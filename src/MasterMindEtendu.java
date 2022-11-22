public class MasterMindEtendu {


    // Affichage du tableau


//    public static char[][] initialiserGrille(int nbEssaiMax, int lgCode) {
//        char[][] grille = new char[nbEssaiMax][lgCode];
//        for (int i = 0; i < nbEssaiMax; i++) {
//            for (int j = 0; j < lgCode; j++) {
//                grille[i][j] = ' ';
//            }
//        }
//        return grille;
//    }
//
//    public static char[][] miseAJourGrille(char[][] grille, int[] cod2, int nbCoups, char[] tabCouleur) {
//        for (int i = 0; i < grille[0].length; i++) {
//            grille[nbCoups][i] = tabCouleur[cod2[i]];
//        }
//        return grille;
//    }
//
//
//    public static void afficher_grille(char[][] grille) {
//
//        // on affiche les côtés ordi caché lors de la partie
//        System.out.print("\n\n||///////////////||");
//        System.out.print("\n||               ||");
//        System.out.print("\n||");
//        for (int i = 0; i < grille[0].length; i++) {
//            System.out.print(" ? |");
//
//        }
//        System.out.print("|");
//        System.out.print("\n||_______________||");
//        System.out.print("\n||               ||");
//        for (int i = 0; i < grille.length; i++) {
//            System.out.print("\n||");
//            for (int j = 0; j < grille[0].length; j++) {
//                System.out.print(" " + grille[i][j] + " |");
//            }
//            System.out.print("|");
//            System.out.print("\n||---------------||");
//        }
//        System.out.println("\n||///////////////||\n\n");
//    }
//
//
//
//
//
//    public static char[][] initialiserGrille(int nbEssaiMax, int lgCode) {
//        char[][] grille = new char[nbEssaiMax][lgCode];
//        for (int i = 0; i < nbEssaiMax; i++) {
//            for (int j = 0; j < lgCode; j++) {
//                grille[i][j] = ' ';
//            }
//        }
//        return grille;
//    }
//
//    public static char[][] miseAJourGrille(char[][] grille, int[] cod2, int nbCoups, char[] tabCouleur) {
//        for (int i = 0; i < grille[0].length; i++) {
//            grille[nbCoups][i] = tabCouleur[cod2[i]];
//        }
//        return grille;
//    }
//
//
//    public static void afficher_grille(char[][] grille) {
//
//        // on affiche les côtés ordi caché lors de la partie
//        System.out.print("\n\n||||");
//        for (int i = 0; i < grille[0].length; i++) {
//            System.out.print("///");
//        }
//        System.out.print("||\n");
//
//
//        System.out.print("||");
//        for (int i = 0; i < grille[0].length; i++) {
//            System.out.print("    ");
//        }
//        System.out.print("||\n");
//
//        System.out.print("||");
//        for (int i = 0; i < grille[0].length; i++) {
//            System.out.print(" ? |");
//
//        }
//        System.out.print("|");
//
//        System.out.print("\n||");
//        for (int k = 0; k < grille[0].length; k++) {
//            System.out.print("---");
//        }
//        System.out.print("||\n");
//
//        System.out.print("||");
//        for (int i = 0; i < grille[0].length; i++) {
//            System.out.print("    ");
//        }
//        System.out.print("||\n");
//
//
//        for (int i = 0; i < grille.length; i++) {
//            System.out.print("||");
//            for (int j = 0; j < grille[0].length; j++) {
//                System.out.print(" " + grille[i][j] + " |");
//            }
//            System.out.print("|");
//            System.out.print("\n||");
//            for (int k = 0; k < grille[0].length; k++) {
//                System.out.print("---");
//            }
//            System.out.print("||\n");
//        }
//
//
//        System.out.print("\n\n||||");
//        for (int i = 0; i < grille[0].length; i++) {
//            System.out.print("///");
//        }
//        System.out.print("||\n");
//    }
}
