package com.example;

import java.util.Collections;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;

import com.example.labeventsv0composition.LabeventsV0Composition;
import com.example.labeventsv0composition.definition.LaboratoryTestResultAnyEventChoice;
import com.example.labeventsv0composition.definition.LaboratoryTestResultAnyEventIntervalEvent;
import com.example.labeventsv0composition.definition.LaboratoryTestResultObservation;

import com.example.labeventsv0composition.definition.ResultDetailsCluster;
import com.nedap.archie.rm.RMObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LabeventsV0Composition composition = new LabeventsV0Composition();
        composition.setLanguage(Language.EN);

        composition.setSubjectIdValue("1006");
        composition.setHadmIdValue("");
        
        ResultDetailsCluster labResultDetails = new ResultDetailsCluster();
        LaboratoryTestResultAnyEventChoice labEvent = new LaboratoryTestResultAnyEventIntervalEvent();
        LaboratoryTestResultObservation testResults = new LaboratoryTestResultObservation();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dt = LocalDateTime.parse("2164-09-24 20:21:00", formatter);  

        labResultDetails.setCharttimeValue(dt);
        labResultDetails.setFlag(Collections.singletonList(null));
        labResultDetails.setValueValue("19");
        labResultDetails.setValueuomValue("mEq/L");

        labEvent.setResultDetails(labResultDetails);
        labEvent.setItemidValue("");
        testResults.setAnyEvent(Collections.singletonList(labEvent));
        composition.setLaboratoryTestResult(testResults);

        TemplateProvider provider = new labeventsTemplateProvider();
        Unflattener unflat = new Unflattener(provider);
        RMObject rmObject = unflat.unflatten(composition);
        CanonicalJson json = new CanonicalJson();
        System.out.println(json.marshal(rmObject));
    }
}
