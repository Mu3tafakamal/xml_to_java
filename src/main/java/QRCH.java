import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement (name="QRCH")
public class QRCH {
    private CdtrInf cdtrinf;
    private CcAmt ccAmt;
    private UltmDbtr ultmDbtr;
    private RmtInf rmtInf;

    @XmlElement
    public CdtrInf getCdtrinf() {
        return cdtrinf;
    }
    @XmlElement
    public CcAmt getCcAmt() {
        return ccAmt;
    }
    @XmlElement
    public UltmDbtr getUltmDbtr(){
        return ultmDbtr;
    }
    @XmlElement
    public RmtInf getRmtInf(){
        return rmtInf;
    }
}