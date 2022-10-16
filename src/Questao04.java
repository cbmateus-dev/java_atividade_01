import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Nome do trabalhador: ");
        String name = ler.next();
        System.out.println("Digite o valor da hora do trabalhador " + name + " R$ ");
        float vlrHora = ler.nextFloat();
        System.out.println("Digite quantas  horas o " + name + " trabalhou");
        float qtdHora = ler.nextFloat();
        float salarioFinal = (vlrHora * qtdHora);
        
        System.out.println("O Salário do " + name + " é  R$ " + salarioFinal);
        
        ler.close();
    }
}
