
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

    private final static QName _ValidateNewAccResponse_QNAME = new QName("http://healthcaresystem.me.org/", "validateNewAccResponse");
    private final static QName _Quotate_QNAME = new QName("http://healthcaresystem.me.org/", "quotate");
    private final static QName _Privilige1Response_QNAME = new QName("http://healthcaresystem.me.org/", "privilige1Response");
    private final static QName _SubmitNewAccResponse_QNAME = new QName("http://healthcaresystem.me.org/", "submitNewAccResponse");
    private final static QName _QuotateResponse_QNAME = new QName("http://healthcaresystem.me.org/", "quotateResponse");
    private final static QName _ValidateNewAcc_QNAME = new QName("http://healthcaresystem.me.org/", "validateNewAcc");
    private final static QName _AddingResponse_QNAME = new QName("http://healthcaresystem.me.org/", "AddingResponse");
    private final static QName _SubmitNewAcc_QNAME = new QName("http://healthcaresystem.me.org/", "submitNewAcc");
    private final static QName _Adding_QNAME = new QName("http://healthcaresystem.me.org/", "Adding");
    private final static QName _Privilige1_QNAME = new QName("http://healthcaresystem.me.org/", "privilige1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.me.healthcaresystem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Quotate }
     * 
     */
    public Quotate createQuotate() {
        return new Quotate();
    }

    /**
     * Create an instance of {@link ValidateNewAccResponse }
     * 
     */
    public ValidateNewAccResponse createValidateNewAccResponse() {
        return new ValidateNewAccResponse();
    }

    /**
     * Create an instance of {@link Privilige1 }
     * 
     */
    public Privilige1 createPrivilige1() {
        return new Privilige1();
    }

    /**
     * Create an instance of {@link Adding }
     * 
     */
    public Adding createAdding() {
        return new Adding();
    }

    /**
     * Create an instance of {@link AddingResponse }
     * 
     */
    public AddingResponse createAddingResponse() {
        return new AddingResponse();
    }

    /**
     * Create an instance of {@link SubmitNewAcc }
     * 
     */
    public SubmitNewAcc createSubmitNewAcc() {
        return new SubmitNewAcc();
    }

    /**
     * Create an instance of {@link QuotateResponse }
     * 
     */
    public QuotateResponse createQuotateResponse() {
        return new QuotateResponse();
    }

    /**
     * Create an instance of {@link ValidateNewAcc }
     * 
     */
    public ValidateNewAcc createValidateNewAcc() {
        return new ValidateNewAcc();
    }

    /**
     * Create an instance of {@link SubmitNewAccResponse }
     * 
     */
    public SubmitNewAccResponse createSubmitNewAccResponse() {
        return new SubmitNewAccResponse();
    }

    /**
     * Create an instance of {@link Privilige1Response }
     * 
     */
    public Privilige1Response createPrivilige1Response() {
        return new Privilige1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateNewAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "validateNewAccResponse")
    public JAXBElement<ValidateNewAccResponse> createValidateNewAccResponse(ValidateNewAccResponse value) {
        return new JAXBElement<ValidateNewAccResponse>(_ValidateNewAccResponse_QNAME, ValidateNewAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quotate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "quotate")
    public JAXBElement<Quotate> createQuotate(Quotate value) {
        return new JAXBElement<Quotate>(_Quotate_QNAME, Quotate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Privilige1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "privilige1Response")
    public JAXBElement<Privilige1Response> createPrivilige1Response(Privilige1Response value) {
        return new JAXBElement<Privilige1Response>(_Privilige1Response_QNAME, Privilige1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitNewAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "submitNewAccResponse")
    public JAXBElement<SubmitNewAccResponse> createSubmitNewAccResponse(SubmitNewAccResponse value) {
        return new JAXBElement<SubmitNewAccResponse>(_SubmitNewAccResponse_QNAME, SubmitNewAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "quotateResponse")
    public JAXBElement<QuotateResponse> createQuotateResponse(QuotateResponse value) {
        return new JAXBElement<QuotateResponse>(_QuotateResponse_QNAME, QuotateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateNewAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "validateNewAcc")
    public JAXBElement<ValidateNewAcc> createValidateNewAcc(ValidateNewAcc value) {
        return new JAXBElement<ValidateNewAcc>(_ValidateNewAcc_QNAME, ValidateNewAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "AddingResponse")
    public JAXBElement<AddingResponse> createAddingResponse(AddingResponse value) {
        return new JAXBElement<AddingResponse>(_AddingResponse_QNAME, AddingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitNewAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "submitNewAcc")
    public JAXBElement<SubmitNewAcc> createSubmitNewAcc(SubmitNewAcc value) {
        return new JAXBElement<SubmitNewAcc>(_SubmitNewAcc_QNAME, SubmitNewAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "Adding")
    public JAXBElement<Adding> createAdding(Adding value) {
        return new JAXBElement<Adding>(_Adding_QNAME, Adding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Privilige1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "privilige1")
    public JAXBElement<Privilige1> createPrivilige1(Privilige1 value) {
        return new JAXBElement<Privilige1>(_Privilige1_QNAME, Privilige1 .class, null, value);
    }

}
