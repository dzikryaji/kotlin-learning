package PemrogramanDasar

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    var jarakTotal = 0
    val order : Int
    var penghasilan : Int
    var km : Int
    val biaya : Int
    val pemotongan : Int

    print("Banyak order: ")
    order = input.nextInt()

    for (i in 1..order){
        print("Jarak order ke-$i: ")
        km = input.nextInt()
        jarakTotal += km
    }

    biaya = jarakTotal * 2000
    penghasilan = biaya * 4/5
    pemotongan = biaya / 5

    if (order >= 5) {
        penghasilan += 50000
    }
    if (jarakTotal > 20){
        penghasilan += 50000
    }

    println("Jumlah total km: $jarakTotal KM")
    println("Total biaya penghantaran ojek: $biaya")
    println("Penghasilan: $penghasilan")
    println("Biaya yang dipotong: $pemotongan")

}