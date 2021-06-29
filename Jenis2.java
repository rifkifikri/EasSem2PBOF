
public class Jenis2 implements Kategori{
	//overloading
	public void kategori() {
		System.out.println("Semut Api");
	}
	//overloading
	public void kategori(String asal){
		String asalnya;
		asalnya=asal;
		System.out.println("asal semut dari : "+ asalnya);
	}
}
