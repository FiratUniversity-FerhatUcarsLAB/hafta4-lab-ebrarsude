Öğrenci no: 250541104
Ad soyad: Ebrar Sude Yıldırım
Tarih: 05.11.2025
Görev adı: Maaş Hesap

  import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Çalışan bilgileri (Kullanıcıdan alınmadı, direkt atandı)
        String adSoyad = "Ebrar Sude Yildirim";
        double brutMaas = 50000;
        int haftalikSaat = 40;
        int mesaiSaat = 10;

        // Gelir hesapları
        double saatlikBrut = brutMaas / 160;
        double mesaiUcreti = saatlikBrut * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // Net maaş
        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Çıktı
        System.out.println("\n========== MAAS BORDROSU ==========");
        System.out.printf("%-25s: %s\n", "Calisan", adSoyad);
        System.out.printf("%-25s: %.2f TL\n", "Brut Maas", brutMaas);
        System.out.printf("%-25s: %.2f TL\n", "Mesai Ucreti", mesaiUcreti);
        System.out.printf("%-25s: %.2f TL\n", "Toplam Gelir", toplamGelir);

        System.out.println("\n------ KESINTILER ------");
        System.out.printf("%-25s: %.2f TL\n", "SGK Kesintisi", sgk);
        System.out.printf("%-25s: %.2f TL\n", "Gelir Vergisi", gelirVergisi);
        System.out.printf("%-25s: %.2f TL\n", "Damga Vergisi", damgaVergisi);
        System.out.printf("%-25s: %.2f TL\n", "Toplam Kesinti", toplamKesinti);

        System.out.println("\n------ NET MAAS ------");
        System.out.printf("%-25s: %.2f TL\n", "Net Maaş", netMaas);

        System.out.println("\n------ ISTATISTIKLER ------");
        System.out.printf("%-25s: %.1f %%\n", "Kesinti Orani", kesintiOrani);
        System.out.printf("%-25s: %.2f TL/saat\n", "Saatlik Net Kazanc", saatlikNetKazanc);
        System.out.printf("%-25s: %.2f TL/gun\n", "Gunluk Net Kazanc", gunlukNetKazanc);

        System.out.println("====================================");
    }
}

