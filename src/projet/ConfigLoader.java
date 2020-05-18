package projet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import fr.emse.simulator.world.Cell;
import fr.emse.simulator.world.Cell;
import fr.emse.simulator.world.Occupant;
import projet.Worldmap;


public class ConfigLoader {
    private static ArrayList<String[]> lesDonnees = new ArrayList<>();
    private static ArrayList<String[]> leLignescolones = new ArrayList<>();
    private static ArrayList<ArrayList<Cellule>> allCellules = new ArrayList<>();
    private static int nbrLigne;
    private static int nbrCol;
    private static Worldmap world;





    //methode lire fichier -> et le stoquer dans une arraylist par ex comme sa après on peut travailler ac arralist
    //Scanner scanner = new Scanner(file); lui transmettre directement le file

    //methode traiter les lignes -> entrer dans chaque arraylist pour traiter les colones **2boucles for each**

    //methode traiter par colone, et ici faire les add cellule sur le world  **** EN gro deux boucles for each****
    //Worldmap world
    //Worldmap world
    public static void load(File file) { // dans le fichier, requiert split car il y a des espaces



        int le_compteur = 0;
        Scanner scanner = null;
        int j = 0;
        int cptCol;
        int cptRow = -1;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                //System.out.println(line);
                if(j > 0){
                    lesDonnees.add(line.split(" "));
                }
                else if( j == 0){
                    leLignescolones.add(line.split(" "));
                    for(String[] x: leLignescolones) {

                        for(String y: x) {
                            if(le_compteur == 0){
                                nbrLigne = Integer.parseInt(y); // on y insère le nombre de ligne inscrit en première ligne
                            }
                            else if(le_compteur == 1){
                                nbrCol = Integer.parseInt(y); // ca sera le deuxième passage, donc le nombre de colone
                            }
                            le_compteur++;
                        }
                }
                j++;
                }


                //deuxième étape, mettre chaque données dans les cellules
            for(String[] c : lesDonnees){
                cptCol = -1;
                cptRow++;
                for(String a : c) {
                    cptCol++;
                    Occ occup = new Occ(a);
                    Cellule the_cellz = new Cellule(occup, cptRow, cptCol); // rempli chaque cellule par l'occupant en donnant sa position
                    ArrayList<Cellule> the_cell = new ArrayList<>();
                    the_cell.add(the_cellz);

                    allCellules.add(the_cell); // arraylist d'arraylistes de cellules
                }
                }
                world = new Worldmap(nbrLigne, nbrCol , allCellules);
            }

            System.out.println(world);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // On lui donne une instance de Worldmap Car une fois qu'on arrive par
    // ex à la ligne 1;1 et qu'on dit ok ici il y a un hashtag donc il faut un mur..
    // on va ajouter dans le monde, la cellule en question
    // du coup il nous faut une instance de ce World afin de faire un ".add cell" sur ce world

    // dans le fichier 18 56 en première ligne va permettre d'executer une verification véridique du nb de ligne/colonne




    // faire une exception àfin que java puisse continuer malgré les erreurs et dire que faire en cas d'exception

   // try{ code
   // } catch(IOException e){ sout "probleme"}

    // ou alors ..

    public static void traiterLigne() throws Exception{ //dans mon code je vais envoyer des exceptions -> ma méthode envois des exception donc c géré deriere t'en fais pas
        //traitement ligne
        //if(nbLigneFichier != cptLigne) {
           // throw new Exception("Problème de ligne");
        }
     // on peut aussi nous créer des exception et les envoyer quand on veut

    public static void loadz(Worldmap world, File file){ // exemple
        //lireFichier(file);
        try{
            traiterLigne();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


    //Jerome : erreur à géré au cas ou mauvais nom de fichier ou mauvais chiffres à linterieur
        }
