package use_case.signup;

import entity.User;

/**
 * DAO for the Signup Use Case.
 */
public interface SignupUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

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
