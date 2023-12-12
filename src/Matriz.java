import java.security.SecureRandom;

public class Matriz {
    public static void main(String[] args){
        final int linha= 2;
        final int coluna=5;

        //matriz
        int[][] numeros= new int[linha][coluna];

        for(int l = 0; l<linha ; l++){
            for (int c = 0; c<coluna ; c++){
                numeros[l][c]= new SecureRandom().nextInt(20);
            }
        }

        for(int l = 0; l<linha ; l++){
            for (int c = 0; c<coluna ; c++){
                System.out.printf("%d | ", numeros[l][c]);
            }
            System.out.printf("%n");
        }

        for(int[] n:numeros){
            for (int v:n){
                System.out.printf("%d | ", v);
            }
        }

        //matriz com valores já iniciados
        int[][] matrizIniciada = {{1,2,3,4,5},{1,2,3,4,5}, {1,2,3,4,5}};

    }
}
