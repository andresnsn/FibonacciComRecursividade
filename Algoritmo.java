import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algoritmo {

    int a = 0, b = 1, c, x = 0, y = 1, z;
    List<Integer> listaRecursiva = new ArrayList<Integer>(Arrays.asList(a, b));
    List<Integer> listaIterativa = new ArrayList<Integer>(Arrays.asList(a, b));

    public int fibonacciRecursivo(int n){
        if(n <= 1) {
            return listaRecursiva.get(n);
        }

        c = a + b;
        a = b;
        b = c;
        listaRecursiva.add(b);

        return listaRecursiva.size() != n + 1? fibonacciRecursivo(n) : listaRecursiva.get(n);
    }

    public int fibonacciIterativo(int n) {
        if(n <= 1) {
            return listaIterativa.get(n);
        }
        for(int i=0; i < n; i++) {
            z = x + y;
            x = y;
            y = z;
            listaIterativa.add(b);
        }

        return listaIterativa.get(n);
    }

}
