package com.seankang.project

class Calculator {

    fun add(a: Int, b: Int) : Int {
        return a+ b
    }

    fun div(a: Int, b: Int): Double {
        assert(b!=0) {"Division by zero"}
        return a/b * 1.0
    }
}