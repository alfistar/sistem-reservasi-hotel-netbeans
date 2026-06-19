/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasihotel;

/**
 *
 * @author infinix
 */
import java.util.ArrayList;

public class Hotel {

    private String namaHotel;

    private ArrayList<Kamar> daftarKamar =
            new ArrayList<>();

    private ArrayList<Reservasi> daftarReservasi =
            new ArrayList<>();

    public Hotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }

    public void tambahKamar(Kamar kamar) {
        daftarKamar.add(kamar);
    }

    public void tambahReservasi(
            Reservasi reservasi) {

        daftarReservasi.add(reservasi);
    }

    public ArrayList<Kamar> getDaftarKamar() {
        return daftarKamar;
    }

    public ArrayList<Reservasi> getDaftarReservasi() {
        return daftarReservasi;
    }
}
