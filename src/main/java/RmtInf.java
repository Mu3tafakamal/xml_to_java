import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor


public class RmtInf {
    String tp;
    String ref;
    AddInf addInf;

    @XmlElement
    public String getTp(){
        return tp;
    }
    @XmlElement
    public String getRef(){
        return ref;
    }
    @XmlElement
    public AddInf getAddInf(){
        return addInf;
    }
}
