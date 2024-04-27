package application;

import exceptions.ParametroInvalido;

import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = sc.nextInt();
        System.out.print("Digite o segundo parâmetro:");
        int segundoParametro = sc.nextInt();

        try {
            contar(primeiroParametro,segundoParametro);
        }catch (ParametroInvalido exception){
            System.err.println("Parâmetros inválidos, o primeiro parâmetro deverá ser menor que o segundo!");
        }
    }

    static void contar (int primeiroParametro, int segundoParametro) throws ParametroInvalido {
        if (primeiroParametro > segundoParametro){
            throw new ParametroInvalido();
        }else {
            int contador = segundoParametro - primeiroParametro;
            for (int interaction = 0; interaction < contador; interaction++) {
                System.out.println("Imprimindo o nº "+(interaction+1));
            }
        }

    }
}
