package es.montanus.calcserver.tests;

import es.montanus.calcserver.Calculator;
import es.montanus.calcserver.XmlCalculator;
import junit.framework.TestCase;
import org.easymock.EasyMock;
import org.easymock.MockControl;

public class XmlCalculatorTest extends TestCase {
    public void testSimpleAdd() {
        final MockControl control = EasyMock.controlFor(Calculator.class);
        Calculator mockCalculator = (Calculator)control.getMock();
        mockCalculator.calculate(1, 2, "/add");
        control.setReturnValue(3);
        control.activate();

        final XmlCalculator xmlCalculator = new XmlCalculator(mockCalculator);

        final String xmlInput =
                "<calculate operation=\"/add\">" +
                "  <argument>1</argument>" +
                "  <argument>2</argument>" +
                "</calculate>";
        assertEquals(3, xmlCalculator.calculate(xmlInput));
        control.verify();
    }
}
