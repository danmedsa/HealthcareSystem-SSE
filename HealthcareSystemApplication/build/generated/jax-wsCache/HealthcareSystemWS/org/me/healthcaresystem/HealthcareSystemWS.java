
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
     * @param cRId
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkRepudiation", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.CheckRepudiation")
    @ResponseWrapper(localName = "checkRepudiationResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.CheckRepudiationResponse")
    @Action(input = "http://healthcaresystem.me.org/HealthcareSystemWS/checkRepudiationRequest", output = "http://healthcaresystem.me.org/HealthcareSystemWS/checkRepudiationResponse")
    public String checkRepudiation(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "c_r_id", targetNamespace = "")
        String cRId);

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
     * @param cvv
     * @param cardNumber
     * @param expDate
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateCard", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.ValidateCard")
    @ResponseWrapper(localName = "validateCardResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.ValidateCardResponse")
    @Action(input = "http://healthcaresystem.me.org/HealthcareSystemWS/validateCardRequest", output = "http://healthcaresystem.me.org/HealthcareSystemWS/validateCardResponse")
    public Boolean validateCard(
        @WebParam(name = "cardNumber", targetNamespace = "")
        String cardNumber,
        @WebParam(name = "expDate", targetNamespace = "")
        String expDate,
        @WebParam(name = "CVV", targetNamespace = "")
        String cvv);

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

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "genUniqueID", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.GenUniqueID")
    @ResponseWrapper(localName = "genUniqueIDResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.GenUniqueIDResponse")
    @Action(input = "http://healthcaresystem.me.org/HealthcareSystemWS/genUniqueIDRequest", output = "http://healthcaresystem.me.org/HealthcareSystemWS/genUniqueIDResponse")
    public String genUniqueID(
        @WebParam(name = "username", targetNamespace = "")
        String username);

}
