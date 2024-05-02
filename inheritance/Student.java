// Soal 2
package inheritance;

public class Student extends Person {
    String nim;
    public Student() {
        // System.out.println("Inside Student:Constructor");  // Commented out to prevent output
        super.name = "Anda";
    }
    
    public String getNim() {
        return nim;
    }
    
    @Override
    public void identity() {
        System.out.println("NIM: " + getNim());
        System.out.println("Nama: " + super.name);
        System.out.println("Alamat: " + super.address);
    }
    
    public void job() {
        System.out.println("Pekerjaan : Mahasiswa");
    }
    
    public String getName() {
        System.out.println("Student name: " + name);
        return name;
    }
    
    public void hitungPembayaran(int biayaSPP, int biayaSKS, int biayaModul) {
        int total = biayaSPP + biayaSKS + biayaModul;
        System.out.println("Total Pembayaran: " + total);
    }
}





// package inheritance;

// public class Student extends Person{
// 	String nim;
// 	public Student() {
// 		System.out.println("Inside Student:Constructor");
// 		super.name="Anda";
// 	}
	
// 	public String getNim()
// 	{
// 		return nim;
// 	}
	
// 	@Override
// 	public void identity()
// 	{
// 		System.out.println("NIM: "+getNim());
// 		System.out.println("Nama: "+super.name);
// 		System.out.println("Alamat: "+super.address);
// 	}
	
// 	public void job()
// 	{
// 		System.out.println("Pekerjaan : Mahasiswa");
// 	}
	
// 	public String getName() {
// 		System.out.println("Student name: "+name);
// 		return name;
// 	}
		
// }
