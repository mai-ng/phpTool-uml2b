<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Class" systemMachine="//@machines.0">
  <machines name="Class">
    <data xsi:type="b:BAbstractSet" name="STR" typing="//@machines.0/@operations.0/@param.3 //@machines.0/@operations.24/@param.1 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.28/@param.1 //@machines.0/@operations.31/@param.1"/>
    <data xsi:type="b:BAbstractSet" name="CLASS" typing="//@machines.0/@data.2 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Class" type="//@machines.0/@data.1" typing="//@machines.0/@operations.4/@param.0 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.10/@param.0 //@machines.0/@operations.11/@param.0 //@machines.0/@operations.12/@param.0 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.14/@param.0 //@machines.0/@operations.15/@param.0 //@machines.0/@operations.16/@param.0 //@machines.0/@operations.17/@param.0 //@machines.0/@operations.18/@param.0 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.26/@param.0 //@machines.0/@operations.27/@param.0 //@machines.0/@operations.28/@param.0 //@machines.0/@operations.29/@param.0 //@machines.0/@operations.30/@param.0 //@machines.0/@operations.31/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="APACKAGE__CONCRETECLASS" typing="//@machines.0/@data.4 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="APackage__ConcreteClass" type="//@machines.0/@data.3" typing="//@machines.0/@operations.5/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ABSTRACTCLASS__ABSTRACTCLASS" typing="//@machines.0/@data.6 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="AbstractClass__AbstractClass" type="//@machines.0/@data.5" typing="//@machines.0/@operations.6/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CONCRETECLASS__CONCRETECLASS" typing="//@machines.0/@data.8 //@machines.0/@operations.3/@param.0"/>
    <data xsi:type="b:BVariable" name="ConcreteClass__ConcreteClass" type="//@machines.0/@data.7" typing="//@machines.0/@operations.7/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__optionalAttribut" type="//@sharedTypes/@sharedTypes.6">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__SetAttribut" type="//@sharedTypes/@sharedTypes.7">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__mandatoryAttribut" type="//@sharedTypes/@sharedTypes.8">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.8"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__nonEmptySet" type="//@sharedTypes/@sharedTypes.9">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.9"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__staticAttribut" type="//@sharedTypes/@sharedTypes.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__readOnlyAttribut" type="//@sharedTypes/@sharedTypes.10">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.10"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__privateAttribut" type="//@sharedTypes/@sharedTypes.11">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.11"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__derivedAttribut" type="//@sharedTypes/@sharedTypes.12">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.12"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__text" type="//@sharedTypes/@sharedTypes.13">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.13"/>
    </data>
    <data xsi:type="b:BVariable" name="Class__constrainedSet" type="//@sharedTypes/@sharedTypes.14">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.14"/>
      <typingPredicate name="!cc.( cc:dom(Class__constrainedSet) => card(Class__constrainedSet[{cc}])>=2)&#xA; &amp; !cc.( cc:dom(Class__constrainedSet) => card(Class__constrainedSet[{cc}])&lt;=6)"/>
    </data>
    <operations name="Class_NEW" body="Class := Class \/ {Instance} || Class__mandatoryAttribut:= Class__mandatoryAttribut \/ {(Instance|->mandatoryAttributValue)} || Class__readOnlyAttribut:= Class__readOnlyAttribut \/ {(Instance|->readOnlyAttributValue)} || Class__constrainedSet:= Class__constrainedSet \/ ({Instance}*constrainedSetValue)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Class"/>
      </param>
      <param name="mandatoryAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
      <param name="readOnlyAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
      <param name="constrainedSetValue" type="//@machines.0/@data.0">
        <typingPredicate type="//@machines.0/@data.0"/>
        <typingPredicate name="card(constrainedSetValue)&lt;=6"/>
        <typingPredicate name="card(constrainedSetValue)>=2"/>
      </param>
    </operations>
    <operations name="APackage__ConcreteClass_NEW" body="APackage__ConcreteClass := APackage__ConcreteClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: APackage__ConcreteClass"/>
      </param>
    </operations>
    <operations name="AbstractClass__AbstractClass_NEW" body="AbstractClass__AbstractClass := AbstractClass__AbstractClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: AbstractClass__AbstractClass"/>
      </param>
    </operations>
    <operations name="ConcreteClass__ConcreteClass_NEW" body="ConcreteClass__ConcreteClass := ConcreteClass__ConcreteClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance /: ConcreteClass__ConcreteClass"/>
      </param>
    </operations>
    <operations name="Class_Free" body="Class := Class - {Instance} || Class__optionalAttribut:= {Instance}&lt;&lt;|Class__optionalAttribut || Class__SetAttribut:= {Instance}&lt;&lt;|Class__SetAttribut || Class__mandatoryAttribut:= {Instance}&lt;&lt;|Class__mandatoryAttribut || Class__nonEmptySet:= {Instance}&lt;&lt;|Class__nonEmptySet || Class__readOnlyAttribut:= {Instance}&lt;&lt;|Class__readOnlyAttribut || Class__privateAttribut:= {Instance}&lt;&lt;|Class__privateAttribut || Class__derivedAttribut:= {Instance}&lt;&lt;|Class__derivedAttribut || Class__text:= {Instance}&lt;&lt;|Class__text || Class__constrainedSet:= {Instance}&lt;&lt;|Class__constrainedSet">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="APackage__ConcreteClass_Free" body="APackage__ConcreteClass := APackage__ConcreteClass - {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="AbstractClass__AbstractClass_Free" body="AbstractClass__AbstractClass := AbstractClass__AbstractClass - {Instance}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="ConcreteClass__ConcreteClass_Free" body="ConcreteClass__ConcreteClass := ConcreteClass__ConcreteClass - {Instance}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="Class__GetOptionalAttribut" body="result := Class__optionalAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetSetAttribut" body="result := Class__SetAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetMandatoryAttribut" body="result := Class__mandatoryAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetNonEmptySet" body="result := Class__nonEmptySet(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetReadOnlyAttribut" body="result := Class__readOnlyAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetPrivateAttribut" body="result := Class__privateAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetDerivedAttribut" body="result := Class__derivedAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetText" body="result := Class__text(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__GetConstrainedSet" body="result := Class__constrainedSet(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class__SetOptionalAttribut" body="Class__optionalAttribut:= ({Instance}&lt;&lt;|Class__optionalAttribut)\/ {(Instance|-> optionalAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="optionalAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Class__SetSetAttribut" body="Class__SetAttribut:= ({Instance}&lt;&lt;|Class__SetAttribut)\/ ({Instance}*SetAttributValue)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="SetAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Class__SetMandatoryAttribut" body="Class__mandatoryAttribut:= ({Instance}&lt;&lt;|Class__mandatoryAttribut)\/ {(Instance|-> mandatoryAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="mandatoryAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Class__SetNonEmptySet" body="Class__nonEmptySet:= ({Instance}&lt;&lt;|Class__nonEmptySet)\/ ({Instance}*nonEmptySetValue)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="nonEmptySetValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Class__SetReadOnlyAttribut" body="Class__readOnlyAttribut:= ({Instance}&lt;&lt;|Class__readOnlyAttribut)\/ {(Instance|-> readOnlyAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="readOnlyAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Class__SetPrivateAttribut" body="Class__privateAttribut:= ({Instance}&lt;&lt;|Class__privateAttribut)\/ {(Instance|-> privateAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="privateAttributValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
    </operations>
    <operations name="Class__SetDerivedAttribut" body="Class__derivedAttribut:= ({Instance}&lt;&lt;|Class__derivedAttribut)\/ {(Instance|-> derivedAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="derivedAttributValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
    </operations>
    <operations name="Class__SetText" body="Class__text:= ({Instance}&lt;&lt;|Class__text)\/ {(Instance|-> textValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="textValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Class__SetConstrainedSet" body="Class__constrainedSet:= ({Instance}&lt;&lt;|Class__constrainedSet)\/ ({Instance}*constrainedSetValue)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="constrainedSetValue" type="//@machines.0/@data.0">
        <typingPredicate type="//@machines.0/@data.0"/>
        <typingPredicate name="card(constrainedSetValue)&lt;=6"/>
        <typingPredicate name="card(constrainedSetValue)>=2"/>
      </param>
    </operations>
    <operations name="Class__AddSetAttribut" body="Class__SetAttribut:= Class__SetAttribut\/ {(Instance|-> SetAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="SetAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> SetAttributValue)/:Class__SetAttribut"/>
      </param>
    </operations>
    <operations name="Class__AddNonEmptySet" body="Class__nonEmptySet:= Class__nonEmptySet\/ {(Instance|-> nonEmptySetValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="nonEmptySetValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> nonEmptySetValue)/:Class__nonEmptySet"/>
      </param>
    </operations>
    <operations name="Class__AddConstrainedSet" body="Class__constrainedSet:= Class__constrainedSet\/ {(Instance|-> constrainedSetValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="Class__constrainedSet[{Instance}]/={}"/>
      </param>
      <param name="constrainedSetValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> constrainedSetValue)/:Class__constrainedSet"/>
        <typingPredicate name="card(Class__constrainedSet[{Instance}])&lt;6"/>
      </param>
    </operations>
    <operations name="Class__RemoveSetAttribut" body="Class__SetAttribut:= Class__SetAttribut\/ {(Instance|-> SetAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="SetAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> SetAttributValue):Class__SetAttribut"/>
      </param>
    </operations>
    <operations name="Class__RemoveNonEmptySet" body="Class__nonEmptySet:= Class__nonEmptySet\/ {(Instance|-> nonEmptySetValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="nonEmptySetValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> nonEmptySetValue):Class__nonEmptySet"/>
      </param>
    </operations>
    <operations name="Class__RemoveConstrainedSet" body="Class__constrainedSet:= Class__constrainedSet\/ {(Instance|-> constrainedSetValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="card(Class__constrainedSet[{Instance}])>2"/>
      </param>
      <param name="constrainedSetValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> constrainedSetValue):Class__constrainedSet"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
    <initialisation init="//@machines.0/@data.12"/>
    <initialisation init="//@machines.0/@data.13"/>
    <initialisation init="//@machines.0/@data.14"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.16"/>
    <initialisation init="//@machines.0/@data.17"/>
    <initialisation init="//@machines.0/@data.18"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@data.13 //@machines.0/@operations.0/@param.1 //@machines.0/@operations.0/@param.2 //@machines.0/@operations.17/@param.1 //@machines.0/@operations.18/@param.1 //@machines.0/@operations.19/@param.1 //@machines.0/@operations.20/@param.1 //@machines.0/@operations.21/@param.1 //@machines.0/@operations.26/@param.1 //@machines.0/@operations.27/@param.1 //@machines.0/@operations.29/@param.1 //@machines.0/@operations.30/@param.1"/>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.22/@param.1 //@machines.0/@operations.23/@param.1"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.3"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.5"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.7"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.9" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.11" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.12" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" expression="TotalFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.17" expression="PartialFunction" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.18" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
  </sharedTypes>
</b:BSpec>
