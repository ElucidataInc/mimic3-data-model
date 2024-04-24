package com.example.labeventsv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-03-29T13:40:13.491379+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface LaboratoryTestResultAnyEventChoice {
  List<Cluster> getMultimediaRepresentation();

  void setMultimediaRepresentation(List<Cluster> multimediaRepresentation);

  ResultDetailsCluster getResultDetails();

  void setResultDetails(ResultDetailsCluster resultDetails);

  List<Cluster> getStructuredTestDiagnosis();

  void setStructuredTestDiagnosis(List<Cluster> structuredTestDiagnosis);

  List<Cluster> getStructuredConfoundingFactors();

  void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors);

  NullFlavour getItemidNullFlavourDefiningCode();

  void setItemidNullFlavourDefiningCode(NullFlavour itemidNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getItemidValue();

  void setItemidValue(String itemidValue);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<Cluster> getSpecimenDetail();

  void setSpecimenDetail(List<Cluster> specimenDetail);
}
