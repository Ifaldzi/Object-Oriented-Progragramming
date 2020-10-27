public class Restaurant
{
	// ubah jadi objek makanan
	private Makanan[] menuMakanan;
	private static byte id = 0;

	public Restaurant()
	{
		menuMakanan = new Makanan[10];
	}

	public void tambahMenuMakanan(String nama, double harga, int stok)
	{
		this.menuMakanan[id] = new Makanan(nama, harga, stok);
	}

	public void tampilMenuMakanan()
	{
		for(int i = 0; i<=id; i++)
		{
			if(!isOutOfStock(i))
			{
				// diubah
				menuMakanan[i].PrintMakanan();
			}
		}
	}

	public boolean isOutOfStock(int id)
	{
		if(menuMakanan[id].getStok() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void nextId()
	{
		id++;
	}

	public void Pesan(String namaMakanan, int jumlah)
	{
		for(int i = 0;i<=id;i++)
		{
			if(namaMakanan.equals(menuMakanan[i].getNamaMakanan()))
			{
				if(menuMakanan[i].getStok() >= jumlah)
				{
					System.out.println(jumlah + " " + menuMakanan[i].getNamaMakanan() + " terjual!");
					menuMakanan[i].kurangStok(jumlah);
				}
				else System.out.println("Stok " + menuMakanan[i].getNamaMakanan() + " tidak cukup!");
			}
		}
	}
}