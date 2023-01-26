
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<String> nombreLista = new ArrayList<>();

        System.out.println("Ingrese la cantidad de nombres a registrar");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un nombre");
            String nom = input.next();
            nombreLista.add(nom);
        }

        nombreLista.remove(1);
        Collections.sort(nombreLista);

        System.out.println("");

        for (String elemento : nombreLista) {
            System.out.println(elemento);
        }


    }

}