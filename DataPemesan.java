
public class DataPemesan{
	private String nama;
	public int umur;
	private String rentDate;
	
	public DataPemesan(String nama, int umur, String rentDate) {
		super();
		this.nama = nama;
		this.umur = umur;
		this.rentDate = rentDate;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate(String rentDate) {
		this.rentDate = rentDate;
	}
	
	
}
