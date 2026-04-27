public class latihanpertemuan7Nestedloop{
    public static void main(String[] args) {
        int totalSemuaHari = 0;
        for (int hari = 1; hari<= 3; hari++) {
            int totalPerHari = 0;
            System.out.println("Hari ke-" + hari);
            for (int transaksi = 1; transaksi <=3; transaksi++) {
                int jumlah = 50000;

                System.out.println(" - Transkaksi " + transaksi +": " + jumlah);
                totalPerHari += jumlah;
            }
            System.out.println("Total: " + totalPerHari);
            System.out.println();

            totalSemuaHari += totalPerHari;
            System.out.println("Total semua hari:" + totalSemuaHari);
        }
    }
}
