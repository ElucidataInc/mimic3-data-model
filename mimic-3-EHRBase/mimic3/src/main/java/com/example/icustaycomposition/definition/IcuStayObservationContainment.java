package com.example.icustaycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class IcuStayObservationContainment extends Containment {
  public SelectAqlField<IcuStayObservation> ICU_STAY_OBSERVATION = new AqlFieldImp<IcuStayObservation>(IcuStayObservation.class, "", "IcuStayObservation", IcuStayObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(IcuStayObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(IcuStayObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(IcuStayObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(IcuStayObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<IcuStayAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<IcuStayAnyEventChoice>(IcuStayObservation.class, "/data[at0001]/events[at0002]", "anyEvent", IcuStayAnyEventChoice.class, this);

  private IcuStayObservationContainment() {
    super("openEHR-EHR-OBSERVATION.icu_stay.v0");
  }

  public static IcuStayObservationContainment getInstance() {
    return new IcuStayObservationContainment();
  }
}
