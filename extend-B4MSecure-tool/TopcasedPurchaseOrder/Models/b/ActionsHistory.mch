
MACHINE
    ActionsHistory    
SEES
 	Context, SecureUMLContext	
VARIABLES
	currentOrder,
	userExecutedPurchaseOrder__receive, orderExecutionPurchaseOrder__receive	,
	userExecutedPurchaseOrder__approve, orderExecutionPurchaseOrder__approve	, 
	userExecutedPurchaseOrder__create, orderExecutionPurchaseOrder__create	  	

INVARIANT
	currentOrder : NAT &
 	userExecutedPurchaseOrder__receive : PURCHASEORDER +-> Users	 & 	 
	orderExecutionPurchaseOrder__receive:  PURCHASEORDER +-> NAT
	&
 	userExecutedPurchaseOrder__approve : PURCHASEORDER +-> Users	 & 	 
	orderExecutionPurchaseOrder__approve:  PURCHASEORDER +-> NAT
	&
 	userExecutedPurchaseOrder__create : PURCHASEORDER +-> Users	 & 	 
	orderExecutionPurchaseOrder__create:  PURCHASEORDER +-> NAT

INITIALISATION
	currentOrder := 0 ||
	userExecutedPurchaseOrder__receive := {} || 
	orderExecutionPurchaseOrder__receive := {}
	||
	userExecutedPurchaseOrder__approve := {} ||
	orderExecutionPurchaseOrder__approve := {}
	||
	userExecutedPurchaseOrder__create := {} ||
	orderExecutionPurchaseOrder__create := {}
OPERATIONS
LogPurchaseOrder__receive(po, usr)=
PRE 
	po: PURCHASEORDER &
	currentOrder+1: NAT &
	usr : Users
THEN
	userExecutedPurchaseOrder__receive(po) := usr || 
  	orderExecutionPurchaseOrder__receive(po) := currentOrder ||
  	currentOrder := currentOrder + 1
END;
LogPurchaseOrder__approve(po, usr)=
PRE 
	po: PURCHASEORDER &
	currentOrder+1: NAT &
	usr : Users
THEN
	userExecutedPurchaseOrder__approve(po) := usr || 
  	orderExecutionPurchaseOrder__approve(po) := currentOrder ||
  	currentOrder := currentOrder + 1
END;
LogPurchaseOrder__create(po, usr)=
PRE 
	po: PURCHASEORDER &
	currentOrder+1: NAT &
	usr : Users
THEN
	userExecutedPurchaseOrder__create(po) := usr || 
  	orderExecutionPurchaseOrder__create(po) := currentOrder ||
  	currentOrder := currentOrder + 1
END  
END
 