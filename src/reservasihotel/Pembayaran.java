/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasihotel;

/**
 *
 * @author infinix
 */
public class Pembayaran {

    public double hitungBiaya(Reservasi reservasi) {

        return reservasi.getKamar().getHargaPerMalam()
                * reservasi.getLamaMenginap();
    }
}