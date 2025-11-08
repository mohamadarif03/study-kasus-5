 class Keranjang {
    private ItemBelanja[] daftarItem;
    private int indexSekarang;

    public Keranjang(int ukuran) {
        this.daftarItem = new ItemBelanja[ukuran];
        this.indexSekarang = 0;
    }

    public void tambahItem(ItemBelanja item) {
        if (this.indexSekarang < this.daftarItem.length) {
            this.daftarItem[this.indexSekarang] = item;
            this.indexSekarang++;
        } else {
            System.out.println("Keranjang sudah penuh!");
        }
    }

    public int getTotalBelanja() {
        int total = 0;
        for (int i = 0; i < this.indexSekarang; i++) {
            total += this.daftarItem[i].getTotalHarga();
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("\n======= STRUK BELANJA FILKOMMART =======");
        System.out.printf("%-15s | %-12s | %-5s | %-12s%n", "Nama Barang", "Harga Satuan", "Jml", "Total");

        for (int i = 0; i < this.indexSekarang; i++) {
            ItemBelanja item = this.daftarItem[i];
            String nama = item.getProduk().getNama();
            int hargaSatuan = item.getProduk().getHarga();
            int jumlah = item.getJumlah();
            int totalItem = item.getTotalHarga();

            System.out.printf("%-15s | Rp%,11d | %5d | Rp%,11d%n", nama, hargaSatuan, jumlah, totalItem);
        }

        System.out.println("--------------------------------------------------");
        int totalBelanja = this.getTotalBelanja();
        System.out.printf("%-36s | Rp%,11d%n", "TOTAL BELANJA", totalBelanja);
        System.out.println("======== Terima Kasih Telah Berbelanja ========");
    }
}
