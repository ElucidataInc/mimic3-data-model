package com.example.labeventsv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-03-29T13:40:13.457048+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class LaboratoryTestResultTestRequestDetailsCluster implements LocatableEntity {
  /**
   * Path: labevents.v0/Laboratory test result/Test request details/Requester
   * Description: Details of the clinician or organisation requesting the laboratory test result.
   */
  @Path("/items[at0090]")
  private Cluster requester;

  /**
   * Path: labevents.v0/Laboratory test result/Test request details/Distribution list
   * Description: Details of additional clinicians or organisations who require a copy of the test result.
   * Comment: The 'Distribution list' is for information-only, and that the primary recipient of the report is the person intended to act on the information.
   */
  @Path("/items[at0035]")
  private List<Cluster> distributionList;

  /**
   * Path: labevents.v0/Laboratory test result/Test request details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setRequester(Cluster requester) {
     this.requester = requester;
  }

  public Cluster getRequester() {
     return this.requester ;
  }

  public void setDistributionList(List<Cluster> distributionList) {
     this.distributionList = distributionList;
  }

  public List<Cluster> getDistributionList() {
     return this.distributionList ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
