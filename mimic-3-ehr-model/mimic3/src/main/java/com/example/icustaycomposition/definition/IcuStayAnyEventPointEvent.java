package com.example.icustaycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-04-02T12:01:58.708779+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
@OptionFor("POINT_EVENT")
public class IcuStayAnyEventPointEvent implements PointEventEntity, IcuStayAnyEventChoice {
  /**
   * Path: icustay/ICU Stay/Any event/subject_id
   */
  @Path("/data[at0003]/items[at0004]/value|value")
  private String subjectIdValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/subject_id/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour subjectIdNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/hadm_id
   */
  @Path("/data[at0003]/items[at0005]/value|value")
  private String hadmIdValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/hadm_id/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour hadmIdNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/icustay_id
   */
  @Path("/data[at0003]/items[at0006]/value|value")
  private String icustayIdValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/icustay_id/null_flavour
   */
  @Path("/data[at0003]/items[at0006]/null_flavour|defining_code")
  private NullFlavour icustayIdNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/dbsource
   */
  @Path("/data[at0003]/items[at0007]/value|value")
  private String dbsourceValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/dbsource/null_flavour
   */
  @Path("/data[at0003]/items[at0007]/null_flavour|defining_code")
  private NullFlavour dbsourceNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/first_careunit
   */
  @Path("/data[at0003]/items[at0009]/value|value")
  private String firstCareunitValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/first_careunit/null_flavour
   */
  @Path("/data[at0003]/items[at0009]/null_flavour|defining_code")
  private NullFlavour firstCareunitNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/last_careunit
   */
  @Path("/data[at0003]/items[at0010]/value|value")
  private String lastCareunitValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/last_careunit/null_flavour
   */
  @Path("/data[at0003]/items[at0010]/null_flavour|defining_code")
  private NullFlavour lastCareunitNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/first_wardid
   */
  @Path("/data[at0003]/items[at0011]/value|magnitude")
  private Long firstWardidMagnitude;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/first_wardid/null_flavour
   */
  @Path("/data[at0003]/items[at0011]/null_flavour|defining_code")
  private NullFlavour firstWardidNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/last_wardid
   */
  @Path("/data[at0003]/items[at0012]/value|magnitude")
  private Long lastWardidMagnitude;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/last_wardid/null_flavour
   */
  @Path("/data[at0003]/items[at0012]/null_flavour|defining_code")
  private NullFlavour lastWardidNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/intime
   */
  @Path("/data[at0003]/items[at0013]/value|value")
  private TemporalAccessor intimeValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/intime/null_flavour
   */
  @Path("/data[at0003]/items[at0013]/null_flavour|defining_code")
  private NullFlavour intimeNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/outtime
   */
  @Path("/data[at0003]/items[at0014]/value|value")
  private TemporalAccessor outtimeValue;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/outtime/null_flavour
   */
  @Path("/data[at0003]/items[at0014]/null_flavour|defining_code")
  private NullFlavour outtimeNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/Ios
   */
  @Path("/data[at0003]/items[at0019]/value|magnitude")
  private Long iosMagnitude;

  /**
   * Path: icustay/ICU Stay/Any event/Tree/Ios/null_flavour
   */
  @Path("/data[at0003]/items[at0019]/null_flavour|defining_code")
  private NullFlavour iosNullFlavourDefiningCode;

  /**
   * Path: icustay/ICU Stay/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: icustay/ICU Stay/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

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

  public void setIcustayIdValue(String icustayIdValue) {
     this.icustayIdValue = icustayIdValue;
  }

  public String getIcustayIdValue() {
     return this.icustayIdValue ;
  }

  public void setIcustayIdNullFlavourDefiningCode(NullFlavour icustayIdNullFlavourDefiningCode) {
     this.icustayIdNullFlavourDefiningCode = icustayIdNullFlavourDefiningCode;
  }

  public NullFlavour getIcustayIdNullFlavourDefiningCode() {
     return this.icustayIdNullFlavourDefiningCode ;
  }

  public void setDbsourceValue(String dbsourceValue) {
     this.dbsourceValue = dbsourceValue;
  }

  public String getDbsourceValue() {
     return this.dbsourceValue ;
  }

  public void setDbsourceNullFlavourDefiningCode(NullFlavour dbsourceNullFlavourDefiningCode) {
     this.dbsourceNullFlavourDefiningCode = dbsourceNullFlavourDefiningCode;
  }

  public NullFlavour getDbsourceNullFlavourDefiningCode() {
     return this.dbsourceNullFlavourDefiningCode ;
  }

  public void setFirstCareunitValue(String firstCareunitValue) {
     this.firstCareunitValue = firstCareunitValue;
  }

  public String getFirstCareunitValue() {
     return this.firstCareunitValue ;
  }

  public void setFirstCareunitNullFlavourDefiningCode(
      NullFlavour firstCareunitNullFlavourDefiningCode) {
     this.firstCareunitNullFlavourDefiningCode = firstCareunitNullFlavourDefiningCode;
  }

  public NullFlavour getFirstCareunitNullFlavourDefiningCode() {
     return this.firstCareunitNullFlavourDefiningCode ;
  }

  public void setLastCareunitValue(String lastCareunitValue) {
     this.lastCareunitValue = lastCareunitValue;
  }

  public String getLastCareunitValue() {
     return this.lastCareunitValue ;
  }

  public void setLastCareunitNullFlavourDefiningCode(
      NullFlavour lastCareunitNullFlavourDefiningCode) {
     this.lastCareunitNullFlavourDefiningCode = lastCareunitNullFlavourDefiningCode;
  }

  public NullFlavour getLastCareunitNullFlavourDefiningCode() {
     return this.lastCareunitNullFlavourDefiningCode ;
  }

  public void setFirstWardidMagnitude(Long firstWardidMagnitude) {
     this.firstWardidMagnitude = firstWardidMagnitude;
  }

  public Long getFirstWardidMagnitude() {
     return this.firstWardidMagnitude ;
  }

  public void setFirstWardidNullFlavourDefiningCode(
      NullFlavour firstWardidNullFlavourDefiningCode) {
     this.firstWardidNullFlavourDefiningCode = firstWardidNullFlavourDefiningCode;
  }

  public NullFlavour getFirstWardidNullFlavourDefiningCode() {
     return this.firstWardidNullFlavourDefiningCode ;
  }

  public void setLastWardidMagnitude(Long lastWardidMagnitude) {
     this.lastWardidMagnitude = lastWardidMagnitude;
  }

  public Long getLastWardidMagnitude() {
     return this.lastWardidMagnitude ;
  }

  public void setLastWardidNullFlavourDefiningCode(NullFlavour lastWardidNullFlavourDefiningCode) {
     this.lastWardidNullFlavourDefiningCode = lastWardidNullFlavourDefiningCode;
  }

  public NullFlavour getLastWardidNullFlavourDefiningCode() {
     return this.lastWardidNullFlavourDefiningCode ;
  }

  public void setIntimeValue(TemporalAccessor intimeValue) {
     this.intimeValue = intimeValue;
  }

  public TemporalAccessor getIntimeValue() {
     return this.intimeValue ;
  }

  public void setIntimeNullFlavourDefiningCode(NullFlavour intimeNullFlavourDefiningCode) {
     this.intimeNullFlavourDefiningCode = intimeNullFlavourDefiningCode;
  }

  public NullFlavour getIntimeNullFlavourDefiningCode() {
     return this.intimeNullFlavourDefiningCode ;
  }

  public void setOuttimeValue(TemporalAccessor outtimeValue) {
     this.outtimeValue = outtimeValue;
  }

  public TemporalAccessor getOuttimeValue() {
     return this.outtimeValue ;
  }

  public void setOuttimeNullFlavourDefiningCode(NullFlavour outtimeNullFlavourDefiningCode) {
     this.outtimeNullFlavourDefiningCode = outtimeNullFlavourDefiningCode;
  }

  public NullFlavour getOuttimeNullFlavourDefiningCode() {
     return this.outtimeNullFlavourDefiningCode ;
  }

  public void setIosMagnitude(Long iosMagnitude) {
     this.iosMagnitude = iosMagnitude;
  }

  public Long getIosMagnitude() {
     return this.iosMagnitude ;
  }

  public void setIosNullFlavourDefiningCode(NullFlavour iosNullFlavourDefiningCode) {
     this.iosNullFlavourDefiningCode = iosNullFlavourDefiningCode;
  }

  public NullFlavour getIosNullFlavourDefiningCode() {
     return this.iosNullFlavourDefiningCode ;
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
