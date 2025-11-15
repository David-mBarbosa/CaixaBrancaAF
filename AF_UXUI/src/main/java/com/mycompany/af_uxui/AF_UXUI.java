/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.af_uxui;

/**
 *
 * @author david
 */
public class AF_UXUI {

    public static void main(String[] args) {
        User user;
        user = new User();
        user.conectarBD();
        System.out.println(user.verificarUsuario("lopes", "123"));
    }
}
