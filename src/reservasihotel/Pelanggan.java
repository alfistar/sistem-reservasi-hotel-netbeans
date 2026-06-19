/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasihotel;

/**
 *
 * @author infinix
 */
public class Pelanggan {

    private int idPelanggan;
    private String nama;
    private String noTelpon;
    private String email;

    public Pelanggan(int idPelanggan,
            String nama,
            String noTelpon,
            String email) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelpon = noTelpon;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public String getEmail() {
        return email;
    }
}
