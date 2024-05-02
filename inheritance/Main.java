package inheritance;

import java.util.Scanner;  // Import the Scanner class

public class Main {
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

        // Creating and using the Student object
        Student std = new Student();  // Create a Student object
        std.setName(name);
        std.setAddress(address);
        std.hobi(hobby);  // Display hobby
        std.hitungPembayaran(biayaSPP, biayaSKS, biayaModul);  // Call hitungPembayaran to calculate total

        scanner.close();  // Close the scanner
    }
}


// Soal 3
// package inheritance;

// import java.util.Scanner;  // Import the Scanner class

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  // Create a Scanner object

//         System.out.println("Enter name:");
//         String name = scanner.nextLine();  // Read user input for name
        
//         System.out.println("Enter address:");
//         String address = scanner.nextLine();  // Read user input for address
        
//         System.out.println("Enter NIM:");
//         String nim = scanner.nextLine();  // Read user input for NIM

//         // Asking for payment details
//         System.out.println("Enter SPP fee:");
//         int biayaSPP = scanner.nextInt();  // Read user input for SPP fee
        
//         System.out.println("Enter SKS fee:");
//         int biayaSKS = scanner.nextInt();  // Read user input for SKS fee

//         System.out.println("Enter Modul fee:");
//         int biayaModul = scanner.nextInt();  // Read user input for Modul fee

//         scanner.nextLine();  // Consume newline left-over

//         System.out.println("Enter your hobby:");
//         String hobby = scanner.nextLine();  // Read user input for hobby

//         Student std = new Student();  // Create a Student object
//         std.setName(name);
//         std.setAddress(address);
//         std.hobi(hobby);  // Display hobby
//         std.hitungPembayaran(biayaSPP, biayaSKS, biayaModul);  // Call hitungPembayaran to calculate total

//         scanner.close();  // Close the scanner
//     }
// }



// Soal 2
// package inheritance;

// import java.util.Scanner;  // Import the Scanner class

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  // Create a Scanner object

//         System.out.println("Enter name:");
//         String name = scanner.nextLine();  // Read user input for name
        
//         System.out.println("Enter address:");
//         String address = scanner.nextLine();  // Read user input for address
        
//         System.out.println("Enter NIM:");
//         String nim = scanner.nextLine();  // Read user input for NIM

//         // Asking for payment details
//         System.out.println("Enter SPP fee:");
//         int biayaSPP = scanner.nextInt();  // Read user input for SPP fee
        
//         System.out.println("Enter SKS fee:");
//         int biayaSKS = scanner.nextInt();  // Read user input for SKS fee

//         System.out.println("Enter Modul fee:");
//         int biayaModul = scanner.nextInt();  // Read user input for Modul fee

//         Student std = new Student();  // Create a Student object
//         std.hitungPembayaran(biayaSPP, biayaSKS, biayaModul);  // Call hitungPembayaran to calculate total

//         scanner.close();  // Close the scanner
//     }
// }



// Soal 1
// package inheritance;

// import java.util.Scanner;  // Import the Scanner class

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  // Create a Scanner object

//         System.out.println("Enter name:");
//         String name = scanner.nextLine();  // Read user input for name
        
//         System.out.println("Enter address:");
//         String address = scanner.nextLine();  // Read user input for address
        
//         System.out.println("Enter NIM:");
//         String nim = scanner.nextLine();  // Read user input for NIM

//         Mahasiswa mhs = new Mahasiswa(nim, name, 20);  // Create a Mahasiswa object with user input
        
//         mhs.cetak();  // Print the Mahasiswa information
//         scanner.close();  // Close the scanner
//     }
// }

// codingan default
// package inheritance;

// public class Main {
//     public static void main(String[] args) {
        
//         boolean isOspek = false;
        
//         Mahasiswa mhs = new Mahasiswa("A11.2000.00001", "Rudi", 20);
//         MahasiswaBaru mb = new MahasiswaBaru("A11.2001.00002", "Susi", 18, "SMA Negeri 1 Semarang");
//         MahasiswaAktif ma = new MahasiswaAktif("A11.2000.00002", "Tony", 20, 4);

//         mhs.cetak();
//         isOspek = mb.ikutOspek();
//         mb.cetak();
//         if(isOspek){
//             System.out.println(mb.nama+" mengikuti Ospek");
//         }
//     }
// }
