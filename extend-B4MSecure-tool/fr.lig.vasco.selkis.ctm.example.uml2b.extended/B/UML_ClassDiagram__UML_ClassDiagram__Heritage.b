<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Heritage" systemMachine="//@machines.0">
  <machines name="Heritage">
    <data xsi:type="b:BAbstractSet" name="STR"/>
    <data xsi:type="b:BAbstractSet" name="HERITAGE_SIMPLE__SUPERCLASS" typing="//@machines.0/@data.2 //@machines.0/@operations.0/@param.0 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="Heritage_Simple__SuperClass" type="//@machines.0/@data.1" typing="//@machines.0/@data.3 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.18/@param.0 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.32/@param.0 //@machines.0/@operations.34/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple__SubClass" type="//@machines.0/@data.2" typing="//@machines.0/@operations.10/@param.0 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.26/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="HERITAGE_SIMPLE2__SUPERCLASS" typing="//@machines.0/@data.5 //@machines.0/@operations.2/@param.0 //@machines.0/@operations.3/@param.0 //@machines.0/@operations.4/@param.0"/>
    <data xsi:type="b:BVariable" name="Heritage_Simple2__SuperClass" type="//@machines.0/@data.4" typing="//@machines.0/@data.6 //@machines.0/@data.7 //@machines.0/@operations.11/@param.0 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.27/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple2__SubClass1" type="//@machines.0/@data.5" typing="//@machines.0/@operations.12/@param.0 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.28/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple2__SubClass2" type="//@machines.0/@data.5" typing="//@machines.0/@operations.13/@param.0 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.29/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="HERITAGE_MULTIPLE__OBJECTS" typing="//@machines.0/@data.9 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.0"/>
    <data xsi:type="b:BVariable" name="Heritage_multiple__OBJECTS" type="//@machines.0/@data.8" typing="//@machines.0/@data.10 //@machines.0/@data.11 //@machines.0/@operations.14/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_multiple__SuperClass1" type="//@machines.0/@data.9" typing="//@machines.0/@data.12 //@machines.0/@operations.15/@param.0 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.30/@param.0 //@machines.0/@operations.33/@param.0 //@machines.0/@operations.35/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_multiple__SuperClass2" type="//@machines.0/@data.9" typing="//@machines.0/@operations.16/@param.0 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.31/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_multiple__SubClass" type="//@machines.0/@data.10" typing="//@machines.0/@operations.17/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.8"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple__SuperClass__superAttribut" type="//@sharedTypes/@sharedTypes.9">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.9"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple__SubClass__subAttribut" type="//@sharedTypes/@sharedTypes.10">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.10"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple2__SuperClass__superAttribut" type="//@sharedTypes/@sharedTypes.11">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.11"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple2__SubClass1__subAttribut" type="//@sharedTypes/@sharedTypes.12">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.12"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_Simple2__SubClass2__subAttribut" type="//@sharedTypes/@sharedTypes.13">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.13"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_multiple__SuperClass1__superAttribut" type="//@sharedTypes/@sharedTypes.14">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.14"/>
      <typingPredicate name="!cc.( cc:dom(Heritage_multiple__SuperClass1__superAttribut) => card(Heritage_multiple__SuperClass1__superAttribut[{cc}])>=2)&#xA; &amp; !cc.( cc:dom(Heritage_multiple__SuperClass1__superAttribut) => card(Heritage_multiple__SuperClass1__superAttribut[{cc}])&lt;=5)"/>
    </data>
    <data xsi:type="b:BVariable" name="Heritage_multiple__SuperClass2__superAttribut" type="//@sharedTypes/@sharedTypes.15">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.15"/>
    </data>
    <invariant body="Heritage_Simple2__SubClass1 /\ Heritage_Simple2__SubClass2 = {}"/>
    <invariant body="Heritage_multiple__SuperClass1 /\ Heritage_multiple__SuperClass2 = Heritage_multiple__SubClass"/>
    <operations name="Heritage_Simple__SuperClass_NEW" body="Heritage_Simple__SuperClass := Heritage_Simple__SuperClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Heritage_Simple__SuperClass"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SubClass_NEW" body="Heritage_Simple__SubClass := Heritage_Simple__SubClass \/ {Instance} || Heritage_Simple__SuperClass := Heritage_Simple__SuperClass \/ {Instance} || Heritage_Simple__SubClass__subAttribut:= Heritage_Simple__SubClass__subAttribut \/ {(Instance|->Heritage_Simple__SubClass__subAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Heritage_Simple__SuperClass"/>
      </param>
      <param name="Heritage_Simple__SubClass__subAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SuperClass_NEW" body="Heritage_Simple2__SuperClass := Heritage_Simple2__SuperClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Heritage_Simple2__SuperClass"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass1_NEW" body="Heritage_Simple2__SubClass1 := Heritage_Simple2__SubClass1 \/ {Instance} || Heritage_Simple2__SuperClass := Heritage_Simple2__SuperClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Heritage_Simple2__SuperClass"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass2_NEW" body="Heritage_Simple2__SubClass2 := Heritage_Simple2__SubClass2 \/ {Instance} || Heritage_Simple2__SuperClass := Heritage_Simple2__SuperClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Heritage_Simple2__SuperClass"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__OBJECTS_NEW" body="Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: Heritage_multiple__OBJECTS"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass1_NEW" body="Heritage_multiple__SuperClass1 := Heritage_multiple__SuperClass1 \/ {Instance} || Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS \/ {Instance} || Heritage_multiple__SuperClass1__superAttribut:= Heritage_multiple__SuperClass1__superAttribut \/ ({Instance}*Heritage_multiple__SuperClass1__superAttributValue)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: Heritage_multiple__OBJECTS"/>
      </param>
      <param name="Heritage_multiple__SuperClass1__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttributValue)&lt;=5"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttributValue)>=2"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass2_NEW" body="Heritage_multiple__SuperClass2 := Heritage_multiple__SuperClass2 \/ {Instance} || Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: Heritage_multiple__OBJECTS"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SubClass_NEW" body="Heritage_multiple__SubClass := Heritage_multiple__SubClass \/ {Instance} || Heritage_multiple__SuperClass1 := Heritage_multiple__SuperClass1 \/ {Instance} || Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS \/ {Instance} || Heritage_multiple__SuperClass2 := Heritage_multiple__SuperClass2 \/ {Instance} || Heritage_multiple__SuperClass1__superAttribut:= Heritage_multiple__SuperClass1__superAttribut \/ ({Instance}*Heritage_multiple__SuperClass1__superAttributValue)">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: Heritage_multiple__OBJECTS"/>
      </param>
      <param name="Heritage_multiple__SuperClass1__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttributValue)&lt;=5"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttributValue)>=2"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SuperClass_Free" body="Heritage_Simple__SuperClass := Heritage_Simple__SuperClass - {Instance} || Heritage_Simple__SuperClass__superAttribut:= {Instance}&lt;&lt;|Heritage_Simple__SuperClass__superAttribut">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="Instance /: (Heritage_Simple__SubClass )"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SubClass_Free" body="Heritage_Simple__SubClass := Heritage_Simple__SubClass - {Instance} || Heritage_Simple__SuperClass := Heritage_Simple__SuperClass - {Instance} || Heritage_Simple__SuperClass__superAttribut:= {Instance}&lt;&lt;|Heritage_Simple__SuperClass__superAttribut || Heritage_Simple__SubClass__subAttribut:= {Instance}&lt;&lt;|Heritage_Simple__SubClass__subAttribut">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SuperClass_Free" body="Heritage_Simple2__SuperClass := Heritage_Simple2__SuperClass - {Instance} || Heritage_Simple2__SuperClass__superAttribut:= {Instance}&lt;&lt;|Heritage_Simple2__SuperClass__superAttribut">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: (Heritage_Simple2__SubClass1 \/ Heritage_Simple2__SubClass2 )"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass1_Free" body="Heritage_Simple2__SubClass1 := Heritage_Simple2__SubClass1 - {Instance} || Heritage_Simple2__SuperClass := Heritage_Simple2__SuperClass - {Instance} || Heritage_Simple2__SuperClass__superAttribut:= {Instance}&lt;&lt;|Heritage_Simple2__SuperClass__superAttribut || Heritage_Simple2__SubClass1__subAttribut:= {Instance}&lt;&lt;|Heritage_Simple2__SubClass1__subAttribut">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass2_Free" body="Heritage_Simple2__SubClass2 := Heritage_Simple2__SubClass2 - {Instance} || Heritage_Simple2__SuperClass := Heritage_Simple2__SuperClass - {Instance} || Heritage_Simple2__SuperClass__superAttribut:= {Instance}&lt;&lt;|Heritage_Simple2__SuperClass__superAttribut || Heritage_Simple2__SubClass2__subAttribut:= {Instance}&lt;&lt;|Heritage_Simple2__SubClass2__subAttribut">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__OBJECTS_Free" body="Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS - {Instance}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance /: (Heritage_multiple__SuperClass1 \/ Heritage_multiple__SuperClass2 )"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass1_Free" body="Heritage_multiple__SuperClass1 := Heritage_multiple__SuperClass1 - {Instance} || Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS - {Instance} || Heritage_multiple__SuperClass1__superAttribut:= {Instance}&lt;&lt;|Heritage_multiple__SuperClass1__superAttribut">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="Instance /: (Heritage_multiple__SubClass )"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass2_Free" body="Heritage_multiple__SuperClass2 := Heritage_multiple__SuperClass2 - {Instance} || Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS - {Instance} || Heritage_multiple__SuperClass2__superAttribut:= {Instance}&lt;&lt;|Heritage_multiple__SuperClass2__superAttribut">
      <param name="Instance" type="//@machines.0/@data.11">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
        <typingPredicate name="Instance /: (Heritage_multiple__SubClass )"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SubClass_Free" body="Heritage_multiple__SubClass := Heritage_multiple__SubClass - {Instance} || Heritage_multiple__SuperClass1 := Heritage_multiple__SuperClass1 - {Instance} || Heritage_multiple__OBJECTS := Heritage_multiple__OBJECTS - {Instance} || Heritage_multiple__SuperClass2 := Heritage_multiple__SuperClass2 - {Instance} || Heritage_multiple__SuperClass1__superAttribut:= {Instance}&lt;&lt;|Heritage_multiple__SuperClass1__superAttribut || Heritage_multiple__SuperClass2__superAttribut:= {Instance}&lt;&lt;|Heritage_multiple__SuperClass2__superAttribut">
      <param name="Instance" type="//@machines.0/@data.12">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.12"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SuperClass__GetSuperAttribut" body="result := Heritage_Simple__SuperClass__superAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SubClass__GetSubAttribut" body="result := Heritage_Simple__SubClass__subAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SuperClass__GetSuperAttribut" body="result := Heritage_Simple2__SuperClass__superAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass1__GetSubAttribut" body="result := Heritage_Simple2__SubClass1__subAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass2__GetSubAttribut" body="result := Heritage_Simple2__SubClass2__subAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass1__GetSuperAttribut" body="result := Heritage_multiple__SuperClass1__superAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass2__GetSuperAttribut" body="result := Heritage_multiple__SuperClass2__superAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.11">
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SuperClass__SetSuperAttribut" body="Heritage_Simple__SuperClass__superAttribut:= ({Instance}&lt;&lt;|Heritage_Simple__SuperClass__superAttribut)\/ ({Instance}*Heritage_Simple__SuperClass__superAttributValue)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Heritage_Simple__SuperClass__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SubClass__SetSubAttribut" body="Heritage_Simple__SubClass__subAttribut:= ({Instance}&lt;&lt;|Heritage_Simple__SubClass__subAttribut)\/ {(Instance|-> Heritage_Simple__SubClass__subAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="Heritage_Simple__SubClass__subAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SuperClass__SetSuperAttribut" body="Heritage_Simple2__SuperClass__superAttribut:= ({Instance}&lt;&lt;|Heritage_Simple2__SuperClass__superAttribut)\/ {(Instance|-> Heritage_Simple2__SuperClass__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="Heritage_Simple2__SuperClass__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass1__SetSubAttribut" body="Heritage_Simple2__SubClass1__subAttribut:= ({Instance}&lt;&lt;|Heritage_Simple2__SubClass1__subAttribut)\/ {(Instance|-> Heritage_Simple2__SubClass1__subAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="Heritage_Simple2__SubClass1__subAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Heritage_Simple2__SubClass2__SetSubAttribut" body="Heritage_Simple2__SubClass2__subAttribut:= ({Instance}&lt;&lt;|Heritage_Simple2__SubClass2__subAttribut)\/ {(Instance|-> Heritage_Simple2__SubClass2__subAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="Heritage_Simple2__SubClass2__subAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass1__SetSuperAttribut" body="Heritage_multiple__SuperClass1__superAttribut:= ({Instance}&lt;&lt;|Heritage_multiple__SuperClass1__superAttribut)\/ ({Instance}*Heritage_multiple__SuperClass1__superAttributValue)">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="Heritage_multiple__SuperClass1__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttributValue)&lt;=5"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttributValue)>=2"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass2__SetSuperAttribut" body="Heritage_multiple__SuperClass2__superAttribut:= ({Instance}&lt;&lt;|Heritage_multiple__SuperClass2__superAttribut)\/ {(Instance|-> Heritage_multiple__SuperClass2__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.11">
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
      </param>
      <param name="Heritage_multiple__SuperClass2__superAttributValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SuperClass__AddSuperAttribut" body="Heritage_Simple__SuperClass__superAttribut:= Heritage_Simple__SuperClass__superAttribut\/ {(Instance|-> Heritage_Simple__SuperClass__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Heritage_Simple__SuperClass__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> Heritage_Simple__SuperClass__superAttributValue)/:Heritage_Simple__SuperClass__superAttribut"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass1__AddSuperAttribut" body="Heritage_multiple__SuperClass1__superAttribut:= Heritage_multiple__SuperClass1__superAttribut\/ {(Instance|-> Heritage_multiple__SuperClass1__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="Heritage_multiple__SuperClass1__superAttribut[{Instance}]/={}"/>
      </param>
      <param name="Heritage_multiple__SuperClass1__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> Heritage_multiple__SuperClass1__superAttributValue)/:Heritage_multiple__SuperClass1__superAttribut"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttribut[{Instance}])&lt;5"/>
      </param>
    </operations>
    <operations name="Heritage_Simple__SuperClass__RemoveSuperAttribut" body="Heritage_Simple__SuperClass__superAttribut:= Heritage_Simple__SuperClass__superAttribut\/ {(Instance|-> Heritage_Simple__SuperClass__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Heritage_Simple__SuperClass__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> Heritage_Simple__SuperClass__superAttributValue):Heritage_Simple__SuperClass__superAttribut"/>
      </param>
    </operations>
    <operations name="Heritage_multiple__SuperClass1__RemoveSuperAttribut" body="Heritage_multiple__SuperClass1__superAttribut:= Heritage_multiple__SuperClass1__superAttribut\/ {(Instance|-> Heritage_multiple__SuperClass1__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="card(Heritage_multiple__SuperClass1__superAttribut[{Instance}])>2"/>
      </param>
      <param name="Heritage_multiple__SuperClass1__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="(Instance|-> Heritage_multiple__SuperClass1__superAttributValue):Heritage_multiple__SuperClass1__superAttribut"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.3"/>
    <initialisation init="//@machines.0/@data.5"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.7"/>
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
    <initialisation init="//@machines.0/@data.19"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@operations.1/@param.1 //@machines.0/@operations.6/@param.1 //@machines.0/@operations.8/@param.1 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.26/@param.1 //@machines.0/@operations.27/@param.1 //@machines.0/@operations.28/@param.1 //@machines.0/@operations.29/@param.1 //@machines.0/@operations.30/@param.1 //@machines.0/@operations.32/@param.1 //@machines.0/@operations.33/@param.1 //@machines.0/@operations.34/@param.1 //@machines.0/@operations.35/@param.1"/>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.31/@param.1"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.2"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.4"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.5"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.8"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.9"/>
    <sharedTypes xsi:type="b:BPowType" pow="//@machines.0/@data.10"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.13" dom="//@machines.0/@data.2" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.14" expression="TotalFunction" dom="//@machines.0/@data.3" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="PartialFunction" dom="//@machines.0/@data.5" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" expression="PartialFunction" dom="//@machines.0/@data.6" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.17" expression="PartialFunction" dom="//@machines.0/@data.7" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.18" dom="//@machines.0/@data.10" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.19" expression="PartialFunction" dom="//@machines.0/@data.11" ran="//@sharedTypes/@sharedTypes.1"/>
  </sharedTypes>
</b:BSpec>
