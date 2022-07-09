package PemrogramanDasar

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    println("Titik A :")
    print("X1 :")
    val x1:Int = input.nextInt()
    print("Y1 :")
    val y1:Int = input.nextInt()
    println("Titik B :")
    print("X2 :")
    val x2:Int = input.nextInt()
    print("Y2 :")
    val y2:Int = input.nextInt()

    val X:Double = (x2 - x1).toDouble()

}