package com.example.patientv0composition;

import com.example.patientv0composition.definition.DemographicsContainerAdminEntry;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.ItemTree;
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
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

public class PatientV0CompositionContainment extends Containment {
  public SelectAqlField<PatientV0Composition> PATIENT_V0_COMPOSITION = new AqlFieldImp<PatientV0Composition>(PatientV0Composition.class, "", "PatientV0Composition", PatientV0Composition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(PatientV0Composition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public SelectAqlField<ItemTree> TREE = new AqlFieldImp<ItemTree>(PatientV0Composition.class, "/context/other_context[at0001]", "tree", ItemTree.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(PatientV0Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(PatientV0Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(PatientV0Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(PatientV0Composition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(PatientV0Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(PatientV0Composition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<DemographicsContainerAdminEntry> DEMOGRAPHICS_CONTAINER = new AqlFieldImp<DemographicsContainerAdminEntry>(PatientV0Composition.class, "/content[openEHR-EHR-ADMIN_ENTRY.demographics.v0]", "demographicsContainer", DemographicsContainerAdminEntry.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(PatientV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PatientV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PatientV0Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(PatientV0Composition.class, "/territory", "territory", Territory.class, this);

  private PatientV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.data_collection.v0");
  }

  public static PatientV0CompositionContainment getInstance() {
    return new PatientV0CompositionContainment();
  }
}
