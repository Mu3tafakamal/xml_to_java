import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CcAmt {
    double amt;
    String ccy;

    @XmlElement
    public double getAmt(){
        return amt;
    }
    @XmlElement
    public String getCcy(){
        return ccy;
    }
}
