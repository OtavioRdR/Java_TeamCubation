import java.util.Scanner;

public class Tabuada {
    public static void main(String [] Args){

        System.out.println("Digite um numero para tabuada:");
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = sc.nextInt();

        for (int i = 1; i < 10; i++){
            int tabuadaResultado = numeroUsuario * i;
            System.out.println(i + " X " + numeroUsuario + " = " + tabuadaResultado);
        }

    }
}