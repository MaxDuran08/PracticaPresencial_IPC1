import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Practica P = new Practica();
//        P.uno();
        Scanner Leer = new Scanner(System.in);
//        System.out.println("LLene el primer arreglo");
//        System.out.println("Defina la cantidad de datos:");
//        int cantidad=Leer.nextInt();
//        int[] Arreglo1 = new int[cantidad];
//        for (int i = 0; i < Arreglo1.length; i++) {
//            System.out.print("["+i+"]: ");
//            Arreglo1[i]=Leer.nextInt();
//        }
//        System.out.println("LLene el segundo arreglo");
//        System.out.println("Defina la cantidad de datos:");
//        int cantidad2=Leer.nextInt();
//        int[] Arreglo2 = new int[cantidad2];
//        for (int i = 0; i < Arreglo2.length; i++) {
//            System.out.print("["+i+"]: ");
//            Arreglo2[i]=Leer.nextInt();
//        }
//        System.out.print("Ingrese el numero: ");
//        int numero=Leer.nextInt();
//        if (P.dos(Arreglo1,Arreglo2,numero)){
//            System.out.println("Devolvio un true");
//        }else{
//            System.out.println("Devolvio un false");
//        }
//        System.out.println("----------------------------------------");
//        System.out.print("Ingrese el limite: ");
//
//        int n=Leer.nextInt();
//        System.out.println(P.tres(n));
        String cadena="Me cago en el auxiliar hijo de la verga";
        System.out.println(P.cuatro(cadena));
    }

}
