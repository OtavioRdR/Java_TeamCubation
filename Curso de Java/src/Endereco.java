public class Endereco {

    private String rua;
    private String cidade;
    private int numero;


    public Endereco(){
    }

    public Endereco(String rua, String cidade, int numero){
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getRua(){
        return this.rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        Endereco pessoaA = new Endereco();
        Endereco pessoaB = new Endereco();


        pessoaA.setCidade("Sorocaba");
        pessoaA.setRua("Rua almeida dos palmares");


        System.out.println("Andressa mora em " + pessoaA.getCidade()+ ", e na rua: " + pessoaA.getRua());
    }

}
