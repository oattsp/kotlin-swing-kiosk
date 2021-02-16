package com.pole.kiosk.page

import com.pole.kiosk.*
import java.awt.Color
import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JPanel

class Page1(mainFrame: MainFrame): JPanel() {

    open var button1: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_1_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_1P_URL)
        setBounds(456, 150, PAGE_1_BUTTON_WIDTH, PAGE_1_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button2: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_2_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_2P_URL)
        setBounds(456, 290, PAGE_1_BUTTON_WIDTH, PAGE_1_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button3: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_3_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_3P_URL)
        setBounds(456, 430, PAGE_1_BUTTON_WIDTH, PAGE_1_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button4: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_4_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_4P_URL)
        setBounds(726, 150, PAGE_1_BUTTON_WIDTH, PAGE_1_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button5: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_5_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_5P_URL)
        setBounds(726, 290, PAGE_1_BUTTON_WIDTH, PAGE_1_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button6: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_6_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_1_BUTTON_6P_URL)
        setBounds(726, 430, PAGE_1_BUTTON_WIDTH, PAGE_1_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var buttonHome: JButton = JButton(ImageIcon(ABSOLUTE_PATH + BUTTON_HOME_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + BUTTON_HOME_P_URL)
        setBounds(420, 650, BUTTON_HOME_WIDTH, BUTTON_HOME_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    init {
        setBounds(0 , 0, SCREEN_WIDTH, SCREEN_HEIGHT)
        isOpaque = false
        layout = null
        background = Color(0,0,0,0)
    }

    init {
        add(button1)
        add(button2)
        add(button3)
        add(button4)
        add(button5)
        add(button6)
        add(buttonHome)
    }
}