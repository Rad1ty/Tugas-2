package tugas;
import java.util.Scanner;
public class latihanpraktikum6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("Pilih pola:");
            System.out.println("1. full");
            System.out.println("2. berurutan kecil ke besar");
            System.out.println("3. berurutan besar ke kecil");
            System.out.println("4. mirror");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = scanner.nextInt();
            
            System.out.print("Masukkan ukuran: ");
            int n = scanner.nextInt();
            if (pilihan == 5) {
                running = false;
                System.out.println("Terima kasih!");
                break;
            }
          
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                    
                case 4:
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}