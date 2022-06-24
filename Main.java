import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	Vector<Data> data = new Vector<>();
	Vector<DataPemesan> dp = new Vector<>();
	
	public void clear() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	public void mainMenu() {
		System.out.println("Rental Motor Hansen");
		System.out.println("===================");
		System.out.println("1. Lihat list motor");
		System.out.println("2. Pesan motor");
		System.out.println("3. Lihat data pemesan (Admin only)");
		System.out.println("4. Exit");
		System.out.println(">>");
	}
	
	public void setData() {
		Random rand = new Random();
		String platNomor = "";
		String available = "Available";
		
		if(data.isEmpty()) {
			platNomor = "B " + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			data.add(new Data("Vario","Matic",platNomor,available));
			
			platNomor = "B " + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			data.add(new Data("Beat","Matic",platNomor,available));
			
			platNomor = "B " + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			data.add(new Data("Mio","Matic",platNomor,available));
			
			platNomor = "B " + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			data.add(new Data("CBR 150","Sport",platNomor,available));
			
			platNomor = "B " + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			data.add(new Data("Revo","Manual",platNomor,available));
		}
		
	}
	
	public void viewList(Vector<Data> data) {
		for (Data data2 : data) {
			System.out.println(data2.getNamaMotor()+ "\t" + data2.getJenisMotor() + "\t" + data2.getPlatNomor()
			+ "\t" + data2.getAvailable());
		}
		System.out.println();
	}
	
	public void bookingMotor(Vector<Data> data, Vector<DataPemesan> dp) {
		String nama = "";
		int umur = 0;
		String rentDate = "";
		String platNomor = "";
		String available = "Available";
		int flag = 0;
		
		viewList(data);
		System.out.println("Masukan plat nomor yang ingin di rental: ");
		platNomor = sc.nextLine();
		for (Data data2 : data) {
			if(data2.getPlatNomor().equals(platNomor)) {
				flag = 1;
				data2.setAvailable(available);
			}
		}
		if(flag == 0) {
			System.out.println("Plat nomor tidak ada");
			return;
		}
		
		System.out.println("Masukan Nama:");
		nama = sc.nextLine();
		
		System.out.println("Masukan Umur:");
		try {
			umur = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			umur = 0;
		}
		sc.nextLine();
		
		System.out.println("Masukan tanggal rental:");
		rentDate = sc.nextLine();
		
		dp.add(new DataPemesan(nama, umur, rentDate));
		
		System.out.println("Booking Selesai");
		
	}
	
	public void viewDP(Vector<Data> data, Vector<DataPemesan> dp) {
		String password = "LI01";
		String tempPass = "";
		
		System.out.print("Enter Password:");
		tempPass = sc.nextLine();
		
		if(password.equals(tempPass)) {
			viewList(data);
			for (int i = 0; i < dp.size(); i++) {
				System.out.print(dp.get(i).getNama()+" | "+dp.get(i).getUmur()+" | "+dp.get(i).getRentDate()+" | ");
//				for (int j = 0; j < data.size(); j++) {
//					if(data.get(j).getAvailable().equals("Not Available")) {
//						System.out.println(data.get(j).getNamaMotor());
//					}
//				}
			}
		}else {
			return;
		}
	}
	
	

	public Main() {
		// TODO Auto-generated constructor stub
		
		boolean isRun = true;
		int input = -1;
		setData();
		do {
			do {
				mainMenu();
				try {
					input = sc.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					input = -1;
				}
				sc.nextLine();
			} while (input < 1 || input >5);
			switch (input) {
			case 1:
				clear();
				viewList(data);
				break;
			case 2:
				clear();
				bookingMotor(data,dp);
				break;
			case 3:
				clear();
				viewDP(data,dp);
				break;
			case 4:
				isRun = !isRun;
				break;
			default:
				break;
			}
		} while (isRun);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Main();
	}

}
