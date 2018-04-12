package es.montanus.basicgui;

public class Editor {
    private final View view;

    public Editor(View view) {
        this.view = view;
        this.view.setEditor(this);
    }

    public void send() {
        view.setLabel(view.getText());
    }
}
