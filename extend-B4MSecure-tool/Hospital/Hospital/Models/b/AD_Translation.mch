MACHINE
    AD_Translation
SEES
 	Context, SecureUMLContext, ActionsHistory  
 	
OPERATIONS 							
 ERROR: wrong design two Activities have the same operation to secure

access<--ADHospitalStay__makePayment(pp, hh, usr)=	 
PRE 	
	pp: PATIENT &	hh: HOSPITAL &	usr : Users
THEN 	
	IF
		pp|->hh : dom(historyHospitalStay__admission)
		& usr = historyHospitalStay__admission(pp, hh)

	THEN
		access := granted
    ELSE
        access := denied
    END
END	
END
