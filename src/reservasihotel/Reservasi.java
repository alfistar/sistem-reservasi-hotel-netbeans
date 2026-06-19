/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasihotel;

/**
 *
 * @author infinix
 */
public class Reservasi {

    private int idReservasi;
    private Pelanggan pelanggan;
    private Kamar kamar;
    private int lamaMenginap;

    public Reservasi(int idReservasi,
            Pelanggan pelanggan,
            Kamar kamar,
            int lamaMenginap) {

        this.idReservasi = idReservasi;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.lamaMenginap = lamaMenginap;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }
}
