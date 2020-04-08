import java.beans.XMLDecoder;
import java.io.InputStream;

public class XmlDecodeUtil {

    public static Object handleXml(InputStream in) {
        XMLDecoder d = new XMLDecoder(in);
        try {
            Object result = d.readObject(); //Deserialization happen here
            return result;
        }
        finally {
            d.close();
        }
    }

    public static void main(String[] args) {

        InputStream in = XmlDecodeUtil.class.getResourceAsStream("src/testcases/obj1.xml");

        XmlDecodeUtil.handleXml(in);
    }

}