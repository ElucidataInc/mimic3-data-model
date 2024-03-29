package com.example.labeventsv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.laboratory_test_analyte.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-03-29T13:40:13.473849+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class ResultDetailsCluster implements LocatableEntity {
  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details/value
   * Description: The measured value of the laboratory test sample
   */
  @Path("/items[at0024 and name/value='value']/value|value")
  private String valueValue;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Tree/Result Details/value/null_flavour
   */
  @Path("/items[at0024 and name/value='value']/null_flavour|defining_code")
  private NullFlavour valueNullFlavourDefiningCode;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details/Analyte result detail
   * Description: Further detail regarding an individual result.
   */
  @Path("/items[at0014]")
  private List<Cluster> analyteResultDetail;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details/valueuom
   * Description: The unit of measurement for the measured laboratory test value.
   * Comment: For example, mEq/L, mg/dL, %, ug/mL etc.
   */
  @Path("/items[at0004 and name/value='valueuom']/value|value")
  private String valueuomValue;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Tree/Result Details/valueuom/null_flavour
   */
  @Path("/items[at0004 and name/value='valueuom']/null_flavour|defining_code")
  private NullFlavour valueuomNullFlavourDefiningCode;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details/Flag
   * Description: The status of the result value.
   */
  @Path("/items[at0005 and name/value='Flag']")
  private List<ResultDetailsFlagElement> flag;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details/charttime
   * Description: The date and time that the analyte result was issued for the recorded ‘Result status’.
   */
  @Path("/items[at0006 and name/value='charttime']/value|value")
  private TemporalAccessor charttimeValue;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Tree/Result Details/charttime/null_flavour
   */
  @Path("/items[at0006 and name/value='charttime']/null_flavour|defining_code")
  private NullFlavour charttimeNullFlavourDefiningCode;

  /**
   * Path: labevents.v0/Laboratory test result/Any event/Result Details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValueValue(String valueValue) {
     this.valueValue = valueValue;
  }

  public String getValueValue() {
     return this.valueValue ;
  }

  public void setValueNullFlavourDefiningCode(NullFlavour valueNullFlavourDefiningCode) {
     this.valueNullFlavourDefiningCode = valueNullFlavourDefiningCode;
  }

  public NullFlavour getValueNullFlavourDefiningCode() {
     return this.valueNullFlavourDefiningCode ;
  }

  public void setAnalyteResultDetail(List<Cluster> analyteResultDetail) {
     this.analyteResultDetail = analyteResultDetail;
  }

  public List<Cluster> getAnalyteResultDetail() {
     return this.analyteResultDetail ;
  }

  public void setValueuomValue(String valueuomValue) {
     this.valueuomValue = valueuomValue;
  }

  public String getValueuomValue() {
     return this.valueuomValue ;
  }

  public void setValueuomNullFlavourDefiningCode(NullFlavour valueuomNullFlavourDefiningCode) {
     this.valueuomNullFlavourDefiningCode = valueuomNullFlavourDefiningCode;
  }

  public NullFlavour getValueuomNullFlavourDefiningCode() {
     return this.valueuomNullFlavourDefiningCode ;
  }

  public void setFlag(List<ResultDetailsFlagElement> flag) {
     this.flag = flag;
  }

  public List<ResultDetailsFlagElement> getFlag() {
     return this.flag ;
  }

  public void setCharttimeValue(TemporalAccessor charttimeValue) {
     this.charttimeValue = charttimeValue;
  }

  public TemporalAccessor getCharttimeValue() {
     return this.charttimeValue ;
  }

  public void setCharttimeNullFlavourDefiningCode(NullFlavour charttimeNullFlavourDefiningCode) {
     this.charttimeNullFlavourDefiningCode = charttimeNullFlavourDefiningCode;
  }

  public NullFlavour getCharttimeNullFlavourDefiningCode() {
     return this.charttimeNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
