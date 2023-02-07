package Assignmnet4;

public class RefactoringExistingSystems {

    public boolean checkLogInCredentials(String username, String password) {
        boolean isValid = false;
        if (username.equals("admin") && password.equals("password")) {
            isValid = true;
        } else if (username.equals("user") && password.equals("1234")) {
            isValid = true;
        }
        return isValid;
    }

}

