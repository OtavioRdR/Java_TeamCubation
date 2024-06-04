import java.util.Scanner;

public class numerPrimo {

    public static boolean seForPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero e o programa verificara se ele é primo ou não: ");

        int numero = scanner.nextInt();

        scanner.close();

        if (seForPrimo(numero)) {

            System.out.println(numero + " é um numero primo.");
        }

        else {
            System.out.println(numero + " não é um numero primo.");
        }
    }
}
