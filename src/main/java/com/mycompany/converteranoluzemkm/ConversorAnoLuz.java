package com.mycompany.converteranoluzemkm;
import java.util.Scanner;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class ConversorAnoLuz {
    public static void main(String[] args) {
        // Declaração de variáveis
        double userAnoLuz;
        BigInteger constAnoLuz = new BigInteger("9454254703200"); // Usando String para inicialização precisa

        // Configuração do Scanner
        Scanner scanner = new Scanner(System.in);

        // Mensagem de boas-vindas
        System.out.println("\n---------- CONVERSOR ANO LUZ PARA KM ----------\n");

        // Entrada do usuário
        System.out.print("Digite o valor de Ano Luz: ");
        userAnoLuz = scanner.nextDouble();

        // Cálculo
        BigInteger userResult = constAnoLuz.multiply(BigInteger.valueOf((long) userAnoLuz));

         // Formata o Numero
         DecimalFormat df = new DecimalFormat("###,###,###");
         String resultadoFormatado = df.format(userResult);
         
        // Resultado
        System.out.println("\n---------- RESULTADO ----------\n");
        System.out.printf("%.2f Ano Luz equivale a %s Km\n", userAnoLuz, resultadoFormatado);
        System.out.println("\n---------- FIM ----------\n");
        
        // Fechar o Scanner
        scanner.close();
    }
}
