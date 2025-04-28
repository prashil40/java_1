import java.time.ZonedDateTime;
import java.util.Arrays;

public class AdvancedUser extends User{

    private String userType;
    private String[] permissions;

    AdvancedUser(User u, String userType, String[] permissions) {
        this.name = u.name;
        this.email = u.email;
        setActive(u.isActive());
        this.userType = userType;
        this.permissions = permissions;
    }

    AdvancedUser(String name, String email, boolean status, String userType, String[] permissions){
        this.name = name;
        this.email = email;
        setActive(status);
        this.userType = userType;
        this.permissions = permissions;
    }

    public String getUserType() {
        return userType;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public String printPermissions() {
        return Arrays.toString(permissions);
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: " + userType + "\nRoles: " + printPermissions();
    }

    public boolean isActive(ZonedDateTime d) {
        if(super.isActive()){
            return d.isBefore(createdAt.plusYears(6));
        } else {
            return false;
        }
    }
}
