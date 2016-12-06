
package org.me.healthcaresystem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.me.healthcaresystem package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SignIn_QNAME = new QName("http://healthcaresystem.me.org/", "signIn");
    private final static QName _CheckRepudiation_QNAME = new QName("http://healthcaresystem.me.org/", "checkRepudiation");
    private final static QName _GenUniqueIDResponse_QNAME = new QName("http://healthcaresystem.me.org/", "genUniqueIDResponse");
    private final static QName _ValidateCardResponse_QNAME = new QName("http://healthcaresystem.me.org/", "validateCardResponse");
    private final static QName _SignOut_QNAME = new QName("http://healthcaresystem.me.org/", "SignOut");
    private final static QName _GenUniqueID_QNAME = new QName("http://healthcaresystem.me.org/", "genUniqueID");
    private final static QName _SignOutResponse_QNAME = new QName("http://healthcaresystem.me.org/", "SignOutResponse");
    private final static QName _ValidateCard_QNAME = new QName("http://healthcaresystem.me.org/", "validateCard");
    private final static QName _SignInResponse_QNAME = new QName("http://healthcaresystem.me.org/", "signInResponse");
    private final static QName _CheckRepudiationResponse_QNAME = new QName("http://healthcaresystem.me.org/", "checkRepudiationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.healthcaresystem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignOut }
     * 
     */
    public SignOut createSignOut() {
        return new SignOut();
    }

    /**
     * Create an instance of {@link ValidateCardResponse }
     * 
     */
    public ValidateCardResponse createValidateCardResponse() {
        return new ValidateCardResponse();
    }

    /**
     * Create an instance of {@link GenUniqueIDResponse }
     * 
     */
    public GenUniqueIDResponse createGenUniqueIDResponse() {
        return new GenUniqueIDResponse();
    }

    /**
     * Create an instance of {@link CheckRepudiation }
     * 
     */
    public CheckRepudiation createCheckRepudiation() {
        return new CheckRepudiation();
    }

    /**
     * Create an instance of {@link SignIn }
     * 
     */
    public SignIn createSignIn() {
        return new SignIn();
    }

    /**
     * Create an instance of {@link CheckRepudiationResponse }
     * 
     */
    public CheckRepudiationResponse createCheckRepudiationResponse() {
        return new CheckRepudiationResponse();
    }

    /**
     * Create an instance of {@link SignInResponse }
     * 
     */
    public SignInResponse createSignInResponse() {
        return new SignInResponse();
    }

    /**
     * Create an instance of {@link ValidateCard }
     * 
     */
    public ValidateCard createValidateCard() {
        return new ValidateCard();
    }

    /**
     * Create an instance of {@link SignOutResponse }
     * 
     */
    public SignOutResponse createSignOutResponse() {
        return new SignOutResponse();
    }

    /**
     * Create an instance of {@link GenUniqueID }
     * 
     */
    public GenUniqueID createGenUniqueID() {
        return new GenUniqueID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignIn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "signIn")
    public JAXBElement<SignIn> createSignIn(SignIn value) {
        return new JAXBElement<SignIn>(_SignIn_QNAME, SignIn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRepudiation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "checkRepudiation")
    public JAXBElement<CheckRepudiation> createCheckRepudiation(CheckRepudiation value) {
        return new JAXBElement<CheckRepudiation>(_CheckRepudiation_QNAME, CheckRepudiation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenUniqueIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "genUniqueIDResponse")
    public JAXBElement<GenUniqueIDResponse> createGenUniqueIDResponse(GenUniqueIDResponse value) {
        return new JAXBElement<GenUniqueIDResponse>(_GenUniqueIDResponse_QNAME, GenUniqueIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "validateCardResponse")
    public JAXBElement<ValidateCardResponse> createValidateCardResponse(ValidateCardResponse value) {
        return new JAXBElement<ValidateCardResponse>(_ValidateCardResponse_QNAME, ValidateCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignOut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "SignOut")
    public JAXBElement<SignOut> createSignOut(SignOut value) {
        return new JAXBElement<SignOut>(_SignOut_QNAME, SignOut.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenUniqueID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "genUniqueID")
    public JAXBElement<GenUniqueID> createGenUniqueID(GenUniqueID value) {
        return new JAXBElement<GenUniqueID>(_GenUniqueID_QNAME, GenUniqueID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignOutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "SignOutResponse")
    public JAXBElement<SignOutResponse> createSignOutResponse(SignOutResponse value) {
        return new JAXBElement<SignOutResponse>(_SignOutResponse_QNAME, SignOutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "validateCard")
    public JAXBElement<ValidateCard> createValidateCard(ValidateCard value) {
        return new JAXBElement<ValidateCard>(_ValidateCard_QNAME, ValidateCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignInResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "signInResponse")
    public JAXBElement<SignInResponse> createSignInResponse(SignInResponse value) {
        return new JAXBElement<SignInResponse>(_SignInResponse_QNAME, SignInResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRepudiationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "checkRepudiationResponse")
    public JAXBElement<CheckRepudiationResponse> createCheckRepudiationResponse(CheckRepudiationResponse value) {
        return new JAXBElement<CheckRepudiationResponse>(_CheckRepudiationResponse_QNAME, CheckRepudiationResponse.class, null, value);
    }

}
