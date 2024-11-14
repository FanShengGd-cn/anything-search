package com.fansheng.anythingsearch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * author fansheng
 * date 2024-11-15 01:01
 */
public class KeyListenerExample extends Frame implements KeyListener {

    private TextField textField;
    private Label displayLabel;

    // Constructor
    public KeyListenerExample() {
        // Set frame properties
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        setTitle("Typed Text Display");
        setSize((int)screenSize.getWidth()/4, (int)screenSize.getHeight()/15);
        setLayout(new FlowLayout());

        // Create and add a TextField for text input
        textField = new TextField(20);
        textField.addKeyListener(this);
        add(textField);

        // Create and add a Label to display typed text
        displayLabel = new Label("Typed Text: ");
        add(displayLabel);

        // Ensure the frame can receive key events
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        // Make the frame visible
        setVisible(true);
    }

    // Implement the keyPressed method
    @Override
    public void keyPressed(KeyEvent e) {
        // You can add custom logic here if needed
    }

    // Implement the keyReleased method
    @Override
    public void keyReleased(KeyEvent e) {
        // You can add custom logic here if needed
    }

    // Implement the keyTyped method
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        displayLabel.setText("Typed Text: " + textField.getText() + keyChar);
        System.out.println(e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}