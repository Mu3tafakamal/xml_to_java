import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor


public class AddInf {
    String ustrd;
    String trailer;
    String strdBkgInf;

    @XmlElement
    public String getUstrd(){
        return ustrd;
    }
    @XmlElement
    public String getTrailer(){
        return trailer;
    }
    @XmlElement
    public String getStrdBkgInf(){
        return strdBkgInf;
    }
}


