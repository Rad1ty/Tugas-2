import java.util.Scanner;

public class Uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        
        double[] pemakaian = new double[7];
        
      
        int pilihan;
        
        do {
            System.out.println("\n Pencatatan Penggunaan Internet Harian ");
            System.out.println("1. Input Data Penggunaan Kuota");
            System.out.println("2. Tampilkan Kategori Pemakaian");
            System.out.println("3. Print Out Hasil (Total Kuota dan Hari Terbesar)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Input Data Penggunaan Kuota ---");
                    for (int i = 0; i < hari.length; i++) {
                        System.out.print("Masukkan pemakaian untuk " + hari[i] + " (GB): ");
                        pemakaian[i] = sc.nextDouble();
                    }
                    System.out.println("Data berhasil diinput!");
                    break;
                    
                case 2:
                    System.out.println("\n--- Kategori Pemakaian Per Hari ---");
                    for (int i = 0; i < hari.length; i++) {
                        String kategori;
                        if (pemakaian[i] > 15) {
                            kategori = "Tinggi";
                        } else if (pemakaian[i] > 8) {
                            kategori = "Sedang";
                        } else {
                            kategori = "Rendah";
                        }
                        System.out.println(hari[i] + ": " + pemakaian[i] + " GB - Kategori: " + kategori);
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- Print Out Hasil ---");
                    
                    double total = 0;
                    for (double p : pemakaian) {
                        total += p;
                    }
                    System.out.println("Total Penggunaan Kuota: " + total + " GB");
                    
                    double maxPemakaian = pemakaian[0];
                    for (int i = 1; i < pemakaian.length; i++) {
                        if (pemakaian[i] > maxPemakaian) {
                            maxPemakaian = pemakaian[i];
                        }
                    }
                    
                    StringBuilder hariTerbesar = new StringBuilder();
                    for (int i = 0; i < hari.length; i++) {
                        if (pemakaian[i] == maxPemakaian) {
                            if (hariTerbesar.length() > 0) {
                                hariTerbesar.append(", ");
                            }
                            hariTerbesar.append(hari[i]);
                        }
                    }
                    
                    System.out.println("Pemakaian Terbesar: " + maxPemakaian + " GB pada hari: " + hariTerbesar.toString());
                    break;
                    
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);
        
        sc.close();
    }
}
