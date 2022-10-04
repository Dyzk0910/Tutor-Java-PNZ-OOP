package ProgremerZamanNowOOP;
/*
  karena class ini ada di dalam folder maka ada package dan jika ada package lagi maka java akan memberi titik
  contoh folder nya ProgremerZamanNowOOP.Folderbaru

*/
class a1_Wedangan {
    /*
    Di Class Wedangan adalah diamana class ini menyimpan objek objek untuk class class lain nya
    contoh class ini di gunakan pada class a1 - a4
     */


// Baris ke 14 - 17 dipakai di class (a2_OrangAPP dan a3_field)
String a1nama;
String a1alamat;
final String a1negara = "Indonesia";


// method ini dipakai untuk class field ( a4_Method )
void a1fungsiHello(String ParameterHello){

    System.out.println("HELLO "+ ParameterHello+" Selamat Datang" );
}



}
