import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        Integer idade = 0;
        Double peso = 0d;

        System.out.println("Informe seu nome: ");
        nome = sc.next();

        System.out.println("Informe seu idade: ");
        idade = sc.nextInt();

        System.out.println("Informe seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é :" + idade);
        System.out.println("Seu peso é :" + peso);
    }
}
