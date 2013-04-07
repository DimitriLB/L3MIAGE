CREATE TABLE QUESTION
(
id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
intitule VARCHAR(255) NOT NULL,
reponse VARCHAR(255) NOT NULL,
choix1 VARCHAR(255) NOT NULL,
choix2 VARCHAR(255) NOT NULL,
choix3 VARCHAR(255) NOT NULL,
choix4 VARCHAR(255) NOT NULL,
niveau INTEGER,
UNIQUE (id)
);

/* insertion des questions de niveau 1 */
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quel système est apparu avant l’autre ?',
								'La ligne de commande avant l’interface graphique',
								'L’interface graphique avant la ligne de commande',
								'La ligne de commande avant l’interface graphique',
								'Les deux sont apparues en même temps',
								'La ligne de commande est réservée aux concepteurs' ,
								1);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('A quoi sert la commande "who" ?',
								'Fournit l''information sur l''ensemble des utilisateurs actuellement connectés',
								'Fournit l''information sur les intrus éventuellement connectés sur l''ordinateur',
								'Fournit votre nom et prènom',
								'Fournit l''information sur l''ensemble des utilisateurs actuellement connectés',
								'Fournit l''information sur l''utilisateur courant',
								1);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle réponse ne décrit pas un systeme UNIX ?',
								'Mono-utilisateur',
								'Interactif',
								'Multitaches, à temps partagés',
								'Mono-utilisateur',
								'Multi-langages',
								1);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Que fait la commande "ls" ?',
								'Affiche le contenu du répertoire',
								'Affiche le répertoire courant',
								'Affiche un calendrier',
								'Ouvre un fichier',
								'Affiche le contenu du répertoire',
								1);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle commande permet de se placer dans un dossier ?',
								'cd',
								'cd',
								'dc',
								'call',								
								'goto',
								1);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle commande permet d''afficher le dossier courant ?',
								'pwd',
								'place',
								'whereami',
								'pwd',
								'map',
								1);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Avec quelle commande pouvez vous arrêter un processus ?',
								'kill',
								'delete',
								'kill',
								'shutdown',								
								'stop',
								1);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment puis-je avoir de l''aide pour la commade "mv" ?',
								'man mv',
								'help mv',
								'mv ?',								
								'more man',
								'man mv',
								1);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Je voudrais créer un répertoire ''batman''. Aidez moi !',
								'mkdir batman',
								'newdir batman',
								'dodir batman',
								'mkdir batman',
								'crdir batman',
								1);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('A quoi sert un système de fichier ?',
								'Il permet de stocker les informations et de les organiser sur les mémoires secondaires',
								'Il permet de stocker les informations et de les organiser sur toutes les mémoires',
								'Il permet de stocker les informations et de les organiser sur les mémoires secondaires',
								'Il permet de stocker les informations et de les organiser sur la mémoire vive',
								'Il permet de stocker les informations et de les organiser sur la mémoire cache',
								1);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Le système d''exploitation fait partie: ',
								'Des logiciels de base',
								'Du matériel',
								'De tous les logiciels',
								'Des logiciels d''application',
								'Des logiciels de base',
								1);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Un système d’exploitation',
								'C’est un intermédiaire entre la machine et l’utilisateur',
								'C’est le nom du processeur central de l’ordinateur',
								'C’est un intermédiaire entre la machine et l’utilisateur',
								'C’est la fonction de l’administrateur système',
								'C’est l’éditeur exploitant le système',
								1);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('A quoi sert le compte root sous Unix ?',
								'Administration du système',
								'A n''avoir que les droits basiques',
								'A réinstaller totalement la machine',
								'Administration du système',
								'Compte générique multi-usages',
								1);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment se nomme le shell par défaut sous Linux ?',
								'Le Bash',
								'Le Cash',
								'Le Bash',
								'Le Sach',
								'Le Mach',
								1);									
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quel utilitaire permet d''afficher des lignes correspondant à un motif donné ?',
								'grep',
								'sed',
								'cut',
								'split',
								'grep',
								1);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment faire pour supprimer un répertoire ?',
								'rmdir',
								'remove',
								'rmdir',
								'erase',
								'deldir',
								1);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment faire pour copier un fichier ?',
								'cp',
								'cp',
								'copy',
								'fl',
								'filecopy',
								1);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment faire pour supprimer un fichier ?',
								'rm',
								'mv',
								'remove',
								'erase',
								'rm',
								1);									
								
						

/*insertion des questions de niveau 2*/
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Tout utilisateur est inscrit dans 2 fichiers systemes. Choisissez lesquels :',
								'/etc/passwd et /etc/group',								
								'/etc/passwd et /etc/networks',
								'/etc/profile et /etc/group',
								'/etc/passwd et /etc/group',
								'/etc/profile et /etc/networks',
								2);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle commande affiche la liste des processus de l''utilisateur ?',
								'ps',
								'pc',
								'ps',
								'sp',
								'pc',
								2);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment créer un nouveau fichier sans l''ouvrir ?',
								'touch nomfichier',
								'cat nomfichier',
								'pico nomfichier',
								'touch nomfichier',
								'more nomfichier',
								2);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Le système UNIX compte les secondes depuis :',
								'01/01/1970',
								'01/01/2000',
								'01/01/1970',
								'23/10/1069',								
								'hier',
								,2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Je ne suis pas un fichier. Trouvez moi :',
								'lien symbolique',
								'fichier ordinaire',
								'fichier spécial',								
								'répertoire',
								'lien symbolique',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelles sont les bibliothèques qui ne sont pas utilisées dans les systèmes d’exploitation ?',
								'Les bibliothèques applicatives',
								'Les bibliothèques applicatives',
								'Les bibliothèques utilitaires',								
								'Les bibliothèques systèmes',
								'Aucune bibliothèque n''est utilisée par les OS',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Une tâche est :',
								'Un processus',
								'Un processus',
								'Un mouvement de données avec les périphériques',								
								'Un logiciel de divertissement',
								'Une correction d''erreur',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Le multitâche :',
								'Permet de commencer l''exécution d''un second programme alors qu''un premier est déjà en exécution',
								'Ne permet pas le multi-utilisateur',
								'chacun  des programmes s''exécute à tour de rôle',								
								'Permet de commencer l''exécution d''un second programme alors qu''un premier est déjà en exécution',
								'N''est pas géré par les OS',
								2);									
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Que fait le BIOS ?',
								'Il vérifie la présence des périphériques comme la souris, le clavier, etc',
								'Il vérifie la mémoire physique',
								'Il vérifie le mot de passe d''un utilisateur',
								'Il vérifie la présence des périphériques comme la souris, le clavier, etc',
								'Rien de tout ça',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment renommer un fichier "new" en "old" ?',
								'mv new old',
								'mv new old',
								'cp new old',
								'rn new old',
								'rm new old',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment visualiser le contenu du fichier "not_empty" ?',
								'cat not_empty',
								'type not_empty',
								'cat not_empty',
								'rn more not_empty',
								'more not_empty',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Dans quel fichier sont stockés les noms d''utilisateurs, et mots de passe sur un système Linux n''utilisant pas le shadowing ?',
								'/etc/passwd',
								'/etc/passwd',
								'/etc/password',
								'/usr/lib/passwd',
								'/usr/etc/passwd',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Sous Unix qu''esct-ce qu''un démon ?',
								'Un programme, un processus',
								'Un programme, un processus',
								'Un virus',
								'Une erreur system',
								'Un pirate',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle partie est reponsable d''envoyer des instructions basiques à l''ordinateur ?',
								'Kernel',
								'Kernel',
								'Un script Shell',
								'Les deux',
								'Aucun des deux',
								2);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Commande pour changer le propriétaire d"un fichier',
								'Chown',
								'Howner',
								'Hown',
								'Chowner',
								'Chown',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle expression permet d''assigner une valeure nulle à une variable en bash ?',
								'Toutes',
								'A=''',
								'A=""',
								'A=',
								'Toutes',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Laquelle de ces variables n''est pas une variable d''environnement ?',
								'Read',
								'Path',
								'Random',
								'Read',
								'Display',
								2);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment afficher la liste des détails d''un fichier comme la date, la taille et les droits d''accès ?',
								'ls-l',
								'ls',
								'ls-full',
								'ls-l',
								'list all',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle est la commande pour chercher tous les fichiers contenant le mot "plasmodium" dans le répertoire courant ?',
								'grep plasmodium *',
								'find plasmodium',
								'find plasmodium -all',
								'grep plasmodium *',
								'lookup plasmodium *',
								2);		
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Si la commande "ls -l" donne en résultat "Total 46" à quoi ça correspond ?',
								'C''est le nombre total de dossiers',
								'C''est le nombre total d'' inodes',
								'C''est une erreur',
								'C''est le nombre total de fichiers',
								'C''est le nombre total de dossiers',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quel est le symbole de redirection de sortie vers un nouveau fichier ?',
								'>',
								'<',
								'>',
								'>>',
								'2>',
								2);
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quel est le symbole de redirection de sortie pour concaténer le résultat à la fin d''un fichier existant ?',
								'>>',
								'<',
								'>',
								'>>',
								'2>',
								2);									
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment exécuter la commande suivante uniquement si la première à réussi ?',
								'&&',
								'<',
								'|',
								'>>',
								'&&',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment exécuter la commande suivante si la première à échoué ?',
								'||',
								'||',
								'|',
								'>>',
								'&&',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment changer l''entrée standard de la commande pour la prendre dans un fichier ?',
								'<',
								'||',
								'|',
								'>>',
								'<',
								2);	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment rediriger la sortie d''erreur ?',
								'2>',
								'||',
								'2>',
								'>>',
								'<',
								2);									

								
								
/*insertion des questions de niveau 3 */
/*1*/
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Le i-node d''un fichier ne contient pas :',
								'son nom',
								'sa taille',
								'les droits d''accès',
								'son nom',
								'son type',
								3);
/*2*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle commande n''affiche pas le contenu d''un fichier ?',
								'show nomdefichier',
								'show nomdefichier',
								'cat nomdefichier',
								'more nomdeficheir',								
								'less nomdefichier',
								3);
/*3*/
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('L''origine d''Unix remonte à :',
								'1969',
								'1974',
								'1970',
								'1968',
								'1969',
								3);
/*4*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Etats du processeur : quelle transition est déclenchée par l’évènement de l’arrivée d’un caractère',
								'actif -> bloqué',
								'saisi au clavier ?',
								'prêt -> actif',
								'actif -> bloqué',
								'bloqué -> prêt',
								3);	
/*5*/
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Le "Swapping", qu''est-ce que c''est ? ',
								'c''est le fait d''utiliser une partie du disque dur comme zone de mémoire virtuelle en vue d''améliorer les performances',
								'c''est le fait d''utiliser une partie de la mémoire virtuelle comme zone de disque dur en vue d''améliorer les performances',
								'c''est le fait d''utiliser une partie du disque dur comme zone de mémoire virtuelle en vue d''améliorer les performances',
								'c''est le fait d''utiliser une partie du disque dur comme zone de mémoire virtuelle mais ça diminue les performances',
								'c''est le fait d''utiliser une partie de la mémoire virtuelle comme zone de disque dur en vue d''augmenter la taille de mémoire physique',
								3);
/*6*/
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Linus B.Torvald mit au point la premiere version de Linux sous plateforme Unix en développant les possibilités de',
								'Minix',
								'Minix',
								'Linix',
								'Irix',
								'Nimix',
								3);	
/*7*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Qu''est-ce qu''une crontab ?',
								'Une tâche planifiée',
								'Un fichier de démarrage',
								'Un virus',
								'Une tâche planifiée',
								'Une table utilisateur',
								3);	
/*8*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Qui gère les tâches planifiées sous Linux ? ',
								'Anacron',
								'Anacrone',
								'Anacon',
								'Nacron',
								'Anacron',
								3);	
/*9*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Solaris,qu''est-ce que c''est ?',
								'un système d''exploitation UNIX propriétaire',
								'Un virus très puissant',
								'un système d''exploitation WINDOWS propriétaire',
								'un système d''exploitation UNIX propriétaire',
								'un système d''exploitation UNIX non propriétaire',
								3);	
/*10*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('FreeBSD,qu''est-ce que c''est ?',
								'un système d''exploitation UNIX libre',
								'Un moyen d''avoir gratuitement une distribution unix payante',
								'un système d''exploitation WINDOWS propriétaire',
								'un système d''exploitation UNIX propriétaire',
								'un système d''exploitation UNIX libre',
								3);	
/*11*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle variable donne la sortie de la dernière commande exécutée?',
								'$?',
								'$*',
								'$!',
								'$?',
								'$@',
								3);	
/*12*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Est-il possible que plusieurs descripteurs de fichier pointent le même fichier ?',
								'Oui',
								'Non',
								'Oui',
								'Cela dépends du propriétaire du fichier',
								'Il n''y a pas de descripteurs de fichier',
								3);	
/*13*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle est la commande pour afficher les variables d''environement ?',
								'PRINTENV',
								'PRINT ENV',
								'DISPENV',
								'DISPLAY ENV',
								'PRINTENV',
								3);	
/*14*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment assigner la valeur de var2 à var1 ?',
								'var1=$var2',
								'$var1=$var2',
								'var1=var2',
								'$var1=var2',
								'var1=$var2',
								3);
/*15*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quel est le résultat de cette commande : $ v= ''ls'' $ echo $v ?',
								'ls',
								'ls',
								'list all files',
								'Error',
								'Aucun résultat',
								3);	
/*16*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Que fait: "../.." ?',
								'Remonte de 2 répertoires',
								'Reste dans le répertoire dans lequel on est',
								'Remonte de 2 répertoires',
								'Remonte d''un répertoire',
								'Autre chose',
								3);	
/*17*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment afficher les 15 premières lignes de tous les fichiers .txt ?',
								'head -15 *.txt',
								'print 15 .txt',
								'head -15 *.txt',
								'head 15 *.txt',
								'cat *.txt -length=15',
								3);	
/*18*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Une commande qui prends en entrée des données d''un fichier standard et écrit en sortie sur le canal de sortie standard ?',
								'Est un filtre',
								'Est un pipe',
								'Est un filtre',
								'Les deux',
								'Aucun des deux',
								3);
/*19*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle commande affiche l''entrée standard que l''on a saisit sur un fichier de sortie ?',
								'cat – file1',
								'cat \etc\si file1',
								'cat \etc\si file1',
								'cat – file1',
								'cat %0 file1',
								3);		
/*20*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment vérifier qu''un package est instllé ?',
								'rpm –q package_name',
								'rpm –q package_name',
								'rpm -qa',
								'rpm –ivh package_name',
								'rpm –ivh package_name',
								3);		
/*21*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment faire pour qu''un utilisateur modifie son fichier de profil sans se déconnecter ?',
								'Effectuer la commande . .profile(dot .profile)',
								'Effectuer la commande sh .profile',
								'Effectuer la commande . .profile(dot .profile)',
								'Effectuer la commande .profile',
								'L''utilisateur doit absolument se déconnecter',
								3);	
/*22*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Que fait la commande "tail -5 emp.lst " ?',
								'Liste les 5 dernières lignes de emp.lst',
								'Liste les 5 dernières lignes de emp.lst',
								'Liste les 5 premières lignes de emp.lst',
								'Rien',
								'Error',
								3);	
/*23*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quand un script enregistre une session, la session enregistrée est placée dans un fichier appelé ?',
								'typescript',
								'Script.out',
								'Script.txt',
								'typescript',
								'typesscript',
								3);
/*24*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle est la partie du système qui recçoit les erreurs dans un cas standard ?',
								'Le moniteur',
								'Le fichier de l''utilisateur courant',
								'Personne',
								'Un fichier standard prévu à cet effet',
								'Le moniteur',
								3);	
/*25*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle option de date doit-être choisit pour afficher l''heure dans un format de 00 à 23 ?',
								'%H',
								'%h',
								'%hh',
								'%H',
								'%HH',
								3);
/*26*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quel est l''ID minimum pour un utilisateur standard sur une distribution Red Hat ?',
								'500',
								'499',
								'500',
								'501',
								'5000',
								3);	
/*27*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Laquelle de ces commandes est fausse ?',
								'expr $a * $b',
								'expr $a + $b - $c',
								'expr $a + $b',
								'expr $a - $b',
								'expr $a * $b',
								3);	
/*28*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Quelle est la commande pour lister tous les fichiers plus grand que 100MB dans le système ?',
								'# find / -type f -size +100M',
								'# find –type f –size +100M',
								'# find –type f –size >100M',
								'# find –type f size +100M',
								'# find / -type f -size +100M',
								3);	
/*29*/								
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Comment répéter la dernière commande effectuée ?',
								'!!',
								'!',
								'!!',
								'#',
								'##',
								3);		
/*30*/	
insert into APP.QUESTION (intitule, reponse, choix1, choix2, choix3, choix4, niveau) values ('Laquelle de ces options de date peut-être utilisée pour afficher l''abréviation d''une journée ',
								'%a',
								'%day',
								'%w',
								'%ad',
								'%a',
								3);								
								
								
