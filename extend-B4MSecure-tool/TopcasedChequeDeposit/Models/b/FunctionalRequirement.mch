
MACHINE 
	FunctionalRequirement
SEES
	Context

VARIABLES

 Bank
, Client
, User
, Cheque
, Deposit
, BankAccountOf
, WorkingBankOf
, Client__name
, Client__amount
, Cheque__value
, Deposit__status
, Client__id
, Cheque__id

INVARIANT

 Bank <: BANK 
& Client <: CLIENT 
& User <: USER 
& Cheque <: CHEQUE 
& Deposit : Cheque +-> Client 
& BankAccountOf : Client +->> Bank 
& WorkingBankOf : User +->> Bank 
& Client__name : Client --> STR 
& Client__amount : Client --> NAT 
& Cheque__value : Cheque --> NAT 
& Deposit__status : Deposit --> DepositStatus 
& Client__id : Client >-> NAT 
& Cheque__id : Cheque >-> NAT 

INITIALISATION

 Bank := {}
|| Client := {}
|| User := {}
|| Cheque := {}
|| Deposit := {}
|| BankAccountOf := {}
|| WorkingBankOf := {}
|| Client__name := {}
|| Client__amount := {}
|| Cheque__value := {}
|| Deposit__status := {}
|| Client__id := {}
|| Cheque__id := {}

OPERATIONS

result<--Client__create( cl )=
PRE
	cl: CLIENT	
THEN
	IF
		cl : Client 
	
	THEN 
		 ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Client__modifyAmount( cl )=
PRE
	cl: CLIENT	
THEN
	IF
		cl : Client 
	
	THEN 
		 ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Client__delete( cl )=
PRE
	cl: CLIENT	
THEN
	IF
		cl : Client 
	
	THEN 
		skip ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--User__joinBank( uu , bb )=
PRE
	uu: USER	&	bb: BANK	
THEN
	IF
		uu : User &		bb : Bank 
		& uu|->bb /: WorkingBankOf /* Precondition generated from annotation*/  
	THEN 
		WorkingBankOf(uu) := bb /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--User__leaveBank( uu )=
PRE
	uu: USER	
THEN
	IF
		uu : User 
		& uu : dom(WorkingBankOf) /* Precondition generated from annotation*/  
	THEN 
		WorkingBankOf := {uu} <<| WorkingBankOf  /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Cheque__create( ch )=
PRE
	ch: CHEQUE	
THEN
	IF
		ch : Cheque 
	
	THEN 
		skip ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Cheque__delete( ch )=
PRE
	ch: CHEQUE	
THEN
	IF
		ch : Cheque 
	
	THEN 
		skip ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Deposit__createDeposit( ch , cl )=
PRE
	ch: CHEQUE	&	cl: CLIENT	
THEN
	IF
		ch : Cheque &		cl : Client 
		& ch /: dom(Deposit) /* Precondition generated from annotation*/  
	THEN 
		Deposit := Deposit \/ {ch|->cl} ||
Deposit__status(ch, Deposit(ch)) := created /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Deposit__validateDeposit( ch )=
PRE
	ch: CHEQUE	
THEN
	IF
		ch : Cheque 
		& ch : dom(Deposit) /* Precondition generated from annotation*/  
	THEN 
		Deposit__status(ch, Deposit(ch)) := validated /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Deposit__verifyDeposit( ch )=
PRE
	ch: CHEQUE	
THEN
	IF
		ch : Cheque 
		& ch : dom(Deposit) /* Precondition generated from annotation*/  
	THEN 
		Deposit__status(ch, Deposit(ch)) := verified /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
result<--Deposit__saveDeposit( ch )=
PRE
	ch: CHEQUE	
THEN
	IF
		ch : Cheque 
		& ch : dom(Deposit) /* Precondition generated from annotation*/  
	THEN 
		Deposit__status(ch, Deposit(ch)) := saved /* Body generated from annotation */ ||	
 		result	:= Ok 
 	ELSE
 		result := Ko
	END
END
;
Bank_NEW( Instance , BankAccountOf__clientValues , WorkingBankOf__userValues )=
PRE
	Instance: BANK	&	BankAccountOf__clientValues: POW(Client)	&	WorkingBankOf__userValues: POW(User)	THEN
	IF
		Instance : BANK &		Instance /: Bank &		BankAccountOf__clientValues : POW(Client) &		BankAccountOf__clientValues/={}
 & BankAccountOf[BankAccountOf__clientValues]={} &		WorkingBankOf__userValues : POW(User) &		WorkingBankOf__userValues/={}
 & WorkingBankOf[WorkingBankOf__userValues]={} 
	THEN
		Bank := Bank \/ {Instance} 
 || BankAccountOf:= BankAccountOf \/ (BankAccountOf__clientValues*{Instance}) 
 || WorkingBankOf:= WorkingBankOf \/ (WorkingBankOf__userValues*{Instance}) 
	END
END
;
Client_NEW( Instance , Client__nameValue , Client__amountValue , Client__idValue )=
PRE
	Instance: CLIENT	&	Client__nameValue: STR	&	Client__amountValue: NAT	&	Client__idValue: NAT	THEN
	IF
		Instance : CLIENT &		Instance /: Client &		Client__nameValue : STR &		Client__amountValue : NAT &		Client__idValue : NAT &		Client__idValue /:ran(Client__id) 
	THEN
		Client := Client \/ {Instance}
 || Client__name:= Client__name \/ {(Instance|->Client__nameValue)}
 || Client__amount:= Client__amount \/ {(Instance|->Client__amountValue)}
 || Client__id:= Client__id \/ {(Instance|->Client__idValue)} 
	END
END
;
User_NEW( Instance )=
PRE
	Instance: USER	THEN
	IF
		Instance : USER &		Instance /: User 
	THEN
		User := User \/ {Instance} 
	END
END
;
Cheque_NEW( Instance , Cheque__valueValue , Cheque__idValue )=
PRE
	Instance: CHEQUE	&	Cheque__valueValue: NAT	&	Cheque__idValue: NAT	THEN
	IF
		Instance : CHEQUE &		Instance /: Cheque &		Cheque__valueValue : NAT &		Cheque__idValue : NAT &		Cheque__idValue /:ran(Cheque__id) 
	THEN
		Cheque := Cheque \/ {Instance}
 || Cheque__value:= Cheque__value \/ {(Instance|->Cheque__valueValue)}
 || Cheque__id:= Cheque__id \/ {(Instance|->Cheque__idValue)} 
	END
END
;
Bank_Free( Instance )=
PRE
	Instance: Bank	THEN
	IF
		Instance : BANK &		Instance : Bank 
	THEN
		Bank := Bank - {Instance}
 || BankAccountOf:= BankAccountOf|>> {Instance}
 || WorkingBankOf:= WorkingBankOf|>> {Instance} 
	END
END
;
Client_Free( Instance )=
PRE
	Instance: Client	THEN
	IF
		Instance : CLIENT &		Instance : Client &		 !c2.(c2:BankAccountOf[{Instance}] =>#cc.(cc:BankAccountOf~[{c2}] & cc/=Instance) ) 
	THEN
		Client := Client - {Instance}
 || Deposit:= Deposit|>> {Instance}
 || BankAccountOf:= {Instance}<<|BankAccountOf
 || Client__id:= {Instance}<<|Client__id
 || Client__name:= {Instance}<<|Client__name
 || Client__amount:= {Instance}<<|Client__amount 
	END
END
;
User_Free( Instance )=
PRE
	Instance: User	THEN
	IF
		Instance : USER &		Instance : User &		 !c2.(c2:WorkingBankOf[{Instance}] =>#cc.(cc:WorkingBankOf~[{c2}] & cc/=Instance) ) 
	THEN
		User := User - {Instance}
 || WorkingBankOf:= {Instance}<<|WorkingBankOf 
	END
END
;
Cheque_Free( Instance )=
PRE
	Instance: Cheque	THEN
	IF
		Instance : CHEQUE &		Instance : Cheque 
	THEN
		Cheque := Cheque - {Instance}
 || Deposit:= {Instance}<<|Deposit
 || Cheque__id:= {Instance}<<|Cheque__id
 || Cheque__value:= {Instance}<<|Cheque__value 
	END
END
;
Deposit_NEW( Instance , ChequeInstance , ClientInstance , Deposit__statusValue )=
PRE
	Instance: Deposit	&	ChequeInstance: Cheque	&	ClientInstance: Client	&	Deposit__statusValue: DepositStatus	THEN
	IF
		Instance : Cheque*Client &		Instance /: Deposit &		ChequeInstance : Cheque &		ChequeInstance /: dom(Deposit) &		ClientInstance : Client &		( ChequeInstance|->ClientInstance )= Instance &		Deposit__statusValue : DepositStatus 
	THEN
		Deposit := Deposit \/ {Instance}
 || Deposit__status:= Deposit__status \/ {(Instance|->Deposit__statusValue)} 
	END
END
;
Deposit_Free( Instance )=
PRE
	Instance: Deposit	THEN
	IF
		Instance : Deposit 
	THEN
		Deposit := Deposit - {Instance}
 || Deposit__status:= {Instance}<<|Deposit__status 
	END
END
;
returnedData<--Cheque__GetDeposit( Instance )=
PRE
	Instance: Cheque	THEN
	IF
		Instance : Cheque &		Instance : dom(Deposit) 
	THEN
		returnedData := Deposit(Instance) 
	END
END
;
returnedData<--Client__GetBankAccountOf( Instance )=
PRE
	Instance: Client	THEN
	IF
		Instance : Client &		Instance : dom(BankAccountOf) 
	THEN
		returnedData := BankAccountOf(Instance) 
	END
END
;
returnedData<--User__GetWorkingBankOf( Instance )=
PRE
	Instance: User	THEN
	IF
		Instance : User &		Instance : dom(WorkingBankOf) 
	THEN
		returnedData := WorkingBankOf(Instance) 
	END
END
;
Cheque__SetDeposit( Instance , Deposit__clientValue )=
PRE
	Instance: Cheque	&	Deposit__clientValue: Client	THEN
	IF
		Instance : Cheque &		Deposit__clientValue : Client &		(Instance|-> Deposit__clientValue) /: Deposit 
	THEN
		Deposit:= ({Instance}<<|Deposit)\/ {(Instance|-> Deposit__clientValue)} 
	END
END
;
Client__SetBankAccountOf( Instance , BankAccountOf__bankValue )=
PRE
	Instance: Client	&	BankAccountOf__bankValue: Bank	THEN
	IF
		Instance : Client &		BankAccountOf__bankValue : Bank &		(Instance|-> BankAccountOf__bankValue) /: BankAccountOf &		#cc.(cc: Client & cc/=Instance & cc: BankAccountOf~[BankAccountOf[{Instance}]]) 
	THEN
		BankAccountOf:= ({Instance}<<|BankAccountOf)\/ {(Instance|-> BankAccountOf__bankValue)} 
	END
END
;
User__SetWorkingBankOf( Instance , WorkingBankOf__bankValue )=
PRE
	Instance: User	&	WorkingBankOf__bankValue: Bank	THEN
	IF
		Instance : User &		WorkingBankOf__bankValue : Bank &		(Instance|-> WorkingBankOf__bankValue) /: WorkingBankOf &		#cc.(cc: User & cc/=Instance & cc: WorkingBankOf~[WorkingBankOf[{Instance}]]) 
	THEN
		WorkingBankOf:= ({Instance}<<|WorkingBankOf)\/ {(Instance|-> WorkingBankOf__bankValue)} 
	END
END
;
returnedData<--Client__GetId( Instance )=
PRE
	Instance: Client	THEN
	IF
		Instance : Client &		Instance : dom(Client__id) 
	THEN
		returnedData := Client__id(Instance) 
	END
END
;
returnedData<--Client__GetName( Instance )=
PRE
	Instance: Client	THEN
	IF
		Instance : Client &		Instance : dom(Client__name) 
	THEN
		returnedData := Client__name(Instance) 
	END
END
;
returnedData<--Client__GetAmount( Instance )=
PRE
	Instance: Client	THEN
	IF
		Instance : Client &		Instance : dom(Client__amount) 
	THEN
		returnedData := Client__amount(Instance) 
	END
END
;
returnedData<--Cheque__GetId( Instance )=
PRE
	Instance: Cheque	THEN
	IF
		Instance : Cheque &		Instance : dom(Cheque__id) 
	THEN
		returnedData := Cheque__id(Instance) 
	END
END
;
returnedData<--Cheque__GetValue( Instance )=
PRE
	Instance: Cheque	THEN
	IF
		Instance : Cheque &		Instance : dom(Cheque__value) 
	THEN
		returnedData := Cheque__value(Instance) 
	END
END
;
returnedData<--Deposit__GetStatus( Instance )=
PRE
	Instance: Deposit	THEN
	IF
		Instance : Deposit &		Instance : dom(Deposit__status) 
	THEN
		returnedData := Deposit__status(Instance) 
	END
END
;
Client__SetName( Instance , Client__nameValue )=
PRE
	Instance: Client	&	Client__nameValue: STR	THEN
	IF
		Instance : Client &		Client__nameValue : STR &		(Instance|-> Client__nameValue) /: Client__name 
	THEN
		Client__name:= ({Instance}<<|Client__name)\/ {(Instance|-> Client__nameValue)} 
	END
END
;
Client__SetAmount( Instance , Client__amountValue )=
PRE
	Instance: Client	&	Client__amountValue: NAT	THEN
	IF
		Instance : Client &		Client__amountValue : NAT &		(Instance|-> Client__amountValue) /: Client__amount 
	THEN
		Client__amount:= ({Instance}<<|Client__amount)\/ {(Instance|-> Client__amountValue)} 
	END
END
;
Cheque__SetValue( Instance , Cheque__valueValue )=
PRE
	Instance: Cheque	&	Cheque__valueValue: NAT	THEN
	IF
		Instance : Cheque &		Cheque__valueValue : NAT &		(Instance|-> Cheque__valueValue) /: Cheque__value 
	THEN
		Cheque__value:= ({Instance}<<|Cheque__value)\/ {(Instance|-> Cheque__valueValue)} 
	END
END
;
Deposit__SetStatus( Instance , Deposit__statusValue )=
PRE
	Instance: Deposit	&	Deposit__statusValue: DepositStatus	THEN
	IF
		Instance : Deposit &		Deposit__statusValue : DepositStatus &		(Instance|-> Deposit__statusValue) /: Deposit__status 
	THEN
		Deposit__status:= ({Instance}<<|Deposit__status)\/ {(Instance|-> Deposit__statusValue)} 
	END
END
;
Client__SetId( Instance , Client__idValue )=
PRE
	Instance: Client	&	Client__idValue: NAT	THEN
	IF
		Instance : Client &		Client__idValue : NAT &		Client__idValue /: ran(Client__id) 
	THEN
		Client__id:= ({Instance}<<|Client__id)\/ {(Instance|-> Client__idValue)} 
	END
END
;
Cheque__SetId( Instance , Cheque__idValue )=
PRE
	Instance: Cheque	&	Cheque__idValue: NAT	THEN
	IF
		Instance : Cheque &		Cheque__idValue : NAT &		Cheque__idValue /: ran(Cheque__id) 
	THEN
		Cheque__id:= ({Instance}<<|Cheque__id)\/ {(Instance|-> Cheque__idValue)} 
	END
END

END
