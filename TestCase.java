import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan daftar usia (pisahkan dengan spasi):");
        String input = sc.nextLine();
        String[] agesArray = input.split(" ");
        
        List<Integer> passed = new ArrayList<>();
        List<Integer> failed = new ArrayList<>();
        
        for (String ageStr : agesArray) {
            int age = Integer.parseInt(ageStr);
            if (age >= 28 && age <= 118) {
                passed.add(age);
            } else {
                failed.add(age);
                }
        }
        System.out.println(passed);
        System.out.println(failed);
        
        sc.close();
    }
}