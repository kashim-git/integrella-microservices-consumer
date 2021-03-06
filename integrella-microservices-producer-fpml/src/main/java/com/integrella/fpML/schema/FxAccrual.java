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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Accrual calculation process.
 * 
 * <p>Java class for FxAccrual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observable" type="{http://www.fpml.org/FpML-5/master}FxRateObservable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accrualRegion" type="{http://www.fpml.org/FpML-5/master}FxAccrualRegion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fixingSchedule" type="{http://www.fpml.org/FpML-5/master}FxFixingSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrual", propOrder = {
    "observable",
    "accrualRegion",
    "fixingSchedule"
})
public class FxAccrual {

    protected List<FxRateObservable> observable;
    protected List<FxAccrualRegion> accrualRegion;
    protected FxFixingSchedule fixingSchedule;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the observable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxRateObservable }
     * 
     * 
     */
    public List<FxRateObservable> getObservable() {
        if (observable == null) {
            observable = new ArrayList<FxRateObservable>();
        }
        return this.observable;
    }

    /**
     * Gets the value of the accrualRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accrualRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccrualRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxAccrualRegion }
     * 
     * 
     */
    public List<FxAccrualRegion> getAccrualRegion() {
        if (accrualRegion == null) {
            accrualRegion = new ArrayList<FxAccrualRegion>();
        }
        return this.accrualRegion;
    }

    /**
     * Gets the value of the fixingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link FxFixingSchedule }
     *     
     */
    public FxFixingSchedule getFixingSchedule() {
        return fixingSchedule;
    }

    /**
     * Sets the value of the fixingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxFixingSchedule }
     *     
     */
    public void setFixingSchedule(FxFixingSchedule value) {
        this.fixingSchedule = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
