
MACHINE
    SecureFilter    
SEES  
  Context, SecureUMLContext, SecureUMLTranslation  
INCLUDES 
  FunctionalRequirement  
OPERATIONS
	

result,access<--FilterPurchaseOrder__receive(po, usr)=
PRE
	po: PURCHASEORDER&
	usr : Users 
THEN
	CHOICE
		access := granted ||
		result<--PurchaseOrder__receive(po)
    OR
        access := denied || result := Ko
    END
END

END
 