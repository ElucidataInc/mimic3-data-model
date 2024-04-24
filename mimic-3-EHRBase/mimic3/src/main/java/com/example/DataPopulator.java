package com.example;

import java.util.Collections;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;

import com.example.icustaycomposition.IcustayComposition;
import com.example.icustaycomposition.definition.IcuStayAnyEventChoice;
import com.example.icustaycomposition.definition.IcuStayAnyEventIntervalEvent;
import com.example.icustaycomposition.definition.IcuStayObservation;
import com.example.labeventsv0composition.LabeventsV0Composition;
import com.example.labeventsv0composition.definition.LaboratoryTestResultAnyEventChoice;
import com.example.labeventsv0composition.definition.LaboratoryTestResultAnyEventIntervalEvent;
import com.example.labeventsv0composition.definition.LaboratoryTestResultObservation;

import com.example.labeventsv0composition.definition.ResultDetailsCluster;
import com.example.patientv0composition.PatientV0Composition;
import com.example.patientv0composition.definition.DateOfBirthAlternativeCluster;
import com.example.patientv0composition.definition.DateOfDeathAlternativeCluster;
import com.example.patientv0composition.definition.DemographicsContainerAdminEntry;
import com.example.patientv0composition.definition.PersonCluster;
import com.nedap.archie.rm.RMObject;

public class DataPopulator {
    public static void main(String[] args) {
        populateLabEventsComposition("mimic-3-ehr-model/mimic3/src/main/java/com/example/data/LABEVENTS.csv/");
        populatePatientsComposition("mimic-3-ehr-model/mimic3/src/main/java/com/example/data/PATIENTS.csv");
        populateIcuStayComposition("mimic-3-ehr-model/mimic3/src/main/java/com/example/data/ICUSTAYS.csv");
    }

    private static void populateLabEventsComposition(String fileName) {
        LabeventsV0Composition composition = new LabeventsV0Composition();
        composition.setLanguage(Language.EN);

        ResultDetailsCluster labResultDetails = new ResultDetailsCluster();
        LaboratoryTestResultAnyEventChoice labEvent = new LaboratoryTestResultAnyEventIntervalEvent();
        LaboratoryTestResultObservation testResults = new LaboratoryTestResultObservation();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        composition.setLaboratoryTestResult(testResults);
        testResults.setAnyEvent(Collections.singletonList(labEvent));
        labEvent.setResultDetails(labResultDetails);

        TemplateProvider provider = new labeventsTemplateProvider();
        Unflattener unflat = new Unflattener(provider);
        CanonicalJson json = new CanonicalJson();

        boolean isFirstRow = true;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            String cvsSplitBy = ",";

            while ((line = br.readLine()) != null) {
                if (isFirstRow) {
                    isFirstRow = false;
                    continue; // Skip the first row
                }
                List<String> data = Arrays.asList(line.split(cvsSplitBy));

                composition.setSubjectIdValue(getDataOrNull(data, 1));
                composition.setHadmIdValue(getDataOrNull(data, 2));
                
                labResultDetails.setCharttimeValue(parseDateTimeOrNull(data, 4, formatter));
                labResultDetails.setFlag(Collections.singletonList(null));
                labResultDetails.setValueValue(getDataOrNull(data, 6));
                labResultDetails.setValueuomValue(getDataOrNull(data, 7));
                labEvent.setItemidValue(getDataOrNull(data, 3));
            }
            // Convert to Canonical JSON
            RMObject lab_rmObject = unflat.unflatten(composition);
            // Write JSON object to file
            System.out.println(json.marshal(lab_rmObject));
            writeJsonToFile("labevents_composition.json", json.marshal(lab_rmObject));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void populatePatientsComposition(String fileName) {
        PatientV0Composition composition = new PatientV0Composition();
        composition.setLanguage(Language.EN);
        DemographicsContainerAdminEntry demographicDetails = new DemographicsContainerAdminEntry();
        PersonCluster personDetails = new PersonCluster();
        DateOfBirthAlternativeCluster dateOfBirth = new DateOfBirthAlternativeCluster();
        DateOfDeathAlternativeCluster dateOfDeath = new DateOfDeathAlternativeCluster();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        TemplateProvider provider = new labeventsTemplateProvider();
        Unflattener unflat = new Unflattener(provider);
        CanonicalJson json = new CanonicalJson();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> data = Arrays.asList(line.split(","));

                demographicDetails.setPerson(personDetails);
                personDetails.setSubjectIdValue(getDataOrNull(data, 1));
                personDetails.setGenderValue(getDataOrNull(data, 2));
                personDetails.setExpireFlagValue(getDataOrNull(data, 6));
                personDetails.setDateOfBirthAlternative(Collections.singletonList(dateOfBirth));
                personDetails.setDateOfDeathAlternative(dateOfDeath);

                LocalDateTime dob = parseDateTimeOrNull(data, 3, formatter);
                LocalDateTime dod = parseDateTimeOrNull(data, 4, formatter);

                dateOfBirth.setDobValue(dob);
                dateOfDeath.setDodValue(dod);
            }

            // Convert to Canonical JSON
            RMObject rmObject = unflat.unflatten(composition);
            writeJsonToFile("patients_composition.json", json.marshal(rmObject));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void populateIcuStayComposition(String fileName) {
        IcustayComposition composition = new IcustayComposition();
        composition.setLanguage(Language.EN);
        IcuStayObservation icustay = new IcuStayObservation();
        IcuStayAnyEventChoice icuevent = new IcuStayAnyEventIntervalEvent();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        TemplateProvider provider = new labeventsTemplateProvider();
        Unflattener unflat = new Unflattener(provider);
        CanonicalJson json = new CanonicalJson();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                List<String> data = Arrays.asList(line.split(","));

                icustay.setAnyEvent(Collections.singletonList(icuevent));
                icuevent.setSubjectIdValue(getDataOrNull(data, 1));
                icuevent.setHadmIdValue(getDataOrNull(data, 2));
                icuevent.setIcustayIdValue(getDataOrNull(data, 3));
                icuevent.setDbsourceValue(getDataOrNull(data, 4));
                icuevent.setFirstCareunitValue(getDataOrNull(data, 5));
                icuevent.setLastCareunitValue(getDataOrNull(data, 6));
                icuevent.setFirstWardidMagnitude(parseLongOrNull(data, 7));
                icuevent.setLastWardidMagnitude(parseLongOrNull(data, 8));

                LocalDateTime intime = parseDateTimeOrNull(data, 9, formatter);
                LocalDateTime outtime = parseDateTimeOrNull(data, 10, formatter);

                icuevent.setIntimeValue(intime);
                icuevent.setOuttimeValue(outtime);
                icuevent.setIosMagnitude(parseLongOrNull(data, 11));
            }

            // Convert to Canonical JSON
            RMObject rmObject = unflat.unflatten(composition);
            writeJsonToFile("icustays_composition.json", json.marshal(rmObject));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getDataOrNull(List<String> data, int index) {
        if (index >= data.size() || index < 0) {
            return null;
        }
        return data.get(index);
    }

    private static LocalDateTime parseDateTimeOrNull(List<String> data, int index, DateTimeFormatter formatter) {
        try {
            return LocalDateTime.parse(getDataOrNull(data, index), formatter);
        } catch (Exception e) {
            return null;
        }
    }

    private static Long parseLongOrNull(List<String> data, int index) {
        try {
            return Long.parseLong(getDataOrNull(data, index));
        } catch (Exception e) {
            return null;
        }
    }

    private static void writeJsonToFile(String fileName, String json) {
        try {
            Files.write(Paths.get(fileName), json.getBytes());
            System.out.println("JSON object written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
