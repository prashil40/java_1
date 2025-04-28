import java.util.Arrays;

public class SuperAdmin extends AbstractSuperAdmin implements AdminActions{

    SuperAdmin(User u, String userType, String[] permissions) {
        super(u, userType, permissions);
    }

    @Override
    public boolean isSuperAdmin() {
        return true;
    }

    @Override
    public void updateUserStatus(User user, boolean status) {
        user.setActive(status);
    }

    @Override
    public boolean updateAdvancedUserPermissions(AdvancedUser user) {
        try {
            if(Arrays.asList(user.getPermissions()).contains("execute") && !("Admin".equalsIgnoreCase(user.getUserType()))) {
                var updatedPermissions = Arrays.stream(user.getPermissions())
                        .filter(p ->
                                !p.equalsIgnoreCase("write") && !p.equalsIgnoreCase("execute")
                        ).toArray(String[]::new);

//                System.out.println(Arrays.toString(updatedPermissions));

                user.setPermissions(updatedPermissions);
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
