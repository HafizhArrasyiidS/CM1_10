import java.util.Scanner;

public class CM1_10 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Input Data Mahasiswa
                System.out.println("===== INPUT DATA MAHASISWA =====");
                System.out.print("Nama\t: ");
                String nama = sc.nextLine();
                System.out.print("NIM\t: ");
                String nim = sc.nextLine();

                // Input Nilai Mata Kuliah 1
                System.out.println("\n --- Mata Kuliah 1: Algoritma dan Pemrograman ---");
                System.out.print("Nilai UTS\t: ");
                int uts1 = sc.nextInt();
                System.out.print("Nilai UAS\t: ");
                int uas1 = sc.nextInt();
                System.out.print("Nilai Tugas\t: ");
                int tugas1 = sc.nextInt();

                // Input Nilai Mata Kuliah 2
                System.out.println("\n --- Mata Kuliah 2: Struktur Data ---");
                System.out.print("Nilai UTS\t: ");
                int uts2 = sc.nextInt();
                System.out.print("Nilai UAS\t: ");
                int uas2 = sc.nextInt();
                System.out.print("Nilai Tugas\t: ");
                int tugas2 = sc.nextInt();

                // Hitung Nilai Akhir
                double nilaiAkhir1 = (0.3 * tugas1) + (0.3 * uts1) + (0.4 * uas1);
                double nilaiAkhir2 = (0.3 * tugas2) + (0.3 * uts2) + (0.4 * uas2);

                // Hitung Rata-Rata Nilai Akhir (dalam tabel)
                double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

                // Menentukan Status Lulus atau Tidak (dalam tabel)
                String status1 = (nilaiAkhir1 >= 70) ? "LULUS" : "TIDAK LULUS";
                String status2 = (nilaiAkhir2 >= 70) ? "LULUS" : "TIDAK LULUS";

                // Menentukan Status Lulus atau Tidak (hasil akhir)
                // String status3 = (rataRata >= 70) ? "LULUS (RATA-RATA > 70)" : "TIDAK LULUS (RATA-RATA < 70)";

                // Mengkonversikan Nilai Angka ke Predikat (per mata kuliah)
                String predikat1, predikat2;

                if (nilaiAkhir1 >= 80)
                        predikat1 = "A";
                else if (nilaiAkhir1 >= 73)
                        predikat1 = "B+";
                else if (nilaiAkhir1 >= 65)
                        predikat1 = "B";
                else if (nilaiAkhir1 >= 60)
                        predikat1 = "C+";
                else if (nilaiAkhir1 >= 50)
                        predikat1 = "C";
                else if (nilaiAkhir1 >= 39)
                        predikat1 = "D";
                else
                        predikat1 = "E";

                if (nilaiAkhir2 >= 80)
                        predikat2 = "A";
                else if (nilaiAkhir2 >= 73)
                        predikat2 = "B+";
                else if (nilaiAkhir2 >= 65)
                        predikat2 = "B";
                else if (nilaiAkhir2 >= 60)
                        predikat2 = "C+";
                else if (nilaiAkhir2 >= 50)
                        predikat2 = "C";
                else if (nilaiAkhir2 >= 39)
                        predikat2 = "D";
                else
                        predikat2 = "E";

                // Menentukan Status Kelulusan Berdasarkan Rata-Rata Nilai Akhir
                String status3;
                if (status1.equals("TIDAK LULUS") || status2.equals("TIDAK LULUS")) {
                        status3 = "TIDAK LULUS (ADA MATA KULIAH YANG TIDAK LULUS)";
                } else if (rataRata >= 70) {
                        status3 = "LULUS (RATA-RATA > 70)";
                } else {
                        status3 = "TIDAK LULUS (RATA-RATA < 70)";
                }

                // Output Hasil
                System.out.println("\n================== HASIL PENILAIAN AKADEMIK ==================");
                System.out.println("Nama\t: " + nama);
                System.out.println("NIM\t: " + nim);
                System.out.println("\nMata Kuliah\t\t\t UTS\t UAS\t Tugas\t Nilai Akhir\t Nilai Huruf\t Status");
                System.out.println(
                                "-------------------------------------------------------------------------------------------------");
                // Menampilkan hasil untuk setiap mata kuliah
                // String.fortmat digunakan untuk membatasi angka desimal menjadi 2 tempat
                System.out.println("Algoritma dan Pemrograman\t " + uts1 + "\t " + uas1 + "\t " + tugas1 + "\t "
                                + String.format("%.2f", nilaiAkhir1) + "\t\t " + predikat1 + "\t\t " + status1);
                System.out.println("Struktur Data\t\t\t " + uts2 + "\t " + uas2 + "\t " + tugas2 + "\t "
                                + String.format("%.2f", nilaiAkhir2) + "\t\t " + predikat2 + "\t\t " + status2);

                // Menampilkan rata-rata dari nilai kedua mata kuliah
                System.out.println("\nRata-Rata Nilai Akhir: " + String.format("%.2f", rataRata));

                // Menampilkan status kelulusan berdasarkan rata-rata nilai akhir
                System.out.println("Status Semester: " + status3);
        }
}
