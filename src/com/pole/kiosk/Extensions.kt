package com.pole.kiosk

import com.fazecast.jSerialComm.SerialPort
import java.lang.Exception
import javax.swing.JOptionPane
import kotlin.system.exitProcess

fun showConfirmDialog() {
    val result = JOptionPane.showConfirmDialog(
        null,
        "You want to close the program?", "Close Program",
        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE
    )

    if (result == JOptionPane.YES_OPTION) {
        exitProcess(0)
    }
}

fun showErrorDialog(message: String) {
    val result = JOptionPane.showConfirmDialog(null,
        message, "Error",
        JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE)

    when(result) {
        JOptionPane.YES_OPTION, JOptionPane.NO_OPTION, JOptionPane.CLOSED_OPTION -> {
            exitProcess(0)
        }
    }
}

fun getSerialPort(): SerialPort? {
    var firstAvailableComPort: SerialPort? = null
    try {
        val allAvailableComPorts = SerialPort.getCommPorts()
        for (eachComport in allAvailableComPorts) {
            println("List of all available comports: $eachComport")
        }
        firstAvailableComPort = allAvailableComPorts[0]
        firstAvailableComPort.openPort()
        println("Opened the first available serial port : " + firstAvailableComPort.descriptivePortName)
    } catch (ex: Exception) {
        ex.printStackTrace()
        showErrorDialog(ex.message.toString())
    }
    return firstAvailableComPort
}