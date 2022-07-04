//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.02 at 09:53:01 PM CEST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.web;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "response-protection")
public class ResponseProtection
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "auth-source")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authSource;
    @XmlAttribute(name = "auth-recipient")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String authRecipient;

    /**
     * Gets the value of the authSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthSource() {
        return authSource;
    }

    /**
     * Sets the value of the authSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthSource(String value) {
        this.authSource = value;
    }

    /**
     * Gets the value of the authRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthRecipient() {
        return authRecipient;
    }

    /**
     * Sets the value of the authRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthRecipient(String value) {
        this.authRecipient = value;
    }

}
