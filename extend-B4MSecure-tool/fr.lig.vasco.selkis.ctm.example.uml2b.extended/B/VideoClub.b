<?xml version="1.0" encoding="ASCII"?>
<b:BSpec xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:b="http://www.liglab.fr/vasco/models/b" name="VideoClub" systemMachine="//@machines.0">
  <machines name="VideoClub">
    <data xsi:type="b:BAbstractSet" name="STR" typing="//@machines.0/@operations.3/@param.2 //@machines.0/@operations.5/@param.2 //@machines.0/@operations.6/@param.2 //@machines.0/@operations.7/@param.2 //@machines.0/@operations.8/@param.2 //@machines.0/@operations.4/@param.1 //@machines.0/@operations.45/@param.1 //@machines.0/@operations.47/@param.1"/>
    <data xsi:type="b:BVariable" name="Client" type="//@machines.0/@data.2" typing="//@machines.0/@operations.0/@param.0 //@machines.0/@operations.9/@param.0 //@machines.0/@operations.2/@param.1 //@machines.0/@operations.17/@param.0 //@machines.0/@operations.23/@param.1 //@machines.0/@operations.24/@param.0 //@machines.0/@operations.29/@param.0 //@machines.0/@operations.34/@param.0 //@machines.0/@operations.35/@param.0 //@machines.0/@operations.42/@param.0 //@machines.0/@operations.43/@param.0">
      <typingPredicate type="//@machines.0/@data.2"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CLIENT" typing="//@machines.0/@data.1 //@machines.0/@operations.1/@param.0"/>
    <data xsi:type="b:BVariable" name="Emprunt" type="//@machines.0/@data.4" typing="//@machines.0/@operations.10/@param.0 //@machines.0/@operations.18/@param.0 //@machines.0/@operations.20/@param.0 //@machines.0/@operations.23/@param.0 //@machines.0/@operations.24/@param.1 //@machines.0/@operations.25/@param.1 //@machines.0/@operations.26/@param.0 //@machines.0/@operations.29/@param.1 //@machines.0/@operations.30/@param.1 //@machines.0/@operations.31/@param.0 //@machines.0/@operations.36/@param.0 //@machines.0/@operations.44/@param.0">
      <typingPredicate type="//@machines.0/@data.4"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="EMPRUNT" typing="//@machines.0/@data.3 //@machines.0/@operations.2/@param.0"/>
    <data xsi:type="b:BVariable" name="Cassette" type="//@machines.0/@data.6" typing="//@machines.0/@data.9 //@machines.0/@data.10 //@machines.0/@operations.0/@param.1 //@machines.0/@operations.11/@param.0 //@machines.0/@operations.19/@param.0 //@machines.0/@operations.22/@param.0 //@machines.0/@operations.25/@param.0 //@machines.0/@operations.26/@param.1 //@machines.0/@operations.27/@param.1 //@machines.0/@operations.28/@param.0 //@machines.0/@operations.30/@param.0 //@machines.0/@operations.31/@param.1 //@machines.0/@operations.32/@param.1 //@machines.0/@operations.33/@param.0 //@machines.0/@operations.37/@param.0 //@machines.0/@operations.38/@param.0 //@machines.0/@operations.45/@param.0 //@machines.0/@operations.46/@param.0">
      <typingPredicate type="//@machines.0/@data.6"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="CASSETTE" typing="//@machines.0/@data.5 //@machines.0/@operations.3/@param.0 //@machines.0/@operations.5/@param.0 //@machines.0/@operations.6/@param.0 //@machines.0/@operations.7/@param.0 //@machines.0/@operations.8/@param.0"/>
    <data xsi:type="b:BVariable" name="Acteur" type="//@machines.0/@data.8" typing="//@machines.0/@operations.12/@param.0 //@machines.0/@operations.21/@param.0 //@machines.0/@operations.27/@param.0 //@machines.0/@operations.28/@param.1 //@machines.0/@operations.32/@param.0 //@machines.0/@operations.33/@param.1 //@machines.0/@operations.39/@param.0 //@machines.0/@operations.47/@param.0">
      <typingPredicate type="//@machines.0/@data.8"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="ACTEUR" typing="//@machines.0/@data.7 //@machines.0/@operations.4/@param.0"/>
    <data xsi:type="b:BVariable" name="Film" type="//@machines.0/@data.5" typing="//@machines.0/@data.12 //@machines.0/@operations.13/@param.0 //@machines.0/@operations.40/@param.0 //@machines.0/@operations.48/@param.0">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BVariable" name="Serie" type="//@machines.0/@data.5" typing="//@machines.0/@data.11 //@machines.0/@operations.14/@param.0 //@machines.0/@operations.41/@param.0 //@machines.0/@operations.49/@param.0">
      <typingPredicate type="//@machines.0/@data.5"/>
    </data>
    <data xsi:type="b:BVariable" name="Anime" type="//@machines.0/@data.10" typing="//@machines.0/@operations.15/@param.0">
      <typingPredicate type="//@machines.0/@data.10"/>
    </data>
    <data xsi:type="b:BVariable" name="OAV" type="//@machines.0/@data.9" typing="//@machines.0/@operations.16/@param.0">
      <typingPredicate type="//@machines.0/@data.6"/>
      <typingPredicate type="//@machines.0/@data.11"/>
      <typingPredicate type="//@machines.0/@data.9"/>
    </data>
    <data xsi:type="b:BEnumSet" name="GENRE" typing="//@machines.0/@operations.5/@param.4 //@machines.0/@operations.8/@param.4 //@machines.0/@operations.48/@param.1">
      <values name="ACTION" type="//@sharedTypes/@sharedTypes.0"/>
      <values name="COMEDIE" type="//@sharedTypes/@sharedTypes.0"/>
    </data>
    <data xsi:type="b:BAbstractSet" name="DATE" typing="//@machines.0/@operations.2/@param.3 //@machines.0/@operations.44/@param.1"/>
    <data xsi:type="b:BVariable" name="ClientEmprunt" type="//@sharedTypes/@sharedTypes.2">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.2"/>
    </data>
    <data xsi:type="b:BVariable" name="CassetteEmprunt" type="//@sharedTypes/@sharedTypes.3">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.3"/>
      <typingPredicate name="dom(CassetteEmprunt)=Emprunt"/>
    </data>
    <data xsi:type="b:BVariable" name="ActeurCassette" type="//@sharedTypes/@sharedTypes.4">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.4"/>
      <typingPredicate name="dom(ActeurCassette)=Cassette"/>
    </data>
    <data xsi:type="b:BVariable" name="Client__num_Client" type="//@sharedTypes/@sharedTypes.7">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.7"/>
    </data>
    <data xsi:type="b:BVariable" name="Client__suspendu" type="//@sharedTypes/@sharedTypes.8">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.8"/>
    </data>
    <data xsi:type="b:BVariable" name="Emprunt__date" type="//@sharedTypes/@sharedTypes.9">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.9"/>
    </data>
    <data xsi:type="b:BVariable" name="Cassette__titre" type="//@sharedTypes/@sharedTypes.10">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.10"/>
    </data>
    <data xsi:type="b:BVariable" name="Cassette__nbLibre" type="//@sharedTypes/@sharedTypes.11">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.11"/>
    </data>
    <data xsi:type="b:BVariable" name="Acteur__nom" type="//@sharedTypes/@sharedTypes.12">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.12"/>
    </data>
    <data xsi:type="b:BVariable" name="Film__genre" type="//@sharedTypes/@sharedTypes.13">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.13"/>
    </data>
    <data xsi:type="b:BVariable" name="Serie__num_Serie" type="//@sharedTypes/@sharedTypes.14">
      <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.14"/>
    </data>
    <invariant body="Film /\ Serie = OAV"/>
    <operations name="Client__emprunter" body="skip">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="casette" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Client_NEW" body="Client := Client \/ {Instance}&#xA; || Client__num_Client:= Client__num_Client \/ {(Instance|->Client__num_ClientValue)}">
      <param name="Instance" type="//@machines.0/@data.2">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate name="Instance /: Client"/>
      </param>
      <param name="Client__num_ClientValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Client__num_ClientValue /:ran(Client__num_Client)"/>
      </param>
    </operations>
    <operations name="Emprunt_NEW" body="Emprunt := Emprunt \/ {Instance} &#xA; || ClientEmprunt:= ClientEmprunt \/ {(Instance|->ClientEmprunt__targetValue)} &#xA; || CassetteEmprunt:= CassetteEmprunt \/ ({Instance}*CassetteEmprunt__targetValues)&#xA; || Emprunt__date:= Emprunt__date \/ {(Instance|->Emprunt__dateValue)}">
      <param name="Instance" type="//@machines.0/@data.4">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate name="Instance /: Emprunt"/>
      </param>
      <param name="ClientEmprunt__targetValue" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="CassetteEmprunt__targetValues" type="//@sharedTypes/@sharedTypes.5">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.5"/>
        <typingPredicate name="CassetteEmprunt__targetValues/={}"/>
      </param>
      <param name="Emprunt__dateValue" type="//@machines.0/@data.14">
        <typingPredicate operator="In" type="//@machines.0/@data.14"/>
        <typingPredicate name="Emprunt__dateValue /:ran(Emprunt__date)"/>
      </param>
    </operations>
    <operations name="Cassette_NEW" body="Cassette := Cassette \/ {Instance} &#xA; || ActeurCassette:= ActeurCassette \/ ({Instance}*ActeurCassette__targetValues)&#xA; || Cassette__titre:= Cassette__titre \/ {(Instance|->Cassette__titreValue)}&#xA; || Cassette__nbLibre:= Cassette__nbLibre \/ {(Instance|->Cassette__nbLibreValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: Cassette"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@sharedTypes/@sharedTypes.6">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
        <typingPredicate name="ActeurCassette__targetValues/={}"/>
      </param>
      <param name="Cassette__titreValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Cassette__titreValue /:ran(Cassette__titre)"/>
      </param>
      <param name="Cassette__nbLibreValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cassette__nbLibreValue /:ran(Cassette__nbLibre)"/>
      </param>
    </operations>
    <operations name="Acteur_NEW" body="Acteur := Acteur \/ {Instance}&#xA; || Acteur__nom:= Acteur__nom \/ {(Instance|->Acteur__nomValue)}">
      <param name="Instance" type="//@machines.0/@data.8">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate name="Instance /: Acteur"/>
      </param>
      <param name="Acteur__nomValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Acteur__nomValue /:ran(Acteur__nom)"/>
      </param>
    </operations>
    <operations name="Film_NEW" body="Film := Film \/ {Instance} &#xA; || Cassette := Cassette \/ {Instance} &#xA; || ActeurCassette:= ActeurCassette \/ ({Instance}*ActeurCassette__targetValues)&#xA; || Cassette__titre:= Cassette__titre \/ {(Instance|->Cassette__titreValue)}&#xA; || Cassette__nbLibre:= Cassette__nbLibre \/ {(Instance|->Cassette__nbLibreValue)}&#xA; || Film__genre:= Film__genre \/ {(Instance|->Film__genreValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: Cassette"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@sharedTypes/@sharedTypes.6">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
        <typingPredicate name="ActeurCassette__targetValues/={}"/>
      </param>
      <param name="Cassette__titreValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Cassette__titreValue /:ran(Cassette__titre)"/>
      </param>
      <param name="Cassette__nbLibreValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cassette__nbLibreValue /:ran(Cassette__nbLibre)"/>
      </param>
      <param name="Film__genreValue" type="//@machines.0/@data.13">
        <typingPredicate operator="In" type="//@machines.0/@data.13"/>
        <typingPredicate name="Film__genreValue /:ran(Film__genre)"/>
      </param>
    </operations>
    <operations name="Serie_NEW" body="Serie := Serie \/ {Instance} &#xA; || Cassette := Cassette \/ {Instance} &#xA; || ActeurCassette:= ActeurCassette \/ ({Instance}*ActeurCassette__targetValues)&#xA; || Cassette__titre:= Cassette__titre \/ {(Instance|->Cassette__titreValue)}&#xA; || Cassette__nbLibre:= Cassette__nbLibre \/ {(Instance|->Cassette__nbLibreValue)}&#xA; || Serie__num_Serie:= Serie__num_Serie \/ {(Instance|->Serie__num_SerieValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: Cassette"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@sharedTypes/@sharedTypes.6">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
        <typingPredicate name="ActeurCassette__targetValues/={}"/>
      </param>
      <param name="Cassette__titreValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Cassette__titreValue /:ran(Cassette__titre)"/>
      </param>
      <param name="Cassette__nbLibreValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cassette__nbLibreValue /:ran(Cassette__nbLibre)"/>
      </param>
      <param name="Serie__num_SerieValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Serie__num_SerieValue /:ran(Serie__num_Serie)"/>
      </param>
    </operations>
    <operations name="Anime_NEW" body="Anime := Anime \/ {Instance} &#xA; || Serie := Serie \/ {Instance} &#xA; || Cassette := Cassette \/ {Instance} &#xA; || ActeurCassette:= ActeurCassette \/ ({Instance}*ActeurCassette__targetValues)&#xA; || Cassette__titre:= Cassette__titre \/ {(Instance|->Cassette__titreValue)}&#xA; || Cassette__nbLibre:= Cassette__nbLibre \/ {(Instance|->Cassette__nbLibreValue)}&#xA; || Serie__num_Serie:= Serie__num_Serie \/ {(Instance|->Serie__num_SerieValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: Cassette"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@sharedTypes/@sharedTypes.6">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
        <typingPredicate name="ActeurCassette__targetValues/={}"/>
      </param>
      <param name="Cassette__titreValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Cassette__titreValue /:ran(Cassette__titre)"/>
      </param>
      <param name="Cassette__nbLibreValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cassette__nbLibreValue /:ran(Cassette__nbLibre)"/>
      </param>
      <param name="Serie__num_SerieValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Serie__num_SerieValue /:ran(Serie__num_Serie)"/>
      </param>
    </operations>
    <operations name="OAV_NEW" body="OAV := OAV \/ {Instance} &#xA; || Anime := Anime \/ {Instance} &#xA; || Serie := Serie \/ {Instance} &#xA; || Cassette := Cassette \/ {Instance} &#xA; || Film := Film \/ {Instance} &#xA; || ActeurCassette:= ActeurCassette \/ ({Instance}*ActeurCassette__targetValues)&#xA; || Cassette__titre:= Cassette__titre \/ {(Instance|->Cassette__titreValue)}&#xA; || Cassette__nbLibre:= Cassette__nbLibre \/ {(Instance|->Cassette__nbLibreValue)}&#xA; || Film__genre:= Film__genre \/ {(Instance|->Film__genreValue)}&#xA; || Serie__num_Serie:= Serie__num_Serie \/ {(Instance|->Serie__num_SerieValue)}">
      <param name="Instance" type="//@machines.0/@data.6">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate name="Instance /: Cassette"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@sharedTypes/@sharedTypes.6">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.6"/>
        <typingPredicate name="ActeurCassette__targetValues/={}"/>
      </param>
      <param name="Cassette__titreValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Cassette__titreValue /:ran(Cassette__titre)"/>
      </param>
      <param name="Cassette__nbLibreValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cassette__nbLibreValue /:ran(Cassette__nbLibre)"/>
      </param>
      <param name="Film__genreValue" type="//@machines.0/@data.13">
        <typingPredicate operator="In" type="//@machines.0/@data.13"/>
        <typingPredicate name="Film__genreValue /:ran(Film__genre)"/>
      </param>
      <param name="Serie__num_SerieValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Serie__num_SerieValue /:ran(Serie__num_Serie)"/>
      </param>
    </operations>
    <operations name="Client_Free" body="Client := Client - {Instance}&#xA; || ClientEmprunt:= ClientEmprunt|>> {Instance}&#xA; || Client__num_Client:= {Instance}&lt;&lt;|Client__num_Client&#xA; || Client__suspendu:= {Instance}&lt;&lt;|Client__suspendu">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.2"/>
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="ClientEmprunt~[{Instance}]={}"/>
      </param>
    </operations>
    <operations name="Emprunt_Free" body="Emprunt := Emprunt - {Instance}&#xA; || ClientEmprunt:= {Instance}&lt;&lt;|ClientEmprunt&#xA; || CassetteEmprunt:= {Instance}&lt;&lt;|CassetteEmprunt&#xA; || Emprunt__date:= {Instance}&lt;&lt;|Emprunt__date">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.4"/>
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Cassette_Free" body="Cassette := Cassette - {Instance}&#xA; || CassetteEmprunt:= CassetteEmprunt|>> {Instance}&#xA; || ActeurCassette:= {Instance}&lt;&lt;|ActeurCassette&#xA; || Cassette__titre:= {Instance}&lt;&lt;|Cassette__titre&#xA; || Cassette__nbLibre:= {Instance}&lt;&lt;|Cassette__nbLibre">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="Instance /: (Film \/ Serie )"/>
        <typingPredicate name=" !c2.(c2:CassetteEmprunt~[{Instance}] => #cc.(cc:CassetteEmprunt[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Acteur_Free" body="Acteur := Acteur - {Instance}&#xA; || ActeurCassette:= ActeurCassette|>> {Instance}&#xA; || Acteur__nom:= {Instance}&lt;&lt;|Acteur__nom">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.8"/>
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name=" !c2.(c2:ActeurCassette~[{Instance}] => #cc.(cc:ActeurCassette[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Film_Free" body="Film := Film - {Instance} &#xA; || Cassette := Cassette - {Instance}&#xA; || CassetteEmprunt:= CassetteEmprunt|>> {Instance}&#xA; || ActeurCassette:= {Instance}&lt;&lt;|ActeurCassette&#xA; || Cassette__titre:= {Instance}&lt;&lt;|Cassette__titre&#xA; || Cassette__nbLibre:= {Instance}&lt;&lt;|Cassette__nbLibre&#xA; || Film__genre:= {Instance}&lt;&lt;|Film__genre">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
        <typingPredicate name="Instance /: (OAV )"/>
        <typingPredicate name=" !c2.(c2:CassetteEmprunt~[{Instance}] => #cc.(cc:CassetteEmprunt[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Serie_Free" body="Serie := Serie - {Instance} &#xA; || Cassette := Cassette - {Instance}&#xA; || CassetteEmprunt:= CassetteEmprunt|>> {Instance}&#xA; || ActeurCassette:= {Instance}&lt;&lt;|ActeurCassette&#xA; || Cassette__titre:= {Instance}&lt;&lt;|Cassette__titre&#xA; || Cassette__nbLibre:= {Instance}&lt;&lt;|Cassette__nbLibre&#xA; || Serie__num_Serie:= {Instance}&lt;&lt;|Serie__num_Serie">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
        <typingPredicate name="Instance /: (Anime )"/>
        <typingPredicate name=" !c2.(c2:CassetteEmprunt~[{Instance}] => #cc.(cc:CassetteEmprunt[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Anime_Free" body="Anime := Anime - {Instance} &#xA; || Serie := Serie - {Instance} &#xA; || Cassette := Cassette - {Instance}&#xA; || CassetteEmprunt:= CassetteEmprunt|>> {Instance}&#xA; || ActeurCassette:= {Instance}&lt;&lt;|ActeurCassette&#xA; || Cassette__titre:= {Instance}&lt;&lt;|Cassette__titre&#xA; || Cassette__nbLibre:= {Instance}&lt;&lt;|Cassette__nbLibre&#xA; || Serie__num_Serie:= {Instance}&lt;&lt;|Serie__num_Serie">
      <param name="Instance" type="//@machines.0/@data.11">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.11"/>
        <typingPredicate name="Instance /: (OAV )"/>
        <typingPredicate name=" !c2.(c2:CassetteEmprunt~[{Instance}] => #cc.(cc:CassetteEmprunt[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="OAV_Free" body="OAV := OAV - {Instance} &#xA; || Anime := Anime - {Instance} &#xA; || Serie := Serie - {Instance} &#xA; || Cassette := Cassette - {Instance} &#xA; || Film := Film - {Instance}&#xA; || CassetteEmprunt:= CassetteEmprunt|>> {Instance}&#xA; || ActeurCassette:= {Instance}&lt;&lt;|ActeurCassette&#xA; || Cassette__titre:= {Instance}&lt;&lt;|Cassette__titre&#xA; || Cassette__nbLibre:= {Instance}&lt;&lt;|Cassette__nbLibre&#xA; || Film__genre:= {Instance}&lt;&lt;|Film__genre&#xA; || Serie__num_Serie:= {Instance}&lt;&lt;|Serie__num_Serie">
      <param name="Instance" type="//@machines.0/@data.12">
        <typingPredicate operator="In" type="//@machines.0/@data.6"/>
        <typingPredicate operator="In" type="//@machines.0/@data.12"/>
        <typingPredicate name=" !c2.(c2:CassetteEmprunt~[{Instance}] => #cc.(cc:CassetteEmprunt[{c2}] &amp; cc/=Instance) )"/>
      </param>
    </operations>
    <operations name="Client__GetClientEmprunt" body="result := ClientEmprunt~(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Emprunt__GetClientEmprunt" body="result := ClientEmprunt(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Cassette__GetCassetteEmprunt" body="result := CassetteEmprunt~(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Emprunt__GetCassetteEmprunt" body="result := CassetteEmprunt(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Acteur__GetActeurCassette" body="result := ActeurCassette~(Instance)">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="Cassette__GetActeurCassette" body="result := ActeurCassette(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Emprunt__SetClientEmprunt" body="ClientEmprunt:= ({Instance}&lt;&lt;|ClientEmprunt)\/ {(Instance|-> ClientEmprunt__targetValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="ClientEmprunt__targetValue" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
        <typingPredicate name="(Instance|-> ClientEmprunt__targetValue) /: ClientEmprunt"/>
      </param>
    </operations>
    <operations name="Client__AddClientEmprunt" body="ClientEmprunt:= ClientEmprunt\/{(ClientEmprunt__sourceValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="ClientEmprunt__sourceValues" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(ClientEmprunt__sourceValues|-> Instance) /:ClientEmprunt"/>
        <typingPredicate name="ClientEmprunt__sourceValues/:dom(ClientEmprunt)"/>
      </param>
    </operations>
    <operations name="Cassette__AddCassetteEmprunt" body="CassetteEmprunt:= CassetteEmprunt\/{(CassetteEmprunt__sourceValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="CassetteEmprunt__sourceValues" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(CassetteEmprunt__sourceValues|-> Instance) /:CassetteEmprunt"/>
      </param>
    </operations>
    <operations name="Emprunt__AddCassetteEmprunt" body="CassetteEmprunt:= CassetteEmprunt\/ {(Instance|-> CassetteEmprunt__targetValues)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="CassetteEmprunt__targetValues" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="(Instance|-> CassetteEmprunt__targetValues) /:CassetteEmprunt"/>
      </param>
    </operations>
    <operations name="Acteur__AddActeurCassette" body="ActeurCassette:= ActeurCassette\/{(ActeurCassette__sourceValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="ActeurCassette__sourceValues" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="(ActeurCassette__sourceValues|-> Instance) /:ActeurCassette"/>
      </param>
    </operations>
    <operations name="Cassette__AddActeurCassette" body="ActeurCassette:= ActeurCassette\/ {(Instance|-> ActeurCassette__targetValues)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="(Instance|-> ActeurCassette__targetValues) /:ActeurCassette"/>
      </param>
    </operations>
    <operations name="Client__RemoveClientEmprunt" body="ClientEmprunt:= ClientEmprunt-{(ClientEmprunt__sourceValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="ClientEmprunt__sourceValues" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(ClientEmprunt__sourceValues|-> Instance) :ClientEmprunt"/>
        <typingPredicate name="#cc.(cc: Client &amp; cc/=Instance &amp; cc: ClientEmprunt[{ClientEmprunt__sourceValues}])"/>
      </param>
    </operations>
    <operations name="Cassette__RemoveCassetteEmprunt" body="CassetteEmprunt:= CassetteEmprunt-{(CassetteEmprunt__sourceValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="CassetteEmprunt__sourceValues" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
        <typingPredicate name="(CassetteEmprunt__sourceValues|-> Instance) :CassetteEmprunt"/>
        <typingPredicate name="#cc.(cc: Cassette &amp; cc/=Instance &amp; cc: CassetteEmprunt[{CassetteEmprunt__sourceValues}])"/>
      </param>
    </operations>
    <operations name="Emprunt__RemoveCassetteEmprunt" body="CassetteEmprunt:= CassetteEmprunt-{(Instance|-> CassetteEmprunt__targetValues)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="CassetteEmprunt__targetValues" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="(Instance|-> CassetteEmprunt__targetValues) :CassetteEmprunt"/>
        <typingPredicate name="#cc.(cc: Cassette&amp; cc/=CassetteEmprunt__targetValues &amp; (Instance|-> CassetteEmprunt__targetValues):CassetteEmprunt )"/>
      </param>
    </operations>
    <operations name="Acteur__RemoveActeurCassette" body="ActeurCassette:= ActeurCassette-{(ActeurCassette__sourceValues|-> Instance)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="ActeurCassette__sourceValues" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
        <typingPredicate name="(ActeurCassette__sourceValues|-> Instance) :ActeurCassette"/>
        <typingPredicate name="#cc.(cc: Acteur &amp; cc/=Instance &amp; cc: ActeurCassette[{ActeurCassette__sourceValues}])"/>
      </param>
    </operations>
    <operations name="Cassette__RemoveActeurCassette" body="ActeurCassette:= ActeurCassette-{(Instance|-> ActeurCassette__targetValues)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="ActeurCassette__targetValues" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
        <typingPredicate name="(Instance|-> ActeurCassette__targetValues) :ActeurCassette"/>
        <typingPredicate name="#cc.(cc: Acteur&amp; cc/=ActeurCassette__targetValues &amp; (Instance|-> ActeurCassette__targetValues):ActeurCassette )"/>
      </param>
    </operations>
    <operations name="Client__GetNum_Client" body="result := Client__num_Client(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Client__GetSuspendu" body="result := Client__suspendu(Instance)">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
    </operations>
    <operations name="Emprunt__GetDate" body="result := Emprunt__date(Instance)">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
    </operations>
    <operations name="Cassette__GetTitre" body="result := Cassette__titre(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Cassette__GetNbLibre" body="result := Cassette__nbLibre(Instance)">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
    </operations>
    <operations name="Acteur__GetNom" body="result := Acteur__nom(Instance)">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
    </operations>
    <operations name="Film__GetGenre" body="result := Film__genre(Instance)">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
      </param>
    </operations>
    <operations name="Serie__GetNum_Serie" body="result := Serie__num_Serie(Instance)">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
    </operations>
    <operations name="Client__SetNum_Client" body="Client__num_Client:= ({Instance}&lt;&lt;|Client__num_Client)\/ {(Instance|-> Client__num_ClientValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="Client__num_ClientValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Client__num_ClientValue /: ran(Client__num_Client)"/>
      </param>
    </operations>
    <operations name="Client__SetSuspendu" body="Client__suspendu:= ({Instance}&lt;&lt;|Client__suspendu)\/ {(Instance|-> Client__suspenduValue)}">
      <param name="Instance" type="//@machines.0/@data.1">
        <typingPredicate operator="In" type="//@machines.0/@data.1"/>
      </param>
      <param name="Client__suspenduValue" type="//@sharedTypes/@sharedTypes.1">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.1"/>
        <typingPredicate name="Client__suspenduValue /: ran(Client__suspendu)"/>
      </param>
    </operations>
    <operations name="Emprunt__SetDate" body="Emprunt__date:= ({Instance}&lt;&lt;|Emprunt__date)\/ {(Instance|-> Emprunt__dateValue)}">
      <param name="Instance" type="//@machines.0/@data.3">
        <typingPredicate operator="In" type="//@machines.0/@data.3"/>
      </param>
      <param name="Emprunt__dateValue" type="//@machines.0/@data.14">
        <typingPredicate operator="In" type="//@machines.0/@data.14"/>
        <typingPredicate name="Emprunt__dateValue /: ran(Emprunt__date)"/>
      </param>
    </operations>
    <operations name="Cassette__SetTitre" body="Cassette__titre:= ({Instance}&lt;&lt;|Cassette__titre)\/ {(Instance|-> Cassette__titreValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="Cassette__titreValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Cassette__titreValue /: ran(Cassette__titre)"/>
      </param>
    </operations>
    <operations name="Cassette__SetNbLibre" body="Cassette__nbLibre:= ({Instance}&lt;&lt;|Cassette__nbLibre)\/ {(Instance|-> Cassette__nbLibreValue)}">
      <param name="Instance" type="//@machines.0/@data.5">
        <typingPredicate operator="In" type="//@machines.0/@data.5"/>
      </param>
      <param name="Cassette__nbLibreValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Cassette__nbLibreValue /: ran(Cassette__nbLibre)"/>
      </param>
    </operations>
    <operations name="Acteur__SetNom" body="Acteur__nom:= ({Instance}&lt;&lt;|Acteur__nom)\/ {(Instance|-> Acteur__nomValue)}">
      <param name="Instance" type="//@machines.0/@data.7">
        <typingPredicate operator="In" type="//@machines.0/@data.7"/>
      </param>
      <param name="Acteur__nomValue" type="//@machines.0/@data.0">
        <typingPredicate operator="In" type="//@machines.0/@data.0"/>
        <typingPredicate name="Acteur__nomValue /: ran(Acteur__nom)"/>
      </param>
    </operations>
    <operations name="Film__SetGenre" body="Film__genre:= ({Instance}&lt;&lt;|Film__genre)\/ {(Instance|-> Film__genreValue)}">
      <param name="Instance" type="//@machines.0/@data.9">
        <typingPredicate operator="In" type="//@machines.0/@data.9"/>
      </param>
      <param name="Film__genreValue" type="//@machines.0/@data.13">
        <typingPredicate operator="In" type="//@machines.0/@data.13"/>
        <typingPredicate name="Film__genreValue /: ran(Film__genre)"/>
      </param>
    </operations>
    <operations name="Serie__SetNum_Serie" body="Serie__num_Serie:= ({Instance}&lt;&lt;|Serie__num_Serie)\/ {(Instance|-> Serie__num_SerieValue)}">
      <param name="Instance" type="//@machines.0/@data.10">
        <typingPredicate operator="In" type="//@machines.0/@data.10"/>
      </param>
      <param name="Serie__num_SerieValue" type="//@sharedTypes/@sharedTypes.0">
        <typingPredicate operator="In" type="//@sharedTypes/@sharedTypes.0"/>
        <typingPredicate name="Serie__num_SerieValue /: ran(Serie__num_Serie)"/>
      </param>
    </operations>
    <initialisation init="//@machines.0/@data.1"/>
    <initialisation init="//@machines.0/@data.3"/>
    <initialisation init="//@machines.0/@data.5"/>
    <initialisation init="//@machines.0/@data.7"/>
    <initialisation init="//@machines.0/@data.9"/>
    <initialisation init="//@machines.0/@data.10"/>
    <initialisation init="//@machines.0/@data.11"/>
    <initialisation init="//@machines.0/@data.12"/>
    <initialisation init="//@machines.0/@data.15"/>
    <initialisation init="//@machines.0/@data.16"/>
    <initialisation init="//@machines.0/@data.17"/>
    <initialisation init="//@machines.0/@data.18"/>
    <initialisation init="//@machines.0/@data.19"/>
    <initialisation init="//@machines.0/@data.20"/>
    <initialisation init="//@machines.0/@data.21"/>
    <initialisation init="//@machines.0/@data.22"/>
    <initialisation init="//@machines.0/@data.23"/>
    <initialisation init="//@machines.0/@data.24"/>
    <initialisation init="//@machines.0/@data.25"/>
  </machines>
  <sharedTypes>
    <sharedTypes xsi:type="b:Z" typing="//@machines.0/@data.13/@values.0 //@machines.0/@data.13/@values.1 //@machines.0/@operations.1/@param.1 //@machines.0/@operations.3/@param.3 //@machines.0/@operations.5/@param.3 //@machines.0/@operations.6/@param.3 //@machines.0/@operations.7/@param.3 //@machines.0/@operations.8/@param.3 //@machines.0/@operations.6/@param.4 //@machines.0/@operations.7/@param.4 //@machines.0/@operations.8/@param.5 //@machines.0/@operations.42/@param.1 //@machines.0/@operations.46/@param.1 //@machines.0/@operations.49/@param.1"/>
    <sharedTypes xsi:type="b:Bool" typing="//@machines.0/@operations.43/@param.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.15" expression="TotalFunction" dom="//@machines.0/@data.3" ran="//@machines.0/@data.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.16" dom="//@machines.0/@data.3" ran="//@machines.0/@data.5"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.17" dom="//@machines.0/@data.5" ran="//@machines.0/@data.7"/>
    <sharedTypes xsi:type="b:BPowType" typing="//@machines.0/@operations.2/@param.2" pow="//@machines.0/@data.5"/>
    <sharedTypes xsi:type="b:BPowType" typing="//@machines.0/@operations.3/@param.1 //@machines.0/@operations.5/@param.1 //@machines.0/@operations.6/@param.1 //@machines.0/@operations.7/@param.1 //@machines.0/@operations.8/@param.1" pow="//@machines.0/@data.7"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.18" expression="TotalInjection" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.19" expression="PartialInjection" dom="//@machines.0/@data.1" ran="//@sharedTypes/@sharedTypes.1"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.20" expression="TotalInjection" dom="//@machines.0/@data.3" ran="//@machines.0/@data.14"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.21" expression="TotalInjection" dom="//@machines.0/@data.5" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.22" expression="TotalInjection" dom="//@machines.0/@data.5" ran="//@sharedTypes/@sharedTypes.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.23" expression="TotalInjection" dom="//@machines.0/@data.7" ran="//@machines.0/@data.0"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.24" expression="TotalInjection" dom="//@machines.0/@data.9" ran="//@machines.0/@data.13"/>
    <sharedTypes xsi:type="b:BComposedType" typing="//@machines.0/@data.25" expression="TotalInjection" dom="//@machines.0/@data.10" ran="//@sharedTypes/@sharedTypes.0"/>
  </sharedTypes>
</b:BSpec>
