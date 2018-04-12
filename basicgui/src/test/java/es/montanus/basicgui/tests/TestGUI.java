package es.montanus.basicgui.tests;

import es.montanus.basicgui.Editor;
import es.montanus.basicgui.View;
import junit.framework.TestCase;

public class TestGUI extends TestCase {
    public void testSend() {
        MockView view = new MockView("Text");
        Editor editor = new Editor(view);
        editor.send();
        view.assertGetTextWasCalledOnce();
        view.assertSetLabelWasCalledOnce();
    }

    private class MockView implements View {
        private final String text;
        private int getTextCallCount = 0;
        private int setLabelCallCount = 0;

        private MockView(String text) {
            this.text = text;
        }

        public String getText() {
            getTextCallCount++;
            return text;
        }

        public void setLabel(String text) {
            setLabelCallCount++;
            assertEquals(this.text, text);
        }

        public void setEditor(Editor editor) {

        }

        private void assertGetTextWasCalledOnce() {
            assertEquals(1, getTextCallCount);
        }

        private void assertSetLabelWasCalledOnce() {
            assertEquals(1, setLabelCallCount);
        }
    }
}
