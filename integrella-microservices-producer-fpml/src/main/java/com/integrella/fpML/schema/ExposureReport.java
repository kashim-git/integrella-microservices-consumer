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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining the content model for a message allowing a firm to send a report listing aggregate exposure to a variety of counterparty and market risk categories. Exposures will be reported from the perspective of the "on-behalf-of" party.
 * 
 * <p>Java class for ExposureReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposureReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NotificationMessage">
 *       &lt;sequence>
 *         &lt;element name="asOfDate" type="{http://www.fpml.org/FpML-5/master}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="asOfTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="dataSetName" type="{http://www.fpml.org/FpML-5/master}NormalizedString" minOccurs="0"/>
 *         &lt;element name="reportContents" type="{http://www.fpml.org/FpML-5/master}ReportContents" minOccurs="0"/>
 *         &lt;element name="quotationCharacteristics" type="{http://www.fpml.org/FpML-5/master}QuotationCharacteristics" minOccurs="0"/>
 *         &lt;element name="exposure" type="{http://www.fpml.org/FpML-5/master}ReportedExposure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/master}PartiesAndAccounts.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposureReport", propOrder = {
    "asOfDate",
    "asOfTime",
    "dataSetName",
    "reportContents",
    "quotationCharacteristics",
    "exposure",
    "party",
    "account"
})
public class ExposureReport
    extends NotificationMessage
{

    protected IdentifiedDate asOfDate;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar asOfTime;
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dataSetName;
    protected ReportContents reportContents;
    protected QuotationCharacteristics quotationCharacteristics;
    protected List<ReportedExposure> exposure;
    protected List<Party> party;
    protected List<Account> account;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAsOfDate(IdentifiedDate value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the asOfTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfTime() {
        return asOfTime;
    }

    /**
     * Sets the value of the asOfTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfTime(XMLGregorianCalendar value) {
        this.asOfTime = value;
    }

    /**
     * Gets the value of the dataSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetName() {
        return dataSetName;
    }

    /**
     * Sets the value of the dataSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetName(String value) {
        this.dataSetName = value;
    }

    /**
     * Gets the value of the reportContents property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContents }
     *     
     */
    public ReportContents getReportContents() {
        return reportContents;
    }

    /**
     * Sets the value of the reportContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContents }
     *     
     */
    public void setReportContents(ReportContents value) {
        this.reportContents = value;
    }

    /**
     * Gets the value of the quotationCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationCharacteristics }
     *     
     */
    public QuotationCharacteristics getQuotationCharacteristics() {
        return quotationCharacteristics;
    }

    /**
     * Sets the value of the quotationCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationCharacteristics }
     *     
     */
    public void setQuotationCharacteristics(QuotationCharacteristics value) {
        this.quotationCharacteristics = value;
    }

    /**
     * Gets the value of the exposure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedExposure }
     * 
     * 
     */
    public List<ReportedExposure> getExposure() {
        if (exposure == null) {
            exposure = new ArrayList<ReportedExposure>();
        }
        return this.exposure;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
