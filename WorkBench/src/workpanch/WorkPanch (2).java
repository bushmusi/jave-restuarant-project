/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workpanch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class WorkPanch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","");
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"You are not connected to database");
           System.exit(0);
        }
    
}
}
