import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan daftar usia (pisahkan dengan spasi):");
        String input = sc.nextLine();
        
        // split input menjadi array berdasarkan spasi
        String[] agesArray = input.split(" ");
        
        // untuk dia pisahkan menjadi dua list: satu untuk yang lolos dan satu untuk yang gagal
        List<Integer> passed = new ArrayList<>();
        List<Integer> failed = new ArrayList<>();
        
        for (String ageStr : agesArray) {
            try {
                int age = Integer.parseInt(ageStr);
                
                // Logika utama: Minimal 28 (20+8) dan Maksimal 118
                if (age >= 28 && age <= 118) {
                    passed.add(age);
                } else {
                    failed.add(age);
                }
            } catch (NumberFormatException e) {
                // Menangani jika ada input yang bukan angka
                System.out.println("Input '" + ageStr + "' bukan angka valid, dilewati.");
            }
        }
        
        // Output hasil sesuai format yang diminta
        System.out.println(passed);
        System.out.println(failed);
        
        sc.close();
    }
}