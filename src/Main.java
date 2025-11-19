//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Moyenne");
        System.out.println("4. Trouver le plus grand");
        System.out.println("0. Quitter");

        int choix;
        do {
            System.out.println("Choisi une option :");
            choix=sc.nextInt();
            switch (choix) {
                case 1 -> {
                    System.out.println("inserez un entier");
                    int a1 = sc.nextInt();
                    System.out.println("inserez un autre entier");
                    int b1 = sc.nextInt();
                    int c = addition(a1, b1);
                    System.out.println("l'addition de ces deux entier est:" + c);
                }
                case 2->{
                    System.out.println("inserer un entier");
                    int a2= sc.nextInt();
                    System.out.println("inserez une autre entier");
                    int b2=sc.nextInt();
                    System.out.println("la multiplication de ces deux entier est :" + multiply(a2,b2));
                }
                case 3->{
                    System.out.println("combien de nombres voulez vous inserez");
                    int l= sc.nextInt();
                    int [] valeurs = new int[l];
                    for(int i=0; i<l;i++){
                        System.out.println("inserez l'entier de l'index " + (i+1));
                        valeurs[i]= sc.nextInt();
                    }
                    System.out.println("le moyenne de ces entiers est :" + moyenne(valeurs));
                }
                case 4->{
                    System.out.println("combien de nombres voulez vous inserez");
                    int m= sc.nextInt();
                    int [] entiers = new int[m];
                    for(int i=0; i<m;i++){
                        System.out.println("inserez l'entier de l'index " + (i+1));
                        entiers[i]= sc.nextInt();
                    }
                    System.out.println("le moyenne de ces entiers est :" + maximum(entiers));
                }
                case 0 ->System.out.println("fin de programme merci de l'utilisation");
                default -> System.out.println("Ce choix n'existe pas");
            }
        }while(choix != 0);

    }

     public static int addition(int a, int b){
        return a + b;
     }
     public static int multiply(int a,int b){return a * b;}
     public static int moyenne(int... valeurs){
        int total=0;
        for(int v : valeurs){
            total+=v;
        }
        return  total/ valeurs.length;}
    public static int maximum(int... valeurs){
        int max=valeurs[0];
        for (int v : valeurs){
            if (v > max){
                max=v;
            }
        }
        return max;
    }

    }
