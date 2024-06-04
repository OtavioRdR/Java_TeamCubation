public class BonusSalario {
    public static void main(String [] args){

        float Salario = 2000;
        int anosServico = 10;
        float porcentagemBonus = 0;
        float bonus = 0;

        if (anosServico > 5){
            porcentagemBonus = 1;
        }
        else{
            porcentagemBonus = 2;
        }


        bonus = Salario * porcentagemBonus / 100;
        System.out.println("sua porcentagem é de: " + porcentagemBonus + "%" );
        System.out.println("bonus acrescentado no salario:" + "R$"+ bonus);

    }



}




