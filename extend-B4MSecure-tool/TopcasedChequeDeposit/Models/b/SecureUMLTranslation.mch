
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
access<--SecureDeposit__validateDeposit(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__validateDeposit_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
access<--SecureDeposit__saveDeposit(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__saveDeposit_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
access<--SecureDeposit__createDeposit(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__createDeposit_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
access<--SecureDeposit__verifyDeposit(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__verifyDeposit_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
ConnectUser(usr, role)=
PRE 
    usr : Users & role : Roles &
    usr /: dom(CurrentRole) &
    usr|->role : PermittedUsersRoles
THEN
    CurrentRole(usr):=role
END

END
