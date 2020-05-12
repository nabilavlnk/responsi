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
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class VTambah_A extends JFrame{
    JLabel linfo4 = new JLabel ("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    JButton btnHome = new JButton("HOME");
    JButton btnTambah = new JButton("TAMBAH");
    JButton btnData = new JButton("DATA");
    JButton btnPetunjuk = new JButton("PETUNJUK");
    JButton btnKaryawan = new JButton("KARYAWAN");
    JButton btnSimpan = new JButton("SIMPAN");
    
    //isi data
    JLabel lid = new JLabel("ID");
    JLabel lnama = new JLabel("Nama");
    JLabel lalamat = new JLabel("Alamat");
    JLabel lnohp = new JLabel("No HP");
    JLabel lposisi = new JLabel("Posisi");
    JLabel lgaji = new JLabel("Gaji");
    
    JTextField tid = new JTextField();
    JTextField tnama = new JTextField();
    JTextField talamat = new JTextField();
    JTextField tnohp = new JTextField();
    JTextField tposisi = new JTextField();
    JTextField tgaji = new JTextField();
    
    VTambah_A(){
        //background
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
	setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
         
        add(linfo4);
        add(btnHome);
        add(btnTambah);
        add(btnData);
        add(btnPetunjuk);
        add(btnKaryawan);
        add(btnSimpan).setBounds(470,280,100,60);
        
        setVisible(true);
        linfo4.setBounds(160,300,600,30);
        btnHome.setBounds(20,20,100,60);
        btnTambah.setBounds(20,90,100,60);
        btnData.setBounds(20,160,100,60);
        btnPetunjuk.setBounds(20,230,100,60);
        btnKaryawan.setBounds(470,20,100,60); 
        
        //isidata
        add(lid).setBounds(130,40,100,20);
        add(lnama).setBounds(130,70,100,20);
        add(lalamat).setBounds(130,100,100,20);
        add(lnohp).setBounds(130,130,100,20);
        add(lposisi).setBounds(130,160,100,20);
        add(lgaji).setBounds(130,190,100,20);
        
        add(tid).setBounds(230,40,200,20);
        add(tnama).setBounds(230,70,200,20);
        add(talamat).setBounds(230,100,100,20);
        add(tnohp).setBounds(230,130,300,20);
        add(tposisi).setBounds(230,160,150,20);
        add(tgaji).setBounds(230,190,150,20);
        
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
        
        btnPetunjuk.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new VPetunjuk_A();
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
    
    public String getid_pegawai(){
        return tid.getText();
    }
    public String getnama(){
        return tnama.getText();
    }
    public String getposisi(){
        return tposisi.getText();
    }
    public String getalamat(){
        return talamat.getText();
    }
    public String getno_hp(){
        return tnohp.getText();
    }
    public String getgaji(){
        return tgaji.getText();
    }

}
