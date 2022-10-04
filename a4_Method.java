package ProgremerZamanNowOOP;

 class a4_Method {
    public static void main(String[] args) {

   var orang1 = new a1_Wedangan(); // mendeklarasikan bahwa variable orang1 itu = berhubungan dengan class a1_Orang

      //orang1         = hasil deklarasi antara kelas a4 dengan a1
      //(.)            = menghubungkan dengan mengunakan titik
      // a1fungsiHello = ini adalah method dari a1 wedangan

        orang1.a1fungsiHello("Andika");
        orang1.a1fungsiHello("dika"); // hasil nya akan null karena tipe data nya bukan primitif

    }
}
