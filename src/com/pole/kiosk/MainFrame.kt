package com.pole.kiosk

import com.pole.kiosk.page.Page1
import javax.swing.JFrame
import javax.swing.JLayeredPane

class MainFrame: JFrame() {

    private val layerPanel = JLayeredPane()

    init {
        title = "Main Frame"
        defaultCloseOperation = EXIT_ON_CLOSE
        isResizable = false
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT)
        setLocationRelativeTo(null)
//        isUndecorated = true
    }

    init {
        layerPanel.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT)
        add(layerPanel)
    }

    init {
        layerPanel.add(Page1())
    }
}


fun main() {
    MainFrame().isVisible = true
}