package use_case.change_password;

import entity.User;

/**
 * The interface of the DAO for the Change Password Use Case.
 */
public interface ChangePasswordUserDataAccessInterface {

    /**
     * Updates the system to record this user's password.
     * @param user the user whose password is to be updated
     */
    void changePassword(User user);

    /**
     * Sets the current user.
     * @param username the user's name to set as current
     */
    void setCurrentUser(String username);

    /**
     * Gets the current user.
     * @return the name of the current user
     */
    String getCurrentUser();
}
