/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservasihotel;

/**
 *
 * @author infinix
 */
public class Admin {

    private int idAdmin;
    private String username;
    private String password;

    public Admin(int idAdmin,
            String username,
            String password) {

        this.idAdmin = idAdmin;
        this.username = username;
        this.password = password;
    }

    public boolean login(String user,
            String pass) {

        return username.equals(user)
                && password.equals(pass);
    }
}
