package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class DateOfDeathAlternativeClusterContainment extends Containment {
  public SelectAqlField<DateOfDeathAlternativeCluster> DATE_OF_DEATH_ALTERNATIVE_CLUSTER = new AqlFieldImp<DateOfDeathAlternativeCluster>(DateOfDeathAlternativeCluster.class, "", "DateOfDeathAlternativeCluster", DateOfDeathAlternativeCluster.class, this);

  public SelectAqlField<TemporalAccessor> DOD_VALUE = new AqlFieldImp<TemporalAccessor>(DateOfDeathAlternativeCluster.class, "/items[at0001]/value|value", "dodValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DOD_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DateOfDeathAlternativeCluster.class, "/items[at0001]/null_flavour|defining_code", "dodNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DateOfDeathAlternativeCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private DateOfDeathAlternativeClusterContainment() {
    super("openEHR-EHR-CLUSTER.dod_alternative.v0");
  }

  public static DateOfDeathAlternativeClusterContainment getInstance() {
    return new DateOfDeathAlternativeClusterContainment();
  }
}
