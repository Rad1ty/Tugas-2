import java.util.Scanner;

public class latihanpraktikum7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        int pilihan;

        int max;
        int cari;
        boolean ditemukan;

        do {
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Cari Nilai Tertinggi");
            System.out.println("3. Cari Angka (Searching)");
            System.out.println("4. Tampilkan Array Terbalik");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Isi array: ");
                    for (int i = 0; i < data.length; i++) {
                        System.out.print(data[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    max = data[0]; // reset nilai awal
                    for (int i = 1; i < data.length; i++) {
                        if (data[i] > max) {
                            max = data[i];
                        }
                    }
                    System.out.println("Nilai tertinggi: " + max);
                    break;

                case 3:
                    System.out.print("Masukkan angka yang dicari: ");
                    cari = input.nextInt();

                    ditemukan = false; // reset
                    for (int i = 0; i < data.length; i++) {
                        if (data[i] == cari) {
                            ditemukan = true;
                            break;
                        }
                    }

                    if (ditemukan) {
                        System.out.println("Angka ditemukan!");
                    } else {
                        System.out.println("Angka tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.print("Array dari belakang: ");
                    for (int i = data.length - 1; i >= 0; i--) {
                        System.out.print(data[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        input.close();
    }
}