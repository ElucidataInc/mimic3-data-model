package com.example.labeventsv0composition;

import com.example.labeventsv0composition.definition.LaboratoryTestResultObservation;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

public class LabeventsV0CompositionContainment extends Containment {
  public SelectAqlField<LabeventsV0Composition> LABEVENTS_V0_COMPOSITION = new AqlFieldImp<LabeventsV0Composition>(LabeventsV0Composition.class, "", "LabeventsV0Composition", LabeventsV0Composition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(LabeventsV0Composition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public SelectAqlField<String> SUBJECT_ID_VALUE = new AqlFieldImp<String>(LabeventsV0Composition.class, "/context/other_context[at0001]/items[at0002]/value|value", "subjectIdValue", String.class, this);

  public SelectAqlField<NullFlavour> SUBJECT_ID_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LabeventsV0Composition.class, "/context/other_context[at0001]/items[at0002]/null_flavour|defining_code", "subjectIdNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> HADM_ID_VALUE = new AqlFieldImp<String>(LabeventsV0Composition.class, "/context/other_context[at0001]/items[at0005]/value|value", "hadmIdValue", String.class, this);

  public SelectAqlField<NullFlavour> HADM_ID_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LabeventsV0Composition.class, "/context/other_context[at0001]/items[at0005]/null_flavour|defining_code", "hadmIdNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(LabeventsV0Composition.class, "/context/other_context[at0001]/items[at0006]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(LabeventsV0Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(LabeventsV0Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(LabeventsV0Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(LabeventsV0Composition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(LabeventsV0Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(LabeventsV0Composition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<LaboratoryTestResultObservation> LABORATORY_TEST_RESULT = new AqlFieldImp<LaboratoryTestResultObservation>(LabeventsV0Composition.class, "/content[openEHR-EHR-OBSERVATION.laboratory_test_result.v1]", "laboratoryTestResult", LaboratoryTestResultObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(LabeventsV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(LabeventsV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(LabeventsV0Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(LabeventsV0Composition.class, "/territory", "territory", Territory.class, this);

  private LabeventsV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.report.v1");
  }

  public static LabeventsV0CompositionContainment getInstance() {
    return new LabeventsV0CompositionContainment();
  }
}
