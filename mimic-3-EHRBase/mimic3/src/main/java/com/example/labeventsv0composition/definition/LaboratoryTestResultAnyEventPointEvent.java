package com.example.labeventsv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-03-29T13:40:13.485561+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("POINT_EVENT")
public class LaboratoryTestResultAnyEventPointEvent implements PointEventEntity, LaboratoryTestResultAnyEventChoice {
  /**
   * Path: labevents.v0/Laboratory test result/Any event/itemid
   * Description: Name of the laboratory investigation performed on the specimen(s).
   * Comment: A test result may be for a single analyte, or a group of items, including panel tests. It is strongly recommended that 'Test name' be coded with a terminology, for example LOINC or SNOMED CT. For example: 'Glucose', 'Urea and Electrolytes', 'Swab', 'Cortisol (am)', 'Potassium in perspiration' or 'Melanoma histopathology'. The name may sometimes include specimen type and patient state, for example 'Fasting blood glucose' or include other information, as 'Potassium (PNA blood gas)'.
   */
  @Path("/data[at0003]/items[at0005 and name/value='itemid']/value|value")
  private String itemidValue;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Tree/itemid/null_flavour
   */
  @Path("/data[at0003]/items[at0005 and name/value='itemid']/null_flavour|defining_code")
  private NullFlavour itemidNullFlavourDefiningCode;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Specimen detail
   * Description: Details about the physical substance that has been analysed.
   * Comment: If the specimen type is sufficiently specified with a code in the Test name, then this additional data is not required. Linking results to specific specimens may be recorded using 'Specimen identifier' elements in both the CLUSTER.specimen and the various results CLUSTER archetypes.
   */
  @Path("/data[at0003]/items[at0065]")
  private List<Cluster> specimenDetail;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details
   * Description: The result of a laboratory test for a single analyte value.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.laboratory_test_analyte.v1 and name/value='Result Details']")
  private ResultDetailsCluster resultDetails;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Structured test diagnosis
   * Description: A structured or complex diagnosis for the laboratory test.
   * Comment: For example: Anatomical pathology diagnoses consisting of several different axes such as morphology, etiology and function.
   */
  @Path("/data[at0003]/items[at0122]")
  private List<Cluster> structuredTestDiagnosis;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Multimedia representation
   * Description: Digital image, video or diagram representing the test result.
   * Comment: Multiple formats are allowed but they should represent equivalent clinical content.
   */
  @Path("/data[at0003]/items[at0118]")
  private List<Cluster> multimediaRepresentation;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Structured confounding factors
   * Description: Details of issues or circumstances that impact on the accurate interpretation of the measurement or test result.
   * Comment: For example: Last Normal Menstrual Period (LNMP).
   */
  @Path("/state[at0112]/items[at0114]")
  private List<Cluster> structuredConfoundingFactors;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setItemidValue(String itemidValue) {
     this.itemidValue = itemidValue;
  }

  public String getItemidValue() {
     return this.itemidValue ;
  }

  public void setItemidNullFlavourDefiningCode(NullFlavour itemidNullFlavourDefiningCode) {
     this.itemidNullFlavourDefiningCode = itemidNullFlavourDefiningCode;
  }

  public NullFlavour getItemidNullFlavourDefiningCode() {
     return this.itemidNullFlavourDefiningCode ;
  }

  public void setSpecimenDetail(List<Cluster> specimenDetail) {
     this.specimenDetail = specimenDetail;
  }

  public List<Cluster> getSpecimenDetail() {
     return this.specimenDetail ;
  }

  public void setResultDetails(ResultDetailsCluster resultDetails) {
     this.resultDetails = resultDetails;
  }

  public ResultDetailsCluster getResultDetails() {
     return this.resultDetails ;
  }

  public void setStructuredTestDiagnosis(List<Cluster> structuredTestDiagnosis) {
     this.structuredTestDiagnosis = structuredTestDiagnosis;
  }

  public List<Cluster> getStructuredTestDiagnosis() {
     return this.structuredTestDiagnosis ;
  }

  public void setMultimediaRepresentation(List<Cluster> multimediaRepresentation) {
     this.multimediaRepresentation = multimediaRepresentation;
  }

  public List<Cluster> getMultimediaRepresentation() {
     return this.multimediaRepresentation ;
  }

  public void setStructuredConfoundingFactors(List<Cluster> structuredConfoundingFactors) {
     this.structuredConfoundingFactors = structuredConfoundingFactors;
  }

  public List<Cluster> getStructuredConfoundingFactors() {
     return this.structuredConfoundingFactors ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
