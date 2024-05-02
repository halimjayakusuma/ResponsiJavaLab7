//Soal 4
package inheritance;

import java.util.Scanner;  // Import the Scanner class

public class InheritMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        // Collecting user information
        System.out.println("Enter name:");
        String name = scanner.nextLine();  // Read user input for name
        
        System.out.println("Enter address:");
        String address = scanner.nextLine();  // Read user input for address
        
        System.out.println("Enter NIM:");
        String nim = scanner.nextLine();  // Read user input for NIM

        // Collecting payment details
        System.out.println("Enter SPP fee:");
        int biayaSPP = scanner.nextInt();  // Read user input for SPP fee
        
        System.out.println("Enter SKS fee:");
        int biayaSKS = scanner.nextInt();  // Read user input for SKS fee

        System.out.println("Enter Modul fee:");
        int biayaModul = scanner.nextInt();  // Read user input for Modul fee

        scanner.nextLine();  // Consume newline left-over
        
        System.out.println("Enter your hobby:");
        String hobby = scanner.nextLine();  // Read user input for hobby

        // Displaying all the collected information
        System.out.println("\nCollected Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("NIM: " + nim);
        System.out.println("SPP Fee: " + biayaSPP);
        System.out.println("SKS Fee: " + biayaSKS);
        System.out.println("Modul Fee: " + biayaModul);
        System.out.println("Hobby: " + hobby);

        // Assuming the existence of a method to create Student and Employee objects, manipulate them if necessary
        Person ref;  // Reference for Person type
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        
        ref = studentObject;
        ref.setName(name);
        ref.setAddress(address);
        ((Student) ref).hobi(hobby);
        ((Student) ref).hitungPembayaran(biayaSPP, biayaSKS, biayaModul);

        scanner.close();  // Close the scanner
    }

}


// package inheritance;

// public class InheritMain {

// 	public static void main(String[] args) {
// //		Student mahasiswa  = new Student();
// //		mahasiswa.identity();
// //		mahasiswa.job();
		
// 		Person ref;
// 		Student studentObject = new Student();
// 		Employee employeeObject = new Employee();
		
// 		ref = studentObject;
// //		
// 		String temp = ref.getName();
// 		System.out.println(temp);
		
// 		ref = employeeObject;
		
// 		String temp1 = ref.getName();
// 		System.out.println(temp);
// 	}

// }
