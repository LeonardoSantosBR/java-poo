public class Client {
    private Number id;
    private String name;
    private String email;
    private String password;

    public Client(
            Number id,
            String name,
            String email,
            String password
    ){
        this.id = id;
        this.email= email;
        this.name= name;
        this.password= password;
    }
};

class Aplicacao {
    public static void main(String[] args){
        Client newClient = new Client(1,"client1","client@gmail.com","12345");
        System.out.println(newClient);
    }
}
