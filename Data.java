
public class Data {
	
	private String namaMotor;
	private String jenisMotor;
	private String platNomor;
	private String available;

	public Data(String namaMotor, String jenisMotor, String platNomor, String available) {
		super();
		this.namaMotor = namaMotor;
		this.jenisMotor = jenisMotor;
		this.platNomor = platNomor;
		this.available = available;
	}

	public String getNamaMotor() {
		return namaMotor;
	}

	public void setNamaMotor(String namaMotor) {
		this.namaMotor = namaMotor;
	}

	public String getJenisMotor() {
		return jenisMotor;
	}

	public void setJenisMotor(String jenisMotor) {
		this.jenisMotor = jenisMotor;
	}

	public String getPlatNomor() {
		return platNomor;
	}

	public void setPlatNomor(String platNomor) {
		this.platNomor = platNomor;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		available = "Not Available";
		this.available = available;
	}

}

