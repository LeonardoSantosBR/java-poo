import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        int it = 0;
        Scanner scan = new Scanner(System.in);

        for (it = 0; it < 5; it++){
            System.out.println(it);
        }

        System.out.println("----------------------------------------");

        int count = 0;
        int max = scan.nextInt();
        while(count <= max){
            count++;
            System.out.println(count);
        }

        System.out.println("----------------------------------------");

        do {
            it++;
            System.out.println(it);
        } while (it <= 10);
    }
}
