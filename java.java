import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int mesa = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você quer ordenar:");
        int tam = sc.nextInt();

        System.out.print("Digite "+tam);
        System.out.print(" números:");

        int[] vetor = new int[tam];

        for(int c = 0; c < tam; c++){
            vetor[c] = sc.nextInt();
        }

        System.out.print("Vetor antes: \n");
        System.out.print("[");
        for(int a = 0; a < tam; a++){

            System.out.print("," +vetor[a]);
        }
        System.out.println("]");

        System.out.print("Vetor depois: \n");
        System.out.print("[");
        for(int a = 0; a < tam; a++){
            for(int b = 1; b < (tam--); b++){
                if (vetor[b] > vetor[b+1]) {
                    
                    mesa = vetor[b];
                    vetor[b] = vetor[b+1];
                    vetor[b+1] = mesa;

                }

            }
            System.out.print("," +vetor[a]);
        }
        System.out.println("]");
        sc.close();
        
    }
}
