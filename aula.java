public class aula {
    public static void main(String[] args){

        int [] vetor;

        vetor = new int[10];

        for(int a = 0; a < 10; a++){
            vetor[a] = a+1;
            System.out.println("Valor do vetor:"+vetor[a]);
            System.out.println("Posição:"+a);

        }
    }
}
