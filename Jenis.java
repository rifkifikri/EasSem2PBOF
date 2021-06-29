
public class Jenis implements Kategori{
	//overloading
	public void kategori() {
		System.out.println("Semut Hitam");
	}
	//overloading
	public void kategori(String asal){
		String asalnya;
		asalnya=asal;
		System.out.println("asal semut dari : "+ asalnya);
	}
}
