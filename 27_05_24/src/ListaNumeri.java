import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumeri {

    public static void main(String[] args) {

        List<Integer> numeri = new ArrayList<>();

        numeri.add(2);
        numeri.add(7);
        numeri.add(4);
        numeri.add(9);
        numeri.add(0);
        numeri.add(5);
        numeri.add(3);
        numeri.add(8);
        numeri.add(1);
        numeri.add(6);
        numeri.add(2);
        numeri.add(7);
        numeri.add(4);
        numeri.add(9);
        numeri.add(0);
        numeri.add(5);
        numeri.add(3);
        numeri.add(8);
        numeri.add(1);
        numeri.add(6);


        System.out.println("Lista originale: " + numeri);


        numeri.remove(Integer.valueOf(3));
        System.out.println("Lista dopo la rimozione del numero 3: " + numeri);


        Collections.sort(numeri);
        System.out.println("Lista ordinata: " + numeri);

    }
}
