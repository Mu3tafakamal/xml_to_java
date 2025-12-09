import com.sun.xml.bind.v2.schemagen.xmlschema.Import;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// @XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor





public class CdtrInf {
    String iBAN;
    Cdtr cdtr;


    @XmlElement
    public String getIBAN(){
        return iBAN;
    }
    @XmlElement
    public Cdtr getCdtr(){
        return cdtr ;
    }
}