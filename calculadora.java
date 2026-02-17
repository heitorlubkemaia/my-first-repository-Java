import java.util.Scanner;

public class calculadora {
    public static void main (String[] banana){
        int op;
        int num1;
        int num2;
        double resultado = 0; 
        Scanner entrada = new Scanner(System.in);
        do {
        System.out.println
        ("ESCOLHA A OPERAÇÃO\n0 - SAIR\n1 - SOMA\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO");
        op = entrada.nextInt();
        if (op == 1) {
            System.out.println("Digite a 1º parcela\n");
            num1 = entrada.nextInt();
            System.out.println("Digite a 2º parcela\n");
            num2 = entrada.nextInt();
            resultado = num1 + num2;
            System.out.println("O total é:");

        }
        else if (op == 2) {
            System.out.println("Digite o minuendo\n");
            num1 = entrada.nextInt();
            System.out.println("Digite o subtraendo\n");
            num2 = entrada.nextInt();
            resultado = num1 - num2;
            System.out.println("A diferença é:");

        }
        else if (op == 3){
            System.out.println("Digite o multiplicando\n");
            num1 = entrada.nextInt();
            System.out.println("Digite o multiplicador\n");
            num2 = entrada.nextInt();
            resultado = num1 * num2;
            System.out.println("O produto é:");
        }
        else if (op == 4) {
            System.out.println("Digite o dividendo\n");
            num1 = entrada.nextInt();
            System.out.println("Digite o divisor\n");
            num2 = entrada.nextInt();
            if (num2 != 0) {
                resultado = (double) num1 / num2;
                System.out.println("O quociente é:");
            }  
            else   
            {
                System.out.println("Não é possível dividir por zero!");
            }
            
        }
        else{
            if (op == 0) {
                
            }
            else{
            System.out.println("ERRO OPÇÃO INESSISTENTE!!!");
            }
        }
        if (op != 0) {
            System.out.println(resultado);
        }


        }while(op != 0);
        entrada.close();
    }
}



