package ProgremerZamanNowOOP;
/*
Class ini adalah untuk sebuah wedangan yang di fungsi kan untuk keperluan class b
 */
class b1_Wedangan {


// INI ADALAH TIPE DATA YANG DIGUNAKAN PENGENALAN CONSTRUCTOR

    String B1Nama,B1Alamat,B1Hobi,B1NamaAlamatHobi;
    Integer B1TinggiBadan;
    final String B1Negara = "Indonesia";

// INI ADALAH TIPE DATA YANG DIGUNAKAN MEMANGIL CONSTRUCTOR

    String B1Hp,B1MerekHp,B1Leptop,B1MerekLeptop;
    Long B1Harga;
    Integer B1NomorSeri;


// INI ADALAH TIPE DATA YANG DIGUNAKAN UNTUK VARIAVLE Variable Shadowing dan mengatasi masalah ini

    Integer Panjang,Lebar,Tinggi;
    String Kubus;











// @@@@@@@@@@@@@@@@    INI ADALAH CONSTRUCTOR ( NAMA DEPAN NYA SAMA KAYA CLASS INI )    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    b1_Wedangan(String parameternama,String parameterAlamat,String parameterNegara){
        B1Nama = parameternama;
        B1Alamat = parameterAlamat;
        B1NamaAlamatHobi = "NAMA : "+ B1Nama +" ALAMAT : "+ B1Alamat +" NEGARA : "+ B1Negara;
        // b1negara tidak bisa di buat di sini karena final
    }
    b1_Wedangan(String ParameterHobi , String ParameterManfaathobi ){
        B1Hobi = ParameterHobi;
    }
    b1_Wedangan(Integer ParameterTinggiBadan){

        B1TinggiBadan = ParameterTinggiBadan;
    }

// @@@@@@@@@@@@@@@@    INI ADALAH CONSTRUCTOR ( NAMA DEPAN NYA SAMA KAYA CLASS INI )    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@






















// @@@@@@@@@@@@@@@@@@@@@@@      MEMANGIL CONSTRUCTOR LAIN       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2


// CONSTRUCTOR ke 1
    b1_Wedangan(String hp , String merekHp , String leptop , String merekLeptop , Long harga){
        B1Hp = hp;
        B1Leptop = leptop;
        B1MerekHp = merekHp;
        B1MerekLeptop = merekLeptop;
        B1Harga = harga;
    }


// CONSTRUCTOR ke 2
    b1_Wedangan(String hp , String merekHp , String leptop , Long harga){
        this(hp,merekHp,leptop,(String) null,harga); // Mengunakan construktor ( 1 )


// CONSTRUCTOR ke 3
    }
    b1_Wedangan(String hp , String merekHp , String leptop , Integer nomorseri){
        this(hp, merekHp, leptop, (Long) null); // Mengunakan construktor ( 2 )
        B1NomorSeri = nomorseri;
    }

// CONSTRUCTOR ke 4
    b1_Wedangan(Integer nomorseri , String hp , String merekhp){
        this(hp, merekhp, (String) null, nomorseri);// Mengunakan construktor ( 3 )
    }


// CONSTRUCTOR ke 5
    b1_Wedangan(String hp){
        this(hp, (String) null, (String) null, (String) null, (Long) null); // Mengunakan construktor ( 1 )
    }

// @@@@@@@@@@@@@@@@@@@@@@@      MEMANGIL CONSTRUCTOR LAIN       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

















// @@@@@@@@@@@@@@@@@@@@@@@    Variable Shadowing     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2

/*
note : lihat pada constructor ke 1

       di bawah di dalam ada atribut Panjang,Lebar,Tinggi
       Contoh Panjang = Panjang nah di atas itu gak ke ambil nama tipe datanya
       maka dari itu dia tidak bisa mengambil variable nya
       terus bagaimana cara kita mengunakan tipe data di atas ??
       cara nya ada di materi di bawah materi setelah ini
 */

// CONSTRUCTOR ke 1
    b1_Wedangan(Integer Panjang , Integer Lebar , Integer Tinggi){
        Panjang = Panjang; // tipe data ini mengambil data dari dalam Constructor ini tidak mengambil dari luar
        Lebar = Lebar;    // jadi tipe data ini tidak berubah Field nya

    }

    void b1sayHello(String name){ // disini juga gak ngambil dari atas
        System.out.println("Hello " + name + " my name is " + name);
    }

// @@@@@@@@@@@@@@@@@@@@@@@    Variable Shadowing     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2



















// @@@@@@@@@@@@@@@@@@@@@@@@@@@@  Mengatasi Variable Shadowing This Keyword   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    b1_Wedangan(String Kubus,Integer Panjang , Integer Lebar , Integer Tinggi){
        this.Kubus = Kubus;
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Tinggi = Tinggi;

    }

    static int B1rumusKubus(Integer Panjang , Integer Lebar , Integer Tinggi){
//        var rusuk = new b1_Wedangan("Kubus",Panjang,Lebar,Tinggi);

     Integer hasil = Panjang* Tinggi* Lebar;
        System.out.println(hasil);
     return hasil;

    }
// @@@@@@@@@@@@@@@@@@@@@@@@@@@@  Mengatasi Variable Shadowing This Keyword   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


















// INI METHOD/FUNGSI

    void b1fungsiHello(String ParameterNama){
        System.out.println("Hallo "+ParameterNama+"  Apakah hobi mu : " + B1Hobi);

    }
}
