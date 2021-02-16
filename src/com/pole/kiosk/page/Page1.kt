package com.pole.kiosk.page

import com.pole.kiosk.SCREEN_HEIGHT
import com.pole.kiosk.SCREEN_WIDTH
import javax.swing.JLabel
import javax.swing.JPanel

class Page1: JPanel() {

    val text = JLabel("Page 1")

    init {
        setBounds(0 , 0, SCREEN_WIDTH, SCREEN_HEIGHT)
        add(text)
    }
}