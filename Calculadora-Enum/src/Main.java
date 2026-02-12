import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double a = info.nextDouble();

        System.out.print("Digite o sinal (+, -, *, /): ");
        String Simbolo = info.next();

        System.out.print("Digite o segundo número: ");
        double b = info.nextDouble();

        try {
            Operacoes operacoes = Operacoes.fromSimbolo(Simbolo);
            double resultado = calculadora.calcular(a, b, operacoes);
            System.out.println("Resultado: " + resultado);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        info.close();
    }
}
