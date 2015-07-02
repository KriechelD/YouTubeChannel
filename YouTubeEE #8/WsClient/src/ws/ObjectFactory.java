
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _MirrorText_QNAME = new QName("http://ws/", "mirrorText");
    private final static QName _MirrorTextResponse_QNAME = new QName("http://ws/", "mirrorTextResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MirrorTextResponse }
     * 
     */
    public MirrorTextResponse createMirrorTextResponse() {
        return new MirrorTextResponse();
    }

    /**
     * Create an instance of {@link MirrorText }
     * 
     */
    public MirrorText createMirrorText() {
        return new MirrorText();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MirrorText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mirrorText")
    public JAXBElement<MirrorText> createMirrorText(MirrorText value) {
        return new JAXBElement<MirrorText>(_MirrorText_QNAME, MirrorText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MirrorTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mirrorTextResponse")
    public JAXBElement<MirrorTextResponse> createMirrorTextResponse(MirrorTextResponse value) {
        return new JAXBElement<MirrorTextResponse>(_MirrorTextResponse_QNAME, MirrorTextResponse.class, null, value);
    }

}
