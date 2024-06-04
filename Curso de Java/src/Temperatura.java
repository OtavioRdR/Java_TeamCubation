import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
    Scanner inicio = new Scanner(System.in);

    System.out.println("Digite a temperatura em graus celsius:");
    float celsius = inicio.nextFloat();

    double fahrenheit = (9 * celsius) / 5 + 32;


    System.out.println("A temperatura escrita em celsiusis foi de: " + celsius + "ºC");
    System.out.println("A temperatua atribuida em fahrenheit é " + fahrenheit + "°F");


    }


}
