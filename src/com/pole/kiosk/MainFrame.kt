package com.pole.kiosk

import com.pole.kiosk.page.Page1
import com.pole.kiosk.page.Page2
import com.pole.kiosk.page.Page3
import com.pole.kiosk.page.PageMain
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class MainFrame : JFrame(), ActionListener {

    private val background = JLabel(ImageIcon(ABSOLUTE_PATH + BACKGROUND_URL))
    private val layerPanel = JLayeredPane()
    private val pageMain = PageMain(this@MainFrame)
    private val page1 = Page1(this@MainFrame)
    private val page2 = Page2(this@MainFrame)
    private val page3 = Page3(this@MainFrame)

    private val buttonClose: JButton = JButton().apply {
        setBounds(SCREEN_WIDTH - 50, 0, 50, 50)
        isOpaque = false
        isContentAreaFilled = false
        isBorderPainted = false
        addActionListener(this@MainFrame)
    }

    // Setup JFrame
    init {
        title = "Main Frame"
        defaultCloseOperation = EXIT_ON_CLOSE
        isResizable = false
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT)
        setLocationRelativeTo(null)
        isUndecorated = true
    }

    // Setup Background
    init {
        background.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT)
        add(background)
        background.add(buttonClose)
    }

    // Setup Layer Panel
    init {
        layerPanel.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT)
        background.add(layerPanel, 0)
    }

    // Add Page Main
    init {
        layerPanel.add(pageMain)
    }

    private fun switchPanels(panel: JPanel) {
        layerPanel.removeAll()
        layerPanel.add(panel)
        layerPanel.repaint()
        layerPanel.revalidate()
    }

    override fun actionPerformed(e: ActionEvent?) {
        when (e?.source) {
            buttonClose -> showConfirmDialog()
            pageMain.button1 -> switchPanels(page1)
            pageMain.button2 -> switchPanels(page2)
            pageMain.button3 -> switchPanels(page3)
            page1.buttonHome, page2.buttonHome, page3.buttonHome -> switchPanels(pageMain)
        }
    }
}