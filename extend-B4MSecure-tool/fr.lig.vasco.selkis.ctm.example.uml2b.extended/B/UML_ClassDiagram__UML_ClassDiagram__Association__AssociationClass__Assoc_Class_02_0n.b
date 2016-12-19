<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Assoc_Class_02_0n" systemMachine="//@machines.0">
  <machines name="Assoc_Class_02_0n">
    <data xsi:type="b:BVariable" name="Class1" type="//@machines.0/@data.1" typing="//@machines.0/@operations.2/@param.0 //@machines.0/@operations.4/@param.2 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.8/@param.0 //@machines.0/@operations.9/@param.1 //@machines.0/@operations.10/@param.0 //@machines.0/@operations.11/@param.1">
      <typingPredicate type="//@machines.0/@data.1"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CLASS1" typing="//@machines.0/@data.0 //@machines.0/@operations.0/@param.0"/>
    <data xsi:type="b:BVariable" name="Class2" type="//@machines.0/@data.3" typing="//@machines.0/@operations.3/@param.0 //@machines.0/@operations.4/@param.1 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.1 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.10/@param.1 //@machines.0/@operations.11/@param.0">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CLASS2" typing="//@machines.0/@data.2 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="AssoClass" type="//@sharedTypes/@sharedTypes.0" typing="//@machines.0/@operations.4/@param.0 //@machines.0/@operations.5/@param.0">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
      <typingPredicate name="!c2.( c2:dom(AssoClass) => card(AssoClass[{c2}])&lt;=2)"/>
    </data>
    <operations name="Class1_NEW" body="Class1 := Class1 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: Class1"/>
      </param>
    </operations>
    <operations name="Class2_NEW" body="Class2 := Class2 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: Class2"/>
      </param>
    </operations>
    <operations name="Class1_Free" body="Class1 := Class1 - {Instance}&#xA; || AssoClass:= AssoClass|>> {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Class2_Free" body="Class2 := Class2 - {Instance}&#xA; || AssoClass:= {Instance}&lt;&lt;|AssoClass">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="AssoClass_NEW" body="AssoClass := AssoClass \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate name="Instance : Class2*Class1"/>
        <typingPredicate name="Instance /: AssoClass"/>
      </param>
      <param name="Class2Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="Class1Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="( Class2Instance|->Class1Instance )= Instance"/>
        <typingPredicate name=" card(AssoClass[{Class2Instance }])&lt; 2"/>
      </param>
    </operations>
    <operations name="AssoClass_Free" body="AssoClass := AssoClass - {Instance}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="Class1__GetAssoClass" body="result := AssoClass~(Instance)">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
    </operations>
    <operations name="Class2__GetAssoClass" body="result := AssoClass(Instance)">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="Class1__AddAssoClass" body="AssoClass:= AssoClass\/{(AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="AssoClass__class2Values" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(AssoClass__class2Values|-> Instance) /:AssoClass"/>
        <typingPredicate name="not(#(c1,c2).(c1:Class1 &amp; c2:Class1 &amp; c1/=c2 &amp; {c1,c2}&lt;: AssoClass[{AssoClass__class2Values}]))"/>
      </param>
    </operations>
    <operations name="Class2__AddAssoClass" body="AssoClass:= AssoClass\/ {(Instance|-> AssoClass__class1Values)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="card(AssoClass[{Instance}])&lt;2"/>
      </param>
      <param name="AssoClass__class1Values" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> AssoClass__class1Values) /:AssoClass"/>
      </param>
    </operations>
    <operations name="Class1__RemoveAssoClass" body="AssoClass:= AssoClass-{(AssoClass__class2Values|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
      </param>
      <param name="AssoClass__class2Values" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="(AssoClass__class2Values|-> Instance) :AssoClass"/>
      </param>
    </operations>
    <operations name="Class2__RemoveAssoClass" body="AssoClass:= AssoClass-{(Instance|-> AssoClass__class1Values)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
      <param name="AssoClass__class1Values" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="(Instance|-> AssoClass__class1Values) :AssoClass"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.0"/>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.4" dom="//@machines.0/@data.2" ran="//@machines.0/@data.0"/>
  </sharedTypes>
</b:BSpec>
