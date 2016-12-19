MACHINE
    ADTranslation      
SEES
 	Context, SecureUMLContext, ActionsHistory   		
OPERATIONS
	

access<--ADPurchaseOrder__receive(po, usr)=
PRE
	po: PURCHASEORDER &
	usr : Users
THEN
	IF
		po : dom(userExecutedPurchaseOrder__approve)&
		po : dom(orderExecutionPurchaseOrder__approve)&
		po : dom(userExecutedPurchaseOrder__create)&
		po : dom(orderExecutionPurchaseOrder__create)
&
		usr /= userExecutedPurchaseOrder__create(po)			&
		orderExecutionPurchaseOrder__approve(po)
			<= orderExecutionPurchaseOrder__create(po)

	THEN
		access := granted
    ELSE
        access := denied
    END
END

END
 