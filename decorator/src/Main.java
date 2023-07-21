import com.rgl.decorator.ChocolateCoffee;
import com.rgl.decorator.Coffee;
import com.rgl.decorator.MilkCoffee;
import com.rgl.decorator.SimpleCoffee;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Price of simpleCoffee "+simpleCoffee.getPrice());
        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println("Price of milkCoffee "+milkCoffee.getPrice());
        Coffee chocolateMilkCoffee = new ChocolateCoffee(milkCoffee);
        System.out.println("Price of chocolateMilkCoffee "+chocolateMilkCoffee.getPrice());
        Coffee chocolateCoffee = new ChocolateCoffee(simpleCoffee);
        System.out.println("Price of chocolateCoffee "+chocolateCoffee.getPrice());
    }
}