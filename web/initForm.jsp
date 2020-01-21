<%--
  Created by IntelliJ IDEA.
  User: jorge.carrillo
  Date: 1/21/2020
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="initProcess.jsp">
    <p>
        <label for="nom">Entrez ici votre nom de famille :</label><br/>
        <input type="text" name="nom" id="nom" tabindex="10"/>
    </p>
    <p>
        <label for="prenom">Entrez ici votre prénom :</label><br/>
        <input type="text" name="prenom" id="prenom" tabindex="20"/>
    </p>
    <p>
        <label for="pays">Dans quel(s) pays avez-vous déjà voyagé ?</label><br/>
        <select name="pays" id="pays" multiple="multiple" tabindex="30">
            <option value="France">France</option>
            <option value="Espagne">Espagne</option>
            <option value="Italie">Italie</option>
            <option value="Royaume-uni">Royaume-Uni</option>
            <option value="Canada">Canada</option>
            <option value="Etats-unis">Etats-Unis</option>
            <option value="Chine">Chine</option>
            <option value="Japon">Japon</option>
        </select>
    </p>
    <p>
        <label for="autre">Entrez ici les autres pays que vous avez visités, séparés par une virgule :</label><br/>
        <textarea id="autre" name="autre" rows="2" cols="40" tabindex="40"
                  placeholder="Ex: Norvège, Chili, Nouvelle-Zélande"></textarea>
    </p>
    <p>
        <input type="submit" value="Valider"/> <input type="reset" value="Remettre à zéro"/>
    </p>
</form>
</body>

<!--
Récapitulons rapidement la fonction de cette page :

permettre à l'utilisateur de saisir son nom ;

permettre à l'utilisateur de saisir son prénom ;

permettre à l'utilisateur de choisir les pays qu'il a visités parmi une liste de choix par défaut ;

permettre à l'utilisateur de saisir d'autres pays qu'il a visités, en les séparant par une virgule.

Voici à la figure suivante le rendu, rempli avec des données de test.
-->
</html>