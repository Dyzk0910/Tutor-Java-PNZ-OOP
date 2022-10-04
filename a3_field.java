package ProgremerZamanNowOOP;

// klasi ini berhubungan dengan a1_Orang saja

public class a3_field {

    public static void main(String[] args) {

        var orang1 = new a1_Wedangan(); // mendeklarasikan ke class a1 wedangan
        orang1.a1nama = "Andika";       // mengisi tipe data / filed
        orang1.a1alamat = "Brebes";
      //orang1.a1negara = ini sudah final jadi tidak bisa di ganti

        System.out.println(orang1.a1nama);  // menampilkan hasil
        System.out.println(orang1.a1alamat);
        System.out.println(orang1.a1negara);

// note bayangin kalo make array maka akan ribet kalo pake ini kan sederhanaa

    }
}
