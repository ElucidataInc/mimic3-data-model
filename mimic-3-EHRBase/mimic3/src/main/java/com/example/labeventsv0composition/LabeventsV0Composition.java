package com.example.labeventsv0composition;

import com.example.labeventsv0composition.definition.LaboratoryTestResultObservation;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.report.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-03-29T13:40:13.437725+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@Template("labevents.v0")
public class LabeventsV0Composition implements CompositionEntity {
  /**
   * Path: labevents.v0/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: labevents.v0/context/subject_id
   * Description: Identification information about the report.
   */
  @Path("/context/other_context[at0001]/items[at0002 and name/value='subject_id']/value|value")
  private String subjectIdValue;

  /**
   * Path: labevents.v0/context/Tree/subject_id/null_flavour
   */
  @Path("/context/other_context[at0001]/items[at0002 and name/value='subject_id']/null_flavour|defining_code")
  private NullFlavour subjectIdNullFlavourDefiningCode;

  /**
   * Path: labevents.v0/context/hadm_id
   * Description: The status of the entire report. Note: This is not the status of any of the report components.
   */
  @Path("/context/other_context[at0001]/items[at0005 and name/value='hadm_id']/value|value")
  private String hadmIdValue;

  /**
   * Path: labevents.v0/context/Tree/hadm_id/null_flavour
   */
  @Path("/context/other_context[at0001]/items[at0005 and name/value='hadm_id']/null_flavour|defining_code")
  private NullFlavour hadmIdNullFlavourDefiningCode;

  /**
   * Path: labevents.v0/context/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/context/other_context[at0001]/items[at0006]")
  private List<Cluster> extension;

  /**
   * Path: labevents.v0/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: labevents.v0/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: labevents.v0/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: labevents.v0/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: labevents.v0/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: labevents.v0/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: labevents.v0/Laboratory test result
   * Description: The result, including findings and the laboratory's interpretation, of an investigation performed on specimens collected from an individual or related to that individual.
   */
  @Path("/content[openEHR-EHR-OBSERVATION.laboratory_test_result.v1]")
  private LaboratoryTestResultObservation laboratoryTestResult;

  /**
   * Path: labevents.v0/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: labevents.v0/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: labevents.v0/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: labevents.v0/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setSubjectIdValue(String subjectIdValue) {
     this.subjectIdValue = subjectIdValue;
  }

  public String getSubjectIdValue() {
     return this.subjectIdValue ;
  }

  public void setSubjectIdNullFlavourDefiningCode(NullFlavour subjectIdNullFlavourDefiningCode) {
     this.subjectIdNullFlavourDefiningCode = subjectIdNullFlavourDefiningCode;
  }

  public NullFlavour getSubjectIdNullFlavourDefiningCode() {
     return this.subjectIdNullFlavourDefiningCode ;
  }

  public void setHadmIdValue(String hadmIdValue) {
     this.hadmIdValue = hadmIdValue;
  }

  public String getHadmIdValue() {
     return this.hadmIdValue ;
  }

  public void setHadmIdNullFlavourDefiningCode(NullFlavour hadmIdNullFlavourDefiningCode) {
     this.hadmIdNullFlavourDefiningCode = hadmIdNullFlavourDefiningCode;
  }

  public NullFlavour getHadmIdNullFlavourDefiningCode() {
     return this.hadmIdNullFlavourDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setLaboratoryTestResult(LaboratoryTestResultObservation laboratoryTestResult) {
     this.laboratoryTestResult = laboratoryTestResult;
  }

  public LaboratoryTestResultObservation getLaboratoryTestResult() {
     return this.laboratoryTestResult ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
