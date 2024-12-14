public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String kategori;
    private int stok;
    private double harga;
    private String pemasok;

    public Barang(String kodeBarang, String namaBarang, String kategori, int stok, double harga, String pemasok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
        this.pemasok = pemasok;
    }

    public String getKodeBarang() { return kodeBarang; }
    public void setKodeBarang(String kodeBarang) { this.kodeBarang = kodeBarang; }

    public String getNamaBarang() { return namaBarang; }
    public void setNamaBarang(String namaBarang) { this.namaBarang = namaBarang; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public String getPemasok() { return pemasok; }
    public void setPemasok(String pemasok) { this.pemasok = pemasok; }
}
