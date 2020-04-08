
import com.h3xstream.findbugs.test.BaseDetectorTest;
import com.h3xstream.findbugs.test.EasyBugReporter;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class XmlDecoderDetectorTest extends BaseDetectorTest {


    @Test
    public void detectXmlDecoder() throws Exception {
        //Locate test code
        String[] files = {
                getClassFilePath("testcode/xmldecoder/XmlDecodeUtil")
        };

        //Run the analysis
        EasyBugReporter reporter = spy(new SecurityReporter());
        analyze(files, reporter);

        verify(reporter).doReportBug(
                bugDefinition()
                        .bugType("XML_DECODER")
                        .inClass("XmlDecodeUtil").inMethod("handleXml").atLine(9)
                        .build()
        );
    }
}