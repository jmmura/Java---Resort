Le pojet s'articule autour des classes Activite, Personne, starter, Horaire et Calendrier.
La classe Activite contient une map d'Activite (statique), un set de Personne (les personnes inscrites) et un set d'Horaire (les horaires de l'activité: le jour, l'heure de début et l'heure de fin), permettant la manipulation des objets créés (tous.
Les classes Stage, Repas et Logement sont des sous-classes d'Activite, contenant chacune une map d'instances de ces mêmes classes.
La classe starter permet les interactions avec l'utilisateur. Lorsque le programme se lance, un menu apparait et l'utilisateur doit alors choisir entre 4 options:
1) créer une activité: 
il entre un nom, un horaire et un prix et une instance d'Activite est créée ou si l'activité existe déja (la map d'Activite contient une clé du même nom) le set d'horaire de celle-ci a une nouvelle entrée. La map d'Activite est mise à jour.
2) Ajouter une personne: 
l'utilisateur entre un nom et a alors le choix d'inscrire la personne à des activités. Les noms des activités entrés permettent de parcourir la map d'Activite pour mettre à jour les set de Personne correspondants à chaque activité où le nouveau membre s'inscrit. 
3) De "supprimer" une personne: 
cela est fait en parcourant la map d'Activite et pour chaque activité, supprimer la personne du set de Personne de l'activité si la personne en question y est (le nom correspond)
4) ne rien faire/sortir du programme

La classe Calendrier (actuellement en cours d'élaboration) permettra de stocker/afficher un  planning sur une semaine à l'aide d'un tableau de String de 7 colonnes et autant de lignes que d'heures d'activité.


ATTENTION:
Tout cela fonctionne actuellement sous l'hypothèse extrême que l'utilisateur agit de manière logique et censée.
La programmation défensive arrivera plus tard.


Q:
présences?
affichage calendrier : System.out.format(...) ou Swing ou ...