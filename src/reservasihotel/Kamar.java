/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasihotel;

/**
 *
 * @author infinix
 */
public class Kamar {

    private int noKamar;
    private String jenisKamar;
    private double hargaPerMalam;
    private int kapasitas;
    private boolean statusKamar;

    public Kamar(int noKamar, String jenisKamar,
            double hargaPerMalam, int kapasitas) {

        this.noKamar = noKamar;
        this.jenisKamar = jenisKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.kapasitas = kapasitas;
        this.statusKamar = true;
    }

    public int getNoKamar() {
        return noKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isStatusKamar() {
        return statusKamar;
    }

    public void updateStatus(boolean status) {
        this.statusKamar = status;
    }

    @Override
    public String toString() {
        return jenisKamar;
    }
}