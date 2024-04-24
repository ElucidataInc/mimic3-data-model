package com.example.labeventsv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ResultDetailsClusterContainment extends Containment {
  public SelectAqlField<ResultDetailsCluster> RESULT_DETAILS_CLUSTER = new AqlFieldImp<ResultDetailsCluster>(ResultDetailsCluster.class, "", "ResultDetailsCluster", ResultDetailsCluster.class, this);

  public SelectAqlField<String> VALUE_VALUE = new AqlFieldImp<String>(ResultDetailsCluster.class, "/items[at0024]/value|value", "valueValue", String.class, this);

  public SelectAqlField<NullFlavour> VALUE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ResultDetailsCluster.class, "/items[at0024]/null_flavour|defining_code", "valueNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> ANALYTE_RESULT_DETAIL = new ListAqlFieldImp<Cluster>(ResultDetailsCluster.class, "/items[at0014]", "analyteResultDetail", Cluster.class, this);

  public SelectAqlField<String> VALUEUOM_VALUE = new AqlFieldImp<String>(ResultDetailsCluster.class, "/items[at0004]/value|value", "valueuomValue", String.class, this);

  public SelectAqlField<NullFlavour> VALUEUOM_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ResultDetailsCluster.class, "/items[at0004]/null_flavour|defining_code", "valueuomNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ResultDetailsFlagElement> FLAG = new ListAqlFieldImp<ResultDetailsFlagElement>(ResultDetailsCluster.class, "/items[at0005]", "flag", ResultDetailsFlagElement.class, this);

  public SelectAqlField<TemporalAccessor> CHARTTIME_VALUE = new AqlFieldImp<TemporalAccessor>(ResultDetailsCluster.class, "/items[at0006]/value|value", "charttimeValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> CHARTTIME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ResultDetailsCluster.class, "/items[at0006]/null_flavour|defining_code", "charttimeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ResultDetailsCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ResultDetailsClusterContainment() {
    super("openEHR-EHR-CLUSTER.laboratory_test_analyte.v1");
  }

  public static ResultDetailsClusterContainment getInstance() {
    return new ResultDetailsClusterContainment();
  }
}
