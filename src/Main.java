import javax.xml.transform.Source;
import java.time.ZonedDateTime;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();

//        Exercise3.exercise3();
        Exercise4.exercise4();
    }


    public static void exercise1(){
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        // Normal user

        // TODO: day 1
        User user1 = new User();
        user1.name = "John";
        user1.email = "johndoe@gmail.com";
        user1.setActive(true);

        System.out.println(user1.toString());

        // Super user
        AdvancedUser user2 = new AdvancedUser(user1, "Admin", new String[] {"read", "write", "execute"});

        System.out.println("\n\n" + user2.toString());

        ZonedDateTime dateToCheck = ZonedDateTime.now();
        System.out.println("\n\nIs Advanced User active? => " + user2.isActive(dateToCheck));

        // Abstract class and Interface

        AdvancedUser user3 = new AdvancedUser("J T", "jt@gmail.com", true, "Trader",  new String[] {"read", "write", "execute"});
        SuperAdmin sAdmin = new SuperAdmin(new User("P T", "pt@gmail.com", true), "SuperAdmin",  new String[] {"read", "write", "execute"});

        System.out.println("\n\nIs user super Admin? => " + sAdmin.isSuperAdmin());

        sAdmin.updateUserStatus(user1, false);
        System.out.println("\n\nUpdated User 1 => " + user1.toString());

        System.out.println("\n\nBefore updating U®ser 3 => " + user3.toString());
        sAdmin.updateAdvancedUserPermissions(user3);
        System.out.println("\nUpdated User 3 => " + user3.toString());

    }

    private static void exercise2() {
        listExercise();

        setExercise();

        mapExercise();

    }


    private static void listExercise() {
        // ArrayList
        System.out.println("ArrayList: ");
        List<String> list1 = new ArrayList<String>();
        list1.add("ABC");
        list1.add("DEF");
        list1.add("XYZ");
        list1.add("ABC");

        HelperClass.printList(list1);


        // LinkedList
        List<String> lList = new LinkedList<String>();

        for (int i = 0; i < list1.size(); i++) {
            lList.add(list1.get(i));
        }
        System.out.println("\nLinked List:");
        HelperClass.    printList(lList);


        // Print list using iterator
        Iterator<String> it = lList.iterator();
        System.out.println("\n");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    private static void setExercise() {
        Set<String> set1 = new HashSet<String>();
        set1.add("Iphone");
        set1.add("Pixel");
        set1.add("Samsung");
        set1.add("Nothing");

        HelperClass.printSet(set1, "Initial set: ");

        if(!set1.add("Iphone")){
            System.out.println("\nDuplicate element was not added");
        }

//        printSet(set1, "After: ");

        // search Samsung in the set.
        if(set1.contains("Samsung")) {
            System.out.println("Found Samsung in the set");
        } else {
            System.out.println("Couldn't find Samsung in the set");
        }

        if(set1.contains("Blackberry")){
            System.out.println("Found Blackberry in the set");
        }
        else {
            System.out.println("Couldn't find Blackberry in the set");
        }
        System.out.println("\n");

        // HashSet with Users
        User[] arrOfUser = HelperClass.getArrayOfUser();

        System.out.println("arrOfUser.length = " + arrOfUser.length);
        HelperClass.printList(Arrays.stream(arrOfUser).toList());
        Set<User> uniqueUsers = new HashSet<User>();
        for (User u : arrOfUser){
            uniqueUsers.add(u);
        }

        HelperClass.printSet(uniqueUsers, "Unique Users: " + uniqueUsers.size());


    }

    private static void mapExercise() {

        User[] arrOfUser = HelperClass.getArrayOfUser();

        Map<String, User> userMap = new HashMap<String, User>();
        for (User user: arrOfUser) {
            userMap.put(user.email, user);
        }

        System.out.println("\nCreated user map:");
        for(String email: userMap.keySet()){
            System.out.println(email + " ==> " + userMap.get(email).name);
        }

        // find user based on key (email)

        if(userMap.containsKey("john@gmail.com")){
            System.out.println("\nFound the key");
        }

        Set<Map.Entry<String, User>> users = userMap.entrySet();

        for ( Map.Entry<String, User> entry : users){
            System.out.println("Key => " + entry.getKey());
            System.out.println("Value => " + entry.getValue().name);
            System.out.println();
        }

    }




}