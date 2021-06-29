import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try {
			LocalDate myObj = LocalDate.now(); //date
			LocalTime time = LocalTime.now(); //time
			
			System.out.println("\t"+myObj+"\t "+time);
			SemutHitam semutHitam=new SemutHitam();
			Jenis jenis1 =new Jenis();
			
			jenis1.kategori();
			jenis1.kategori("Australia");
			semutHitam.warna();
			semutHitam.jumlahKaki();
			semutHitam.jumlahTangan();
			
			SemutApi api =new SemutApi();
			Jenis2 jenis2 = new Jenis2();
			
			jenis2.kategori();
			jenis2.kategori("Indonesia");
			
			api.warna();
			api.jumlahKaki();
			api.jumlahTangan();
		}catch(Exception e) {
			System.out.println("terjadi kesalahan"+e);
		}
		
	}
}
