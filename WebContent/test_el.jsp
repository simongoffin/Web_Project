<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test des expressions EL</title>
    </head>
    <body>
    <p>
        <!-- Initialisation d'un bean de type Coyote avec une action standard, pour l'exemple : -->
        <jsp:useBean id="coyote" class="com.sdzee.beans.Coyote" />
        <!-- Initialisation de sa propri�t� 'pr�nom' : -->
        <jsp:setProperty name="coyote" property="prenom" value="Wile E."/>
        <!-- Et affichage de sa valeur : -->
        ${ coyote.prenom }
    </p>
    </body>
</html>