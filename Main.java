package aula02Variaveis;

public class Main {

    public static void main(String[] args) {
        String discricao1 = "Estou com fome";
        String discricao2 = "Estou com sede";

        if (discricao1.equals(discricao2)){
            System.out.println("Descricao é igual");
        }else
            System.out.println("Descricao diferentes");


        Integer numero1 = 25;
        Integer numero2 = 25;
        int comparar;

        if (numero1.equals(numero2)){
            System.out.println("Numero1 e Numero2 são iguais.");
        }else{
            comparar = numero1.compareTo(numero2);
            if (comparar < 0)
                System.out.println("Numero1 é maior que Numero2");
            else
                System.out.println("Numero2 é maior que Numero1");
        }

    }
}
