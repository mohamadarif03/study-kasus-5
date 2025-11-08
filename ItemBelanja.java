 class ItemBelanja {
    private Produk produk;
    private int jumlah;

    public ItemBelanja(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return this.produk;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public int getTotalHarga() {
        return this.produk.getHarga() * this.jumlah;
    }
}