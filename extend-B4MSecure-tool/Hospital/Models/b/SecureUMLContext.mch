
	
MACHINE 
	SecureUMLContext 
SETS
     Users = {Jack, Paul, Mary, Bob, none}
     ; Roles = {SecretaryRole, DoctorRole}
     ; Operations = {
		 HospitalStay__deleteHospitalStay_Label 		
		, HospitalStay__makePayment_Label 		
		, HospitalStay__admission_Label 		
		, MedicalRecord__validate_Label 		
		}
     ; Access = {granted, denied}
CONSTANTS
    Permissions,  PermittedUsersRoles
PROPERTIES
     Permissions ={ 
      SecretaryRole|->{       	
     		 HospitalStay__deleteHospitalStay_Label      	,      	
     		 HospitalStay__makePayment_Label      	,      	
     		 HospitalStay__admission_Label      	     	   
     } 
     , DoctorRole|->{       	
     		 MedicalRecord__validate_Label      	     	   
     } 
     } 
     & PermittedUsersRoles ={Jack|->SecretaryRole, Paul|->DoctorRole, Mary|->SecretaryRole, Bob|->DoctorRole}
 END
