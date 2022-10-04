package ProgremerZamanNowOOP;
/*
Super Keyword

Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child
Untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
Sederhananya, super digunakan untuk mengakses class parent
Tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super


 */
public class D2_SuperKeyword {

    public static void main(String[] args) {

        var shape = new D2_Induk();
        System.out.println(shape.getCorner());

        var shape1 = new D2_Anak();
        System.out.println(shape1.getCorner());
        System.out.println(shape1.getPerentCorner());


    }

}
class D2_Induk {
    int getCorner(){
        return 0;
    }
}


class D2_Anak extends D2_Induk {
    int getCorner() {
        return 4;
    }

    int getPerentCorner(){
        return super.getCorner(); // mengakses method dari Induk nya
    }

}
