
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produk[] databaseProduk = {
                new Produk("Beras", 55000),
                new Produk("Gula", 10000),
                new Produk("Minyak Goreng", 56000),
                new Produk("Sabun", 15000),
                new Produk("Telur", 2500)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Filkom mart!");
        System.out.println("Selamat berbelanja");
        System.out.print("Jumlah barang yang dibeli? ");
        int jumlahJenisBarang = scanner.nextInt();
        scanner.nextLine();

        Keranjang keranjangBelanja = new Keranjang(jumlahJenisBarang);

        for (int i = 0; i < jumlahJenisBarang; i++) {
            System.out.println("Barang ke-" + (i + 1));

            System.out.print("Nama Barang " + (i + 1) + ": ");
            String namaBarangInput = scanner.nextLine();
            Produk produkTerpilih = null;
            boolean ditemukan = false;
            for (Produk p : databaseProduk) {
                if (p.getNama().equalsIgnoreCase(namaBarangInput)) {
                    produkTerpilih = p;
                    ditemukan = true;
                    break;
                }
            }

            if (ditemukan) {
                System.out.print("Jumlah Barang " + (i + 1) + ": ");
                int jumlahSatuan = scanner.nextInt();
                scanner.nextLine();

                ItemBelanja itemBaru = new ItemBelanja(produkTerpilih, jumlahSatuan);
                keranjangBelanja.tambahItem(itemBaru);

            } else {
                System.out.println("Produk tidak ditemukan.");
            }
        }

        keranjangBelanja.cetakStruk();

    }
}