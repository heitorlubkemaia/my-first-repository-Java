import java.util.Random;
import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jogadas = 0;
        int numd;
        Random ram = new Random();
        int num = ram.nextInt(11)+ 1;

        System.out.println("\tDescubra o número de 1 a 10 gerado aleatóriamente");

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
