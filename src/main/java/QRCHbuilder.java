import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;

public class QRCHbuilder {

    public static String toXML(QRCH qrch) throws Exception {

        JAXBContext context = JAXBContext.newInstance(QRCH.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

      //  QName qName = new QName("QRCH");

     //   JAXBElement jb = new JAXBElement(qName, qrch.getClass(), qrch);

        StringWriter xmlSW = new StringWriter();
        mar.marshal(qrch, xmlSW);


        return  xmlSW.toString();
    }
}

