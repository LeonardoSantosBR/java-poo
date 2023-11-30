public class Loops {
    public static void main(String[] args){
        int it = 0;

        for (it = 0; it < 5; it++){
            System.out.println(it);
        }

        while(it <= 5){
            it++;
            System.out.println(it);
        }

        do {
            it++;
            System.out.println(it);
        } while (it <= 10);
    }
}
