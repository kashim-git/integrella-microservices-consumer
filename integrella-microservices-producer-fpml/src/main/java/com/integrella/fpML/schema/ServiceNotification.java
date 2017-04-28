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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type defining the content model for a message that allows a service to send a notification message to a user of the service.
 * 
 * <p>Java class for ServiceNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceNotification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/master}NotificationMessage">
 *       &lt;sequence>
 *         &lt;element name="serviceName" type="{http://www.fpml.org/FpML-5/master}NormalizedString" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="status" type="{http://www.fpml.org/FpML-5/master}ServiceStatus"/>
 *           &lt;element name="processingStatus" type="{http://www.fpml.org/FpML-5/master}ServiceProcessingStatus"/>
 *           &lt;element name="advisory" type="{http://www.fpml.org/FpML-5/master}ServiceAdvisory"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceNotification", propOrder = {
    "serviceName",
    "status",
    "processingStatus",
    "advisory"
})
public class ServiceNotification
    extends NotificationMessage
{

    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String serviceName;
    protected ServiceStatus status;
    protected ServiceProcessingStatus processingStatus;
    protected ServiceAdvisory advisory;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatus }
     *     
     */
    public ServiceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatus }
     *     
     */
    public void setStatus(ServiceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the processingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProcessingStatus }
     *     
     */
    public ServiceProcessingStatus getProcessingStatus() {
        return processingStatus;
    }

    /**
     * Sets the value of the processingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProcessingStatus }
     *     
     */
    public void setProcessingStatus(ServiceProcessingStatus value) {
        this.processingStatus = value;
    }

    /**
     * Gets the value of the advisory property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAdvisory }
     *     
     */
    public ServiceAdvisory getAdvisory() {
        return advisory;
    }

    /**
     * Sets the value of the advisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAdvisory }
     *     
     */
    public void setAdvisory(ServiceAdvisory value) {
        this.advisory = value;
    }

}