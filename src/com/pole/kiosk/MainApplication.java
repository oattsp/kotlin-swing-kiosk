package com.pole.kiosk;

import javax.swing.*;
import static com.pole.kiosk.ExtensionsKt.showErrorDialog;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            for (UIManager.LookAndFeelInfo info :
                    UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            showErrorDialog(ex.getMessage());
        }
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
