import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args){
        int[] array1= {5,2,15,13,43,27,120,90,40,12};
        int[] array2= new int[10];
        int n1= 15;

        Arrays.sort(array1);
        System.arraycopy(array1, 0, array2, 0 ,array1.length);
        boolean isArrayEqual= Arrays.equals(array1, array2);

        if(isArrayEqual)
            System.out.println("Os dois arrays são iguais.");

        System.out.println("o index do numero: "+ Arrays.binarySearch(array1, 10));

        for(int n: array1){ //for para leitura de array.
            System.out.println(n);
        }

    }
}
