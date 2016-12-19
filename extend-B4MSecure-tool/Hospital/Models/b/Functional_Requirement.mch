
MACHINE 
	Functional_Requirement
SEES
	Context

VARIABLES

 MedicalRecord
, Patient
, Doctor
, Hospital
, HospitalStay
, MedicalRecordOf
, BelongingHospitalOf
, MedicalRecord__data
, MedicalRecord__isValid
, Patient__address
, HospitalStay__dateIn
, HospitalStay__isPayed
, Patient__snn

INVARIANT

 MedicalRecord <: MEDICALRECORD 
& Patient <: PATIENT 
& Doctor <: DOCTOR 
& Hospital <: HOSPITAL 
& HospitalStay : Patient <-> Hospital 
& MedicalRecordOf : Patient >->> MedicalRecord 
& BelongingHospitalOf : Doctor +-> Hospital 
& MedicalRecord__data : MedicalRecord --> STR 
& MedicalRecord__isValid : MedicalRecord --> BOOL 
& Patient__address : Patient --> STR 
& HospitalStay__dateIn : HospitalStay --> NAT 
& HospitalStay__isPayed : HospitalStay --> BOOL 
& Patient__snn : Patient >-> NAT 

INITIALISATION

 MedicalRecord := {}
|| Patient := {}
|| Doctor := {}
|| Hospital := {}
|| HospitalStay := {}
|| MedicalRecordOf := {}
|| BelongingHospitalOf := {}
|| MedicalRecord__data := {}
|| MedicalRecord__isValid := {}
|| Patient__address := {}
|| HospitalStay__dateIn := {}
|| HospitalStay__isPayed := {}
|| Patient__snn := {}

OPERATIONS

result<--MedicalRecord__validate( mr )=
PRE
	mr: MEDICALRECORD	
THEN
	IF
		mr : MedicalRecord 
	
	THEN 
		MedicalRecord__isValid(mr) := TRUE /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
returnedData, result<--Patient__viewMedicalRecord( mr )=
PRE
	mr: MEDICALRECORD	
THEN
	IF
		mr : MedicalRecord 
	
	THEN 
		returnedData := MedicalRecord__data(mr) /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Doctor__joinHospital( dd , hh )=
PRE
	dd: DOCTOR	&	hh: HOSPITAL	
THEN
	IF
		dd : Doctor &		hh : Hospital 
		& dd|->hh /: BelongingHospitalOf /* Precondition generated from annotation*/  
	THEN 
		BelongingHospitalOf(dd) := hh /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Doctor__leaveHospital( dd )=
PRE
	dd: DOCTOR	
THEN
	IF
		dd : Doctor 
		& dd : dom(BelongingHospitalOf) /* Precondition generated from annotation*/  
	THEN 
		BelongingHospitalOf := {dd}<<|BelongingHospitalOf /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--HospitalStay__admission( pp , hh )=
PRE
	pp: PATIENT	&	hh: HOSPITAL	
THEN
	IF
		pp : Patient &		hh : Hospital 
	
	THEN 
		HospitalStay := HospitalStay \/ {pp|->hh} ||
		HospitalStay__isPayed(pp|->hh) := FALSE ||
		ANY time WHERE time:NAT THEN	
			HospitalStay__dateIn(pp|->hh) := time
		END /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--HospitalStay__deleteHospitalStay( pp , hh )=
PRE
	pp: PATIENT	&	hh: HOSPITAL	
THEN
	IF
		pp : Patient &		hh : Hospital 
		& pp|->hh : HospitalStay /* Precondition generated from annotation*/  
	THEN 
		HospitalStay := HospitalStay - {pp|->hh} ||
		HospitalStay__dateIn :=  {pp|->hh} <<| HospitalStay__dateIn ||
		HospitalStay__isPayed := {pp|->hh} <<| HospitalStay__isPayed  /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--HospitalStay__makePayment( pp , hh )=
PRE
	pp: PATIENT	&	hh: HOSPITAL	
THEN
	IF
		pp : Patient &		hh : Hospital 
		& pp|->hh : HospitalStay /* Precondition generated from annotation*/  
	THEN 
		HospitalStay__isPayed(pp|->hh) := TRUE /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
MedicalRecord_NEW( Instance , MedicalRecordOf__patientValue , MedicalRecord__dataValue , MedicalRecord__isValidValue )=
PRE
	Instance: MEDICALRECORD	&	MedicalRecordOf__patientValue: Patient	&	MedicalRecord__dataValue: STR	&	MedicalRecord__isValidValue: BOOL	THEN
	IF
		Instance : MEDICALRECORD &		Instance /: MedicalRecord &		MedicalRecordOf__patientValue : Patient &		MedicalRecordOf__patientValue/:dom(MedicalRecordOf) &		MedicalRecord__dataValue : STR &		MedicalRecord__isValidValue : BOOL 
	THEN
		MedicalRecord := MedicalRecord \/ {Instance} 
 || MedicalRecordOf:= MedicalRecordOf \/ {(MedicalRecordOf__patientValue|->Instance)}
 || MedicalRecord__data:= MedicalRecord__data \/ {(Instance|->MedicalRecord__dataValue)}
 || MedicalRecord__isValid:= MedicalRecord__isValid \/ {(Instance|->MedicalRecord__isValidValue)} 
	END
END
;
Patient_NEW( Instance , MedicalRecordOf__medicalRecordValue , Patient__addressValue , Patient__snnValue )=
PRE
	Instance: PATIENT	&	MedicalRecordOf__medicalRecordValue: MedicalRecord	&	Patient__addressValue: STR	&	Patient__snnValue: NAT	THEN
	IF
		Instance : PATIENT &		Instance /: Patient &		MedicalRecordOf__medicalRecordValue : MedicalRecord &		MedicalRecordOf__medicalRecordValue/:ran(MedicalRecordOf) &		Patient__addressValue : STR &		Patient__snnValue : NAT &		Patient__snnValue /:ran(Patient__snn) 
	THEN
		Patient := Patient \/ {Instance} 
 || MedicalRecordOf:= MedicalRecordOf \/ {(Instance|->MedicalRecordOf__medicalRecordValue)}
 || Patient__address:= Patient__address \/ {(Instance|->Patient__addressValue)}
 || Patient__snn:= Patient__snn \/ {(Instance|->Patient__snnValue)} 
	END
END
;
Doctor_NEW( Instance )=
PRE
	Instance: DOCTOR	THEN
	IF
		Instance : DOCTOR &		Instance /: Doctor 
	THEN
		Doctor := Doctor \/ {Instance} 
	END
END
;
Hospital_NEW( Instance )=
PRE
	Instance: HOSPITAL	THEN
	IF
		Instance : HOSPITAL &		Instance /: Hospital 
	THEN
		Hospital := Hospital \/ {Instance} 
	END
END
;
MedicalRecord_Free( Instance )=
PRE
	Instance: MedicalRecord	THEN
	IF
		Instance : MEDICALRECORD &		Instance : MedicalRecord &		MedicalRecordOf~[{Instance}]={} 
	THEN
		MedicalRecord := MedicalRecord - {Instance}
 || MedicalRecordOf:= MedicalRecordOf|>> {Instance}
 || MedicalRecord__data:= {Instance}<<|MedicalRecord__data
 || MedicalRecord__isValid:= {Instance}<<|MedicalRecord__isValid 
	END
END
;
Patient_Free( Instance )=
PRE
	Instance: Patient	THEN
	IF
		Instance : PATIENT &		Instance : Patient &		MedicalRecordOf[{Instance}]={} 
	THEN
		Patient := Patient - {Instance}
 || HospitalStay:= {Instance}<<|HospitalStay
 || MedicalRecordOf:= {Instance}<<|MedicalRecordOf
 || Patient__snn:= {Instance}<<|Patient__snn
 || Patient__address:= {Instance}<<|Patient__address 
	END
END
;
Doctor_Free( Instance )=
PRE
	Instance: Doctor	THEN
	IF
		Instance : DOCTOR &		Instance : Doctor 
	THEN
		Doctor := Doctor - {Instance}
 || BelongingHospitalOf:= {Instance}<<|BelongingHospitalOf 
	END
END
;
Hospital_Free( Instance )=
PRE
	Instance: Hospital	THEN
	IF
		Instance : HOSPITAL &		Instance : Hospital 
	THEN
		Hospital := Hospital - {Instance}
 || HospitalStay:= HospitalStay|>> {Instance}
 || BelongingHospitalOf:= BelongingHospitalOf|>> {Instance} 
	END
END
;
HospitalStay_NEW( Instance , PatientInstance , HospitalInstance , HospitalStay__dateInValue , HospitalStay__isPayedValue )=
PRE
	Instance: HospitalStay	&	PatientInstance: Patient	&	HospitalInstance: Hospital	&	HospitalStay__dateInValue: NAT	&	HospitalStay__isPayedValue: BOOL	THEN
	IF
		Instance : Patient*Hospital &		Instance /: HospitalStay &		PatientInstance : Patient &		HospitalInstance : Hospital &		( PatientInstance|->HospitalInstance )= Instance &		HospitalStay__dateInValue : NAT &		HospitalStay__isPayedValue : BOOL 
	THEN
		HospitalStay := HospitalStay \/ {Instance}
 || HospitalStay__dateIn:= HospitalStay__dateIn \/ {(Instance|->HospitalStay__dateInValue)}
 || HospitalStay__isPayed:= HospitalStay__isPayed \/ {(Instance|->HospitalStay__isPayedValue)} 
	END
END
;
HospitalStay_Free( Instance )=
PRE
	Instance: HospitalStay	THEN
	IF
		Instance : HospitalStay 
	THEN
		HospitalStay := HospitalStay - {Instance}
 || HospitalStay__dateIn:= {Instance}<<|HospitalStay__dateIn
 || HospitalStay__isPayed:= {Instance}<<|HospitalStay__isPayed 
	END
END
;
returnedData<--Hospital__GetHospitalStay( Instance )=
PRE
	Instance: Hospital	THEN
	IF
		Instance : Hospital &		Instance : ran(HospitalStay) 
	THEN
		returnedData := HospitalStay~(Instance) 
	END
END
;
returnedData<--Patient__GetHospitalStay( Instance )=
PRE
	Instance: Patient	THEN
	IF
		Instance : Patient &		Instance : dom(HospitalStay) 
	THEN
		returnedData := HospitalStay(Instance) 
	END
END
;
returnedData<--MedicalRecord__GetMedicalRecordOf( Instance )=
PRE
	Instance: MedicalRecord	THEN
	IF
		Instance : MedicalRecord &		Instance : ran(MedicalRecordOf) 
	THEN
		returnedData := MedicalRecordOf~(Instance) 
	END
END
;
returnedData<--Patient__GetMedicalRecordOf( Instance )=
PRE
	Instance: Patient	THEN
	IF
		Instance : Patient &		Instance : dom(MedicalRecordOf) 
	THEN
		returnedData := MedicalRecordOf(Instance) 
	END
END
;
returnedData<--Hospital__GetBelongingHospitalOf( Instance )=
PRE
	Instance: Hospital	THEN
	IF
		Instance : Hospital &		Instance : ran(BelongingHospitalOf) 
	THEN
		returnedData := BelongingHospitalOf~(Instance) 
	END
END
;
returnedData<--Doctor__GetBelongingHospitalOf( Instance )=
PRE
	Instance: Doctor	THEN
	IF
		Instance : Doctor &		Instance : dom(BelongingHospitalOf) 
	THEN
		returnedData := BelongingHospitalOf(Instance) 
	END
END
;
MedicalRecord__SetMedicalRecordOf( Instance , MedicalRecordOf__patientValue )=
PRE
	Instance: MedicalRecord	&	MedicalRecordOf__patientValue: Patient	THEN
	IF
		Instance : MedicalRecord &		MedicalRecordOf__patientValue : Patient &		(MedicalRecordOf__patientValue|-> Instance) /: MedicalRecordOf &		MedicalRecordOf__patientValue/:dom(MedicalRecordOf) &		#cc.(cc: MedicalRecord & cc/=Instance & cc: MedicalRecordOf[MedicalRecordOf~[{Instance}]]) 
	THEN
		MedicalRecordOf:= (MedicalRecordOf|>>{Instance})\/{(MedicalRecordOf__patientValue|-> Instance)} 
	END
END
;
Patient__SetMedicalRecordOf( Instance , MedicalRecordOf__medicalRecordValue )=
PRE
	Instance: Patient	&	MedicalRecordOf__medicalRecordValue: MedicalRecord	THEN
	IF
		Instance : Patient &		MedicalRecordOf__medicalRecordValue : MedicalRecord &		(Instance|-> MedicalRecordOf__medicalRecordValue) /: MedicalRecordOf &		MedicalRecordOf__medicalRecordValue/:ran(MedicalRecordOf) &		#cc.(cc: Patient & cc/=Instance & cc: MedicalRecordOf~[MedicalRecordOf[{Instance}]]) 
	THEN
		MedicalRecordOf:= ({Instance}<<|MedicalRecordOf)\/ {(Instance|-> MedicalRecordOf__medicalRecordValue)} 
	END
END
;
Doctor__SetBelongingHospitalOf( Instance , BelongingHospitalOf__hospitalValue )=
PRE
	Instance: Doctor	&	BelongingHospitalOf__hospitalValue: Hospital	THEN
	IF
		Instance : Doctor &		BelongingHospitalOf__hospitalValue : Hospital &		(Instance|-> BelongingHospitalOf__hospitalValue) /: BelongingHospitalOf 
	THEN
		BelongingHospitalOf:= ({Instance}<<|BelongingHospitalOf)\/ {(Instance|-> BelongingHospitalOf__hospitalValue)} 
	END
END
;
result<--Hospital__AddHospitalStay( Instance , HospitalStay__patientValues )=
PRE
	Instance: Hospital	&	HospitalStay__patientValues: Patient	
THEN
	IF
		Instance : Hospital &		HospitalStay__patientValues : Patient &		(HospitalStay__patientValues|-> Instance) /:HospitalStay 
	
	THEN 
		HospitalStay:= HospitalStay\/{(HospitalStay__patientValues|-> Instance)} ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Patient__AddHospitalStay( Instance , HospitalStay__hospitalValues )=
PRE
	Instance: Patient	&	HospitalStay__hospitalValues: Hospital	
THEN
	IF
		Instance : Patient &		HospitalStay__hospitalValues : Hospital &		(Instance|-> HospitalStay__hospitalValues) /:HospitalStay 
	
	THEN 
		HospitalStay:= HospitalStay\/ {(Instance|-> HospitalStay__hospitalValues)} ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Hospital__AddBelongingHospitalOf( Instance , BelongingHospitalOf__doctorValues )=
PRE
	Instance: Hospital	&	BelongingHospitalOf__doctorValues: Doctor	
THEN
	IF
		Instance : Hospital &		BelongingHospitalOf__doctorValues : Doctor &		(BelongingHospitalOf__doctorValues|-> Instance) /:BelongingHospitalOf &		BelongingHospitalOf__doctorValues/:dom(BelongingHospitalOf) 
	
	THEN 
		BelongingHospitalOf:= BelongingHospitalOf\/{(BelongingHospitalOf__doctorValues|-> Instance)} ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Hospital__RemoveHospitalStay( Instance , HospitalStay__patientValues )=
PRE
	Instance: Hospital	&	HospitalStay__patientValues: Patient	
THEN
	IF
		Instance : Hospital &		HospitalStay__patientValues : Patient &		(HospitalStay__patientValues|-> Instance) :HospitalStay 
	
	THEN 
		HospitalStay:= HospitalStay-{(HospitalStay__patientValues|-> Instance)} ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Patient__RemoveHospitalStay( Instance , HospitalStay__hospitalValues )=
PRE
	Instance: Patient	&	HospitalStay__hospitalValues: Hospital	
THEN
	IF
		Instance : Patient &		HospitalStay__hospitalValues : Hospital &		(Instance|-> HospitalStay__hospitalValues) :HospitalStay 
	
	THEN 
		HospitalStay:= HospitalStay-{(Instance|-> HospitalStay__hospitalValues)} ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Hospital__RemoveBelongingHospitalOf( Instance , BelongingHospitalOf__doctorValues )=
PRE
	Instance: Hospital	&	BelongingHospitalOf__doctorValues: Doctor	
THEN
	IF
		Instance : Hospital &		BelongingHospitalOf__doctorValues : Doctor &		(BelongingHospitalOf__doctorValues|-> Instance) :BelongingHospitalOf 
	
	THEN 
		BelongingHospitalOf:= BelongingHospitalOf-{(BelongingHospitalOf__doctorValues|-> Instance)} ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
returnedData<--MedicalRecord__GetData( Instance )=
PRE
	Instance: MedicalRecord	THEN
	IF
		Instance : MedicalRecord &		Instance : dom(MedicalRecord__data) 
	THEN
		returnedData := MedicalRecord__data(Instance) 
	END
END
;
returnedData<--MedicalRecord__GetIsValid( Instance )=
PRE
	Instance: MedicalRecord	THEN
	IF
		Instance : MedicalRecord &		Instance : dom(MedicalRecord__isValid) 
	THEN
		returnedData := MedicalRecord__isValid(Instance) 
	END
END
;
returnedData<--Patient__GetSnn( Instance )=
PRE
	Instance: Patient	THEN
	IF
		Instance : Patient &		Instance : dom(Patient__snn) 
	THEN
		returnedData := Patient__snn(Instance) 
	END
END
;
returnedData<--Patient__GetAddress( Instance )=
PRE
	Instance: Patient	THEN
	IF
		Instance : Patient &		Instance : dom(Patient__address) 
	THEN
		returnedData := Patient__address(Instance) 
	END
END
;
returnedData<--HospitalStay__GetDateIn( Instance )=
PRE
	Instance: HospitalStay	THEN
	IF
		Instance : HospitalStay &		Instance : dom(HospitalStay__dateIn) 
	THEN
		returnedData := HospitalStay__dateIn(Instance) 
	END
END
;
returnedData<--HospitalStay__GetIsPayed( Instance )=
PRE
	Instance: HospitalStay	THEN
	IF
		Instance : HospitalStay &		Instance : dom(HospitalStay__isPayed) 
	THEN
		returnedData := HospitalStay__isPayed(Instance) 
	END
END
;
MedicalRecord__SetData( Instance , MedicalRecord__dataValue )=
PRE
	Instance: MedicalRecord	&	MedicalRecord__dataValue: STR	THEN
	IF
		Instance : MedicalRecord &		MedicalRecord__dataValue : STR &		(Instance|-> MedicalRecord__dataValue) /: MedicalRecord__data 
	THEN
		MedicalRecord__data:= ({Instance}<<|MedicalRecord__data)\/ {(Instance|-> MedicalRecord__dataValue)} 
	END
END
;
MedicalRecord__SetIsValid( Instance , MedicalRecord__isValidValue )=
PRE
	Instance: MedicalRecord	&	MedicalRecord__isValidValue: BOOL	THEN
	IF
		Instance : MedicalRecord &		MedicalRecord__isValidValue : BOOL &		(Instance|-> MedicalRecord__isValidValue) /: MedicalRecord__isValid 
	THEN
		MedicalRecord__isValid:= ({Instance}<<|MedicalRecord__isValid)\/ {(Instance|-> MedicalRecord__isValidValue)} 
	END
END
;
Patient__SetAddress( Instance , Patient__addressValue )=
PRE
	Instance: Patient	&	Patient__addressValue: STR	THEN
	IF
		Instance : Patient &		Patient__addressValue : STR &		(Instance|-> Patient__addressValue) /: Patient__address 
	THEN
		Patient__address:= ({Instance}<<|Patient__address)\/ {(Instance|-> Patient__addressValue)} 
	END
END
;
HospitalStay__SetDateIn( Instance , HospitalStay__dateInValue )=
PRE
	Instance: HospitalStay	&	HospitalStay__dateInValue: NAT	THEN
	IF
		Instance : HospitalStay &		HospitalStay__dateInValue : NAT &		(Instance|-> HospitalStay__dateInValue) /: HospitalStay__dateIn 
	THEN
		HospitalStay__dateIn:= ({Instance}<<|HospitalStay__dateIn)\/ {(Instance|-> HospitalStay__dateInValue)} 
	END
END
;
HospitalStay__SetIsPayed( Instance , HospitalStay__isPayedValue )=
PRE
	Instance: HospitalStay	&	HospitalStay__isPayedValue: BOOL	THEN
	IF
		Instance : HospitalStay &		HospitalStay__isPayedValue : BOOL &		(Instance|-> HospitalStay__isPayedValue) /: HospitalStay__isPayed 
	THEN
		HospitalStay__isPayed:= ({Instance}<<|HospitalStay__isPayed)\/ {(Instance|-> HospitalStay__isPayedValue)} 
	END
END
;
Patient__SetSnn( Instance , Patient__snnValue )=
PRE
	Instance: Patient	&	Patient__snnValue: NAT	THEN
	IF
		Instance : Patient &		Patient__snnValue : NAT &		Patient__snnValue /: ran(Patient__snn) 
	THEN
		Patient__snn:= ({Instance}<<|Patient__snn)\/ {(Instance|-> Patient__snnValue)} 
	END
END

END
