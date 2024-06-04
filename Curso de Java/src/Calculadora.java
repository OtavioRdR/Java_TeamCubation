import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner comeco = new Scanner(System.in);

        System.out.println("digite o seu primeiro numero para a adição: ");
        double primeiroNumero  = comeco.nextDouble();

        System.out.println("digite o segundo numero para adição: ");
        double segundoNumero = comeco.nextDouble();

        double result = primeiroNumero + segundoNumero;
        System.out.println("o resultado das adições foi: " + result);




    }



}
