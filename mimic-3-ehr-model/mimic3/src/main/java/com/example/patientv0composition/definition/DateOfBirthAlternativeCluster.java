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
@Archetype("openEHR-EHR-CLUSTER.dob_alternative.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-04-01T16:41:57.138292+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DateOfBirthAlternativeCluster implements LocatableEntity {
  /**
   * Path: patient.v0/Demographics container/Person/Date of birth alternative/dob
   * Comment: Partial dates are allowed...XXX
   */
  @Path("/items[at0001 and name/value='dob']/value|value")
  private TemporalAccessor dobValue;

  /**
   * Path: patient.v0/Demographics container/Item tree/Person/Date of birth alternative/dob/null_flavour
   */
  @Path("/items[at0001 and name/value='dob']/null_flavour|defining_code")
  private NullFlavour dobNullFlavourDefiningCode;

  /**
   * Path: patient.v0/Demographics container/Person/Date of birth alternative/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDobValue(TemporalAccessor dobValue) {
     this.dobValue = dobValue;
  }

  public TemporalAccessor getDobValue() {
     return this.dobValue ;
  }

  public void setDobNullFlavourDefiningCode(NullFlavour dobNullFlavourDefiningCode) {
     this.dobNullFlavourDefiningCode = dobNullFlavourDefiningCode;
  }

  public NullFlavour getDobNullFlavourDefiningCode() {
     return this.dobNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
