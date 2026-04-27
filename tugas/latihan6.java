import java.util.Scanner;
public class latihan6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah elemen array: ");
            int n = input.nextInt();
            int[] array = new int[n];
            System.out.println("Masukkan elemen array:");
            for (int i = 0; i < n; i++) {
                array[i] = input.nextInt();
            }
            System.out.println("Elemen array yang dimasukkan:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
                
            }
        }
    }
}