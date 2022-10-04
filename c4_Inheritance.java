package ProgremerZamanNowOOP;

class c4_Inheritance {

    public static void main(String[] args) {

        // ini pengunaan class induk
        var wedangan = new c1_Wedangan();
        wedangan.nama = "Andika";
        wedangan.c1Sayhello("cecep");

        // ini pengunaan turunan dari induk lihat lh pada C1_Wedangan di situ tidak ada sebuah method tapi bisa di gunakaaan
        // nah itu dia pewarisan kita bisa mengunakaan yang ada di induk
        var wedangan1 = new c2_TurunanWedangan1();
        wedangan1.nama = "dika";
        wedangan1.c1Sayhello("udin");

        // ini sama tapi ini hanya experiment saja
        var wedangan2 = new c3_TurunanWedangan2();
        wedangan2.namabangunruang = "Menghitung Persegi panjang";
        wedangan2.mengitungluas(50,20);


    }
}
