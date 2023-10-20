import java.util.Scanner;

public class Arraylist2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos elementos enteros va a ingresar");
        int cantidad_elementos = lector.nextInt();
        // int Arreglo[]={84,21,47,96,15};
        int Arreglo[] = new int[cantidad_elementos];
        for (int i = 0; i < Arreglo.length; i++) {
            Arreglo[i] = lector.nextInt();
        }
        System.out.println("Ingreso datos finalizados");
        System.out.println("que elementos desea buscar");
        int buscado = lector.nextInt();
        int hallado = busquedaLineal(Arreglo, Arreglo.length, buscado);

        if (hallado != -1) {
            System.out.println(" el valor " + buscado + " fue encontrado en la posicion " + hallado);
        } else {
            System.out.println(" El valor " + buscado + " No fue encontrado ");

        }
         lector.close();
    }

    public static int busquedaLineal(int A[], int n, int buscado) {
        int indice = 0;
        while (indice < n) {
            if (A[indice] == buscado) {
                return indice;
            }

            indice++;
        }
       
        return -1;

    }

}
