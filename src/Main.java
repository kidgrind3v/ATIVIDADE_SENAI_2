import java.util.Scanner;

//2 - Solicite um número e calcule o FATORIAL dele.
public class Main {
    public static void main(String[] args) {
        int numero;
        int fatorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        sc.close();
    }
}
