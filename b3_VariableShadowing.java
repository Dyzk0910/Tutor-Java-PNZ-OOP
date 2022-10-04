package ProgremerZamanNowOOP;


class b3_VariableShadowing {
    public static void main(String[] args) {

        var PLT = new b1_Wedangan(10,10,10);
        System.out.println(PLT.Panjang);
        System.out.println(PLT.Lebar);
        System.out.println(PLT.Tinggi);

        // Yang keluar akan null , kenapa null ?? karena pada class b1_Wedangan , materi Variable Shadowing
        // dan Constructor ke 1 itu ada Pendeklarasian Panjang = Panjang , Lebar = Lebar , Tinggi = Tinggi
        // itu dia mengambil Filed/value nya dari constructor itu sendiri nah itu dai yang dinamakan Variable
        // Shadownig

        PLT.b1sayHello("Andika"); // ini juga method nya ngambil variable nya dari dalam method itu sendiri




// Mengatasi Variable Shadowing yang di hasilkan maka tidak null karena ada this

        var angkakubus = new b1_Wedangan("Kubus", 10, 10, 10);

        double hasil = angkakubus.Lebar * angkakubus.Panjang * angkakubus.Tinggi;
        System.out.println(hasil);

 // Kombinasi antara COnstructor dengan method

        angkakubus.B1rumusKubus(15, 48, 65);





    }
}