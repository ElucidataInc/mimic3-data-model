package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

@Entity
@Archetype("openEHR-EHR-ADMIN_ENTRY.demographics.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-04-01T16:41:57.105755+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class DemographicsContainerAdminEntry implements EntryEntity {
  /**
   * Path: patient.v0/Demographics container/Person
   * Description: An individual human being.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.person.v1]")
  private PersonCluster person;

  /**
   * Path: patient.v0/Demographics container/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: patient.v0/Demographics container/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: patient.v0/Demographics container/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setPerson(PersonCluster person) {
     this.person = person;
  }

  public PersonCluster getPerson() {
     return this.person ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
