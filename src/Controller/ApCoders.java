/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import View.TelaPrincipal;
import java.sql.Connection;

/**
 *
 * @author ferna
 */
public class ApCoders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
        } catch (Exception e) {
             e.printStackTrace();
        }         

    }
    
}
