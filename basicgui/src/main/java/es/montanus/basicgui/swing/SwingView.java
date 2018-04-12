package es.montanus.basicgui.swing;

import es.montanus.basicgui.Editor;
import es.montanus.basicgui.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingView extends JFrame implements View {
    private final JTextField textField;
    private final JLabel label;
    private final JButton button;
    private Editor editor;

    public SwingView() {
        getContentPane().setLayout(new FlowLayout());
        textField = new JTextField(16);
        getContentPane().add(textField);
        label = new JLabel();
        getContentPane().add(label);
        button = new JButton("Send");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editor.send();
            }
        });
        getContentPane().add(button);
        pack();
        setVisible(true);
    }

    public String getText() {
        return textField.getText();
    }

    public void setLabel(String text) {
        label.setText(text);
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }
}
