import java.util.Scanner;

public class inout {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a altura:");
        double altura = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome:");
        String nome = sc.nextLine();
        sc.nextLine();

        sc.close();
    }
}
