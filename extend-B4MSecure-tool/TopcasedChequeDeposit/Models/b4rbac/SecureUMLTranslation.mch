
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
access<--SecureDeposit__validate(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__validate_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
access<--SecureDeposit__save(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__save_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
access<--SecureDeposit__create(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__create_Label : Permissions THEN
	    	access:=granted
		ELSE
	     	access:=denied
	    END
	ELSE
	    access:=denied 	
	END
END;		
		
access<--SecureDeposit__verify(usr)=
PRE
	usr : Users
THEN	
 	IF usr : dom(CurrentRole) THEN
 		IF	CurrentRole(usr)|-> Deposit__verify_Label : Permissions THEN
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
