<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Functional" systemMachine="//@machines.0">
  <machines name="Functional">
    <data xsi:type="b:BAbstractSet" name="STR" typing="//@machines.0/@operations.7/@param.2 //@machines.0/@operations.8/@param.2 //@machines.0/@operations.38/@param.1 //@machines.0/@operations.40/@param.1"/>
    <data xsi:type="b:BVariable" name="MedicalRecord" type="//@machines.0/@data.2" typing="//@machines.0/@operations.11/@param.0 //@machines.0/@operations.8/@param.1 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.24/@param.1 //@machines.0/@operations.32/@param.0 //@machines.0/@operations.33/@param.0 //@machines.0/@operations.38/@param.0 //@machines.0/@operations.39/@param.0">
      <typingPredicate type="//@machines.0/@data.2"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="MEDICALRECORD" typing="//@machines.0/@data.1 //@machines.0/@operations.0/@param.0 //@machines.0/@operations.1/@param.0 //@machines.0/@operations.7/@param.0"/>
    <data xsi:type="b:BVariable" name="Patient" type="//@machines.0/@data.4" typing="//@machines.0/@operations.12/@param.0 //@machines.0/@operations.15/@param.1 //@machines.0/@operations.7/@param.1 //@machines.0/@operations.18/@param.0 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.23/@param.1 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.26/@param.1 //@machines.0/@operations.27/@param.0 //@machines.0/@operations.29/@param.1 //@machines.0/@operations.30/@param.0 //@machines.0/@operations.34/@param.0 //@machines.0/@operations.35/@param.0 //@machines.0/@operations.40/@param.0 //@machines.0/@operations.43/@param.0">
      <typingPredicate type="//@machines.0/@data.4"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="PATIENT" typing="//@machines.0/@data.3 //@machines.0/@operations.4/@param.0 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.8/@param.0"/>
    <data xsi:type="b:BVariable" name="Doctor" type="//@machines.0/@data.6" typing="//@machines.0/@operations.13/@param.0 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.28/@param.1 //@machines.0/@operations.31/@param.1">
      <typingPredicate type="//@machines.0/@data.6"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="DOCTOR" typing="//@machines.0/@data.5 //@machines.0/@operations.2/@param.0 //@machines.0/@operations.3/@param.0 //@machines.0/@operations.9/@param.0"/>
    <data xsi:type="b:BVariable" name="Hospital" type="//@machines.0/@data.8" typing="//@machines.0/@operations.14/@param.0 //@machines.0/@operations.15/@param.2 //@machines.0/@operations.17/@param.0 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.26/@param.0 //@machines.0/@operations.27/@param.1 //@machines.0/@operations.28/@param.0 //@machines.0/@operations.29/@param.0 //@machines.0/@operations.30/@param.1 //@machines.0/@operations.31/@param.0">
      <typingPredicate type="//@machines.0/@data.8"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="HOSPITAL" typing="//@machines.0/@data.7 //@machines.0/@operations.2/@param.1 //@machines.0/@operations.4/@param.1 //@machines.0/@operations.5/@param.1 //@machines.0/@operations.6/@param.1 //@machines.0/@operations.10/@param.0"/>
    <data xsi:type="b:BVariable" name="HospitalStay" type="//@sharedTypes/@sharedTypes.2" typing="//@machines.0/@operations.15/@param.0 //@machines.0/@operations.16/@param.0 //@machines.0/@operations.36/@param.0 //@machines.0/@operations.37/@param.0 //@machines.0/@operations.41/@param.0 //@machines.0/@operations.42/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="MedicalRecordOf" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="BelongingHospitalOf" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BVariable" name="MedicalRecord__data" type="//@sharedTypes/@sharedTypes.5">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="MedicalRecord__isValid" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__address" type="//@sharedTypes/@sharedTypes.7">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="HospitalStay__dateIn" type="//@sharedTypes/@sharedTypes.8">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.8"/>
    </data>
    <data xsi:type="b:BVariable" name="HospitalStay__isPayed" type="//@sharedTypes/@sharedTypes.9">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.9"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__snn" type="//@sharedTypes/@sharedTypes.10">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.10"/>
    </data>
    <operations name="MedicalRecord__validate" body="MedicalRecord__isValid(mr) := TRUE /* Body generated from annotation */">
      <param name="mr" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Patient__viewMedicalRecord" body="returnedData := MedicalRecord__data(mr) /* Body generated from annotation */">
      <param name="mr" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Doctor__joinHospital" body="BelongingHospitalOf(dd) := hh /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="dd|->hh /: BelongingHospitalOf /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="dd" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="hh" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="Doctor__leaveHospital" body="BelongingHospitalOf := {dd}&lt;&lt;|BelongingHospitalOf /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="dd : dom(BelongingHospitalOf) /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="dd" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="HospitalStay__admission" body="HospitalStay := HospitalStay \/ {pp|->hh} ||&#xD;&#xA;&#x9;&#x9;HospitalStay__isPayed(pp|->hh) := FALSE ||&#xD;&#xA;&#x9;&#x9;ANY time WHERE time:NAT THEN&#x9;&#xD;&#xA;&#x9;&#x9;&#x9;HospitalStay__dateIn(pp|->hh) := time&#xD;&#xA;&#x9;&#x9;END /* Body generated from annotation */">
      <param name="pp" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="hh" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="HospitalStay__deleteHospitalStay" body="HospitalStay := HospitalStay - {pp|->hh} ||&#xD;&#xA;&#x9;&#x9;HospitalStay__dateIn :=  {pp|->hh} &lt;&lt;| HospitalStay__dateIn ||&#xD;&#xA;&#x9;&#x9;HospitalStay__isPayed := {pp|->hh} &lt;&lt;| HospitalStay__isPayed  /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="pp|->hh : HospitalStay /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="pp" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="hh" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="HospitalStay__makePayment" body="HospitalStay__isPayed(pp|->hh) := TRUE /* Body generated from annotation */">
      <substitution>
        <precondition>
          <typingPredicate name="pp|->hh : HospitalStay /* Precondition generated from annotation*/ "/>
        </precondition>
      </substitution>
      <param name="pp" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="hh" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="MedicalRecord_NEW" body="MedicalRecord := MedicalRecord \/ {Instance} &#xA; || MedicalRecordOf:= MedicalRecordOf \/ {(MedicalRecordOf__patientValue|->Instance)}&#xA; || MedicalRecord__data:= MedicalRecord__data \/ {(Instance|->MedicalRecord__dataValue)}&#xA; || MedicalRecord__isValid:= MedicalRecord__isValid \/ {(Instance|->MedicalRecord__isValidValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="Instance /: MedicalRecord"/>
      </param>
      <param name="MedicalRecordOf__patientValue" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="MedicalRecordOf__patientValue/:dom(MedicalRecordOf)"/>
      </param>
      <param name="MedicalRecord__dataValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="MedicalRecord__isValidValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Patient_NEW" body="Patient := Patient \/ {Instance} &#xA; || MedicalRecordOf:= MedicalRecordOf \/ {(Instance|->MedicalRecordOf__medicalRecordValue)}&#xA; || Patient__address:= Patient__address \/ {(Instance|->Patient__addressValue)}&#xA; || Patient__snn:= Patient__snn \/ {(Instance|->Patient__snnValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Patient"/>
      </param>
      <param name="MedicalRecordOf__medicalRecordValue" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="MedicalRecordOf__medicalRecordValue/:ran(MedicalRecordOf)"/>
      </param>
      <param name="Patient__addressValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Patient__snnValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="Patient__snnValue /:ran(Patient__snn)"/>
      </param>
    </operations>
    <operations name="Doctor_NEW" body="Doctor := Doctor \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: Doctor"/>
      </param>
    </operations>
    <operations name="Hospital_NEW" body="Hospital := Hospital \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: Hospital"/>
      </param>
    </operations>
    <operations name="MedicalRecord_Free" body="MedicalRecord := MedicalRecord - {Instance}&#xA; || MedicalRecordOf:= MedicalRecordOf|>> {Instance}&#xA; || MedicalRecord__data:= {Instance}&lt;&lt;|MedicalRecord__data&#xA; || MedicalRecord__isValid:= {Instance}&lt;&lt;|MedicalRecord__isValid">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="MedicalRecordOf~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="Patient_Free" body="Patient := Patient - {Instance}&#xA; || HospitalStay:= {Instance}&lt;&lt;|HospitalStay&#xA; || MedicalRecordOf:= {Instance}&lt;&lt;|MedicalRecordOf&#xA; || Patient__snn:= {Instance}&lt;&lt;|Patient__snn&#xA; || Patient__address:= {Instance}&lt;&lt;|Patient__address">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="MedicalRecordOf[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="Doctor_Free" body="Doctor := Doctor - {Instance}&#xA; || BelongingHospitalOf:= {Instance}&lt;&lt;|BelongingHospitalOf">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Hospital_Free" body="Hospital := Hospital - {Instance}&#xA; || HospitalStay:= HospitalStay|>> {Instance}&#xA; || BelongingHospitalOf:= BelongingHospitalOf|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="HospitalStay_NEW" body="HospitalStay := HospitalStay \/ {Instance}&#xA; || HospitalStay__dateIn:= HospitalStay__dateIn \/ {(Instance|->HospitalStay__dateInValue)}&#xA; || HospitalStay__isPayed:= HospitalStay__isPayed \/ {(Instance|->HospitalStay__isPayedValue)}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate name="Instance : Patient*Hospital"/>
        <typingPredicate name="Instance /: HospitalStay"/>
      </param>
      <param name="PatientInstance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="HospitalInstance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="( PatientInstance|->HospitalInstance )= Instance"/>
      </param>
      <param name="HospitalStay__dateInValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
      <param name="HospitalStay__isPayedValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="HospitalStay_Free" body="HospitalStay := HospitalStay - {Instance}&#xA; || HospitalStay__dateIn:= {Instance}&lt;&lt;|HospitalStay__dateIn&#xA; || HospitalStay__isPayed:= {Instance}&lt;&lt;|HospitalStay__isPayed">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
      </param>
    </operations>
    <operations name="Hospital__GetHospitalStay" body="returnedData := HospitalStay~(Instance)">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance : ran(HospitalStay)"/>
      </param>
    </operations>
    <operations name="Patient__GetHospitalStay" body="returnedData := HospitalStay(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance : dom(HospitalStay)"/>
      </param>
    </operations>
    <operations name="MedicalRecord__GetMedicalRecordOf" body="returnedData := MedicalRecordOf~(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : ran(MedicalRecordOf)"/>
      </param>
    </operations>
    <operations name="Patient__GetMedicalRecordOf" body="returnedData := MedicalRecordOf(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance : dom(MedicalRecordOf)"/>
      </param>
    </operations>
    <operations name="Hospital__GetBelongingHospitalOf" body="returnedData := BelongingHospitalOf~(Instance)">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance : ran(BelongingHospitalOf)"/>
      </param>
    </operations>
    <operations name="Doctor__GetBelongingHospitalOf" body="returnedData := BelongingHospitalOf(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance : dom(BelongingHospitalOf)"/>
      </param>
    </operations>
    <operations name="MedicalRecord__SetMedicalRecordOf" body="MedicalRecordOf:= (MedicalRecordOf|>>{Instance})\/{(MedicalRecordOf__patientValue|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="MedicalRecordOf__patientValue" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(MedicalRecordOf__patientValue|-> Instance) /: MedicalRecordOf"/>
        <typingPredicate name="MedicalRecordOf__patientValue/:dom(MedicalRecordOf)"/>
        <typingPredicate name="#cc.(cc: MedicalRecord &amp; cc/=Instance &amp; cc: MedicalRecordOf[MedicalRecordOf~[{Instance}]])"/>
      </param>
    </operations>
    <operations name="Patient__SetMedicalRecordOf" body="MedicalRecordOf:= ({Instance}&lt;&lt;|MedicalRecordOf)\/ {(Instance|-> MedicalRecordOf__medicalRecordValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="MedicalRecordOf__medicalRecordValue" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="(Instance|-> MedicalRecordOf__medicalRecordValue) /: MedicalRecordOf"/>
        <typingPredicate name="MedicalRecordOf__medicalRecordValue/:ran(MedicalRecordOf)"/>
        <typingPredicate name="#cc.(cc: Patient &amp; cc/=Instance &amp; cc: MedicalRecordOf~[MedicalRecordOf[{Instance}]])"/>
      </param>
    </operations>
    <operations name="Doctor__SetBelongingHospitalOf" body="BelongingHospitalOf:= ({Instance}&lt;&lt;|BelongingHospitalOf)\/ {(Instance|-> BelongingHospitalOf__hospitalValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="BelongingHospitalOf__hospitalValue" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="(Instance|-> BelongingHospitalOf__hospitalValue) /: BelongingHospitalOf"/>
      </param>
    </operations>
    <operations name="Hospital__AddHospitalStay" body="HospitalStay:= HospitalStay\/{(HospitalStay__patientValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="HospitalStay__patientValues" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(HospitalStay__patientValues|-> Instance) /:HospitalStay"/>
      </param>
    </operations>
    <operations name="Patient__AddHospitalStay" body="HospitalStay:= HospitalStay\/ {(Instance|-> HospitalStay__hospitalValues)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="HospitalStay__hospitalValues" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="(Instance|-> HospitalStay__hospitalValues) /:HospitalStay"/>
      </param>
    </operations>
    <operations name="Hospital__AddBelongingHospitalOf" body="BelongingHospitalOf:= BelongingHospitalOf\/{(BelongingHospitalOf__doctorValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="BelongingHospitalOf__doctorValues" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="(BelongingHospitalOf__doctorValues|-> Instance) /:BelongingHospitalOf"/>
        <typingPredicate name="BelongingHospitalOf__doctorValues/:dom(BelongingHospitalOf)"/>
      </param>
    </operations>
    <operations name="Hospital__RemoveHospitalStay" body="HospitalStay:= HospitalStay-{(HospitalStay__patientValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="HospitalStay__patientValues" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(HospitalStay__patientValues|-> Instance) :HospitalStay"/>
      </param>
    </operations>
    <operations name="Patient__RemoveHospitalStay" body="HospitalStay:= HospitalStay-{(Instance|-> HospitalStay__hospitalValues)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="HospitalStay__hospitalValues" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="(Instance|-> HospitalStay__hospitalValues) :HospitalStay"/>
      </param>
    </operations>
    <operations name="Hospital__RemoveBelongingHospitalOf" body="BelongingHospitalOf:= BelongingHospitalOf-{(BelongingHospitalOf__doctorValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="BelongingHospitalOf__doctorValues" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="(BelongingHospitalOf__doctorValues|-> Instance) :BelongingHospitalOf"/>
      </param>
    </operations>
    <operations name="MedicalRecord__GetData" body="returnedData := MedicalRecord__data(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : dom(MedicalRecord__data)"/>
      </param>
    </operations>
    <operations name="MedicalRecord__GetIsValid" body="returnedData := MedicalRecord__isValid(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance : dom(MedicalRecord__isValid)"/>
      </param>
    </operations>
    <operations name="Patient__GetSnn" body="returnedData := Patient__snn(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance : dom(Patient__snn)"/>
      </param>
    </operations>
    <operations name="Patient__GetAddress" body="returnedData := Patient__address(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance : dom(Patient__address)"/>
      </param>
    </operations>
    <operations name="HospitalStay__GetDateIn" body="returnedData := HospitalStay__dateIn(Instance)">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance : dom(HospitalStay__dateIn)"/>
      </param>
    </operations>
    <operations name="HospitalStay__GetIsPayed" body="returnedData := HospitalStay__isPayed(Instance)">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance : dom(HospitalStay__isPayed)"/>
      </param>
    </operations>
    <operations name="MedicalRecord__SetData" body="MedicalRecord__data:= ({Instance}&lt;&lt;|MedicalRecord__data)\/ {(Instance|-> MedicalRecord__dataValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="MedicalRecord__dataValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> MedicalRecord__dataValue) /: MedicalRecord__data"/>
      </param>
    </operations>
    <operations name="MedicalRecord__SetIsValid" body="MedicalRecord__isValid:= ({Instance}&lt;&lt;|MedicalRecord__isValid)\/ {(Instance|-> MedicalRecord__isValidValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="MedicalRecord__isValidValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> MedicalRecord__isValidValue) /: MedicalRecord__isValid"/>
      </param>
    </operations>
    <operations name="Patient__SetAddress" body="Patient__address:= ({Instance}&lt;&lt;|Patient__address)\/ {(Instance|-> Patient__addressValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="Patient__addressValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> Patient__addressValue) /: Patient__address"/>
      </param>
    </operations>
    <operations name="HospitalStay__SetDateIn" body="HospitalStay__dateIn:= ({Instance}&lt;&lt;|HospitalStay__dateIn)\/ {(Instance|-> HospitalStay__dateInValue)}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
      </param>
      <param name="HospitalStay__dateInValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="(Instance|-> HospitalStay__dateInValue) /: HospitalStay__dateIn"/>
      </param>
    </operations>
    <operations name="HospitalStay__SetIsPayed" body="HospitalStay__isPayed:= ({Instance}&lt;&lt;|HospitalStay__isPayed)\/ {(Instance|-> HospitalStay__isPayedValue)}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
      </param>
      <param name="HospitalStay__isPayedValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> HospitalStay__isPayedValue) /: HospitalStay__isPayed"/>
      </param>
    </operations>
    <operations name="Patient__SetSnn" body="Patient__snn:= ({Instance}&lt;&lt;|Patient__snn)\/ {(Instance|-> Patient__snnValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="Patient__snnValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="Patient__snnValue /: ran(Patient__snn)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.1"/>
    <initialisation init="//@machines.0/@data.3"/>
    <initialisation init="//@machines.0/@data.5"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
    <initialisation init="//@machines.0/@data.12"/>
    <initialisation init="//@machines.0/@data.13"/>
    <initialisation init="//@machines.0/@data.14"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.16"/>
    <initialisation init="//@machines.0/@data.17"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.7/@param.3 //@machines.0/@operations.15/@param.4 //@machines.0/@operations.39/@param.1 //@machines.0/@operations.42/@param.1"/>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@operations.15/@param.3 //@machines.0/@operations.8/@param.3 //@machines.0/@operations.41/@param.1 //@machines.0/@operations.43/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.9" dom="//@machines.0/@data.3" ran="//@machines.0/@data.7"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" expression="TotalBijection" dom="//@machines.0/@data.3" ran="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.11" expression="PartialFunction" dom="//@machines.0/@data.5" ran="//@machines.0/@data.7"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.12" expression="TotalFunction" dom="//@machines.0/@data.1" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.13" expression="TotalFunction" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" expression="TotalFunction" dom="//@machines.0/@data.3" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="TotalFunction" dom="//@machines.0/@data.9" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" expression="TotalFunction" dom="//@machines.0/@data.9" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.17" expression="TotalInjection" dom="//@machines.0/@data.3" ran="//@sharedTypes/@sharedTypes.1"/>
  </sharedTypes>
</b:BSpec>
