package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class DemographicsContainerAdminEntryContainment extends Containment {
  public SelectAqlField<DemographicsContainerAdminEntry> DEMOGRAPHICS_CONTAINER_ADMIN_ENTRY = new AqlFieldImp<DemographicsContainerAdminEntry>(DemographicsContainerAdminEntry.class, "", "DemographicsContainerAdminEntry", DemographicsContainerAdminEntry.class, this);

  public SelectAqlField<PersonCluster> PERSON = new AqlFieldImp<PersonCluster>(DemographicsContainerAdminEntry.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.person.v1]", "person", PersonCluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DemographicsContainerAdminEntry.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DemographicsContainerAdminEntry.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DemographicsContainerAdminEntry.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private DemographicsContainerAdminEntryContainment() {
    super("openEHR-EHR-ADMIN_ENTRY.demographics.v0");
  }

  public static DemographicsContainerAdminEntryContainment getInstance() {
    return new DemographicsContainerAdminEntryContainment();
  }
}
