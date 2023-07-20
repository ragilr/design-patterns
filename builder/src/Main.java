import com.rgl.builder.User;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Parvathi", "Ragil").age(3).phone("987654321").address("Calicut").build();
        System.out.println(user);
    }
}