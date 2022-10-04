@@@@@  Pengenalan Object Oriented Programming   @@@@@@


Apa itu Object Oriented Programming?

Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep “objek”
Ada banyak sudut pandang bahasa pemrograman, namun OOP adalah yang sangat populer saat ini.
Ada beberapa istilah yang perlu dimengerti dalam OOP, yaitu: Object dan Class


Apa itu Object?

Object adalah data yang berisi field / properties / attributes dan method / function / behavior
Semua data bukan primitif di Java adalah object, dari mulai Integer, Boolean, Character, String dan yang lainnya


Apa itu Class?

Class adalah blueprint, prototype atau cetakan untuk membuat Object
Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object
Setiap Object selalu dibuat dari Class
Dan sebuah Class bisa membuat Object tanpa batas


Class dan Object : Person

http://www.plantuml.com/plantuml/uml/TP7DQeGm4CVlynI3f_RW2nHQn59QUf12ds3KgH_632Jn86NVVMVPoBgH5Hp8x_-Ha1G-a0lBR00QGzxZ3pil5ly1zViDRh0T_WtEXufctaD3H-Pf_M9Zv2ckhUhFYU5Jf2rNlhUS0AGUkGd8au3--7BR5Lyn-vWaYznGWhVeA9hLSGX_YzfKESIhfNFIxohgfHtWCjAAKbcsAMa5zQGLyURo_0sl1trtJ87tV9G7GYoE0XHiMtsJCm00



Class dan Object : Car

http://www.plantuml.com/plantuml/uml/NP312i8m44Jl-Oeb9ptq1mIbKWGldXGyRzjG8ib6qbImuh_RR4jIp27BliaCGye-e0-3DQ8nsFTGeOUFWEbSWzVK0Q5LwxtsI2q3TfweqwGssuMuPm9V8LpzK4q0V26DAEO1Euw4FSWZ0va5pexApRrTG9aJZCLHyBtsnrqcdDptmKnDizkwMXljn39N2PUPo2pbbBEZDbQ8Fr8K1yXFAgymg2Ia-l-SUoLSAce7Qtu0


@@@@@   Class   @@@@@


Membuat Class

Untuk membuat class, kita bisa menggunakan kata kunci class
Penamaan class biasa menggunakan format CamelCase


@@@@@   Object  @@@@@


Membuat Object

Object adalah hasil instansiasi dari sebuah class
Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung ()


@@@@@   Field   @@@@@

Fields / Properties / Attributes adalah data yang bisa kita sisipkan di dalam Object
Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut di dalam deklarasi class-nya
Membuat field sama seperti membuat variable, namun ditempatkan di block class


Manipulasi Field

Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan.
Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya
Untuk memanipulasi data field, sama seperti cara pada variable
Untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama fields nya


Method

Selain menambahkan field, kita juga bisa menambahkan method ke object
Cara dengan mendeklarasikan method tersebut di dalam block class
Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang ada di dalam block class
Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya. Sama seperti mengakses field



