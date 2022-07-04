//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.07.02 at 08:06:38 PM CEST 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    "web",
    "passByReference",
    "uniqueId",
    "securityRoleMapping",
    "realm",
    "ejbRef",
    "resourceRef",
    "resourceEnvRef",
    "serviceRef",
    "messageDestinationRef",
    "messageDestination",
    "archiveName",
    "compatibility"
})
@XmlRootElement(name = "sun-application")
public class SunApplication
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<Web> web;
    @XmlElement(name = "pass-by-reference")
    protected String passByReference;
    @XmlElement(name = "unique-id")
    protected String uniqueId;
    @XmlElement(name = "security-role-mapping")
    protected List<SecurityRoleMapping> securityRoleMapping;
    protected String realm;
    @XmlElement(name = "ejb-ref")
    protected List<EjbRef> ejbRef;
    @XmlElement(name = "resource-ref")
    protected List<ResourceRef> resourceRef;
    @XmlElement(name = "resource-env-ref")
    protected List<ResourceEnvRef> resourceEnvRef;
    @XmlElement(name = "service-ref")
    protected List<ServiceRef> serviceRef;
    @XmlElement(name = "message-destination-ref")
    protected List<MessageDestinationRef> messageDestinationRef;
    @XmlElement(name = "message-destination")
    protected List<MessageDestination> messageDestination;
    @XmlElement(name = "archive-name")
    protected String archiveName;
    protected String compatibility;

    /**
     * Gets the value of the web property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the web property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWeb().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Web }
     * 
     * 
     */
    public List<Web> getWeb() {
        if (web == null) {
            web = new ArrayList<Web>();
        }
        return this.web;
    }

    /**
     * Gets the value of the passByReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassByReference() {
        return passByReference;
    }

    /**
     * Sets the value of the passByReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassByReference(String value) {
        this.passByReference = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the securityRoleMapping property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the securityRoleMapping property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSecurityRoleMapping().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityRoleMapping }
     * 
     * 
     */
    public List<SecurityRoleMapping> getSecurityRoleMapping() {
        if (securityRoleMapping == null) {
            securityRoleMapping = new ArrayList<SecurityRoleMapping>();
        }
        return this.securityRoleMapping;
    }

    /**
     * Gets the value of the realm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealm(String value) {
        this.realm = value;
    }

    /**
     * Gets the value of the ejbRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ejbRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEjbRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EjbRef }
     * 
     * 
     */
    public List<EjbRef> getEjbRef() {
        if (ejbRef == null) {
            ejbRef = new ArrayList<EjbRef>();
        }
        return this.ejbRef;
    }

    /**
     * Gets the value of the resourceRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resourceRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getResourceRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceRef }
     * 
     * 
     */
    public List<ResourceRef> getResourceRef() {
        if (resourceRef == null) {
            resourceRef = new ArrayList<ResourceRef>();
        }
        return this.resourceRef;
    }

    /**
     * Gets the value of the resourceEnvRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resourceEnvRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getResourceEnvRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceEnvRef }
     * 
     * 
     */
    public List<ResourceEnvRef> getResourceEnvRef() {
        if (resourceEnvRef == null) {
            resourceEnvRef = new ArrayList<ResourceEnvRef>();
        }
        return this.resourceEnvRef;
    }

    /**
     * Gets the value of the serviceRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serviceRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getServiceRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRef }
     * 
     * 
     */
    public List<ServiceRef> getServiceRef() {
        if (serviceRef == null) {
            serviceRef = new ArrayList<ServiceRef>();
        }
        return this.serviceRef;
    }

    /**
     * Gets the value of the messageDestinationRef property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the messageDestinationRef property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMessageDestinationRef().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDestinationRef }
     * 
     * 
     */
    public List<MessageDestinationRef> getMessageDestinationRef() {
        if (messageDestinationRef == null) {
            messageDestinationRef = new ArrayList<MessageDestinationRef>();
        }
        return this.messageDestinationRef;
    }

    /**
     * Gets the value of the messageDestination property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the messageDestination property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMessageDestination().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDestination }
     * 
     * 
     */
    public List<MessageDestination> getMessageDestination() {
        if (messageDestination == null) {
            messageDestination = new ArrayList<MessageDestination>();
        }
        return this.messageDestination;
    }

    /**
     * Gets the value of the archiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveName() {
        return archiveName;
    }

    /**
     * Sets the value of the archiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveName(String value) {
        this.archiveName = value;
    }

    /**
     * Gets the value of the compatibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibility() {
        return compatibility;
    }

    /**
     * Sets the value of the compatibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibility(String value) {
        this.compatibility = value;
    }

}
