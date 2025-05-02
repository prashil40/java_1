import java.util.List;
import java.util.Set;

public class HelperClass {
    public static User[] getArrayOfUser() {
        User[] arrOfUser = {
                new User("John", "john@gmail.com", true),
                new User("Doe", "doe@gmail.com", true),
                new User("Jane", "jane@gmail.com", true),
                new User("Jane Doe", "janedoe@gmail.com", true),
                new User("John Doe", "jane@gmail.com", true),
                new User("John Krasinski", "johnK@gmail.com", true)
        };
        return arrOfUser;
    }

    public static void printSet(Set<?> set1, String message) {
        System.out.println("\n"+message);
        for (Object phone: set1){
            System.out.println(phone);
        }
    }

    public static void printList(List<?> list1) {
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
