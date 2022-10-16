import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a Primeira Nota ");
        double nota1 = ler.nextDouble();

        System.out.println("Didigte a Segunda Nota ");
        double nota2 = ler.nextDouble();

        double mediaNota = (nota1+nota2)/2;

        System.out.println(mediaNota);
         if(mediaNota>7){
            System.out.println("Aprovado, média final " + mediaNota);

         }
         else{
            System.out.println("Reprovado, média final " + mediaNota);
         }
         ler.close();

      
    }
}
