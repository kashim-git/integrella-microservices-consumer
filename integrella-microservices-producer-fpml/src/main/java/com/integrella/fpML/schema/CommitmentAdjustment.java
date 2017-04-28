//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An event defining a future change in facility commitment.
 * 
 * <p>Java class for CommitmentAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentAdjustment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}FacilityEvent">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="refusalAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="pik" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="facilityCommitment" type="{http://www.fpml.org/FpML-5/master}FacilityCommitment" minOccurs="0"/>
 *           &lt;element name="adjustment" type="{http://www.fpml.org/FpML-5/master}Adjustment" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="commitmentSchedule" type="{http://www.fpml.org/FpML-5/master}CommitmentSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentAdjustment", propOrder = {
    "refusalAllowed",
    "scheduled",
    "pik",
    "facilityCommitment",
    "adjustment",
    "commitmentSchedule"
})
public class CommitmentAdjustment
    extends FacilityEvent
{

    protected Boolean refusalAllowed;
    protected Boolean scheduled;
    protected Boolean pik;
    protected FacilityCommitment facilityCommitment;
    protected Adjustment adjustment;
    protected CommitmentSchedule commitmentSchedule;

    /**
     * Gets the value of the refusalAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefusalAllowed() {
        return refusalAllowed;
    }

    /**
     * Sets the value of the refusalAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefusalAllowed(Boolean value) {
        this.refusalAllowed = value;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduled(Boolean value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the pik property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPik() {
        return pik;
    }

    /**
     * Sets the value of the pik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPik(Boolean value) {
        this.pik = value;
    }

    /**
     * Gets the value of the facilityCommitment property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityCommitment }
     *     
     */
    public FacilityCommitment getFacilityCommitment() {
        return facilityCommitment;
    }

    /**
     * Sets the value of the facilityCommitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityCommitment }
     *     
     */
    public void setFacilityCommitment(FacilityCommitment value) {
        this.facilityCommitment = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment }
     *     
     */
    public Adjustment getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment }
     *     
     */
    public void setAdjustment(Adjustment value) {
        this.adjustment = value;
    }

    /**
     * Gets the value of the commitmentSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentSchedule }
     *     
     */
    public CommitmentSchedule getCommitmentSchedule() {
        return commitmentSchedule;
    }

    /**
     * Sets the value of the commitmentSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentSchedule }
     *     
     */
    public void setCommitmentSchedule(CommitmentSchedule value) {
        this.commitmentSchedule = value;
    }

}
