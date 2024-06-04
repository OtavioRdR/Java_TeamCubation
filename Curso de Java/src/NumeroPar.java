import java.util.Scanner;


public class NumeroPar {
    public static void main(String [] Args) {

        System.out.println("Digite um Numero:" );
        Scanner sc = new Scanner(System.in);

        int NumeroUsuario = sc.nextInt();
            if (NumeroUsuario % 2 == 0){
                System.out.println("É PAR");
        }
        else {
            System.out.println("É IMPAR");
            }

    }

}