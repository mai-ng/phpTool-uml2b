MACHINE
    ActionsHistory
SEES
 	Context, SecureUMLContext  
INCLUDES  
	Functional_Requirement
	
VARIABLES 
 historyHospitalStay__admission, orderExecutionHospitalStay__admission
	, historyDoctor__joinHospital, orderExecutionDoctor__joinHospital
	, historyDoctor__leaveHospital, orderExecutionDoctor__leaveHospital
	, historyHospitalStay__makePayment, orderExecutionHospitalStay__makePayment
	, historyMedicalRecord__validate, orderExecutionMedicalRecord__validate
	, currentOrder 
	
INVARIANT	
 historyHospitalStay__admission: PATIENT* HOSPITAL	+-> Users	  	 
	& orderExecutionHospitalStay__admission:  PATIENT* HOSPITAL	+-> NAT
	& historyDoctor__joinHospital: DOCTOR* HOSPITAL	+-> Users	  	 
	& orderExecutionDoctor__joinHospital:  DOCTOR* HOSPITAL	+-> NAT
	& historyDoctor__leaveHospital: DOCTOR	+-> Users	  	 
	& orderExecutionDoctor__leaveHospital:  DOCTOR	+-> NAT
	& historyHospitalStay__makePayment: PATIENT* HOSPITAL	+-> Users	  	 
	& orderExecutionHospitalStay__makePayment:  PATIENT* HOSPITAL	+-> NAT
	& historyMedicalRecord__validate: MEDICALRECORD	+-> Users	  	 
	& orderExecutionMedicalRecord__validate:  MEDICALRECORD	+-> NAT
	& currentOrder : NAT
	
INITIALISATION 
 historyHospitalStay__admission:= {} || orderExecutionHospitalStay__admission := {}
	|| historyDoctor__joinHospital:= {} || orderExecutionDoctor__joinHospital := {}
	|| historyDoctor__leaveHospital:= {} || orderExecutionDoctor__leaveHospital := {}
	|| historyHospitalStay__makePayment:= {} || orderExecutionHospitalStay__makePayment := {}
	|| historyMedicalRecord__validate:= {} || orderExecutionMedicalRecord__validate := {}
	|| currentOrder := 0
	
OPERATIONS
	
result<--ExecutionHospitalStay__admission(pp, hh, usr)=
PRE 
	pp: PATIENT & hh: HOSPITAL
	& currentOrder+1: NAT
	& usr : Users
THEN
	IF 
		pp : Patient &
		hh : Hospital 
		
   THEN
		result<--  HospitalStay__admission(pp, hh)||
  		historyHospitalStay__admission(pp, hh) := usr || 
  		orderExecutionHospitalStay__admission(pp, hh) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result:=Ko
  	END   
 END
;
result<--ExecutionDoctor__joinHospital(dd, hh, usr)=
PRE 
	dd: DOCTOR & hh: HOSPITAL
	& currentOrder+1: NAT
	& usr : Users
THEN
	IF 
		dd : Doctor &
		hh : Hospital 
		& dd|->hh /: BelongingHospitalOf /* Precondition generated from annotation*/  
   THEN
		result<--  Doctor__joinHospital(dd, hh)||
  		historyDoctor__joinHospital(dd, hh) := usr || 
  		orderExecutionDoctor__joinHospital(dd, hh) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result:=Ko
  	END   
 END
;
result<--ExecutionDoctor__leaveHospital(dd, usr)=
PRE 
	dd: DOCTOR
	& currentOrder+1: NAT
	& usr : Users
THEN
	IF 
		dd : Doctor 
		& dd : dom(BelongingHospitalOf) /* Precondition generated from annotation*/  
   THEN
		result<--  Doctor__leaveHospital(dd)||
  		historyDoctor__leaveHospital(dd) := usr || 
  		orderExecutionDoctor__leaveHospital(dd) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result:=Ko
  	END   
 END
;
result<--ExecutionHospitalStay__makePayment(pp, hh, usr)=
PRE 
	pp: PATIENT & hh: HOSPITAL
	& currentOrder+1: NAT
	& usr : Users
THEN
	IF 
		pp : Patient &
		hh : Hospital 
		& pp|->hh : HospitalStay /* Precondition generated from annotation*/  
   THEN
		result<--  HospitalStay__makePayment(pp, hh)||
  		historyHospitalStay__makePayment(pp, hh) := usr || 
  		orderExecutionHospitalStay__makePayment(pp, hh) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result:=Ko
  	END   
 END
;
result<--ExecutionMedicalRecord__validate(mr, usr)=
PRE 
	mr: MEDICALRECORD
	& currentOrder+1: NAT
	& usr : Users
THEN
	IF 
		mr : MedicalRecord 
		
   THEN
		result<--  MedicalRecord__validate(mr)||
  		historyMedicalRecord__validate(mr) := usr || 
  		orderExecutionMedicalRecord__validate(mr) := currentOrder ||
  		currentOrder := currentOrder + 1
  	ELSE
  		result:=Ko
  	END   
 END
 END
 