
package com.aonaware.services.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LetterSolutionsMinResult" type="{http://services.aonaware.com/webservices/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "letterSolutionsMinResult"
})
@XmlRootElement(name = "LetterSolutionsMinResponse")
public class LetterSolutionsMinResponse {

    @XmlElement(name = "LetterSolutionsMinResult")
    protected ArrayOfString letterSolutionsMinResult;

    /**
     * Gets the value of the letterSolutionsMinResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getLetterSolutionsMinResult() {
        return letterSolutionsMinResult;
    }

    /**
     * Sets the value of the letterSolutionsMinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setLetterSolutionsMinResult(ArrayOfString value) {
        this.letterSolutionsMinResult = value;
    }

}
