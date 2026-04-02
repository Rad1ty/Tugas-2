import java.util.Scanner;

public class SKSfromIP {

    // Fungsi menentukan SKS maksimal
    public static int hitungMaksSKS(double ip) {
        if (ip >= 3.50) return 24;
        else if (ip >= 3.00) return 22;
        else if (ip >= 2.00) return 20;
        else if (ip >= 0.00) return 18;
        else return 12;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan IP Semester: ");
        double ip = input.nextDouble();

        if (ip < 0 || ip > 4) {
            System.out.println("IP tidak valid!");
        } else {
            int sks = hitungMaksSKS(ip);

            System.out.println("\n=== HASIL ===");
            System.out.println("IP: " + ip);
            System.out.println("Maksimal SKS yang bisa diambil: " + sks);
            
            switch (sks) {
                case 24:
                    System.out.println("Sangat Baik");
                    break;
                case 22:
                    System.out.println("Baik");
                    break;
                case 20:
                    System.out.println("Cukup");
                    break;
                case 18:
                    System.out.println("Kurang");
                    break;
                default:
                    System.out.println("Sangat Kurang");
            }
        }

        input.close();
    }
}