package algodat.midexam;

import static algodat.midexam.Relasi.*;

public class Stok {
    static Node head;

    public static void push(String namaBarang){
        Node baru = new Node(namaBarang);
        if (head == null) {
            head = baru;
        } else {
            baru.Next = head;
            head = baru;
        }
        relasi = kirim = terkirim = i;
        barang[i] = head.data;
        i++;
    }

    public static void pop(){
        if (Antrian.antrianKosong()) return;
        else {
            if (head==null) {
                return;
            }
            else{
                head = head.Next;
            }
        }
    }

    public static void daftarStok(){
        Node current = head;
        System.out.println("=>");
        if(head==null) System.out.println("Tidak ada stok");
        while (current != null){
            System.out.println(current.data);
            current = current.Next;
        }
    }
}