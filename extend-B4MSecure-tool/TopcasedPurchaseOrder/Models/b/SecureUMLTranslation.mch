
MACHINE
    SecureUMLTranslation
SEES
    SecureUMLContext
VARIABLES
    Session
INVARIANT
    Session : Users +-> Roles &
    Session <: PermittedUsersRoles    
INITIALISATION
    Session :={}
OPERATIONS    
    access<--check_user_permission(usr, op)=
    PRE	usr : Users & op : Operations THEN	
        IF usr : dom(Session) THEN
            IF	Session(usr)|-> op : Permissions THEN
                access:=granted
            ELSE
                access:=denied
            END
        ELSE
            access:=denied 	
        END
    END;		
    
    ConnectUser(usr, rol)=
    PRE 
        usr : Users & rol : Roles &
        usr /: dom(Session) &
        usr|->rol : PermittedUsersRoles
    THEN
        Session(usr):=rol
    END
END
