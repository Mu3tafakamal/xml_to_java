import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor


public class UltmDbtr {
    String adrTp;
    String name;
    String strTNmOrAdrLine1;
    String bldgNbOrAdrLine2;
    Integer pstCd;
    String twnNm;
    String ctry;

    @XmlElement
    public String getadrTp(){
        return adrTp;
    }

    @XmlElement
    public String getName(){
        return name;
    }
    @XmlElement
    public String getStrTNmOrAdrLine1(){
        return strTNmOrAdrLine1;
    }

    @XmlElement
    public String getBldgNbOrAdrLine2(){
        return bldgNbOrAdrLine2;
    }

    @XmlElement
    public Integer getPstCd(){
        return pstCd;
    }

    @XmlElement
    public String getTwnNm(){
        return twnNm;
    }

    @XmlElement
    public String getCtry(){
        return ctry;
    }


}
