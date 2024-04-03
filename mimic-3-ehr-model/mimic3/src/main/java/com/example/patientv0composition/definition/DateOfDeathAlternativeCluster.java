package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.dod_alternative.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-04-01T16:41:57.146690+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DateOfDeathAlternativeCluster implements LocatableEntity {
  /**
   * Path: patient.v0/Demographics container/Person/Date of death alternative/dod
   * Description: Proposed alternative date of death.
   * Comment: For example: Partial dates, estimated date/time of death, approximate date/time of death.
   */
  @Path("/items[at0001 and name/value='dod']/value|value")
  private TemporalAccessor dodValue;

  /**
   * Path: patient.v0/Demographics container/Item tree/Person/Date of death alternative/dod/null_flavour
   */
  @Path("/items[at0001 and name/value='dod']/null_flavour|defining_code")
  private NullFlavour dodNullFlavourDefiningCode;

  /**
   * Path: patient.v0/Demographics container/Person/Date of death alternative/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDodValue(TemporalAccessor dodValue) {
     this.dodValue = dodValue;
  }

  public TemporalAccessor getDodValue() {
     return this.dodValue ;
  }

  public void setDodNullFlavourDefiningCode(NullFlavour dodNullFlavourDefiningCode) {
     this.dodNullFlavourDefiningCode = dodNullFlavourDefiningCode;
  }

  public NullFlavour getDodNullFlavourDefiningCode() {
     return this.dodNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
