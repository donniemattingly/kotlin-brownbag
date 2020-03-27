package com.donniemattingly.kotlinbrownbag

object Utils {

    fun <T> nullSafeToString(t: T?): String {
        return if (t == null || t.toString() == null) {
            "NULL"
        } else t.toString()

    }

}
