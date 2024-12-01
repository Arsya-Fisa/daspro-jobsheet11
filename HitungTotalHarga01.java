import java.util.Scanner;

public class HitungTotalHarga01 {
    public static int HitungTotalHarga(int pilihanmenu, int banyakitem){
        int[] hargaitem = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalharga = hargaitem[pilihanmenu-1] *banyakitem;
        return totalharga;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("\nMasukan nomor menu yang ingin anda pesan: ");
        int pilihanmenu = sc.nextInt();
        System.out.print("Masukan jumlah item yang diinginkan: ");
        int banyakitem = sc.nextInt();

        int totalharga = HitungTotalHarga(pilihanmenu,banyakitem);
        System.out.println("Total harga pesanan anda : Rp " + totalharga);
    }
}
