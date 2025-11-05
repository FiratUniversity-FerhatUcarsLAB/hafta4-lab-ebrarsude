Öğrenci no: 250541104
Ad soyad: Ebrar Sude Yıldırım
Tarih: 05.11.2025
Görev adı: Geometrik Hesap

  public class GeometrikHesap {
    public static void main(String[] args) {

        final double PI = 3.14159;
        double r = 8; // Yarıçap sabit olarak verilmiştir

        double daireAlani = PI * Math.pow(r, 2);
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * Math.pow(r, 2);

        System.out.println("\n--- Hesap Sonuclari (r = 8) ---");
        System.out.printf("%-20s: %.2f\n", "Daire Alani", daireAlani);
        System.out.printf("%-20s: %.2f\n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-20s: %.2f\n", "Daire Capi", daireCapi);
        System.out.printf("%-20s: %.2f\n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-20s: %.2f\n", "Kure Yuzey Alani", kureYuzeyAlani);
    }
}


