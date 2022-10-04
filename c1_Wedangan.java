package ProgremerZamanNowOOP;

class c1_Wedangan {
String nama ;
    void c1Sayhello(String name){
        System.out.println("Halo "+ name + " nama saya "+nama );
    }
}

// di bawah ini ada kelass turunan dari c1_wedangan di tambahkan ( EXTENDS )

class c2_TurunanWedangan1 extends c1_Wedangan{
}

class c3_TurunanWedangan2 extends c1_Wedangan{
    String namabangunruang;
    int mengitungluas(Integer panjang, Integer lebar){
       int hasil;
       hasil =panjang*lebar ;
        System.out.println(this.namabangunruang+hasil);
       return hasil;
    }
}