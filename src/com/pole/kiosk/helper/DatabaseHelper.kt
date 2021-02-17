package com.pole.kiosk.helper

import com.pole.kiosk.ABSOLUTE_PATH
import com.pole.kiosk.DATABASE_PATH
import com.pole.kiosk.model.SectionModel
import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement
import java.sql.SQLException

import java.sql.ResultSet


class DatabaseHelper {
    companion object {
        private lateinit var conn: Connection
        private lateinit var statement: Statement

        fun connect() {
            try {
                Class.forName("org.sqlite.JDBC")
                conn = DriverManager.getConnection("jdbc:sqlite:${ABSOLUTE_PATH + DATABASE_PATH}")
                statement = conn.createStatement()
                println("Connect to database complete")
            } catch (ex: Exception) {
                println(ex.message)
            }
        }

        fun selectAll(): ArrayList<SectionModel> {
            val sql = "SELECT * FROM sections"

            statement.let {
                val resultSet: ResultSet = it.executeQuery(sql)
                val sections = ArrayList<SectionModel>()
                while (resultSet.next()) {
                    val sectionModel = SectionModel(
                        page = resultSet.getInt("page"),
                        button = resultSet.getInt("button"),
                        section = resultSet.getInt("section")
                    )
                    sections.add(sectionModel)
                }
                return sections
            }
        }

        fun selectByPage(page: Int): ArrayList<SectionModel> {
            val sql = "SELECT * FROM sections WHERE page=$page"

            statement.let {
                val resultSet: ResultSet = it.executeQuery(sql)
                val sections = ArrayList<SectionModel>()
                while (resultSet.next()) {
                    val sectionModel = SectionModel(
                        page = resultSet.getInt("page"),
                        button = resultSet.getInt("button"),
                        section = resultSet.getInt("section")
                    )
                    sections.add(sectionModel)
                }
                return sections
            }
        }

        fun selectByPageButton(page: Int, button: Int): ArrayList<SectionModel> {
            val sql = "SELECT * FROM sections WHERE page=$page AND button=$button"

            statement.let {
                val resultSet: ResultSet = it.executeQuery(sql)
                val sections = ArrayList<SectionModel>()
                while (resultSet.next()) {
                    val sectionModel = SectionModel(
                        page = resultSet.getInt("page"),
                        button = resultSet.getInt("button"),
                        section = resultSet.getInt("section")
                    )
                    sections.add(sectionModel)
                }
                return sections
            }
        }
    }
}