package org.me.healthcaresystem;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author DanielMedina
 */
@WebService(serviceName = "HealthcareSystemWS")
@Stateless()
public class HealthcareSystemWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signIn")
    public String signIn(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        //TODO Sign in logic
        return "Implement Log in Logic";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SignOut")
    public Boolean SignOut() {
        //TODO write your implementation code here:
        return null;
    }
}
