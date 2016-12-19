<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="AC" systemMachine="//@machines.0">
  <machines name="AC">
    <data xsi:type="b:BAbstractSet" name="STR2" typing="//@machines.0/@operations.0/@param.2 //@machines.0/@operations.0/@param.3 //@machines.0/@operations.16/@param.1 //@machines.0/@operations.17/@param.1"/>
    <data xsi:type="b:BAbstractSet" name="PATIENT" typing="//@machines.0/@data.2 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Patient" type="//@machines.0/@data.1" typing="//@machines.0/@operations.3/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.10/@param.0 //@machines.0/@operations.11/@param.0 //@machines.0/@operations.12/@param.0 //@machines.0/@operations.15/@param.0 //@machines.0/@operations.16/@param.0 //@machines.0/@operations.17/@param.0 //@machines.0/@operations.18/@param.0 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.20/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="MANAGEMENTACT" typing="//@machines.0/@data.4 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="ManagementAct" type="//@machines.0/@data.3" typing="//@machines.0/@operations.4/@param.0 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.14/@param.0 //@machines.0/@operations.21/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="USER" typing="//@machines.0/@data.6 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="User" type="//@machines.0/@data.5" typing="//@machines.0/@operations.5/@param.0 //@machines.0/@operations.1/@param.1">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="STR" typing="//@machines.0/@data.8/@values.0 //@machines.0/@data.8/@values.1 //@machines.0/@data.8/@values.2"/>
    <data xsi:type="b:BEnumSet" name="GENDER" typing="//@machines.0/@operations.0/@param.4 //@machines.0/@operations.18/@param.1">
      <values name="MALE" type="//@machines.0/@data.7"/>
      <values name="FEMALE" type="//@machines.0/@data.7"/>
      <values name="UNKNOWN" type="//@machines.0/@data.7"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="Boolean"/>
    <data xsi:type="b:BAbstractSet" name="Integer"/>
    <data xsi:type="b:BAbstractSet" name="String"/>
    <data xsi:type="b:BAbstractSet" name="UnlimitedNatural"/>
    <data xsi:type="b:BAbstractSet" name="TimeStamp" typing="//@machines.0/@operations.1/@param.2 //@machines.0/@operations.21/@param.1"/>
    <data xsi:type="b:BVariable" name="Owner" type="//@sharedTypes/@sharedTypes.5">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__id" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__firstName" type="//@sharedTypes/@sharedTypes.7">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__lastName" type="//@sharedTypes/@sharedTypes.8">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.8"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__sex" type="//@sharedTypes/@sharedTypes.9">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.9"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__weight" type="//@sharedTypes/@sharedTypes.10">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.10"/>
    </data>
    <data xsi:type="b:BVariable" name="Patient__height" type="//@sharedTypes/@sharedTypes.11">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.11"/>
    </data>
    <data xsi:type="b:BVariable" name="ManagementAct__dateTime" type="//@sharedTypes/@sharedTypes.12">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.12"/>
    </data>
    <data xsi:type="b:BVariable" name="ManagementAct__validated" type="//@sharedTypes/@sharedTypes.13">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.13"/>
    </data>
    <operations name="Patient_NEW" body="Patient := Patient \/ {Instance}&#xA; || Patient__id:= Patient__id \/ {(Instance|->Patient__idValue)}&#xA; || Patient__firstName:= Patient__firstName \/ {(Instance|->Patient__firstNameValue)}&#xA; || Patient__lastName:= Patient__lastName \/ {(Instance|->Patient__lastNameValue)}&#xA; || Patient__sex:= Patient__sex \/ {(Instance|->Patient__sexValue)}&#xA; || Patient__height:= Patient__height \/ {(Instance|->Patient__heightValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Patient"/>
      </param>
      <param name="Patient__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
      <param name="Patient__firstNameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Patient__lastNameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="Patient__sexValue" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
      <param name="Patient__heightValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="ManagementAct_NEW" body="ManagementAct := ManagementAct \/ {Instance} || Owner:= Owner \/ {(Instance|->Owner__userValue)}&#xA; || ManagementAct__dateTime:= ManagementAct__dateTime \/ {(Instance|->ManagementAct__dateTimeValue)}&#xA; || ManagementAct__validated:= ManagementAct__validated \/ {(Instance|->ManagementAct__validatedValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: ManagementAct"/>
      </param>
      <param name="Owner__userValue" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="ManagementAct__dateTimeValue" type="//@machines.0/@data.13">
        <typingPredicate operator="In" type="//@machines.0/@data.13"/>
      </param>
      <param name="ManagementAct__validatedValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
    </operations>
    <operations name="User_NEW" body="User := User \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: User"/>
      </param>
    </operations>
    <operations name="Patient_Free" body="Patient := Patient - {Instance} || Patient__id:= {Instance}&lt;&lt;|Patient__id || Patient__firstName:= {Instance}&lt;&lt;|Patient__firstName || Patient__lastName:= {Instance}&lt;&lt;|Patient__lastName || Patient__sex:= {Instance}&lt;&lt;|Patient__sex || Patient__weight:= {Instance}&lt;&lt;|Patient__weight || Patient__height:= {Instance}&lt;&lt;|Patient__height">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="ManagementAct_Free" body="ManagementAct := ManagementAct - {Instance}&#xA; || Owner:= {Instance}&lt;&lt;|Owner || ManagementAct__dateTime:= {Instance}&lt;&lt;|ManagementAct__dateTime || ManagementAct__validated:= {Instance}&lt;&lt;|ManagementAct__validated">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="User_Free" body="User := User - {Instance}&#xA; || Owner:= Owner|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name=" !c2.(c2:Owner~[{Instance}] => #cc.(cc:Owner[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="ManagementAct__GetOwner" body="result := Owner(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Patient__GetId" body="result := Patient__id(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetFirstName" body="result := Patient__firstName(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetLastName" body="result := Patient__lastName(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetSex" body="result := Patient__sex(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetWeight" body="result := Patient__weight(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Patient__GetHeight" body="result := Patient__height(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="ManagementAct__GetDateTime" body="result := ManagementAct__dateTime(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="ManagementAct__GetValidated" body="result := ManagementAct__validated(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Patient__SetId" body="Patient__id:= ({Instance}&lt;&lt;|Patient__id)\/ {(Instance|-> Patient__idValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Patient__idValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Patient__SetFirstName" body="Patient__firstName:= ({Instance}&lt;&lt;|Patient__firstName)\/ {(Instance|-> Patient__firstNameValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Patient__firstNameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Patient__SetLastName" body="Patient__lastName:= ({Instance}&lt;&lt;|Patient__lastName)\/ {(Instance|-> Patient__lastNameValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Patient__lastNameValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Patient__SetSex" body="Patient__sex:= ({Instance}&lt;&lt;|Patient__sex)\/ {(Instance|-> Patient__sexValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Patient__sexValue" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Patient__SetWeight" body="Patient__weight:= ({Instance}&lt;&lt;|Patient__weight)\/ {(Instance|-> Patient__weightValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Patient__weightValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Patient__SetHeight" body="Patient__height:= ({Instance}&lt;&lt;|Patient__height)\/ {(Instance|-> Patient__heightValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Patient__heightValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="ManagementAct__SetDateTime" body="ManagementAct__dateTime:= ({Instance}&lt;&lt;|ManagementAct__dateTime)\/ {(Instance|-> ManagementAct__dateTimeValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="ManagementAct__dateTimeValue" type="//@machines.0/@data.13">
        <typingPredicate operator="In" type="//@machines.0/@data.13"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.14"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.16"/>
    <initialisation init="//@machines.0/@data.17"/>
    <initialisation init="//@machines.0/@data.18"/>
    <initialisation init="//@machines.0/@data.19"/>
    <initialisation init="//@machines.0/@data.20"/>
    <initialisation init="//@machines.0/@data.21"/>
    <initialisation init="//@machines.0/@data.22"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@operations.0/@param.1 //@machines.0/@operations.0/@param.5 //@machines.0/@operations.15/@param.1 //@machines.0/@operations.19/@param.1 //@machines.0/@operations.20/@param.1"/>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.1/@param.3"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.3"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.5"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" expression="TotalFunction" dom="//@machines.0/@data.4" ran="//@machines.0/@data.6"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.17" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.18" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.8"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.19" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.20" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.21" expression="TotalFunction" dom="//@machines.0/@data.4" ran="//@machines.0/@data.13"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.22" expression="TotalFunction" dom="//@machines.0/@data.4" ran="//@sharedTypes/@sharedTypes.1"/>
  </sharedTypes>
</b:BSpec>
