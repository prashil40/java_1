import java.sql.Array;
import java.time.ZonedDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
}