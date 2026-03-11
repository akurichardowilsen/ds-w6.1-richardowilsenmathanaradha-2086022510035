import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan daftar usia (pisahkan dengan spasi):");
        // Input harus berupa String sesuai constraint
        String input = sc.nextLine();
        String[] agesArray = input.split(" ");
        
        // Menggunakan Queue (LinkedList) sebagai struktur data
        Queue<Integer> passed = new LinkedList<>();
        Queue<Integer> failed = new LinkedList<>();
        
        for (String ageStr : agesArray) {
            try {
                int age = Integer.parseInt(ageStr);
                
                // Logika pengecekan usia
                if (age >= 28 && age <= 118) {
                    enqueue(passed, age);
                } else {
                    enqueue(failed, age);
                }
            } catch (NumberFormatException e) {
                // Menangani jika ada input yang bukan angka
                continue;
            }
        }

        // Menampilkan output (berisi Integer)
        System.out.println("Passed (Queue): " + passed);
        System.out.println("Failed (Queue): " + failed);
        
        // Contoh penggunaan remove/dequeue jika ingin mengosongkan antrian
        if (!passed.isEmpty()) {
            System.out.println("Data pertama yang diproses: " + dequeue(passed));
        }

        sc.close();
    }

    // Fungsi bantuan untuk Enqueue (menambah ke antrian)
    public static void enqueue(Queue<Integer> queue, int value) {
        queue.add(value);
    }

    // Fungsi bantuan untuk Dequeue (mengambil dari antrian)
    public static Integer dequeue(Queue<Integer> queue) {
        return queue.remove();
    }
}