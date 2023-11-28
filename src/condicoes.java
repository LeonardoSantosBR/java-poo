public class condicoes {
   public static void main(String[] args){
       int notaP1 = 6;
       int notaP2 = 6;
       boolean aprovado;

       if((notaP1 + notaP2) / 2 >= 6 ){
           aprovado = true;
       }else{
           aprovado = false;
       }

       System.out.print(aprovado);
   }
}
