package com.example.icustaycomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2024-04-02T12:01:58.716557+05:30",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.5.0"
)
public interface IcuStayAnyEventChoice {
  Long getIosMagnitude();

  void setIosMagnitude(Long iosMagnitude);

  TemporalAccessor getIntimeValue();

  void setIntimeValue(TemporalAccessor intimeValue);

  NullFlavour getDbsourceNullFlavourDefiningCode();

  void setDbsourceNullFlavourDefiningCode(NullFlavour dbsourceNullFlavourDefiningCode);

  TemporalAccessor getOuttimeValue();

  void setOuttimeValue(TemporalAccessor outtimeValue);

  Long getFirstWardidMagnitude();

  void setFirstWardidMagnitude(Long firstWardidMagnitude);

  NullFlavour getIntimeNullFlavourDefiningCode();

  void setIntimeNullFlavourDefiningCode(NullFlavour intimeNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getDbsourceValue();

  void setDbsourceValue(String dbsourceValue);

  Long getLastWardidMagnitude();

  void setLastWardidMagnitude(Long lastWardidMagnitude);

  NullFlavour getSubjectIdNullFlavourDefiningCode();

  void setSubjectIdNullFlavourDefiningCode(NullFlavour subjectIdNullFlavourDefiningCode);

  String getIcustayIdValue();

  void setIcustayIdValue(String icustayIdValue);

  NullFlavour getOuttimeNullFlavourDefiningCode();

  void setOuttimeNullFlavourDefiningCode(NullFlavour outtimeNullFlavourDefiningCode);

  String getFirstCareunitValue();

  void setFirstCareunitValue(String firstCareunitValue);

  NullFlavour getLastWardidNullFlavourDefiningCode();

  void setLastWardidNullFlavourDefiningCode(NullFlavour lastWardidNullFlavourDefiningCode);

  NullFlavour getIosNullFlavourDefiningCode();

  void setIosNullFlavourDefiningCode(NullFlavour iosNullFlavourDefiningCode);

  String getSubjectIdValue();

  void setSubjectIdValue(String subjectIdValue);

  NullFlavour getIcustayIdNullFlavourDefiningCode();

  void setIcustayIdNullFlavourDefiningCode(NullFlavour icustayIdNullFlavourDefiningCode);

  NullFlavour getFirstWardidNullFlavourDefiningCode();

  void setFirstWardidNullFlavourDefiningCode(NullFlavour firstWardidNullFlavourDefiningCode);

  NullFlavour getFirstCareunitNullFlavourDefiningCode();

  void setFirstCareunitNullFlavourDefiningCode(NullFlavour firstCareunitNullFlavourDefiningCode);

  String getLastCareunitValue();

  void setLastCareunitValue(String lastCareunitValue);

  String getHadmIdValue();

  void setHadmIdValue(String hadmIdValue);

  NullFlavour getHadmIdNullFlavourDefiningCode();

  void setHadmIdNullFlavourDefiningCode(NullFlavour hadmIdNullFlavourDefiningCode);

  NullFlavour getLastCareunitNullFlavourDefiningCode();

  void setLastCareunitNullFlavourDefiningCode(NullFlavour lastCareunitNullFlavourDefiningCode);
}
