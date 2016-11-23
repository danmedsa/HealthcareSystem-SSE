
package org.me.healthcaresystem;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HealthcareSystemWS", targetNamespace = "http://healthcaresystem.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HealthcareSystemWS {


    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "SignOut")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SignOut", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.SignOut")
    @ResponseWrapper(localName = "SignOutResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.SignOutResponse")
    @Action(input = "http://healthcaresystem.me.org/HealthcareSystemWS/SignOutRequest", output = "http://healthcaresystem.me.org/HealthcareSystemWS/SignOutResponse")
    public Boolean signOut();

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "signIn", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.SignIn")
    @ResponseWrapper(localName = "signInResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.SignInResponse")
    @Action(input = "http://healthcaresystem.me.org/HealthcareSystemWS/signInRequest", output = "http://healthcaresystem.me.org/HealthcareSystemWS/signInResponse")
    public String signIn(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}