import java.util.Random;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int jogadas = 0;
        int numd;
        Random ram = new Random();
        System.out.println("Digite número maximo:");
        int tam = sc.nextInt();
        int num = ram.nextInt(tam)+ 1;

        System.out.print("\tDescubra o número de 1 a "+tam);
        System.out.println(" gerado aleatóriamente");

        do{
            System.out.println("Digite:");
            numd = sc.nextInt();
            sc.nextLine();
            jogadas++;
            if (numd > num) {
                System.out.println("Palpite Maior");
            }
            else if(numd < num){
                System.out.println("Palpite menor");
            }

        }while(num != numd);
        System.out.println("Acertou!\nTentativas:"+jogadas);



        

        sc.close();

    }
}
