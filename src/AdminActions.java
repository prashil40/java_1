public interface AdminActions {
    boolean updateAdvancedUserPermissions(AdvancedUser user);

    void updateUserStatus(User user, boolean status);
}
