public class Metodos {
    public static  void main(String[] args){
        int result = sumNumbers(10,10,10);
        double resultDouble = sumNumbers(2.5,2.5);

        System.out.println(result);
        System.out.println(resultDouble);
    }

    private static int sumNumbers(int... numbers){
        int res= 0;
        for(int n: numbers){
          res += n;
        };

        return res;
    };

    private static Double sumNumbers(Double... numbers){
        Double res= 0.0;
        for(Double n: numbers){
            res += n;
        };

        return res;
    };
}
