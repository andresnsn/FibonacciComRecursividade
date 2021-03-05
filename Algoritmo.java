import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algoritmo {

    int a = 0;
    int b = 1;
    int c;
    int result;
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(a, b));
    

    public int fibonacci(int n){
        if(n <= 1) {
            return list.get(n);
        }

        c = a + b;
        a = b;
        b = c;
        list.add(b);

        return list.size() != n + 1? fibonacci(n) : list.get(n);
    }
    
}
