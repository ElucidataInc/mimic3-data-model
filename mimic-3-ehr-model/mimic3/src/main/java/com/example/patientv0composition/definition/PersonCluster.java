package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.person.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-04-01T16:41:57.121076+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public class PersonCluster implements LocatableEntity {
  /**
   * Path: patient.v0/Demographics container/Person/subject_id
   * Description: The subject identifier for a given patient.
   * Comment: The content of this data element may be derived from one or more components from CLUSTER.structured_name combined together as a text string. For example: 'John Markham', 'Professor Sir John Markham', 'John Markham Jnr MP'.
   */
  @Path("/items[at0001 and name/value='subject_id']/value|value")
  private String subjectIdValue;

  /**
   * Path: patient.v0/Demographics container/Item tree/Person/subject_id/null_flavour
   */
  @Path("/items[at0001 and name/value='subject_id']/null_flavour|defining_code")
  private NullFlavour subjectIdNullFlavourDefiningCode;

  /**
   * Path: patient.v0/Demographics container/Person/gender
   * Description: A label for the individual.
   * Comment: For example: 'Neighbour in the house with the red door'.
   */
  @Path("/items[at0011 and name/value='gender']/value|value")
  private String genderValue;

  /**
   * Path: patient.v0/Demographics container/Item tree/Person/gender/null_flavour
   */
  @Path("/items[at0011 and name/value='gender']/null_flavour|defining_code")
  private NullFlavour genderNullFlavourDefiningCode;

  /**
   * Path: patient.v0/Demographics container/Person/Structured name
   * Description: Alternative representation of an individual's complete name by separation into discrete, structured components.
   * Comment: Any or all of the structured name elements can be combined together as a text string and represented in the 'Name' data element in this archetype.
   */
  @Path("/items[at0002]")
  private List<Cluster> structuredName;

  /**
   * Path: patient.v0/Demographics container/Person/Address
   * Description: Details about an address for the individual.
   */
  @Path("/items[at0005]")
  private List<Cluster> address;

  /**
   * Path: patient.v0/Demographics container/Person/Electronic communication
   * Description: Details about one or more types of electronic communication for the individual.
   */
  @Path("/items[at0006]")
  private List<Cluster> electronicCommunication;

  /**
   * Path: patient.v0/Demographics container/Person/Organisation
   * Description: Details about the organisational context for the individual.
   * Comment: For example: identifying the business or community organisation associated with the 'Role' of the individual.
   */
  @Path("/items[at0007]")
  private List<Cluster> organisation;

  /**
   * Path: patient.v0/Demographics container/Person/Date of birth alternative
   * Description: Date of birth details
   */
  @Path("/items[openEHR-EHR-CLUSTER.dob_alternative.v0]")
  private List<DateOfBirthAlternativeCluster> dateOfBirthAlternative;

  /**
   * Path: patient.v0/Demographics container/Person/Date of death alternative
   * Description: Date/time of death details.
   */
  @Path("/items[openEHR-EHR-CLUSTER.dod_alternative.v0]")
  private DateOfDeathAlternativeCluster dateOfDeathAlternative;

  /**
   * Path: patient.v0/Demographics container/Person/Photo
   * Description: Photograph of the individual.
   */
  @Path("/items[at0009]")
  private List<Cluster> photo;

  /**
   * Path: patient.v0/Demographics container/Person/expire_flag
   * Description: Additional narrative about the individual not captured in other fields.
   */
  @Path("/items[at0010 and name/value='expire_flag']/value|value")
  private String expireFlagValue;

  /**
   * Path: patient.v0/Demographics container/Item tree/Person/expire_flag/null_flavour
   */
  @Path("/items[at0010 and name/value='expire_flag']/null_flavour|defining_code")
  private NullFlavour expireFlagNullFlavourDefiningCode;

  /**
   * Path: patient.v0/Demographics container/Person/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setSubjectIdValue(String subjectIdValue) {
     this.subjectIdValue = subjectIdValue;
  }

  public String getSubjectIdValue() {
     return this.subjectIdValue ;
  }

  public void setSubjectIdNullFlavourDefiningCode(NullFlavour subjectIdNullFlavourDefiningCode) {
     this.subjectIdNullFlavourDefiningCode = subjectIdNullFlavourDefiningCode;
  }

  public NullFlavour getSubjectIdNullFlavourDefiningCode() {
     return this.subjectIdNullFlavourDefiningCode ;
  }

  public void setGenderValue(String genderValue) {
     this.genderValue = genderValue;
  }

  public String getGenderValue() {
     return this.genderValue ;
  }

  public void setGenderNullFlavourDefiningCode(NullFlavour genderNullFlavourDefiningCode) {
     this.genderNullFlavourDefiningCode = genderNullFlavourDefiningCode;
  }

  public NullFlavour getGenderNullFlavourDefiningCode() {
     return this.genderNullFlavourDefiningCode ;
  }

  public void setStructuredName(List<Cluster> structuredName) {
     this.structuredName = structuredName;
  }

  public List<Cluster> getStructuredName() {
     return this.structuredName ;
  }

  public void setAddress(List<Cluster> address) {
     this.address = address;
  }

  public List<Cluster> getAddress() {
     return this.address ;
  }

  public void setElectronicCommunication(List<Cluster> electronicCommunication) {
     this.electronicCommunication = electronicCommunication;
  }

  public List<Cluster> getElectronicCommunication() {
     return this.electronicCommunication ;
  }

  public void setOrganisation(List<Cluster> organisation) {
     this.organisation = organisation;
  }

  public List<Cluster> getOrganisation() {
     return this.organisation ;
  }

  public void setDateOfBirthAlternative(
      List<DateOfBirthAlternativeCluster> dateOfBirthAlternative) {
     this.dateOfBirthAlternative = dateOfBirthAlternative;
  }

  public List<DateOfBirthAlternativeCluster> getDateOfBirthAlternative() {
     return this.dateOfBirthAlternative ;
  }

  public void setDateOfDeathAlternative(DateOfDeathAlternativeCluster dateOfDeathAlternative) {
     this.dateOfDeathAlternative = dateOfDeathAlternative;
  }

  public DateOfDeathAlternativeCluster getDateOfDeathAlternative() {
     return this.dateOfDeathAlternative ;
  }

  public void setPhoto(List<Cluster> photo) {
     this.photo = photo;
  }

  public List<Cluster> getPhoto() {
     return this.photo ;
  }

  public void setExpireFlagValue(String expireFlagValue) {
     this.expireFlagValue = expireFlagValue;
  }

  public String getExpireFlagValue() {
     return this.expireFlagValue ;
  }

  public void setExpireFlagNullFlavourDefiningCode(NullFlavour expireFlagNullFlavourDefiningCode) {
     this.expireFlagNullFlavourDefiningCode = expireFlagNullFlavourDefiningCode;
  }

  public NullFlavour getExpireFlagNullFlavourDefiningCode() {
     return this.expireFlagNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
