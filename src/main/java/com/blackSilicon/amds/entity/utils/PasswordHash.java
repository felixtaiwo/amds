//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.blackSilicon.amds.entity.utils;

import javax.ejb.Stateless;
import org.mindrot.BCrypt;

@Stateless
public class PasswordHash {
    public PasswordHash() {
    }

    public String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public boolean verifyHash(String password, String hashPassword) {
        return BCrypt.checkpw(password, hashPassword);
    }
}

