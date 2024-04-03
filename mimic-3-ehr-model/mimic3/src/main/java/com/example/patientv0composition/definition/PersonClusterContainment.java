package com.example.patientv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PersonClusterContainment extends Containment {
  public SelectAqlField<PersonCluster> PERSON_CLUSTER = new AqlFieldImp<PersonCluster>(PersonCluster.class, "", "PersonCluster", PersonCluster.class, this);

  public SelectAqlField<String> SUBJECT_ID_VALUE = new AqlFieldImp<String>(PersonCluster.class, "/items[at0001]/value|value", "subjectIdValue", String.class, this);

  public SelectAqlField<NullFlavour> SUBJECT_ID_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PersonCluster.class, "/items[at0001]/null_flavour|defining_code", "subjectIdNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> GENDER_VALUE = new AqlFieldImp<String>(PersonCluster.class, "/items[at0011]/value|value", "genderValue", String.class, this);

  public SelectAqlField<NullFlavour> GENDER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PersonCluster.class, "/items[at0011]/null_flavour|defining_code", "genderNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_NAME = new ListAqlFieldImp<Cluster>(PersonCluster.class, "/items[at0002]", "structuredName", Cluster.class, this);

  public ListSelectAqlField<Cluster> ADDRESS = new ListAqlFieldImp<Cluster>(PersonCluster.class, "/items[at0005]", "address", Cluster.class, this);

  public ListSelectAqlField<Cluster> ELECTRONIC_COMMUNICATION = new ListAqlFieldImp<Cluster>(PersonCluster.class, "/items[at0006]", "electronicCommunication", Cluster.class, this);

  public ListSelectAqlField<Cluster> ORGANISATION = new ListAqlFieldImp<Cluster>(PersonCluster.class, "/items[at0007]", "organisation", Cluster.class, this);

  public ListSelectAqlField<DateOfBirthAlternativeCluster> DATE_OF_BIRTH_ALTERNATIVE = new ListAqlFieldImp<DateOfBirthAlternativeCluster>(PersonCluster.class, "/items[openEHR-EHR-CLUSTER.dob_alternative.v0]", "dateOfBirthAlternative", DateOfBirthAlternativeCluster.class, this);

  public SelectAqlField<DateOfDeathAlternativeCluster> DATE_OF_DEATH_ALTERNATIVE = new AqlFieldImp<DateOfDeathAlternativeCluster>(PersonCluster.class, "/items[openEHR-EHR-CLUSTER.dod_alternative.v0]", "dateOfDeathAlternative", DateOfDeathAlternativeCluster.class, this);

  public ListSelectAqlField<Cluster> PHOTO = new ListAqlFieldImp<Cluster>(PersonCluster.class, "/items[at0009]", "photo", Cluster.class, this);

  public SelectAqlField<String> EXPIRE_FLAG_VALUE = new AqlFieldImp<String>(PersonCluster.class, "/items[at0010]/value|value", "expireFlagValue", String.class, this);

  public SelectAqlField<NullFlavour> EXPIRE_FLAG_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PersonCluster.class, "/items[at0010]/null_flavour|defining_code", "expireFlagNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PersonCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private PersonClusterContainment() {
    super("openEHR-EHR-CLUSTER.person.v1");
  }

  public static PersonClusterContainment getInstance() {
    return new PersonClusterContainment();
  }
}
