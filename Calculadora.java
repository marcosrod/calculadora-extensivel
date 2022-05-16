import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = scanner.nextInt();
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        String resultado = "Nenhuma operação válida selecionada.";

        if (operacao == 1) {
            resultado = "A soma é igual a = "+(n1+n2);
        } else if (operacao == 2) {
            resultado = "A subtracao é igual a = "+(n1-n2);
        } else if (operacao == 3) {
            resultado = "A multiplicacao é igual a = "+(n1*n2);
        } else if (operacao == 4) {
            resultado = "A divisão é igual a = "+(n1/n2);
        }

        System.out.println(resultado);
    }
}
