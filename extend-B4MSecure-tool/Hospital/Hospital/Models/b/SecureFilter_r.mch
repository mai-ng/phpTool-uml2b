
REFINEMENT
    Secure_Filter_r
REFINES Secure_Filter
SEES  
   Context, AD_Translation, SecureUMLTranslation, SecureUMLContext
INCLUDES
    ActionsHistory

OPERATIONS 							
 ERROR: wrong design two Activities have the same operation to secure

	result, access<--FilterHospitalStay__makePayment(pp, hh, dd, usr)=	 
	VAR staticRights IN
		staticRights<--SecureHospitalStay__makePayment(usr);
		IF staticRights = granted THEN
			VAR dynamicRights IN
				dynamicRights<--ADHospitalStay__makePayment(pp, hh, dd, usr);
				IF dynamicRights = granted  THEN
					result<--ExecutionHospitalStay__makePayment(pp, hh, usr)
            	ELSE
                	result := Ko
            	END;
                access := dynamicRights
            END
        ELSE
            access := denied ;
           	result := Ko
        END   
    END 	

END
