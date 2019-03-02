## Auteurs du TP: Ferhat HOCINE 



## TP et ses objectifs 

Ce tp a pour but de d'apprendre la représentation et la manipulation d’images, il consiste a utilisé les pixels d'une image qui sont caractérisés par une couleur représentant un niveau de gris pour affiché cette dérniere on lui appliquant quellques modification.

## lancez la commande "make all" 

##  main Question 4/5
question 04:
Pour le main de la classe ImageExemple on a commance par crée une page blache de (100,200) et  puis on a ajouter les réctangles demandé avec a l'intérieure de pixels des couleurs que on a déja crée, donc pour modifié les couleur des réctongle il suffit de modifié les valeurs de (new GrayColor(x)) et pour leurs taille il faut modifié dans les for le max de row et col. ansi on a eu l'image avec les récangles a l'intérieure  et pour l'affichage on a utilisé la classe ImageDisplayer avec sa fonction display qui sert a affiché et on a appliqué sa a une image que on a crée 3 fois chaque fois on a affiché d'une manière défirente a l'autre, dans le 1er cas on a affiché l'image crée directement , 2eme cas on appliqué a l'image la fonction edge(x) de la classe image avec un paramètre que on peut modifiè et qui sert a précisé le seuil de la défirence et dans le 3eme cas on appliqué a l'image la fonction decreaseNbGrayLevels(x)de la classe image avec un paramètre que on peut modifiè et qui sert a précisé la valeur que on diménue du niveau de gris de chauque pixél.

question 05:
pour le main de la question 5 on a fait pareil que pour la question 4 juste que la on a importé l'image au lieu de la crée on ajoutant un arg au main et comme sa on peut changé l'image importé en passant une autre image lors de l'éxécution par exemple "java -classpath classes image.ImageMain /images/chat.pgm 15 16" et puis on a affiché les 3 variable qui contienne cette image chaque une de sa facon comme la question 4


##  éxécution de main Question 4/5

pour l'éxécution on lance la commande "make all" dans le termianl a partir du dossier racine qui lance la compilation des classes, puis génère la documantation ensuite elle lance le main dela class imageExemple puis affiche la réusite des testes et enfin il lance le ImageMain avec l'éxemple choisi qui est lampe.pgm seuil 15 , decreaseNbGrayLevel 16


##  produire le jar exécutable
monImage.jar:pour la classe ImageMain 
pour crée le fichier jar on ce met dans le dossier classes on lance la commande "jar cvf ../monImage.jar image image.color " depuis le terminal puis on lance la commande 
"jar cvfm ../monImage.jar ../manifest-ex image image.color" qui nous permet de lancer la classe principale grace au fichier manifest-ex puis on ajoute le dossier images a l'archive avec "jar cvfm ../monImage.jar ../manifest-ex image -C .. images" a la fin on se met a la racine de tp et on lance le fichier .jar (executable) grace a la commande 
 "java -jar monImage.jar /images/lamp.pgm 15 16" ou le premier parametre est l'image choisi (/images/lamp.pgm) qui est dans images et 15 le parametre de la fonction edge et 16 le parametre de la fonction decrease

ImageMain.jar:pour la classe ImageExample
pour crée le fichier jar on ce met dans le dossier classes on lance la commande "jar cvf ../ImageExample.jar image image.color " depuis le terminal puis on lance la commande 
"jar cvfm ../ImageExample.jar ../manifestt-ex image image.color" qui nous permet de lancer la classe principale grace au fichier manifestt-ex  a la fin on se met a la racine de tp et on lance le fichier .jar (executable) grace a la commande "java -jar ImageExample.jar 
## utilisation du GIt ***
Pour accédé à notre tp il suffit de se positionné dans le répèrtoire qui contienne nous tp (si vous ne l'avez pas copiez le lien dans GITLab des tp et faites la commande "git clone le lien" dans le terminale, puis rentréz votre nom d'utilisateur et le mot de passe.)et de lancer la commande "git pull" puis rentréz votre nom d'utilisateur et le mot de passe, ansi vous obtenez touts les nouveaux fichiers 




