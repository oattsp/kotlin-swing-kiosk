package com.pole.kiosk

import com.fazecast.jSerialComm.SerialPort
import com.pole.kiosk.helper.DatabaseHelper
import com.pole.kiosk.model.SectionModel
import com.pole.kiosk.page.Page1
import com.pole.kiosk.page.Page2
import com.pole.kiosk.page.Page3
import com.pole.kiosk.page.PageMain
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*
import java.awt.Color




class MainFrame : JFrame(), ActionListener {
    private var serial: SerialPort? = getSerialPort()

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

    private fun getSection(e: ActionEvent?): ArrayList<SectionModel>? {
        return when (e?.source) {
            page1.button1 -> DatabaseHelper.selectByPageButton(1, 1)
            page1.button2 -> DatabaseHelper.selectByPageButton(1, 2)
            page1.button3 -> DatabaseHelper.selectByPageButton(1, 3)
            page1.button4 -> DatabaseHelper.selectByPageButton(1, 4)
            page1.button5 -> DatabaseHelper.selectByPageButton(1, 5)
            page1.button6 -> DatabaseHelper.selectByPageButton(1, 6)
            page2.button1 -> DatabaseHelper.selectByPageButton(2, 1)
            page2.button2 -> DatabaseHelper.selectByPageButton(2, 2)
            page2.button3 -> DatabaseHelper.selectByPageButton(2, 3)
            page2.button4 -> DatabaseHelper.selectByPageButton(2, 4)
            page2.button5 -> DatabaseHelper.selectByPageButton(2, 5)
            page2.button6 -> DatabaseHelper.selectByPageButton(2, 6)
            page2.button7 -> DatabaseHelper.selectByPageButton(2, 7)
            page2.button8 -> DatabaseHelper.selectByPageButton(2, 8)
            page2.button9 -> DatabaseHelper.selectByPageButton(2, 9)
            page3.button1 -> DatabaseHelper.selectByPageButton(3, 1)
            page3.button2 -> DatabaseHelper.selectByPageButton(3, 2)
            page3.button3 -> DatabaseHelper.selectByPageButton(3, 3)
            page3.button4 -> DatabaseHelper.selectByPageButton(3, 4)
            page3.button5 -> DatabaseHelper.selectByPageButton(3, 5)
            page3.button6 -> DatabaseHelper.selectByPageButton(3, 6)
            page3.button7 -> DatabaseHelper.selectByPageButton(3, 7)
            page3.button8 -> DatabaseHelper.selectByPageButton(3, 8)
            page3.button9 -> DatabaseHelper.selectByPageButton(3, 9)
            else -> null
        }
    }

    private fun sendSerial(sec: Int) {
        val section: Int = sec - 1
        val command = ";PN,$section,0,\r\n"
        println(command)
        val byteCMD = command.toByteArray()
        serial?.let {
            it.writeBytes(byteCMD, byteCMD.size.toLong())
            val delay = 600
            val timer = Timer(delay) {
                switchPanels(pageMain)
            }
            timer.isRepeats = false
            timer.start()
        }
    }

    private fun switchPanels(panel: JPanel) {
        layerPanel.removeAll()
        layerPanel.add(panel)
        layerPanel.repaint()
        layerPanel.revalidate()
    }

    override fun actionPerformed(e: ActionEvent?) {
        if (serial == null) {
            serial = getSerialPort()
        }

        when (e?.source) {
            buttonClose -> showConfirmDialog()
            pageMain.button1 -> switchPanels(page1)
            pageMain.button2 -> switchPanels(page2)
            pageMain.button3 -> switchPanels(page3)
            page1.buttonHome, page2.buttonHome, page3.buttonHome -> switchPanels(pageMain)
            else -> {
                val sections = getSection(e)
                sections?.let {
                    val section: Int = it[0].section
                    sendSerial(section)
                }
            }
        }
    }
}