import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void exercise3 () {

        exceptionHandling();

        // Stream API Grouping

        User[] arrOfUser = HelperClass.getArrayOfUser();
        List<User> userList = Arrays.stream(arrOfUser).toList();

        Map<String, List<User>> userMap =  userList.stream()
                .collect(Collectors.groupingBy(user -> user.name.substring(0,3)));

        Set<String> keys = userMap.keySet();
        for (String key: keys){
            System.out.println("Key => " + key);
            System.out.println("Value => " + userMap.get(key));
            System.out.println();
        }



    }

    private static void exceptionHandling() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("This is Arithmatic exception handler block");
        }
        catch (Exception e ){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }

        try{
            throwsExampleMethod();
        } catch (FileNotFoundException e ){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void throwsExampleMethod () throws FileNotFoundException {
        FileReader reader = new FileReader("file.txt");
    }
}
