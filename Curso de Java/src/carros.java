public class carros {

    private String marca;
    private String modelo;
    private int valor;
    private int ano;


    public carros (String marca, String modelo, int ano, int valor){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;


    }
    public void detalhe(){
        System.out.println("esses são os detalhes: ");
        System.out.println("ano do carro : " + ano);
        System.out.println("a marca do carro é: " + marca);
        System.out.println("e o modelo é: " + modelo);
        System.out.println("ele esta saindo por: " + "R$" + valor);
    }

    public static void main(String[] args) {
        carros novoCarro = new carros("Camaro ss" , "Chevrolet" , 2023 , 202312);
        carros outroCarro = new carros("Corvette" , "Chevrolet" , 2023 , 123112);

        novoCarro.detalhe();


    }














}
