package ProgremerZamanNowOOP;
/*
Super Constructor

Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa digunakan untuk mengakses constructor
Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor
Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter-nya (tidak memiliki default constructor), maka class child wajib mengakses constructor class parent tersebut.

 */
class D3_SuperConstructor {

}

class D3_Induk{
    String name;

    D3_Induk(String name){ // jadi class anak wajib pakai constractor ini kecuali tidak ada parameter
        this.name = name;
    }
    D3_Induk(){ // tidak ada parameter nya jadi anak class nya gpp gada karena ini jadi default constractor
    }
}


class D3_Anak extends D3_Induk {

    D3_Anak(String name){

    }


}

