baca terlebih dahulu dan lihat sourch nya


Constructor ( b1_wedangan )

note : kodingan nya ada di b1_wedangan

Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ()
Di dalam class Java, kita bisa membuat constructor, constructor adalah method  yang akan dipanggil saat pertama kali Object dibuat.
Mirip seperti di method, kita bisa memberi parameter pada constructor
Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value



Constructor Overloading ( b1_wedangan )

Sama seperti di method, di constructor pun kita bisa melakukan overloading
Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter harus berbeda



Memanggil Constructor Lain  ( b1_wedangan )

Constructor bisa memanggil constructor lain
Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata kunci this


Variable Shadowing ( b1_wedangan )

Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi variable dengan nama yang sama di scope diatasnya
Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses


Mengatasi Variable Shadowing This Keyword  ( b1_wedangan )

Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci this untuk mengakses object saat ini
Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak bisa dilakukan jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci this
This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method
This bisa digunakan untuk mengatasi masalah variable shadowing
