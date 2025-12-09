import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.net.HttpURLConnection;

public class QRCHbuilderTest {
    @Test
    public void should_create_xml() throws Exception {
        Cdtr cdtr = new Cdtr("S","Mobi","lasjf","lsjfaj",6760,"aslkfj","sljflajf");
        CdtrInf cdtrInf = new CdtrInf("CH345345353536", cdtr);
        CcAmt ccAmt = new CcAmt(123,"CHF");
        UltmDbtr ultmDbtr = new UltmDbtr("S","Mobi","lasjf","lsjfaj",6760,"aslkfj","sljflajf");
        AddInf addInf = new AddInf("jlsajf","lsajfla","lsjfl");
        RmtInf rmtInf = new RmtInf("lskjfal","dljflajf",addInf);

        QRCH qrch = new QRCH(cdtrInf,ccAmt,ultmDbtr,rmtInf);

        String s = QRCHbuilder.toXML(qrch);

        //File dataSourceFile = new File(getClass().getResource("QRCH.txt").toURI());
        File file = new File(getClass().getClassLoader().getResource("QRCH.txt").getFile());

        //File dataSourceFile = new File(getClass().getResource("F:\\Java\\java_to_xml\\src\\test\\resources\\QRCH.txt").toURI());
        String data = FileUtils.readFileToString(file, "UTF-8");
        Assert.assertEquals(data, s);
    }

}