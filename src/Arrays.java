import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = {40,34,2,333,90};

        for(int i= 0 ; i < array2.length; i++){
            System.out.println(array2[i]);
        }

        int nota = 0;
        final int tamanho = 5;
        char[] gabarito = {'a','c','a','a','e'};
        char[] respostas = new char[tamanho];

        for(int i = 0; i<respostas.length; i++){
            respostas[i]= scan.next().charAt(0);
        }

        for(int i = 0; i<respostas.length; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
                System.out.println("Parabéns você acertou sua nota aumentou para "+nota);
            }
        }

        System.out.println("nota final: "+nota);
    }
}
