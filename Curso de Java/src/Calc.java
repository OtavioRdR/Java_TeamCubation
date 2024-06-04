public class Calc {

    public int somar(int x , int z){
        return x + z;
    }

    public static void main(String[] args) {

    Calc calc = new Calc();
    int resultado = calc.somar(43 , 45);
        System.out.println("este é seu resultado: " + resultado);

    }

}
