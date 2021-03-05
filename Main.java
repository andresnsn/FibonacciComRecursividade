import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Algoritmo algoritmo = new Algoritmo();

        List<Integer> list = new ArrayList<Integer>();

        System.out.println(algoritmo.fibonacci(0));
        System.out.println(algoritmo.fibonacci(1));
        System.out.println(algoritmo.fibonacci(2));
        System.out.println(algoritmo.fibonacci(3));
        System.out.println(algoritmo.fibonacci(4));
        System.out.println(algoritmo.fibonacci(5));
        System.out.println(algoritmo.fibonacci(6));
        System.out.println(algoritmo.fibonacci(7));
        System.out.println(algoritmo.fibonacci(8));
        System.out.println(algoritmo.fibonacci(9));
        System.out.println(algoritmo.fibonacci(10));

        System.out.println(algoritmo.getFibonacciList());

    }

}