import com.rgl.builder.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Parvathi", "Ragil").age(3).phone("987654321").address("Calicut").build();
        System.out.println(user);
//        List l = Arrays.asList([1,2,3]
    }
}