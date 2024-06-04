public class Carro {

    private String nomeCarro;
    private int anoCarro;

    public Carro() {
    }

    public Carro(String nomeCarro, int anoCarro) {
        this.nomeCarro = nomeCarro;
        this.anoCarro = anoCarro;
    }

    public String getNomeCarro() {
        return this.nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getAno() {
        return this.anoCarro;
    }

    public void setAno(int anoCarro) {
        this.anoCarro = anoCarro;
    }

    public static void main(String[] args) {
        Carro chevrolet = new Carro();
        Carro volkswagen = new Carro();


        chevrolet.setNomeCarro("Camaro");
        volkswagen.setNomeCarro("Jetta Gli");
        chevrolet.setAno(2022);
        volkswagen.setAno(2021);


        System.out.println(chevrolet.getNomeCarro() + " : " + chevrolet.getAno());
        System.out.println(volkswagen.getNomeCarro() + " : " + volkswagen.getAno());
    }

}
