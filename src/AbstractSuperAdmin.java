abstract class AbstractSuperAdmin extends AdvancedUser{
    AbstractSuperAdmin(User u, String userType, String[] permissions) {
        super(u, userType, permissions);
    }

    abstract public boolean isSuperAdmin();
}
