package com.wz.deadorlife.annotation;

import java.util.List;

/**
 * @author wz
 */
public class PasswordUtils {

    @UserCase(id = 47, description = "password must contain at least one")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d*\\w*"));
    }

    @UserCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuffer(password).reverse().toString();
    }

    @UserCase(id = 49,description = "NEW password can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }


}
