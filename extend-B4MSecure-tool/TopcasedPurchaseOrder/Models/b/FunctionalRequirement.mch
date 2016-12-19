
MACHINE 
	FunctionalRequirement
SEES
	Context

VARIABLES

 PurchaseOrder
, Supplier
, PurchaseOrder__createdDate
, PurchaseOrder__isApproved
, PurchaseOrder__isReceived
, Supplier__name
, PurchaseOrder__id
, Supplier__id

INVARIANT

 PurchaseOrder <: PURCHASEORDER 
& Supplier <: SUPPLIER 
& PurchaseOrder__createdDate : PurchaseOrder --> NAT 
& PurchaseOrder__isApproved : PurchaseOrder --> BOOL 
& PurchaseOrder__isReceived : PurchaseOrder --> BOOL 
& Supplier__name : Supplier --> STR 
& PurchaseOrder__id : PurchaseOrder >-> NAT 
& Supplier__id : Supplier >-> NAT 

INITIALISATION

 PurchaseOrder := {}
|| Supplier := {}
|| PurchaseOrder__createdDate := {}
|| PurchaseOrder__isApproved := {}
|| PurchaseOrder__isReceived := {}
|| Supplier__name := {}
|| PurchaseOrder__id := {}
|| Supplier__id := {}

OPERATIONS

result<--PurchaseOrder__create( po )=
PRE
	po: PURCHASEORDER	
THEN
	IF
		po : PurchaseOrder 
	
	THEN 
		ANY nb, time WHERE nb : NAT & time :ran(PurchaseOrder__id)-NAT THEN
	PurchaseOrder__id(po) := nb ||
	PurchaseOrder__createdDate(po) := time ||
	PurchaseOrder__isApproved(po) := FALSE ||
	PurchaseOrder__isReceived(po) := FALSE 
END /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--PurchaseOrder__approve( po )=
PRE
	po: PURCHASEORDER	
THEN
	IF
		po : PurchaseOrder 
	
	THEN 
		PurchaseOrder__isApproved(po) := TRUE /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--PurchaseOrder__receive( po )=
PRE
	po: PURCHASEORDER	
THEN
	IF
		po : PurchaseOrder 
	
	THEN 
		PurchaseOrder__isReceived(po) := TRUE
 /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
PurchaseOrder_NEW( Instance , PurchaseOrder__createdDateValue , PurchaseOrder__isApprovedValue , PurchaseOrder__isReceivedValue , PurchaseOrder__idValue )=
PRE
	Instance: PURCHASEORDER	&	PurchaseOrder__createdDateValue: NAT	&	PurchaseOrder__isApprovedValue: BOOL	&	PurchaseOrder__isReceivedValue: BOOL	&	PurchaseOrder__idValue: NAT	THEN
	IF
		Instance : PURCHASEORDER &		Instance /: PurchaseOrder &		PurchaseOrder__createdDateValue : NAT &		PurchaseOrder__isApprovedValue : BOOL &		PurchaseOrder__isReceivedValue : BOOL &		PurchaseOrder__idValue : NAT &		PurchaseOrder__idValue /:ran(PurchaseOrder__id) 
	THEN
		PurchaseOrder := PurchaseOrder \/ {Instance}
 || PurchaseOrder__createdDate:= PurchaseOrder__createdDate \/ {(Instance|->PurchaseOrder__createdDateValue)}
 || PurchaseOrder__isApproved:= PurchaseOrder__isApproved \/ {(Instance|->PurchaseOrder__isApprovedValue)}
 || PurchaseOrder__isReceived:= PurchaseOrder__isReceived \/ {(Instance|->PurchaseOrder__isReceivedValue)}
 || PurchaseOrder__id:= PurchaseOrder__id \/ {(Instance|->PurchaseOrder__idValue)} 
	END
END
;
Supplier_NEW( Instance , Supplier__nameValue , Supplier__idValue )=
PRE
	Instance: SUPPLIER	&	Supplier__nameValue: STR	&	Supplier__idValue: NAT	THEN
	IF
		Instance : SUPPLIER &		Instance /: Supplier &		Supplier__nameValue : STR &		Supplier__idValue : NAT &		Supplier__idValue /:ran(Supplier__id) 
	THEN
		Supplier := Supplier \/ {Instance}
 || Supplier__name:= Supplier__name \/ {(Instance|->Supplier__nameValue)}
 || Supplier__id:= Supplier__id \/ {(Instance|->Supplier__idValue)} 
	END
END
;
PurchaseOrder_Free( Instance )=
PRE
	Instance: PurchaseOrder	THEN
	IF
		Instance : PURCHASEORDER &		Instance : PurchaseOrder 
	THEN
		PurchaseOrder := PurchaseOrder - {Instance}
 || PurchaseOrder__id:= {Instance}<<|PurchaseOrder__id
 || PurchaseOrder__createdDate:= {Instance}<<|PurchaseOrder__createdDate
 || PurchaseOrder__isApproved:= {Instance}<<|PurchaseOrder__isApproved
 || PurchaseOrder__isReceived:= {Instance}<<|PurchaseOrder__isReceived 
	END
END
;
Supplier_Free( Instance )=
PRE
	Instance: Supplier	THEN
	IF
		Instance : SUPPLIER &		Instance : Supplier 
	THEN
		Supplier := Supplier - {Instance}
 || Supplier__id:= {Instance}<<|Supplier__id
 || Supplier__name:= {Instance}<<|Supplier__name 
	END
END
;
returnedData<--PurchaseOrder__GetId( Instance )=
PRE
	Instance: PurchaseOrder	THEN
	IF
		Instance : PurchaseOrder &		Instance : dom(PurchaseOrder__id) 
	THEN
		returnedData := PurchaseOrder__id(Instance) 
	END
END
;
returnedData<--PurchaseOrder__GetCreatedDate( Instance )=
PRE
	Instance: PurchaseOrder	THEN
	IF
		Instance : PurchaseOrder &		Instance : dom(PurchaseOrder__createdDate) 
	THEN
		returnedData := PurchaseOrder__createdDate(Instance) 
	END
END
;
returnedData<--PurchaseOrder__GetIsApproved( Instance )=
PRE
	Instance: PurchaseOrder	THEN
	IF
		Instance : PurchaseOrder &		Instance : dom(PurchaseOrder__isApproved) 
	THEN
		returnedData := PurchaseOrder__isApproved(Instance) 
	END
END
;
returnedData<--PurchaseOrder__GetIsReceived( Instance )=
PRE
	Instance: PurchaseOrder	THEN
	IF
		Instance : PurchaseOrder &		Instance : dom(PurchaseOrder__isReceived) 
	THEN
		returnedData := PurchaseOrder__isReceived(Instance) 
	END
END
;
returnedData<--Supplier__GetId( Instance )=
PRE
	Instance: Supplier	THEN
	IF
		Instance : Supplier &		Instance : dom(Supplier__id) 
	THEN
		returnedData := Supplier__id(Instance) 
	END
END
;
returnedData<--Supplier__GetName( Instance )=
PRE
	Instance: Supplier	THEN
	IF
		Instance : Supplier &		Instance : dom(Supplier__name) 
	THEN
		returnedData := Supplier__name(Instance) 
	END
END
;
PurchaseOrder__SetCreatedDate( Instance , PurchaseOrder__createdDateValue )=
PRE
	Instance: PurchaseOrder	&	PurchaseOrder__createdDateValue: NAT	THEN
	IF
		Instance : PurchaseOrder &		PurchaseOrder__createdDateValue : NAT &		(Instance|-> PurchaseOrder__createdDateValue) /: PurchaseOrder__createdDate 
	THEN
		PurchaseOrder__createdDate:= ({Instance}<<|PurchaseOrder__createdDate)\/ {(Instance|-> PurchaseOrder__createdDateValue)} 
	END
END
;
PurchaseOrder__SetIsApproved( Instance , PurchaseOrder__isApprovedValue )=
PRE
	Instance: PurchaseOrder	&	PurchaseOrder__isApprovedValue: BOOL	THEN
	IF
		Instance : PurchaseOrder &		PurchaseOrder__isApprovedValue : BOOL &		(Instance|-> PurchaseOrder__isApprovedValue) /: PurchaseOrder__isApproved 
	THEN
		PurchaseOrder__isApproved:= ({Instance}<<|PurchaseOrder__isApproved)\/ {(Instance|-> PurchaseOrder__isApprovedValue)} 
	END
END
;
PurchaseOrder__SetIsReceived( Instance , PurchaseOrder__isReceivedValue )=
PRE
	Instance: PurchaseOrder	&	PurchaseOrder__isReceivedValue: BOOL	THEN
	IF
		Instance : PurchaseOrder &		PurchaseOrder__isReceivedValue : BOOL &		(Instance|-> PurchaseOrder__isReceivedValue) /: PurchaseOrder__isReceived 
	THEN
		PurchaseOrder__isReceived:= ({Instance}<<|PurchaseOrder__isReceived)\/ {(Instance|-> PurchaseOrder__isReceivedValue)} 
	END
END
;
Supplier__SetName( Instance , Supplier__nameValue )=
PRE
	Instance: Supplier	&	Supplier__nameValue: STR	THEN
	IF
		Instance : Supplier &		Supplier__nameValue : STR &		(Instance|-> Supplier__nameValue) /: Supplier__name 
	THEN
		Supplier__name:= ({Instance}<<|Supplier__name)\/ {(Instance|-> Supplier__nameValue)} 
	END
END
;
PurchaseOrder__SetId( Instance , PurchaseOrder__idValue )=
PRE
	Instance: PurchaseOrder	&	PurchaseOrder__idValue: NAT	THEN
	IF
		Instance : PurchaseOrder &		PurchaseOrder__idValue : NAT &		PurchaseOrder__idValue /: ran(PurchaseOrder__id) 
	THEN
		PurchaseOrder__id:= ({Instance}<<|PurchaseOrder__id)\/ {(Instance|-> PurchaseOrder__idValue)} 
	END
END
;
Supplier__SetId( Instance , Supplier__idValue )=
PRE
	Instance: Supplier	&	Supplier__idValue: NAT	THEN
	IF
		Instance : Supplier &		Supplier__idValue : NAT &		Supplier__idValue /: ran(Supplier__id) 
	THEN
		Supplier__id:= ({Instance}<<|Supplier__id)\/ {(Instance|-> Supplier__idValue)} 
	END
END

END
