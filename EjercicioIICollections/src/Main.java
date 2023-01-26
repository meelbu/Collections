import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> Nombres = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres a registrar");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un nombre");
            String nom = input.next();
            Nombres.add(nom);
        }

        for (String elemento : Nombres) {
            System.out.println(elemento);

        }
    }
}