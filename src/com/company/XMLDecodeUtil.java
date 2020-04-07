package com.company;

import java.beans.XMLDecoder;
import java.io.InputStream;

public class XMLDecodeUtil {
    public static Object handleXml(InputStream in) {
        XMLDecoder d = new XMLDecoder(in);
        try {
            return d.readObject(); //Deserialization happen here
        }
        finally {
            d.close();
        }
    }
}
