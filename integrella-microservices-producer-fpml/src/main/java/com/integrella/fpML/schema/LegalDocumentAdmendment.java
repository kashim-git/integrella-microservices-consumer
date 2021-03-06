//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A legal document admendment, which can be specified by either referencing a legal document that is described elsewhere in the XML file, or by specifying the identity of that amended document.
 * 
 * <p>Java class for LegalDocumentAdmendment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalDocumentAdmendment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="partyDocumentIdentifier" type="{http://www.fpml.org/FpML-5/master}PartyDocumentIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalDocumentAdmendment", propOrder = {
    "agreementDate",
    "partyDocumentIdentifier"
})
public class LegalDocumentAdmendment {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    protected List<PartyDocumentIdentifier> partyDocumentIdentifier;

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the partyDocumentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyDocumentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyDocumentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyDocumentIdentifier }
     * 
     * 
     */
    public List<PartyDocumentIdentifier> getPartyDocumentIdentifier() {
        if (partyDocumentIdentifier == null) {
            partyDocumentIdentifier = new ArrayList<PartyDocumentIdentifier>();
        }
        return this.partyDocumentIdentifier;
    }

}
