package com.pole.kiosk;

import com.pole.kiosk.helper.DatabaseHelper;
import com.pole.kiosk.model.SectionModel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class SettingFrame extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public SettingFrame() {
        setTitle("Setting Frame");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(450, 641);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "\u0E1C\u0E39\u0E49\u0E1B\u0E48\u0E27\u0E22\u0E43\u0E2B\u0E21\u0E48", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBounds(6, 6, 438, 126);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("ห้องตรวจ 1 เช้า");
        lblNewLabel.setBounds(26, 24, 85, 16);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("ห้องตรวจ 2 เช้า");
        lblNewLabel_1.setBounds(26, 57, 85, 16);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("ห้องตรวจ 3 เช้า");
        lblNewLabel_2.setBounds(26, 90, 85, 16);
        panel.add(lblNewLabel_2);


        JSpinner page1_button1 = new JSpinner();
        page1_button1.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page1_button1.setBounds(117, 19, 52, 26);
        panel.add(page1_button1);

        JSpinner page1_button2 = new JSpinner();
        page1_button2.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page1_button2.setBounds(117, 52, 52, 26);
        panel.add(page1_button2);

        JSpinner page1_button3 = new JSpinner();
        page1_button3.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page1_button3.setBounds(117, 85, 52, 26);
        panel.add(page1_button3);

        JLabel lblNewLabel_3 = new JLabel("ห้องตรวจ 1 บ่าย");
        lblNewLabel_3.setBounds(267, 24, 89, 16);
        panel.add(lblNewLabel_3);

        JSpinner page1_button4 = new JSpinner();
        page1_button4.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page1_button4.setBounds(362, 19, 52, 26);
        panel.add(page1_button4);

        JLabel lblNewLabel_1_1 = new JLabel("ห้องตรวจ 2 บ่าย");
        lblNewLabel_1_1.setBounds(267, 57, 89, 16);
        panel.add(lblNewLabel_1_1);

        JSpinner page1_button5 = new JSpinner();
        page1_button5.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page1_button5.setBounds(362, 52, 52, 26);
        panel.add(page1_button5);

        JLabel lblNewLabel_2_1 = new JLabel("ห้องตรวจ 3 บ่าย");
        lblNewLabel_2_1.setBounds(267, 90, 89, 16);
        panel.add(lblNewLabel_2_1);

        JSpinner page1_button6 = new JSpinner();
        page1_button6.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page1_button6.setBounds(362, 85, 52, 26);
        panel.add(page1_button6);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "\u0E1C\u0E39\u0E49\u0E1B\u0E48\u0E27\u0E22\u0E40\u0E01\u0E48\u0E32", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_1.setBounds(6, 145, 438, 192);
        contentPane.add(panel_1);

        JLabel lblNewLabel_4 = new JLabel("ห้องตรวจ 1 เช้า");
        lblNewLabel_4.setBounds(26, 24, 85, 16);
        panel_1.add(lblNewLabel_4);

        JLabel lblNewLabel_1_2 = new JLabel("ห้องตรวจ 2 เช้า");
        lblNewLabel_1_2.setBounds(26, 57, 85, 16);
        panel_1.add(lblNewLabel_1_2);

        JLabel lblNewLabel_2_2 = new JLabel("ห้องตรวจ 3 เช้า");
        lblNewLabel_2_2.setBounds(26, 90, 85, 16);
        panel_1.add(lblNewLabel_2_2);

        JSpinner page2_button1 = new JSpinner();
        page2_button1.setBounds(117, 19, 52, 26);
        panel_1.add(page2_button1);

        JSpinner page2_button2 = new JSpinner();
        page2_button2.setBounds(117, 52, 52, 26);
        panel_1.add(page2_button2);

        JSpinner page2_button3 = new JSpinner();
        page2_button3.setBounds(117, 85, 52, 26);
        panel_1.add(page2_button3);

        JLabel lblNewLabel_3_1 = new JLabel("ห้องตรวจ 1 บ่าย");
        lblNewLabel_3_1.setBounds(267, 24, 89, 16);
        panel_1.add(lblNewLabel_3_1);

        JSpinner page2_button5 = new JSpinner();
        page2_button5.setBounds(362, 19, 52, 26);
        panel_1.add(page2_button5);

        JLabel lblNewLabel_1_1_1 = new JLabel("ห้องตรวจ 2 บ่าย");
        lblNewLabel_1_1_1.setBounds(267, 57, 89, 16);
        panel_1.add(lblNewLabel_1_1_1);

        JSpinner page2_button6 = new JSpinner();
        page2_button6.setBounds(362, 52, 52, 26);
        panel_1.add(page2_button6);

        JLabel lblNewLabel_2_1_1 = new JLabel("ห้องตรวจ 3 บ่าย");
        lblNewLabel_2_1_1.setBounds(267, 90, 89, 16);
        panel_1.add(lblNewLabel_2_1_1);

        JSpinner page2_button7 = new JSpinner();
        page2_button7.setBounds(362, 85, 52, 26);
        panel_1.add(page2_button7);

        JLabel lblNewLabel_2_2_1 = new JLabel("ห้องฉาย L1");
        lblNewLabel_2_2_1.setBounds(26, 123, 85, 16);
        panel_1.add(lblNewLabel_2_2_1);

        JSpinner page2_button4 = new JSpinner();
        page2_button4.setBounds(117, 118, 52, 26);
        panel_1.add(page2_button4);

        JLabel lblNewLabel_2_2_1_1 = new JLabel("ห้องฉาย L2");
        lblNewLabel_2_2_1_1.setBounds(267, 123, 85, 16);
        panel_1.add(lblNewLabel_2_2_1_1);

        JSpinner page2_button8 = new JSpinner();
        page2_button8.setBounds(362, 118, 52, 26);
        panel_1.add(page2_button8);

        JSpinner page2_button9 = new JSpinner();
        page2_button9.setBounds(362, 151, 52, 26);
        panel_1.add(page2_button9);

        JLabel lblNewLabel_2_2_1_1_1 = new JLabel("ห้องเคมีบำบัด");
        lblNewLabel_2_2_1_1_1.setBounds(267, 156, 85, 16);
        panel_1.add(lblNewLabel_2_2_1_1_1);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Priority", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_1_1.setBounds(6, 349, 438, 192);
        contentPane.add(panel_1_1);

        JLabel lblNewLabel_4_1 = new JLabel("ห้องตรวจ 1 เช้า");
        lblNewLabel_4_1.setBounds(26, 24, 85, 16);
        panel_1_1.add(lblNewLabel_4_1);

        JLabel lblNewLabel_1_2_1 = new JLabel("ห้องตรวจ 2 เช้า");
        lblNewLabel_1_2_1.setBounds(26, 57, 85, 16);
        panel_1_1.add(lblNewLabel_1_2_1);

        JLabel lblNewLabel_2_2_2 = new JLabel("ห้องตรวจ 3 เช้า");
        lblNewLabel_2_2_2.setBounds(26, 90, 85, 16);
        panel_1_1.add(lblNewLabel_2_2_2);

        JSpinner page3_button1 = new JSpinner();
        page3_button1.setBounds(117, 19, 52, 26);
        panel_1_1.add(page3_button1);

        JSpinner page3_button2 = new JSpinner();
        page3_button2.setBounds(117, 52, 52, 26);
        panel_1_1.add(page3_button2);

        JSpinner page3_button3 = new JSpinner();
        page3_button3.setBounds(117, 85, 52, 26);
        panel_1_1.add(page3_button3);

        JLabel lblNewLabel_3_1_1 = new JLabel("ห้องตรวจ 1 บ่าย");
        lblNewLabel_3_1_1.setBounds(267, 24, 89, 16);
        panel_1_1.add(lblNewLabel_3_1_1);

        JSpinner page3_button5 = new JSpinner();
        page3_button5.setBounds(362, 19, 52, 26);
        panel_1_1.add(page3_button5);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("ห้องตรวจ 2 บ่าย");
        lblNewLabel_1_1_1_1.setBounds(267, 57, 89, 16);
        panel_1_1.add(lblNewLabel_1_1_1_1);

        JSpinner page3_button6 = new JSpinner();
        page3_button6.setBounds(362, 52, 52, 26);
        panel_1_1.add(page3_button6);

        JLabel lblNewLabel_2_1_1_1 = new JLabel("ห้องตรวจ 3 บ่าย");
        lblNewLabel_2_1_1_1.setBounds(267, 90, 89, 16);
        panel_1_1.add(lblNewLabel_2_1_1_1);

        JSpinner page3_button7 = new JSpinner();
        page3_button7.setBounds(362, 85, 52, 26);
        panel_1_1.add(page3_button7);

        JLabel lblNewLabel_2_2_1_2 = new JLabel("ห้องฉาย L1");
        lblNewLabel_2_2_1_2.setBounds(26, 123, 85, 16);
        panel_1_1.add(lblNewLabel_2_2_1_2);

        JSpinner page3_button4 = new JSpinner();
        page3_button4.setBounds(117, 118, 52, 26);
        panel_1_1.add(page3_button4);

        JLabel lblNewLabel_2_2_1_1_2 = new JLabel("ห้องฉาย L2");
        lblNewLabel_2_2_1_1_2.setBounds(267, 123, 85, 16);
        panel_1_1.add(lblNewLabel_2_2_1_1_2);

        JSpinner page3_button8 = new JSpinner();
        page3_button8.setBounds(362, 118, 52, 26);
        panel_1_1.add(page3_button8);

        JSpinner page3_button9 = new JSpinner();
        page3_button9.setBounds(362, 151, 52, 26);
        panel_1_1.add(page3_button9);

        JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("ห้องเคมีบำบัด");
        lblNewLabel_2_2_1_1_1_1.setBounds(267, 156, 85, 16);
        panel_1_1.add(lblNewLabel_2_2_1_1_1_1);

        JButton btn_save = new JButton("บันทึก");
        btn_save.setBackground(new Color(0, 204, 255));
        btn_save.setForeground(Color.BLACK);
        btn_save.setBounds(6, 553, 438, 49);
        contentPane.add(btn_save);

        page2_button1.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button2.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button3.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button4.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button5.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button6.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button7.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button8.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page2_button9.setModel(new SpinnerNumberModel(1, 1, 32, 1));

        page3_button1.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button2.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button3.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button4.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button5.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button6.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button7.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button8.setModel(new SpinnerNumberModel(1, 1, 32, 1));
        page3_button9.setModel(new SpinnerNumberModel(1, 1, 32, 1));

        setLocationRelativeTo(null);


        // select all section
        ArrayList<SectionModel> sectionModels = DatabaseHelper.Companion.selectAll();
        for (SectionModel sectionModel : sectionModels) {
            if (sectionModel.getPage() == 1) {
                switch (sectionModel.getButton()) {
                    case 1:
                        page1_button1.setValue(sectionModel.getSection());
                        break;
                    case 2:
                        page1_button2.setValue(sectionModel.getSection());
                        break;
                    case 3:
                        page1_button3.setValue(sectionModel.getSection());
                        break;
                    case 4:
                        page1_button4.setValue(sectionModel.getSection());
                        break;
                    case 5:
                        page1_button5.setValue(sectionModel.getSection());
                        break;
                    case 6:
                        page1_button6.setValue(sectionModel.getSection());
                        break;
                }
            } else if (sectionModel.getPage() == 2) {
                switch (sectionModel.getButton()) {
                    case 1:
                        page2_button1.setValue(sectionModel.getSection());
                        break;
                    case 2:
                        page2_button2.setValue(sectionModel.getSection());
                        break;
                    case 3:
                        page2_button3.setValue(sectionModel.getSection());
                        break;
                    case 4:
                        page2_button4.setValue(sectionModel.getSection());
                        break;
                    case 5:
                        page2_button5.setValue(sectionModel.getSection());
                        break;
                    case 6:
                        page2_button6.setValue(sectionModel.getSection());
                        break;
                    case 7:
                        page2_button7.setValue(sectionModel.getSection());
                        break;
                    case 8:
                        page2_button8.setValue(sectionModel.getSection());
                        break;
                    case 9:
                        page2_button9.setValue(sectionModel.getSection());
                        break;
                }
            } else if (sectionModel.getPage() == 3) {
                switch (sectionModel.getButton()) {
                    case 1:
                        page3_button1.setValue(sectionModel.getSection());
                        break;
                    case 2:
                        page3_button2.setValue(sectionModel.getSection());
                        break;
                    case 3:
                        page3_button3.setValue(sectionModel.getSection());
                        break;
                    case 4:
                        page3_button4.setValue(sectionModel.getSection());
                        break;
                    case 5:
                        page3_button5.setValue(sectionModel.getSection());
                        break;
                    case 6:
                        page3_button6.setValue(sectionModel.getSection());
                        break;
                    case 7:
                        page3_button7.setValue(sectionModel.getSection());
                        break;
                    case 8:
                        page3_button8.setValue(sectionModel.getSection());
                        break;
                    case 9:
                        page3_button9.setValue(sectionModel.getSection());
                        break;
                }
            }
        }

        btn_save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int page = 1; page <= 3; page++) {
                    if (page == 1) {
                        for (int button = 1; button <= 6; button++) {
                            switch (button) {
                                case 1:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page1_button1.getValue());
                                    break;
                                case 2:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page1_button2.getValue());
                                    break;
                                case 3:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page1_button3.getValue());
                                    break;
                                case 4:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page1_button4.getValue());
                                    break;
                                case 5:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page1_button5.getValue());
                                    break;
                                case 6:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page1_button6.getValue());
                                    break;
                            }
                        }
                    } else if (page == 2) {
                        for (int button = 1; button <= 9; button++) {
                            switch (button) {
                                case 1:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button1.getValue());
                                    break;
                                case 2:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button2.getValue());
                                    break;
                                case 3:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button3.getValue());
                                    break;
                                case 4:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button4.getValue());
                                    break;
                                case 5:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button5.getValue());
                                    break;
                                case 6:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button6.getValue());
                                    break;
                                case 7:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button7.getValue());
                                    break;
                                case 8:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button8.getValue());
                                    break;
                                case 9:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page2_button9.getValue());
                                    break;
                            }
                        }
                    } else {
                        for (int button = 1; button <= 9; button++) {
                            switch (button) {
                                case 1:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button1.getValue());
                                    break;
                                case 2:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button2.getValue());
                                    break;
                                case 3:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button3.getValue());
                                    break;
                                case 4:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button4.getValue());
                                    break;
                                case 5:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button5.getValue());
                                    break;
                                case 6:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button6.getValue());
                                    break;
                                case 7:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button7.getValue());
                                    break;
                                case 8:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button8.getValue());
                                    break;
                                case 9:
                                    DatabaseHelper.Companion.updateByPageButton(page, button, (Integer) page3_button9.getValue());
                                    break;
                            }
                        }
                    }
                }
                dispose();
            }
        });
    }
}
