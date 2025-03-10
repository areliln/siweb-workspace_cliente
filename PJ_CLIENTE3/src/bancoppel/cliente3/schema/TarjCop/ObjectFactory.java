//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.08 at 12:13:00 PM GMT-06:00 
//


package bancoppel.cliente3.schema.TarjCop;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import bancoppel.cliente3.schema.SpConsultaClienteseIndividual.CabeceraType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bancoppel.cliente3.schema.TarjCop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TarjCopResponse_QNAME = new QName("http://www.bancoppel.com/Cliente3/TarjCop/", "TarjCopResponse");
    private final static QName _TarjCop_QNAME = new QName("http://www.bancoppel.com/Cliente3/TarjCop/", "TarjCop");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bancoppel.cliente3.schema.TarjCop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TarjCopResponseType }
     * 
     */
    public TarjCopResponseType createTarjCopResponseType() {
        return new TarjCopResponseType();
    }

    /**
     * Create an instance of {@link TarjCopType }
     * 
     */
    public TarjCopType createTarjCopType() {
        return new TarjCopType();
    }

    /**
     * Create an instance of {@link TarjCopRegistroType }
     * 
     */
    public TarjCopRegistroType createTarjCopRegistroType() {
        return new TarjCopRegistroType();
    }
    
    /**
     * Create an instance of {@link CabeceraType }
     * 
     */
    public CabeceraType createCabeceraType() {
        return new CabeceraType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarjCopResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bancoppel.com/Cliente3/TarjCop/", name = "TarjCopResponse")
    public JAXBElement<TarjCopResponseType> createTarjCopResponse(TarjCopResponseType value) {
        return new JAXBElement<TarjCopResponseType>(_TarjCopResponse_QNAME, TarjCopResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarjCopType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bancoppel.com/Cliente3/TarjCop/", name = "TarjCop")
    public JAXBElement<TarjCopType> createTarjCop(TarjCopType value) {
        return new JAXBElement<TarjCopType>(_TarjCop_QNAME, TarjCopType.class, null, value);
    }

}
