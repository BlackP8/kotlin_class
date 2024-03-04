package org.example.module1

fun main() {
    var a:String = readLine()?:"0"
    var b:String = readLine()?:"0"
    var result:Boolean = a.toInt() > b.toInt()
    println(result)
}