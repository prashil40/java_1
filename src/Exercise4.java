import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exercise4 {
    public static void exercise4() {

        CustomFunctionalInterface f = () -> System.out.println("Printing from custom function");
        f.myFunction();

        Consumer<String> func2 = str  -> System.out.println("Print str: " + str);
        func2.accept("ABC");

        Supplier<Double> func3 = () -> Math.random();
        System.out.println("Print random number with Supplier: " + func3.get());

        Function<String, Integer> func4 = (str) -> Integer.parseInt(str);
        System.out.println("Parse '00239' this string to integer: " + func4.apply("00239"));

        Predicate<String> func5 = (str) -> str.length() % 2 == 0;
        System.out.println("Check if this string is even 'Asdjncsdlks': " + func5.test("Asdjncsdlks"));



    }
}
