package algodat.midexam;

import java.util.Scanner;
import static algodat.midexam.Relasi.*;
import static algodat.midexam.Stok.*;
import static algodat.midexam.Antrian.*;

public class Main {
    public static int aksi=0,aksiPembeli=0,aksiAdmin=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data utama = new Data();
        menuAwal:
        while(aksi != 9){
            if (aksi==0){
                System.out.println("\nPREIMH CREATIVE STORE");
                System.out.println("---------------------");
                System.out.println("Kami hanya menjual satu jenis produk dan satu edisi dalam tiap bulan dengan stok terbatas\n");
                System.out.println("1. Menu Admin");
                System.out.println("2. Menu Pembeli");
                System.out.println("9. Quit");
                System.out.print("Pilih Aksi : ");
                aksi = input.nextInt();
            }
            switch(aksi){
                case 1:
                    menuAdmin : {
                        int pw;
                        System.out.print("Masukkan Password : ");
                        pw = input.nextInt();
                        if (pw == 123) {
                            System.out.println("\nMENU ADMIN");
                            System.out.println("----------");
                            menuAdminn :
                            while (aksiAdmin != 9) {
                                System.out.println("\n1. Tambah Produk");
                                System.out.println("2. Stok Produk");
                                System.out.println("3. Kirim Barang");
                                System.out.println("4. Data Barang Terkirim");
                                System.out.println("5. Menu Pembeli");
                                System.out.println("9. Quit");
                                System.out.print("Pilih Aksi : ");
                                aksiAdmin = input.nextInt();
                                switch (aksiAdmin) {
                                    case 1:
                                        utama.barang();
                                        continue menuAdminn;
                                    case 2:
                                        daftarStok();
                                        continue menuAdminn;
                                    case 3:
                                        kirim();
                                        continue menuAdminn;
                                    case 4:
                                        terkirim();
                                        continue menuAdminn;
                                    case 5:
                                        aksi = 2;
                                        continue menuAwal;
                                    case 9:
                                        System.out.println("Terima Kasih dan Sampai Jumpa");
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Input tidak sesuai, silahkan ulangi\n");
                                        System.out.print("Pilih Aksi : ");
                                        continue menuAdminn;
                                }
                            }
                        }
                        else System.out.println("Password Salah");
                    }
                    break;
                case 2:
                    menuPembeli:
                    while(aksiPembeli != 9) {
                        System.out.println("\nMENU PEMBELI");
                        System.out.println("------------");
                        System.out.println("1. Beli");
                        System.out.println("2. Daftar Antrian");
                        System.out.println("3. Menu Admin");
                        System.out.println("9. Quit");
                        System.out.print("Pilih Aksi : ");
                        aksiPembeli = input.nextInt();
                        switch (aksiPembeli) {
                            case 1:
                                utama.pembeli();
                                continue menuPembeli;
                            case 2:
                                if(antrianKosong()) {
                                    System.out.println("Tidak ada antrian");
                                    continue menuPembeli;
                                }
                                else {
                                    daftarAntrian();
                                    continue menuPembeli;
                                }
                            case 3:
                                aksi = 1;
                                continue menuAwal;
                            case 9:
                                System.out.println("Terima Kasih dan Sampai Jumpa");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Input tidak sesuai, silahkan ulangi\n");
                                System.out.print("Pilih Aksi : ");
                                continue menuPembeli;
                        }
                    }
                    break;
                case 9:
                    System.out.println("Terima Kasih dan Sampai Jumpa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input tidak sesuai, silahkan ulangi");
                    aksi=0;
                    continue menuAwal;
            }
            System.out.println();
        }
    }
}
