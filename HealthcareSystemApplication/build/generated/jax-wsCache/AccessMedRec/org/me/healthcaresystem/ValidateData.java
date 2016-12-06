
package org.me.healthcaresystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doctor_visit_summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lab_result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radiology_report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pathology_report" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allergy_information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prescribed_medicines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Problem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NurseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateData", propOrder = {
    "doctorVisitSummary",
    "labResult",
    "radiologyReport",
    "pathologyReport",
    "allergyInformation",
    "prescribedMedicines",
    "problem",
    "treatment",
    "nurseID",
    "doctorID"
})
public class ValidateData {

    @XmlElement(name = "doctor_visit_summary")
    protected String doctorVisitSummary;
    @XmlElement(name = "lab_result")
    protected String labResult;
    @XmlElement(name = "radiology_report")
    protected String radiologyReport;
    @XmlElement(name = "pathology_report")
    protected String pathologyReport;
    @XmlElement(name = "allergy_information")
    protected String allergyInformation;
    @XmlElement(name = "prescribed_medicines")
    protected String prescribedMedicines;
    @XmlElement(name = "Problem")
    protected String problem;
    @XmlElement(name = "Treatment")
    protected String treatment;
    @XmlElement(name = "NurseID")
    protected String nurseID;
    @XmlElement(name = "DoctorID")
    protected String doctorID;

    /**
     * Gets the value of the doctorVisitSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorVisitSummary() {
        return doctorVisitSummary;
    }

    /**
     * Sets the value of the doctorVisitSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorVisitSummary(String value) {
        this.doctorVisitSummary = value;
    }

    /**
     * Gets the value of the labResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabResult() {
        return labResult;
    }

    /**
     * Sets the value of the labResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabResult(String value) {
        this.labResult = value;
    }

    /**
     * Gets the value of the radiologyReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiologyReport() {
        return radiologyReport;
    }

    /**
     * Sets the value of the radiologyReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiologyReport(String value) {
        this.radiologyReport = value;
    }

    /**
     * Gets the value of the pathologyReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathologyReport() {
        return pathologyReport;
    }

    /**
     * Sets the value of the pathologyReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathologyReport(String value) {
        this.pathologyReport = value;
    }

    /**
     * Gets the value of the allergyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllergyInformation() {
        return allergyInformation;
    }

    /**
     * Sets the value of the allergyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllergyInformation(String value) {
        this.allergyInformation = value;
    }

    /**
     * Gets the value of the prescribedMedicines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrescribedMedicines() {
        return prescribedMedicines;
    }

    /**
     * Sets the value of the prescribedMedicines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrescribedMedicines(String value) {
        this.prescribedMedicines = value;
    }

    /**
     * Gets the value of the problem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblem() {
        return problem;
    }

    /**
     * Sets the value of the problem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblem(String value) {
        this.problem = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * Sets the value of the treatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatment(String value) {
        this.treatment = value;
    }

    /**
     * Gets the value of the nurseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNurseID() {
        return nurseID;
    }

    /**
     * Sets the value of the nurseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNurseID(String value) {
        this.nurseID = value;
    }

    /**
     * Gets the value of the doctorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     * Sets the value of the doctorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorID(String value) {
        this.doctorID = value;
    }

}
