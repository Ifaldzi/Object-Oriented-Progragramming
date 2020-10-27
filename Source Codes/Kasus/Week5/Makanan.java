public class Makanan
{
	// pindahin ke sini tapi jangan array
	private String nama_makanan;
	private double harga_makanan;
	private int stok;

	// bikin konstruktor nya
	public Makanan(String _namaMakanan, double _hargaMakanan, int _stok)
	{
		this.nama_makanan = _namaMakanan;
		this.harga_makanan = _hargaMakanan;
		this.stok = _stok;
	}

	public String getNamaMakanan()
	{
		return nama_makanan;
	}

	public int getStok()
	{
		return stok;
	}

	public void PrintMakanan()
	{
		System.out.println(nama_makanan + "[" + stok + "]" + "\tRp. " + harga_makanan);
	}

	// fitur pengurangan stok
	public void kurangStok(int jumlah)
	{
		stok -= jumlah;
	}
}