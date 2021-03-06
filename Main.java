import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Algoritmo algoritmo = new Algoritmo();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma posição: ");
        var pos = input.nextInt();

        System.out.println("Resultado da operação recursiva: "+algoritmo.fibonacciRecursivo(pos));
        System.out.println("Resultado da operação iterativa: "+algoritmo.fibonacciIterativo(pos));


    }

}