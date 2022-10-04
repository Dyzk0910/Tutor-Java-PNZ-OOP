package ProgremerZamanNowOOP;

// class ini berhubungan dengan a1_Wedangan

public class a2_OrangAPP {
    public static void main(String[] args) {


        var orang1 = new a1_Wedangan();        // 1. mendeklarasi kan antara class a2 dengan a1
        var orang2 = new a1_Wedangan();

        a1_Wedangan orang3 = new a1_Wedangan();  // 2. mendeklarasi kan antara class a2 dengan a1

        a1_Wedangan orang4;
        orang3 = new a1_Wedangan();            // 3. mendeklarasi kan antara class a2 dengan a1


        System.out.println(orang1);         // menampilkan hasil deklarasi di baris ke 9 - 15
        System.out.println(orang2);
        System.out.println(orang3);

    }
}
