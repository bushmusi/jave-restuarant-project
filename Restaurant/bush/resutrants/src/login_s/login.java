/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_s;
import java.awt.Color;
import resutrant_s.resutrants;
import setcost_s.setcost;
import java.io.BufferedReader;
import resutrant_s.resutrants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }
    
    public login(String name, String password) {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtn2 = new javax.swing.JTextField();
        jpsd2 = new javax.swing.JPasswordField();
        jbtnsignin = new javax.swing.JButton();
        jlblerr = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(400, 330));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 109, 124, 46);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 173, 114, 46);

        jtxtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtn2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jtxtn2);
        jtxtn2.setBounds(134, 109, 178, 46);

        jpsd2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpsd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jpsd2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jpsd2);
        jpsd2.setBounds(134, 173, 178, 46);

        jbtnsignin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnsignin.setText("Signin");
        jbtnsignin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jbtnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsigninActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnsignin);
        jbtnsignin.setBounds(250, 230, 67, 35);

        jlblerr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblerr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlblerr);
        jlblerr.setBounds(134, 70, 178, 33);

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login Page");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(29, 0, 358, 59);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_s/lemon_water_splash-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 420, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsigninActionPerformed
        // TODO add your handling code here:
        this.jlblerr.setText(null);
        String password=jpsd2.getText();
        String name=jtxtn2.getText();
        
        try {
            BufferedReader bf=new BufferedReader(new  FileReader("C:\\Users\\user\\Desktop\\bini\\"+name));
            String c=String.valueOf(password);
            String  lname = bf.readLine();
            String p=bf.readLine();
            String ln=bf.readLine();
            String acn=bf.readLine();
         if(c == null ? p == null : c.equals(p))
         {
             this.jlblerr.setText(null);
             this.setVisible(false);
             login bs = new login(name,password);
             bs.setVisible(false);
             y.setVisible(true);
           
        }
        else if(  password==null ){
           this.jlblerr.setText(null);
           this.jlblerr.setText(lname);
           this.jlblerr.setForeground(Color.red);
            this.jlblerr.setText("Null password is not accesiptable");
        }
        else
        {  
           this.jlblerr.setText(null);
           this.jlblerr.setForeground(Color.red);
           this.jlblerr.setText("invalid password");
           
        }
            
        } catch (FileNotFoundException ex) {
            this.jlblerr.setForeground(Color.red);
            this.jlblerr.setText("File not Found");
            
        } catch (IOException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            this.jlblerr.setText("IOException");
        }
        Formatter fr;
        try {
            fr = new Formatter(new File("C:\\Users\\user\\Desktop\\method.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtnsigninActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnsignin;
    private javax.swing.JLabel jlblerr;
    private javax.swing.JPasswordField jpsd2;
    private javax.swing.JTextField jtxtn2;
    // End of variables declaration//GEN-END:variables
    setcost y=new setcost();
}
