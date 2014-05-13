//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.13 at 12:51:56 PM EDT 
//


package yoh.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="headerFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payloadFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expectedOutput" type="{http://www.yohahnandcompany.com/testCase}expectedOutput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputMessage", propOrder = {
    "headerFile",
    "payloadFile",
    "expectedOutput"
})
public class InputMessage {

    @XmlElement(required = true)
    protected String headerFile;
    @XmlElement(required = true)
    protected String payloadFile;
    @XmlElement(required = true)
    protected ExpectedOutput expectedOutput;

    /**
     * Gets the value of the headerFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderFile() {
        return headerFile;
    }

    /**
     * Sets the value of the headerFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderFile(String value) {
        this.headerFile = value;
    }

    /**
     * Gets the value of the payloadFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayloadFile() {
        return payloadFile;
    }

    /**
     * Sets the value of the payloadFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayloadFile(String value) {
        this.payloadFile = value;
    }

    /**
     * Gets the value of the expectedOutput property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedOutput }
     *     
     */
    public ExpectedOutput getExpectedOutput() {
        return expectedOutput;
    }

    /**
     * Sets the value of the expectedOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedOutput }
     *     
     */
    public void setExpectedOutput(ExpectedOutput value) {
        this.expectedOutput = value;
    }

    public void sendAndExpect() {
        System.out.println("\t\tSending...");
        System.out.println("\t\t\theader: "+getHeaderFile());
        System.out.println("\t\t\tpayload: "+getPayloadFile());

        System.out.println("\t\tExpecting...");
        getExpectedOutput().expect();
    }
}
