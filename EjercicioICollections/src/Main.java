import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> Lista1 = new ArrayList<Integer>();
        Lista1.add(10);
        Lista1.add(20);
        Lista1.add(30);
        Lista1.add(40);
        Lista1.add(50);
        Lista1.add(60);
        Lista1.add(70);

        for (Integer num: Lista1){
            System.out.println(num);
        }

        System.out.println("");

        List<Integer> Lista2 = new ArrayList<Integer>();
        System.out.println("Ingrese la cantidad de numeros a cargar");
        int N = input.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Ingrese un numero");
            int nn = input.nextInt();
            Lista2.add(nn);
        }

        for (Integer elemento : Lista2){
        System.out.println(elemento);
    }
}
}