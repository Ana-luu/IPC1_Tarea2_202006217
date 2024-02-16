
import java.util.Scanner;

public class Main {
    public static Scanner inicio;
    public static Double a;
    public static Double b;
    public static Double c;

    public static void main(String[] args){


        System.out.println("SELECCIONA LA OPCION ");

        int op = 0;
        do {
            System.out.println();

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion");
            System.out.println("5. Salir");

            try {
                inicio = new Scanner(System.in);
                op= inicio.nextInt();
            } catch (Exception e) {
                System.out.println("Por favor ingrese un numero");
            }

            switch (op) {
                case 1:
                    suma();
                    break;


                case 2:
                    resta();
                    break;


                case 3:
                    division();
                    break;

                case 4:
                    multiplicacion();
                    break;

                case 5:
                    break;
            }
        } while (op != 5);
    }
    public static void suma(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        a=numero.nextDouble();
        System.out.println("Ingrese el segundo numero");
        b=numero.nextDouble();
        c=a+b;
        System.out.println("El resultado es de: "+c);



    }
    public static void resta(){
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        a=numero.nextDouble();
        System.out.println("Ingrese el segundo numero");
        b=numero.nextDouble();
        c=a-b;
        System.out.println("El resultado es de: "+c);


    }
    public static void division(){
        Scanner numero = new Scanner(System.in);
        try {
            System.out.println("Ingrese el numerador");
            a = numero.nextDouble();
            System.out.println("Ingrese el denominador");
            b = numero.nextDouble();
            c=a/b;
            System.out.println("El resultado es de: " + c);
        } catch(ArithmeticException ae) {
            System.out.println("El denominador no puede ser cero");
        }


    }
    public static void multiplicacion(){
            Scanner numero = new Scanner(System.in);
            System.out.println("Ingrese el primer numero");
            a = numero.nextDouble();
            System.out.println("Ingrese el segundo numero");
            b = numero.nextDouble();
            c = a*b;
            System.out.println("El resultado es de: " + c);


   }
}