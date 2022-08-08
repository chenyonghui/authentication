//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.02 at 08:06:39 PM CEST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "steadyPoolSize",
    "resizeQuantity",
    "maxPoolSize",
    "poolIdleTimeoutInSeconds",
    "maxWaitTimeInMillis"
})
@XmlRootElement(name = "bean-pool")
public class BeanPool
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "steady-pool-size")
    protected String steadyPoolSize;
    @XmlElement(name = "resize-quantity")
    protected String resizeQuantity;
    @XmlElement(name = "max-pool-size")
    protected String maxPoolSize;
    @XmlElement(name = "pool-idle-timeout-in-seconds")
    protected String poolIdleTimeoutInSeconds;
    @XmlElement(name = "max-wait-time-in-millis")
    protected String maxWaitTimeInMillis;

    /**
     * Gets the value of the steadyPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSteadyPoolSize() {
        return steadyPoolSize;
    }

    /**
     * Sets the value of the steadyPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSteadyPoolSize(String value) {
        this.steadyPoolSize = value;
    }

    /**
     * Gets the value of the resizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResizeQuantity() {
        return resizeQuantity;
    }

    /**
     * Sets the value of the resizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResizeQuantity(String value) {
        this.resizeQuantity = value;
    }

    /**
     * Gets the value of the maxPoolSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * Sets the value of the maxPoolSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPoolSize(String value) {
        this.maxPoolSize = value;
    }

    /**
     * Gets the value of the poolIdleTimeoutInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolIdleTimeoutInSeconds() {
        return poolIdleTimeoutInSeconds;
    }

    /**
     * Sets the value of the poolIdleTimeoutInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolIdleTimeoutInSeconds(String value) {
        this.poolIdleTimeoutInSeconds = value;
    }

    /**
     * Gets the value of the maxWaitTimeInMillis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWaitTimeInMillis() {
        return maxWaitTimeInMillis;
    }

    /**
     * Sets the value of the maxWaitTimeInMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWaitTimeInMillis(String value) {
        this.maxWaitTimeInMillis = value;
    }

}