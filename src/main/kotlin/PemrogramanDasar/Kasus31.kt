package PemrogramanDasar

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Berapa KM jarak yang anda tempuh?")
    val jarak: Int = input.nextInt()
    val biaya: Int = jarak * 2000
    println("Biaya perjalanan anda adalah : Rp$biaya")
}