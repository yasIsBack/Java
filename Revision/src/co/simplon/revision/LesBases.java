package co.simplon.revision;

import java.util.Arrays;
import java.util.Scanner;

public class LesBases {

    public static int minTab(int[] t) {
	Arrays.sort(t);
	return t[0];
    }

    public static int maxTab(int[] t) {
	Arrays.sort(t);
	return t[t.length - 1];
    }

    public static double moyenneTab(int[] t) {
	double res = 0;
	for (int i = 0;i<t.length;i++)
	    res += t[i];
	return res/t.length;
    }
    public static void tabToPrint(int[] t) {
	System.out.print("[ ");
	for (int i = 0; i < t.length; i++)
	    System.out.print(t[i]+", ");
	
	System.out.println(" ]");

    }

    public static int[] tabReader() {
	int tailleTab,indexUserTab=0;
	int[] userTab;
	Scanner Clavier = new Scanner(System.in);
	
	System.out.println("Taille de votre tableau d'entiers : ");
	tailleTab = Clavier.nextInt();
	userTab = new int[tailleTab];
	
	System.out.println("Renseigner les valeurs de votre tableau.");
	
	while(indexUserTab < tailleTab) {
	    System.out.print("La valeur de la position "+(indexUserTab+1)+" ");
	    userTab[indexUserTab] = Clavier.nextInt();
	    indexUserTab++;
	}
	
	Clavier.close();
	return userTab; // On renvoie le tableau créer par l'utilisateur

    }

    public static void main(String[] args) {
	int[] tab = tabReader();
	tabToPrint(tab);
	
	System.out.println("La valeur Min : "+minTab(tab));
	System.out.println("La valeur Max : "+maxTab(tab));
	System.out.println("La moyenne : "+moyenneTab(tab));
	System.out.println("Tableau trié : ");
	
	tabToPrint(tab);
	
    }

}
