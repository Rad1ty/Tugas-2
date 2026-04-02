//1. import class
import java.util.Scanner;
public class latihanScanner {
    public static void main(String[] args) {
        //2. declare scanner
        Scanner scanner = new Scanner(System.in);

        //3. input (declare variabel)
        String namaBarang;
        int harga = 0, jumlahBeli = 0, total = 0;

        //teks input
        System.out.print("Nama barang : ");
        namaBarang = scanner.nextLine(); // nextLine untuk string

        System.out.print("Harga : ");
        harga = scanner.nextInt(); // nextInt untuk bilangan bulat

        System.out.print("Jumlah beli : ");
        jumlahBeli = scanner.nextInt();

        //4. output
        total = harga * jumlahBeli;
        System.out.println("Total : " + total);

        scanner.close();
    }
}
