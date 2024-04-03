package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class DateOfBirthAlternativeClusterContainment extends Containment {
  public SelectAqlField<DateOfBirthAlternativeCluster> DATE_OF_BIRTH_ALTERNATIVE_CLUSTER = new AqlFieldImp<DateOfBirthAlternativeCluster>(DateOfBirthAlternativeCluster.class, "", "DateOfBirthAlternativeCluster", DateOfBirthAlternativeCluster.class, this);

  public SelectAqlField<TemporalAccessor> DOB_VALUE = new AqlFieldImp<TemporalAccessor>(DateOfBirthAlternativeCluster.class, "/items[at0001]/value|value", "dobValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DOB_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DateOfBirthAlternativeCluster.class, "/items[at0001]/null_flavour|defining_code", "dobNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DateOfBirthAlternativeCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private DateOfBirthAlternativeClusterContainment() {
    super("openEHR-EHR-CLUSTER.dob_alternative.v0");
  }

  public static DateOfBirthAlternativeClusterContainment getInstance() {
    return new DateOfBirthAlternativeClusterContainment();
  }
}
