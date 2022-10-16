import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Nome: ");
        String name = ler.next();       


        System.out.println("Olá " + name);
        
        ler.close();
    }
}
