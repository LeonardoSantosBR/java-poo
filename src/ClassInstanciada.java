public class ClassInstanciada {
    public static void main(String[] args){
        int it = 1;

        ClassPoo c1 = new ClassPoo(++it);
        ClassPoo c2 = new ClassPoo(++it);
        ClassPoo c3 = new ClassPoo(++it);

        //c1.setMethod(10);
        //System.out.printf("vidas do jogador: %d", c1.getMethod());

        c1.info();
        c2.info();
        c3.info();
    }
}
