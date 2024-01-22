public class ClassPoo {
    final int maxVidas = 5;
    public int num;
    private int vidas;
    static boolean alerta= false;

    public ClassPoo(int num){
        this.num = num;
        this.vidas = 1;
    }

    public int getMethod(){
        return this.vidas;
    }

    public void setMethod(int vidas){
        if(vidas > maxVidas){
            this.vidas = maxVidas;
        }else if ( vidas < 0 ){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }
        System.out.printf("Vidas do jogador setada para: $n", vidas);
    }

    public void info(){
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta: %s", (alerta ? "sim" : "não"));
        System.out.printf("%n----------------------------------------------");

    }


}


