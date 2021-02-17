package com.pole.kiosk.page

import com.pole.kiosk.*
import java.awt.Color
import javax.swing.ImageIcon
import javax.swing.JButton
import javax.swing.JPanel

class PageMain(mainFrame: MainFrame) : JPanel() {

    open var button1: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_MAIN_BUTTON_1_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_MAIN_BUTTON_1P_URL)
        setBounds(456, 150, PAGE_MAIN_BUTTON_WIDTH, PAGE_MAIN_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button2: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_MAIN_BUTTON_2_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_MAIN_BUTTON_2P_URL)
        setBounds(456, 290, PAGE_MAIN_BUTTON_WIDTH, PAGE_MAIN_BUTTON_HEIGHT)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(mainFrame)
    }

    open var button3: JButton = JButton(ImageIcon(ABSOLUTE_PATH + PAGE_MAIN_BUTTON_3_URL)).apply {
        pressedIcon = ImageIcon(ABSOLUTE_PATH + PAGE_MAIN_BUTTON_3P_URL)
        setBounds(456, 430, PAGE_MAIN_BUTTON_WIDTH, PAGE_MAIN_BUTTON_HEIGHT)
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
    }
}