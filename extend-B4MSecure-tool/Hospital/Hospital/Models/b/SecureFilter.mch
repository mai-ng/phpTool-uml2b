
MACHINE
    Secure_Filter
SEES  
  Context, SecureUMLContext, SecureUMLTranslation
INCLUDES 
  ActionsHistory 

OPERATIONS 							
 ERROR: wrong design two Activities have the same operation to secure
			

result, access<--FilterHospitalStay__makePayment(pp, hh, dd, usr)=	 
PRE 	
	pp: PATIENT &	hh: HOSPITAL &	dd: DOCTOR &	usr : Users
	& currentOrder+1: NAT
THEN 
	CHOICE
  		result<--ExecutionHospitalStay__makePayment(pp, hh, usr)||
  		access := granted
  	OR
  		result:=Ko || access := denied
  	END   
END 	END
