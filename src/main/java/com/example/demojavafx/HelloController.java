package com.example.demojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class HelloController {
    @FXML
    private PasswordField passwordField;

    private final PasswordGenerator passwordGenerator = new PasswordGeneratorImpl();

    @FXML
    protected void onGeneratePasswordButtonClick() {
        String generatedPassword = passwordGenerator.generate();
        passwordField.setText(generatedPassword);
    }

    @FXML
    protected void onCopyPasswordButtonClick() {
        final String copyText = passwordField.getText();
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(copyText);
        clipboard.setContent(content);
    }
}