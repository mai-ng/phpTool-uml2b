<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="Heritage_multiple2" systemMachine="//@machines.0">
  <machines name="Heritage_multiple2">
    <data xsi:type="b:BVariable" name="OBJECTS" type="//@machines.0/@data.1" typing="//@machines.0/@data.4 //@machines.0/@data.5 //@machines.0/@operations.6/@param.0">
      <typingPredicate type="//@machines.0/@data.1"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="OBJECTS_AS" typing="//@machines.0/@data.0 //@machines.0/@operations.0/@param.0 //@machines.0/@operations.2/@param.0 //@machines.0/@operations.3/@param.0 //@machines.0/@operations.4/@param.0 //@machines.0/@operations.5/@param.0"/>
    <data xsi:type="b:BVariable" name="Class1" type="//@machines.0/@data.3" typing="//@machines.0/@operations.7/@param.0">
      <typingPredicate type="//@machines.0/@data.3"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CLASS1" typing="//@machines.0/@data.2 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="SuperClass1" type="//@machines.0/@data.0" typing="//@machines.0/@operations.8/@param.0 //@machines.0/@operations.12/@param.0 //@machines.0/@operations.15/@param.0">
      <typingPredicate type="//@machines.0/@data.0"/>
    </data>
    <data xsi:type="b:BVariable" name="SuperClass2" type="//@machines.0/@data.0" typing="//@machines.0/@data.6 //@machines.0/@data.7 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.16/@param.0">
      <typingPredicate type="//@machines.0/@data.0"/>
    </data>
    <data xsi:type="b:BVariable" name="SuperClass22" type="//@machines.0/@data.5" typing="//@machines.0/@operations.14/@param.0 //@machines.0/@operations.17/@param.0">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BVariable" name="SuperClass21" type="//@machines.0/@data.5" typing="//@machines.0/@data.8 //@machines.0/@operations.10/@param.0">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BVariable" name="SubClass" type="//@machines.0/@data.7" typing="//@machines.0/@operations.11/@param.0">
      <typingPredicate type="//@machines.0/@data.1"/>
      <typingPredicate type="//@machines.0/@data.4"/>
      <typingPredicate type="//@machines.0/@data.6"/>
      <typingPredicate type="//@machines.0/@data.7"/>
    </data>
    <data xsi:type="b:BVariable" name="SuperClass1__superAttribut" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="SuperClass2__superAttribut" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
    </data>
    <data xsi:type="b:BVariable" name="SuperClass22__attrib" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
    </data>
    <invariant body="SuperClass1 /\ SuperClass2 = SubClass\/SubClass"/>
    <invariant body="SuperClass22 /\ SuperClass21 = SubClass"/>
    <operations name="OBJECTS_NEW" body="OBJECTS := OBJECTS \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: OBJECTS"/>
      </param>
    </operations>
    <operations name="Class1_NEW" body="Class1 := Class1 \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="Instance /: Class1"/>
      </param>
    </operations>
    <operations name="SuperClass1_NEW" body="SuperClass1 := SuperClass1 \/ {Instance} &#xA; || OBJECTS := OBJECTS \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: OBJECTS"/>
      </param>
    </operations>
    <operations name="SuperClass2_NEW" body="SuperClass2 := SuperClass2 \/ {Instance} &#xA; || OBJECTS := OBJECTS \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: OBJECTS"/>
      </param>
    </operations>
    <operations name="SuperClass21_NEW" body="SuperClass21 := SuperClass21 \/ {Instance} &#xA; || SuperClass2 := SuperClass2 \/ {Instance} &#xA; || OBJECTS := OBJECTS \/ {Instance}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: OBJECTS"/>
      </param>
    </operations>
    <operations name="SubClass_NEW" body="SubClass := SubClass \/ {Instance} &#xA; || SuperClass1 := SuperClass1 \/ {Instance} &#xA; || OBJECTS := OBJECTS \/ {Instance} &#xA; || SuperClass22 := SuperClass22 \/ {Instance} &#xA; || SuperClass2 := SuperClass2 \/ {Instance} &#xA; || SuperClass21 := SuperClass21 \/ {Instance}&#xA; || SuperClass22__attrib:= SuperClass22__attrib \/ {(Instance|->SuperClass22__attribValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="Instance /: OBJECTS"/>
      </param>
      <param name="SuperClass22__attribValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="SuperClass22__attribValue /:ran(SuperClass22__attrib)"/>
      </param>
    </operations>
    <operations name="OBJECTS_Free" body="OBJECTS := OBJECTS - {Instance}">
      <param name="Instance" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Instance /: (SuperClass1 \/ SuperClass2 )"/>
      </param>
    </operations>
    <operations name="Class1_Free" body="Class1 := Class1 - {Instance}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
      </param>
    </operations>
    <operations name="SuperClass1_Free" body="SuperClass1 := SuperClass1 - {Instance} &#xA; || OBJECTS := OBJECTS - {Instance}&#xA; || SuperClass1__superAttribut:= {Instance}&lt;&lt;|SuperClass1__superAttribut">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: (SubClass )"/>
      </param>
    </operations>
    <operations name="SuperClass2_Free" body="SuperClass2 := SuperClass2 - {Instance} &#xA; || OBJECTS := OBJECTS - {Instance}&#xA; || SuperClass2__superAttribut:= {Instance}&lt;&lt;|SuperClass2__superAttribut">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: (SuperClass22 \/ SuperClass21 )"/>
      </param>
    </operations>
    <operations name="SuperClass21_Free" body="SuperClass21 := SuperClass21 - {Instance} &#xA; || SuperClass2 := SuperClass2 - {Instance} &#xA; || OBJECTS := OBJECTS - {Instance}&#xA; || SuperClass2__superAttribut:= {Instance}&lt;&lt;|SuperClass2__superAttribut">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="Instance /: (SubClass )"/>
      </param>
    </operations>
    <operations name="SubClass_Free" body="SubClass := SubClass - {Instance} &#xA; || SuperClass1 := SuperClass1 - {Instance} &#xA; || OBJECTS := OBJECTS - {Instance} &#xA; || SuperClass22 := SuperClass22 - {Instance} &#xA; || SuperClass2 := SuperClass2 - {Instance} &#xA; || SuperClass21 := SuperClass21 - {Instance}&#xA; || SuperClass1__superAttribut:= {Instance}&lt;&lt;|SuperClass1__superAttribut&#xA; || SuperClass2__superAttribut:= {Instance}&lt;&lt;|SuperClass2__superAttribut&#xA; || SuperClass22__attrib:= {Instance}&lt;&lt;|SuperClass22__attrib">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
      </param>
    </operations>
    <operations name="SuperClass1__GetSuperAttribut" body="result := SuperClass1__superAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
    </operations>
    <operations name="SuperClass2__GetSuperAttribut" body="result := SuperClass2__superAttribut(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="SuperClass22__GetAttrib" body="result := SuperClass22__attrib(Instance)">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
    </operations>
    <operations name="SuperClass1__SetSuperAttribut" body="SuperClass1__superAttribut:= ({Instance}&lt;&lt;|SuperClass1__superAttribut)\/ ({Instance}*SuperClass1__superAttributValue)">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
      </param>
      <param name="SuperClass1__superAttributValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate type="//@sharedTypes/@sharedTypes.0"/>
      </param>
    </operations>
    <operations name="SuperClass2__SetSuperAttribut" body="SuperClass2__superAttribut:= ({Instance}&lt;&lt;|SuperClass2__superAttribut)\/ {(Instance|-> SuperClass2__superAttributValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="SuperClass2__superAttributValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="SuperClass2__superAttributValue /: ran(SuperClass2__superAttribut)"/>
      </param>
    </operations>
    <operations name="SuperClass22__SetAttrib" body="SuperClass22__attrib:= ({Instance}&lt;&lt;|SuperClass22__attrib)\/ {(Instance|-> SuperClass22__attribValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
      </param>
      <param name="SuperClass22__attribValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="SuperClass22__attribValue /: ran(SuperClass22__attrib)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.0"/>
    <initialisation init="//@machines.0/@data.2"/>
    <initialisation init="//@machines.0/@data.4"/>
    <initialisation init="//@machines.0/@data.5"/>
    <initialisation init="//@machines.0/@data.6"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.8"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@operations.5/@param.1 //@machines.0/@operations.15/@param.1 //@machines.0/@operations.17/@param.1"/>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.16/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.9" dom="//@machines.0/@data.4" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.10" expression="PartialInjection" dom="//@machines.0/@data.5" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.11" expression="TotalInjection" dom="//@machines.0/@data.6" ran="//@sharedTypes/@sharedTypes.0"/>
  </sharedTypes>
</b:BSpec>
