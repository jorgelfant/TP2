package main.java;

import javax.servlet.http.HttpServlet;

public class Theorie extends HttpServlet {
     /*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                  JSTL core : exercice d'application
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

La bibliothèque Core n'a maintenant plus de secrets pour vous. Mais si vous souhaitez vous familiariser avec toutes
ces nouvelles balises et être à l'aise lors du développement de pages JSP, vous devez vous entraîner !

Je vous propose ici un petit exercice d'application qui met en jeu des concepts réalisables à l'aide des balises que
vous venez de découvrir. Suivez le guide... ;)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                        Les bases de l'exercice
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Pour mener à bien ce petit exercice, commencez par créer un nouveau projet web nommé jstl_exo1. Référez-vous au premier
chapitre de cette partie si vous avez encore des hésitations sur la démarche nécessaire. Configurez bien entendu ce
projet en y intégrant la JSTL, afin de pouvoir utiliser nos chères balises dans les pages JSP !

Une fois que c'est fait, créez une première page JSP à la racine de votre application, sous le répertoire WebContent.
Je vous en donne ici le contenu complet :

Récapitulons rapidement la fonction de cette page :

   * permettre à l'utilisateur de saisir son nom ;

   * permettre à l'utilisateur de saisir son prénom ;

   * permettre à l'utilisateur de choisir les pays qu'il a visités parmi une liste de choix par défaut ;

   * permettre à l'utilisateur de saisir d'autres pays qu'il a visités, en les séparant par une virgule.

   * Voici à la figure suivante le rendu, rempli avec des données de test.

Votre mission maintenant, c'est d'écrire la page initProcess.jsp qui va se charger de traiter les données saisies dans la page contenant le formulaire.

Nous n'avons pas encore étudié le traitement des formulaires en Java EE, mais ne paniquez pas. Tout ce que vous avez
besoin de savoir ici, c'est que les données saisies par le client dans les champs du formulaire seront accessibles
dans votre JSP à travers les paramètres de requêtes, autrement dit l'objet implicite param. Avec la JSTL et les
expressions EL, vous avez tout en main pour mettre en place ce petit exercice ! ;)

Ne vous inquiétez pas, nous apprendrons dans la partie suivante de ce cours comment gérer proprement les formulaires
dans une application Java EE.

Le sujet est ici volontairement simple, et son utilité nulle. L'objectif est purement didactique, l'intérêt est de
vous familiariser avec le développement de pages et la manipulation de données en utilisant la JSTL. Ne vous préoccupez
pas de l'architecture factice mise en place, et ne vous intéressez par conséquent pas aux détails de cette première
page initForm.jsp, elle n'est là que pour servir de base à notre exercice.

Pour en revenir à l'exercice, je ne vous demande rien de bien compliqué. La page devra également être placée à la racine du projet, sous le répertoire WebContent, et sera donc accessible après validation du formulaire de la page http://localhost:8080/jstl_exo1/initForm.jsp. Elle devra simplement afficher :

   1) une liste récapitulant le nom de chaque champ du formulaire et les informations qui y ont été saisies ;

   2) le nom et le prénom saisis par l'utilisateur ;

   3) une liste des pays visités par l'utilisateur.

Il y a plusieurs manières de réaliser ces tâches basiques, choisissez celle qui vous semble la plus simple et logique.
Prenez le temps de chercher et de réfléchir, et on se retrouve ensuite pour la correction ! ;)
    */
}
