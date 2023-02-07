package Assignmnet4;

import java.util.HashMap;

public class RefactoringExistingSystems {

    private HashMap<String, String> userCredentials;

    public RefactoringExistingSystems(){
        userCredentials = new HashMap<>();
        userCredentials.put("admin", "password");
        userCredentials.put("user", "1234");
    }
    public boolean checkLogInCredentials(String username, String password){
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }
}

