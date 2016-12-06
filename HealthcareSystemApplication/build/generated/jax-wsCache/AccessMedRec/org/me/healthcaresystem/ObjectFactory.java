
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

    private final static QName _GetMedicalRecordResponse_QNAME = new QName("http://healthcaresystem.me.org/", "getMedicalRecordResponse");
    private final static QName _GetMedicalRecord_QNAME = new QName("http://healthcaresystem.me.org/", "getMedicalRecord");
    private final static QName _Submit_QNAME = new QName("http://healthcaresystem.me.org/", "submit");
    private final static QName _SubmitResponse_QNAME = new QName("http://healthcaresystem.me.org/", "submitResponse");
    private final static QName _Quotate_QNAME = new QName("http://healthcaresystem.me.org/", "quotate");
    private final static QName _Privilige1Response_QNAME = new QName("http://healthcaresystem.me.org/", "privilige1Response");
    private final static QName _ValidateDataResponse_QNAME = new QName("http://healthcaresystem.me.org/", "validateDataResponse");
    private final static QName _QuotateResponse_QNAME = new QName("http://healthcaresystem.me.org/", "quotateResponse");
    private final static QName _ValidateData_QNAME = new QName("http://healthcaresystem.me.org/", "validateData");
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
     * Create an instance of {@link SubmitResponse }
     * 
     */
    public SubmitResponse createSubmitResponse() {
        return new SubmitResponse();
    }

    /**
     * Create an instance of {@link Submit }
     * 
     */
    public Submit createSubmit() {
        return new Submit();
    }

    /**
     * Create an instance of {@link GetMedicalRecord }
     * 
     */
    public GetMedicalRecord createGetMedicalRecord() {
        return new GetMedicalRecord();
    }

    /**
     * Create an instance of {@link GetMedicalRecordResponse }
     * 
     */
    public GetMedicalRecordResponse createGetMedicalRecordResponse() {
        return new GetMedicalRecordResponse();
    }

    /**
     * Create an instance of {@link Privilige1 }
     * 
     */
    public Privilige1 createPrivilige1() {
        return new Privilige1();
    }

    /**
     * Create an instance of {@link ValidateData }
     * 
     */
    public ValidateData createValidateData() {
        return new ValidateData();
    }

    /**
     * Create an instance of {@link QuotateResponse }
     * 
     */
    public QuotateResponse createQuotateResponse() {
        return new QuotateResponse();
    }

    /**
     * Create an instance of {@link ValidateDataResponse }
     * 
     */
    public ValidateDataResponse createValidateDataResponse() {
        return new ValidateDataResponse();
    }

    /**
     * Create an instance of {@link Privilige1Response }
     * 
     */
    public Privilige1Response createPrivilige1Response() {
        return new Privilige1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalRecordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "getMedicalRecordResponse")
    public JAXBElement<GetMedicalRecordResponse> createGetMedicalRecordResponse(GetMedicalRecordResponse value) {
        return new JAXBElement<GetMedicalRecordResponse>(_GetMedicalRecordResponse_QNAME, GetMedicalRecordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMedicalRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "getMedicalRecord")
    public JAXBElement<GetMedicalRecord> createGetMedicalRecord(GetMedicalRecord value) {
        return new JAXBElement<GetMedicalRecord>(_GetMedicalRecord_QNAME, GetMedicalRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Submit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "submit")
    public JAXBElement<Submit> createSubmit(Submit value) {
        return new JAXBElement<Submit>(_Submit_QNAME, Submit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "submitResponse")
    public JAXBElement<SubmitResponse> createSubmitResponse(SubmitResponse value) {
        return new JAXBElement<SubmitResponse>(_SubmitResponse_QNAME, SubmitResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "validateDataResponse")
    public JAXBElement<ValidateDataResponse> createValidateDataResponse(ValidateDataResponse value) {
        return new JAXBElement<ValidateDataResponse>(_ValidateDataResponse_QNAME, ValidateDataResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://healthcaresystem.me.org/", name = "validateData")
    public JAXBElement<ValidateData> createValidateData(ValidateData value) {
        return new JAXBElement<ValidateData>(_ValidateData_QNAME, ValidateData.class, null, value);
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
