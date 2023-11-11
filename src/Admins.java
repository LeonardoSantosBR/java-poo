public class Admins {
    private Number id;
    private String name;
    private String cpf;
    private String email;
    private String password;

    public Admins(
            Number id,
            String name,
            String cpf,
            String email,
            String password
    ){
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password= password;
    }
}
class AdminsController {
    public static void main(String[] args){
        Admins newAdmin = new Admins(1, "admin1", "cpf1", "email1", "password1");
        System.out.println(newAdmin);
    }
}