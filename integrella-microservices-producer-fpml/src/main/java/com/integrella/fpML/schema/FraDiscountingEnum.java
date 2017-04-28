//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.26 at 04:37:38 PM BST 
//


package com.integrella.fpML.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraDiscountingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FraDiscountingEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ISDA"/>
 *     &lt;enumeration value="AFMA"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ISDAYield"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FraDiscountingEnum")
@XmlEnum
public enum FraDiscountingEnum {


    /**
     * "FRA Discounting" per the ISDA Definitions will apply.
     * 
     */
    ISDA("ISDA"),

    /**
     * FRA discounting per the Australian Financial Markets Association (AFMA) OTC Financial Product Conventions will apply. Note: Should not be used for a FRA trade documented under a legal framework where the 2006 ISDA Definitions have been incorporated.
     * 
     */
    AFMA("AFMA"),

    /**
     * No discounting will apply.
     * 
     */
    NONE("NONE"),

    /**
     * Per ISDA 2006 Definitions, Section 8.4. Discounting, paragraph (e)
     * 
     */
    @XmlEnumValue("ISDAYield")
    ISDA_YIELD("ISDAYield");
    private final String value;

    FraDiscountingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FraDiscountingEnum fromValue(String v) {
        for (FraDiscountingEnum c: FraDiscountingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
