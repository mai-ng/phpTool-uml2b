<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Selkis_VASCO_ORBAC" systemMachine="//@machines.0">
  <machines name="Selkis_VASCO_ORBAC">
    <data xsi:type="b:BVariable" name="User" type="//@machines.0/@data.1" typing="//@machines.0/@operations.5/@param.0 //@machines.0/@operations.3/@param.1 //@machines.0/@operations.14/@param.0 //@machines.0/@operations.16/@param.0 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.26/@param.0 //@machines.0/@operations.32/@param.0 //@machines.0/@operations.33/@param.0">
      <typingPredicate type="//@machines.0/@data.1"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="USER" typing="//@machines.0/@data.0 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Org" type="//@machines.0/@data.3" typing="//@machines.0/@operations.6/@param.0 //@machines.0/@operations.10/@param.1 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.24/@param.1 //@machines.0/@operations.31/@param.1">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ORG" typing="//@machines.0/@data.2 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="Role" type="//@machines.0/@data.5" typing="//@machines.0/@operations.7/@param.0 //@machines.0/@operations.10/@param.2 //@machines.0/@operations.12/@param.0 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.22/@param.1 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.23/@param.1 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.30/@param.0 //@machines.0/@operations.30/@param.1 //@machines.0/@operations.31/@param.0 //@machines.0/@operations.37/@param.0 //@machines.0/@operations.37/@param.1">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ROLE" typing="//@machines.0/@data.4 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="Session" type="//@machines.0/@data.7" typing="//@machines.0/@operations.8/@param.0 //@machines.0/@operations.15/@param.0 //@machines.0/@operations.17/@param.0 //@machines.0/@operations.26/@param.1 //@machines.0/@operations.27/@param.0 //@machines.0/@operations.33/@param.1 //@machines.0/@operations.34/@param.0">
      <typingPredicate type="//@machines.0/@data.7"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="SESSION" typing="//@machines.0/@data.6 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BVariable" name="Action" type="//@machines.0/@data.9" typing="//@machines.0/@operations.9/@param.0 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.28/@param.1 //@machines.0/@operations.29/@param.0 //@machines.0/@operations.29/@param.1 //@machines.0/@operations.35/@param.1 //@machines.0/@operations.36/@param.0 //@machines.0/@operations.36/@param.1">
      <typingPredicate type="//@machines.0/@data.9"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ACTION" typing="//@machines.0/@data.8 //@machines.0/@operations.4/@param.0"/>
    <data xsi:type="b:BVariable" name="Position" type="//@sharedTypes/@sharedTypes.0" typing="//@machines.0/@operations.18/@param.0 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.27/@param.1 //@machines.0/@operations.28/@param.0 //@machines.0/@operations.32/@param.1 //@machines.0/@operations.34/@param.1 //@machines.0/@operations.35/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
    </data>
    <data xsi:type="b:BVariable" name="UserAssignment" type="//@sharedTypes/@sharedTypes.1">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
    </data>
    <data xsi:type="b:BVariable" name="SessionUser" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="SessionActivePositions" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
      <typingPredicate name="dom(SessionActivePositions)=Session"/>
    </data>
    <data xsi:type="b:BVariable" name="PermissionAssignment" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BVariable" name="SubActions" type="//@sharedTypes/@sharedTypes.5">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="RoleInheritance" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <operations name="User_NEW" body="User := User \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: User"/>
      </param>
    </operations>
    <operations name="Org_NEW" body="Org := Org \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: Org"/>
      </param>
    </operations>
    <operations name="Role_NEW" body="Role := Role \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: Role"/>
      </param>
    </operations>
    <operations name="Session_NEW" body="Session := Session \/ {Instance} &#xA; || SessionUser:= SessionUser \/ {(Instance|->SessionUser__userValue)} &#xA; || SessionActivePositions:= SessionActivePositions \/ ({Instance}*SessionActivePositions__activePositionsValues)">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance /: Session"/>
      </param>
      <param name="SessionUser__userValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="SessionActivePositions__activePositionsValues" type="//@sharedTypes/@sharedTypes.7">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
        <typingPredicate name="SessionActivePositions__activePositionsValues/={}"/>
      </param>
    </operations>
    <operations name="Action_NEW" body="Action := Action \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance /: Action"/>
      </param>
    </operations>
    <operations name="User_Free" body="User := User - {Instance}&#xA; || UserAssignment:= {Instance}&lt;&lt;|UserAssignment&#xA; || SessionUser:= SessionUser|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="SessionUser~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="Org_Free" body="Org := Org - {Instance}&#xA; || Position:= {Instance}&lt;&lt;|Position">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Role_Free" body="Role := Role - {Instance}&#xA; || Position:= Position|>> {Instance}&#xA; || RoleInheritance:= {Instance}&lt;&lt;|RoleInheritance&#xA; || RoleInheritance:= {Instance}&lt;&lt;|RoleInheritance">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Session_Free" body="Session := Session - {Instance}&#xA; || SessionUser:= {Instance}&lt;&lt;|SessionUser&#xA; || SessionActivePositions:= {Instance}&lt;&lt;|SessionActivePositions">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Action_Free" body="Action := Action - {Instance}&#xA; || PermissionAssignment:= PermissionAssignment|>> {Instance}&#xA; || SubActions:= {Instance}&lt;&lt;|SubActions&#xA; || SubActions:= {Instance}&lt;&lt;|SubActions">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Position_NEW" body="Position := Position \/ {Instance}">
      <param name="Instance">
        <typingPredicate name="Instance : Org*Role"/>
        <typingPredicate name="Instance /: Position"/>
      </param>
      <param name="OrgInstance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="OrgInstance /: dom(Position)"/>
      </param>
      <param name="RoleInstance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="( OrgInstance|->RoleInstance )= Instance"/>
      </param>
    </operations>
    <operations name="Position_Free"/>
    <operations name="Role__GetPosition" body="result := Position~(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Org__GetPosition" body="result := Position(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="User__GetUserAssignment" body="result := UserAssignment(Instance)">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Session__GetSessionUser" body="result := SessionUser(Instance)">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="User__GetSessionUser" body="result := SessionUser~(Instance)">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Session__GetSessionActivePositions" body="result := SessionActivePositions(Instance)">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Position__GetPermissionAssignment" body="result := PermissionAssignment(Instance)">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
    </operations>
    <operations name="Action__GetSubActions" body="result := SubActions(Instance)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Role__GetRoleInheritance" body="result := RoleInheritance(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Role__GetRoleInheritance" body="result := RoleInheritance(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Org__SetPosition" body="Position:= ({Instance}&lt;&lt;|Position)\/ {(Instance|-> Position__roleValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Position__roleValue" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> Position__roleValue) /: Position"/>
      </param>
    </operations>
    <operations name="Role__SetRoleInheritance" body="RoleInheritance:= ({Instance}&lt;&lt;|RoleInheritance)\/ {(Instance|-> RoleInheritance__parentRoleValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="RoleInheritance__parentRoleValue" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> RoleInheritance__parentRoleValue) /: RoleInheritance"/>
        <typingPredicate name="RoleInheritance__parentRoleValue/:ran(RoleInheritance)"/>
      </param>
    </operations>
    <operations name="Role__AddPosition" body="Position:= Position\/{(Position__orgValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Position__orgValues" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(Position__orgValues|-> Instance) /:Position"/>
        <typingPredicate name="Position__orgValues/:dom(Position)"/>
      </param>
    </operations>
    <operations name="User__AddUserAssignment" body="UserAssignment:= UserAssignment\/ {(Instance|-> UserAssignment__positionsValues)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="UserAssignment__positionsValues" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="(Instance|-> UserAssignment__positionsValues) /:UserAssignment"/>
      </param>
    </operations>
    <operations name="User__AddSessionUser" body="SessionUser:= SessionUser\/{(SessionUser__sessionValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="SessionUser__sessionValues" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="(SessionUser__sessionValues|-> Instance) /:SessionUser"/>
        <typingPredicate name="SessionUser__sessionValues/:dom(SessionUser)"/>
      </param>
    </operations>
    <operations name="Session__AddSessionActivePositions" body="SessionActivePositions:= SessionActivePositions\/ {(Instance|-> SessionActivePositions__activePositionsValues)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="SessionActivePositions__activePositionsValues" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="(Instance|-> SessionActivePositions__activePositionsValues) /:SessionActivePositions"/>
      </param>
    </operations>
    <operations name="Position__AddPermissionAssignment" body="PermissionAssignment:= PermissionAssignment\/ {(Instance|-> PermissionAssignment__actionValues)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="PermissionAssignment__actionValues" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="(Instance|-> PermissionAssignment__actionValues) /:PermissionAssignment"/>
      </param>
    </operations>
    <operations name="Action__AddSubActions" body="SubActions:= SubActions\/ {(Instance|-> SubActions__subActionsValues)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="SubActions__subActionsValues" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="(Instance|-> SubActions__subActionsValues) /:SubActions"/>
        <typingPredicate name="SubActions__subActionsValues/:ran(SubActions)"/>
      </param>
    </operations>
    <operations name="Role__AddRoleInheritance" body="RoleInheritance:= RoleInheritance\/ {(Instance|-> RoleInheritance__subRolesValues)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="RoleInheritance__subRolesValues" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> RoleInheritance__subRolesValues) /:RoleInheritance"/>
        <typingPredicate name="RoleInheritance__subRolesValues/:ran(RoleInheritance)"/>
      </param>
    </operations>
    <operations name="Role__RemovePosition" body="Position:= Position-{(Position__orgValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="Position__orgValues" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(Position__orgValues|-> Instance) :Position"/>
      </param>
    </operations>
    <operations name="User__RemoveUserAssignment" body="UserAssignment:= UserAssignment-{(Instance|-> UserAssignment__positionsValues)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="UserAssignment__positionsValues" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="(Instance|-> UserAssignment__positionsValues) :UserAssignment"/>
      </param>
    </operations>
    <operations name="User__RemoveSessionUser" body="SessionUser:= SessionUser-{(SessionUser__sessionValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="SessionUser__sessionValues" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="(SessionUser__sessionValues|-> Instance) :SessionUser"/>
        <typingPredicate name="#cc.(cc: User &amp; cc/=Instance &amp; cc: SessionUser[{SessionUser__sessionValues}])"/>
      </param>
    </operations>
    <operations name="Session__RemoveSessionActivePositions" body="SessionActivePositions:= SessionActivePositions-{(Instance|-> SessionActivePositions__activePositionsValues)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="SessionActivePositions__activePositionsValues" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="(Instance|-> SessionActivePositions__activePositionsValues) :SessionActivePositions"/>
        <typingPredicate name="#cc.(cc: Position&amp; cc/=SessionActivePositions__activePositionsValues &amp; (Instance|-> SessionActivePositions__activePositionsValues):SessionActivePositions )"/>
      </param>
    </operations>
    <operations name="Position__RemovePermissionAssignment" body="PermissionAssignment:= PermissionAssignment-{(Instance|-> PermissionAssignment__actionValues)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="PermissionAssignment__actionValues" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="(Instance|-> PermissionAssignment__actionValues) :PermissionAssignment"/>
      </param>
    </operations>
    <operations name="Action__RemoveSubActions" body="SubActions:= SubActions-{(Instance|-> SubActions__subActionsValues)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="SubActions__subActionsValues" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="(Instance|-> SubActions__subActionsValues) :SubActions"/>
      </param>
    </operations>
    <operations name="Role__RemoveRoleInheritance" body="RoleInheritance:= RoleInheritance-{(Instance|-> RoleInheritance__subRolesValues)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="RoleInheritance__subRolesValues" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="(Instance|-> RoleInheritance__subRolesValues) :RoleInheritance"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.0"/>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
    <initialisation init="//@machines.0/@data.12"/>
    <initialisation init="//@machines.0/@data.13"/>
    <initialisation init="//@machines.0/@data.14"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.16"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.11" dom="//@machines.0/@data.0" ran="//@machines.0/@data.10"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.12" expression="TotalFunction" dom="//@machines.0/@data.6" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.13" dom="//@machines.0/@data.6" ran="//@machines.0/@data.10"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" dom="//@machines.0/@data.10" ran="//@machines.0/@data.8"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="PartialFunction" dom="//@machines.0/@data.8" ran="//@machines.0/@data.8"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" expression="PartialFunction" dom="//@machines.0/@data.4" ran="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BPowType" typing="//@machines.0/@operations.3/@param.2" pow="//@machines.0/@data.10"/>
  </sharedTypes>
</b:BSpec>
