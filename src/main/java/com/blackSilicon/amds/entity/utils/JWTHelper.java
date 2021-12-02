//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.blackSilicon.amds.entity.utils;

import com.blackSilicon.amds.entity.User;
import com.blackSilicon.amds.session.UserFacade;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.bind.DatatypeConverter;

@Stateless
public class JWTHelper {
    @EJB
    UserFacade uf;
    private final String roleCustomer = "user";
    private final String roleAdmin = "admin";
    private final String roleStore = "store";

    public JWTHelper() {
    }

    public String getRoleCustomer() {
        return "user";
    }

    public String getRoleAdmin() {
        return "admin";
    }

    public String getRoleStore() {
        return "store";
    }
private String secret ="iHInIHHiuU^%65&^7%6f$6rYrVCytcytRytrTFTr^CYUGyutVt7T8787t87t87T^trfyuT6t6T&^T87t&T7T76T7T7T7T7T76R76R76e54r6b6T7";
    public String generateToken(User user) {
        Map<String, Object> tokenData = new HashMap();
        String id = user.getId().toString();
        String username = user.getUsername();
        tokenData.put("id", id);
        tokenData.put("username", username);
        Calendar calendar = Calendar.getInstance();
        calendar.add(10, 24);
        tokenData.put("expires", calendar.getTime());
        JwtBuilder jwtBuilder = Jwts.builder();
        jwtBuilder.setExpiration(calendar.getTime());
        jwtBuilder.setClaims(tokenData);
        return jwtBuilder.signWith(SignatureAlgorithm.HS256, secret).compact();
    }

    public Map<String, Object> getUser(String data) {
        Map<String, Object> payload = new HashMap();
        int i = data.lastIndexOf(46);
        String withoutSignature = data.substring(0, i + 1);
        Jwt<Header, Claims> untrusted = Jwts.parser().parseClaimsJwt(withoutSignature);
        String username = ((Claims)untrusted.getBody()).get("username").toString();
        User user = this.uf.findByUsername(username);
        payload.put("user", user);
        return payload;
    }

    public Map<String, String> validateToken(String token) {
        Map<String, String> payload = new HashMap();
        String message = "";

        try {
            Map<String, Object> data = this.getUser(token);
            Object user = data.getOrDefault("user", (Object)null);
            Boolean isUser = user != null;
            User user1 = isUser ? (User)user : null;
            boolean userActive = true;
           

            if (!isUser) {
                message = "invalid_auth_token";
            } else if (isUser && !userActive) {
                message = "user_blocked";
            } else {
                
                Claims claims = (Claims)Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(secret)).parseClaimsJws(token).getBody();
                long expires = (Long)claims.get("expires");
                Date expired = new Date(expires);
                Date today = new Date();
                if (today.after(expired)) {
                    message = "expired_auth_token";
                } else {
                    message = "valid";
                }
            }

           
        } catch (Exception var15) {
            message = "error processing jwt";
        }

        payload.put("message", message);
        return payload;
    }
}

