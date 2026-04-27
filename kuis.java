import java.util.Scanner;

public class kuis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        int jumlahPeserta = 0;
        char pilihan;

        do {
            // Input data peserta
            System.out.print("Masukkan nama peserta: ");
            nama = scanner.nextLine();

            // Validasi sederhana
            if (!nama.isEmpty()) {
                jumlahPeserta++;
                System.out.println("Peserta \"" + nama + "\" berhasil didaftarkan.");
            } else {
                System.out.println("Nama tidak boleh kosong!");
            }

            // Tanya lanjut atau tidak
            System.out.print("Tambah peserta lagi? (Y/T): ");
            pilihan = scanner.next().charAt(0);
            scanner.nextLine(); // membersihkan buffer

        } while (pilihan == 'Y' || pilihan == 'y');

        // Output hasil
        System.out.println("\nJumlah peserta terdaftar: " + jumlahPeserta);

        scanner.close();
    }
} 

