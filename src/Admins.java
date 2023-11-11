public class Admins {
    private Number id;
    private String name;
    private String cpf;
    private String email;
    private String password;

    private Admins(
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
