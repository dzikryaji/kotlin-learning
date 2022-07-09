package PemrogramanDasar

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val ipk : Double
    val masaStudi : Int
    val nilaiB : String

    println("***********************")
    println("Cek Predikat Kelulusan v1.0")
    println("***********************\n")

    print("Masukkan IPK mahasiswa: ")
    ipk = input.nextDouble()
    print("Masukkan masa studi mahasiswa (tahun): ")
    masaStudi = input.nextInt()
    print("Apakah mahasiswa memiliki nilai lulus di bawah  B? (Y/T)")
    nilaiB = input.next()
    println()

    when {
        ipk > 3.5 && masaStudi <= 4 && "T".equals(nilaiB) -> {
            println("Mahasiswa lulus dengan predikat Dengan Pujian.\n")
        }
        ipk > 2.75 -> {
            println("Mahasiswa lulus dengan predikat Sangat Memuaskan.\n")
        }
        ipk <= 2.75 && ipk > 2.00 -> {
            println("Mahasiswa lulus dengan predikat Memuaskan.\n")
        }
    }

    println("Terima kasih telah menggunakan layanan ini.")


}