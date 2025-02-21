import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de Informação da Empresa
        System.out.println("Sistema de Informação da Empresa");

        // Declaração das Variáveis
        String nome;
        double salario;
        double imposto;

        // Entrada
        System.out.println("Informe o nome:");
        nome = input.nextLine();
        System.out.println("Informe o salario");
        salario = input.nextDouble();

        // Processamento
        if (salario >= 5.0) {

            // Saída para recolher o imposto
            System.out.println("Você recolhe IR.");
            imposto = salario * 20 / 100;
        } else {

            // Saída para isenção do IR
            System.out.println("Você está isento do IR");
            imposto = 0.0;
        }

        // Saída
        System.out.println("O seu salario bruto é de R$" + salario);
        System.out.println(" A aliquota de IR de 20% corresponde a R$ " + imposto);
        System.out.println("Seu salário líquido será de R$ " + (salario - imposto));
    }
}
