import java.util.Scanner;

public class ScannerClass {
 public static void main(String[] args){

   Scanner scan = new Scanner(System.in);

   String nome , res;
   int p1=0, p2=0;

   System.out.println("Digite seu nome:");
   nome= scan.nextLine();

   System.out.println(("Digite sua primeira nota:"));
   p1= scan.nextInt();

   System.out.println(("Digite sua segunda nota:"));
   p2= scan.nextInt();

   res= "olá "+ nome + " sua média foi " + ((p1 + p2) / 2 );

   System.out.println(res);
 }
}
