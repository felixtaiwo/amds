//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.blackSilicon.amds.entity.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Priority;
import javax.ejb.EJB;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

@Provider
@SecuredAdmin
@Priority(1000)
public class AdminAuthenticator implements ContainerRequestFilter {
    @EJB
    JWTHelper jwt;

    public AdminAuthenticator() {
    }

    public void filter(ContainerRequestContext requestContext) throws IOException {
        String authorizationHeader = requestContext.getHeaderString("Authorization");
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            String token = authorizationHeader.substring("Bearer ".length()).trim();
            Map<String, String> payload = this.jwt.validateToken(token);
            String valid = (String)payload.get("message");
           
            if (!valid.equals("valid")) {
                this.abortWithUnauthorized(requestContext, valid);
            }
        } else {
            throw new NotAuthorizedException("Authorization header must be provided", new Object[0]);
        }
    }

    private void abortWithUnauthorized(ContainerRequestContext requestContext, String errorMsg) {
        Map<String, String> resData = new HashMap();
        resData.put("message", errorMsg);
        requestContext.abortWith(Response.status(Status.UNAUTHORIZED).entity(resData).build());
    }
}

