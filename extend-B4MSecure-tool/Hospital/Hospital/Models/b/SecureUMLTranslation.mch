
MACHINE
    SecureUMLTranslation
SEES
	SecureUMLContext
VARIABLES
    CurrentRole
INVARIANT
    CurrentRole : Users +-> Roles &
    CurrentRole <: PermittedUsersRoles    
INITIALISATION
    CurrentRole:={}
OPERATIONS
access<--SecureHospitalStay__deleteHospitalStay(usr)=
PRE
	usr : Users
THEN	
 	IF 
 		 usr : dom(CurrentRole) & 
 		 HospitalStay__deleteHospitalStay_Label : Permissions(CurrentRole(usr))  
 	THEN
	     access:=granted
	ELSE
	     access:=denied
	END
END;		
		
access<--SecureHospitalStay__makePayment(usr)=
PRE
	usr : Users
THEN	
 	IF 
 		 usr : dom(CurrentRole) & 
 		 HospitalStay__makePayment_Label : Permissions(CurrentRole(usr))  
 	THEN
	     access:=granted
	ELSE
	     access:=denied
	END
END;		
		
access<--SecureHospitalStay__admission(usr)=
PRE
	usr : Users
THEN	
 	IF 
 		 usr : dom(CurrentRole) & 
 		 HospitalStay__admission_Label : Permissions(CurrentRole(usr))  
 	THEN
	     access:=granted
	ELSE
	     access:=denied
	END
END;		
		
access<--SecureMedicalRecord__validate(usr)=
PRE
	usr : Users
THEN	
 	IF 
 		 usr : dom(CurrentRole) & 
 		 MedicalRecord__validate_Label : Permissions(CurrentRole(usr))  
 	THEN
	     access:=granted
	ELSE
	     access:=denied
	END
END;		
		
ConnectUser(usr, role)=
PRE 
    usr : Users & role : Roles &
    usr|->role : PermittedUsersRoles
THEN
    CurrentRole(usr):=role
END

END
