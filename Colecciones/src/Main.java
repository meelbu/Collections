import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> ListaNumeros = new ArrayList<Integer>();

        System.out.println("Ingrese de numeros a cargar:");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un numero nuevo");
            int numero = input.nextInt();
            ListaNumeros.add(numero);
        }

        for (Integer elemento : ListaNumeros) {
            System.out.println(elemento);
        }
    }

}