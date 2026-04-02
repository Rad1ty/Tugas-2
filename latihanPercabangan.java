import java.util.Scanner;;
public class latihanPercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //daftar member (nama,alamat,no hp)
        String namaMember="", alamatMember="", noHpMember="";
        String jawaban = "";
        String namaBarang;
        double harga=0.0, jumlah=0.0, total=0.0, diskon=0.0, grandTotal=0.0;

        //output nanya daftar member atau tidak
        System.out.print("Apakah anda sudah menjadi member? (ya/tidak) : "); //untuk memberi text input
        jawaban = scanner.nextLine();

        //mengecek jawaban user dengan jawaban ya/tidak menggunakan if
        // equals = case sensitive ( harus sesuai kapital atau tidak)
        //equalsignorecase = tidak case sensitive (tidak harus sesuai kapital atau tidak)
        // || = atau
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.print("masukkan nama anda: ");
            namaMember = scanner.nextLine();
            System.out.print("masukkan alamat anda: ");
            alamatMember = scanner.nextLine();
            System.out.print("masukkan no hp anda: ");
            noHpMember = scanner.nextLine();

            System.out.print("ingin belanja? (ya/tidak) : ");
            jawaban = scanner.nextLine();
            if (jawaban.equalsIgnoreCase("ya")) {
                System.out.print("Nama barang : ");
                namaBarang = scanner.nextLine();

                System.out.print("Harga : ");
                harga = scanner.nextDouble();

                System.out.print("Jumlah beli : ");
                jumlah = scanner.nextDouble();

                total = harga * jumlah;
                diskon = (int) (total * 0.1);
                grandTotal = total - diskon;
                System.out.println("Total : " + total);
                System.out.println("Diskon : " + diskon);
                System.out.println("Grand Total : " + grandTotal);
                // menghitung diskon sendiri
                if (total > 100000.0) {
                    diskon = total * 0.05 * 0.02;
                } else if (total >300000.0) {
                    diskon = total * 0.1 *0.2;
                }
            }
        } else {
            System.out.println("terimakasih dan selamat berbelanja");
        }
       
        // jika menggunakan ignorecase
        // if (jawaban.equals("ya") || jawaban.equals("Ya") || jawaban.equals("YA")) {
            
        // } else {

        // }



    }
}
