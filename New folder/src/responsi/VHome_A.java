/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VHome_A extends JFrame {
JTextArea ta = new JTextArea("Selamat Datang."
            + "Silahkan Masuk ke menu gaji untuk melakukanperhitungan gaji."
            + "Jika mengalaminkesulitan, klik menu petunjuk");
    JLabel linfo4 = new JLabel ("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    JButton btnHome = new JButton("HOME");
    JButton btnTambah = new JButton("TAMBAH");
    JButton btnData = new JButton("DATA");
    JButton btnPetunjuk = new JButton("PETUNJUK");
    JButton btnKaryawan = new JButton("KARYAWAN");
    
    VHome_A(){
        //background
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
	setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
         
        add(ta);
        add(linfo4);
        add(btnHome);
        add(btnTambah);
        add(btnData);
        add(btnPetunjuk);
        add(btnKaryawan);
        
        setVisible(true);
        ta.setBounds(160,100,300,160);
        linfo4.setBounds(160,300,600,30);
        btnHome.setBounds(20,20,100,60);
        btnTambah.setBounds(20,90,100,60);
        btnData.setBounds(20,160,100,60);
        btnPetunjuk.setBounds(20,230,100,60);
        btnKaryawan.setBounds(470,20,100,60);   
        
        btnHome.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new VHome_A();
                  MVC mvc = new MVC();
                  dispose();
              }
        });
        
        btnTambah.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new VTambah_A();
                  MVC mvc = new MVC();
                  dispose();
              }
         });
        
        btnData.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new VData_A();
                  MVC mvc = new MVC();
                  dispose();
              }
         });
        btnKaryawan.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new VHome_P();
              }
         });
    }

}

