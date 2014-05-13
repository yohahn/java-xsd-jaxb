package yoh.xsd.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;

/**
 * Created by yohahn.kim on 5/12/14.
 */
public class TestCaseDriver {

    public static void main(String[] args) {

        try {
            // Context is the name of package
            String context = "yoh.xsd.jaxb";

            // Create an instance of JAXB Context
            JAXBContext jContext = JAXBContext.newInstance(context);

            StreamSource source = new StreamSource("src/main/resources/testCase.xml");

            // Unmarshal the data from InputStream
            JAXBElement<TestCase> element = jContext.createUnmarshaller().unmarshal(source, TestCase.class);
            TestCase testCase = element.getValue();

            testCase.runTestSteps();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
