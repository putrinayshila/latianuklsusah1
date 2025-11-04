import java.util.Scanner;

public class soalsusah1 {
    


    
    // Fungsi untuk menghitung rata-rata
    static double hitungRataRata(double[] nilai, int jumlahSiswa) {
        double total = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            total += nilai[i];
        }
        return total / jumlahSiswa;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        
        double[] nilai = new double[jumlah];
        
        // Input nilai tiap siswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
        }
        
        // Hitung rata-rata dengan memanggil fungsi
        double rata = hitungRataRata(nilai, jumlah);
        
        System.out.printf("\nRata-rata nilai ujian Produktif RPL = %.2f\n", rata);
    }
}

}
