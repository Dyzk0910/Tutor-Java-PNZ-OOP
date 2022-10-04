package ProgremerZamanNowOOP;
// note class D1_Overriding nya hanya digunakan sebagai penggunaan class induk dan class anak
class D1_Overriding {
/*
  Method Overriding

Method overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, method yang di class parent tidak bisa diakses lagi

*/
    public static void main(String[] args) {

        // penggunaan class induk
        var Overriding = new ClassInduk();
        Overriding.name = "Andika";
        Overriding.sayHello("Budi");

        // penggunaan class anak yang di warisi induk nya
        var Overriding1 = new anak();
        Overriding1.name  ="dika";
        Overriding1.sayHello("cecep");

    }
}


/*
lihat pada code di bawah
ada sebuah 2 class
1. class induk
2. class anak

dimana class induk dan class anak memiliki nama method yang sama

 */
class ClassInduk {
    String name;
    void sayHello(String name){
        System.out.println("Hello "+name+" My Name is Manager "+ this.name);
    }
}

class anak extends ClassInduk {
    void sayHello(String name) {
        System.out.println("Hello " + name + " My Name is Karyawan " + this.name);
    }

}