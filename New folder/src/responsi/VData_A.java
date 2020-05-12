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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class VData_A extends JFrame {
    JLabel linfo4 = new JLabel ("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    JButton btnHome = new JButton("HOME");
    JButton btnTambah = new JButton("TAMBAH");
    JButton btnData = new JButton("DATA");
    JButton btnKaryawan = new JButton("KARYAWAN");
    JButton btnUpdate = new JButton("UPDATE");
    JButton btnShow = new JButton("SHOW");
    JButton btnDelete = new JButton("DELETE");
    
    JLabel lsearch = new JLabel("ID PEGAWAI");
    JTextField tsearch = new JTextField();
    
    //TABEL
    JScrollPane scroll;
    DefaultTableModel model;
    String kolom[] = {"ID", "Nama", "Alamat", "No HP", "Posisi", "Gaji Pokok"};
    JTable table;
    JScrollPane sp;
    JTextArea ta = new JTextArea();
          
    
    VData_A(){
        //background
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
	setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        //tabel
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        model = new DefaultTableModel(kolom, 0);
        table = new JTable(model);
        sp = new JScrollPane(table);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(sp).setBounds(120, 80, 400, 200);
         
        add(linfo4);
        add(btnHome);
        add(btnTambah);
        add(btnData);
        add(btnKaryawan);
        add(btnUpdate).setBounds(200,330,100,60);
        add(btnShow).setBounds(310,330,100,60);
        add(btnDelete).setBounds(420,330,100,60);
        add(lsearch).setBounds(160,290,70,20);
        add(tsearch).setBounds(250,290,200,20);
        
        
        setVisible(true);
        linfo4.setBounds(160,400,600,30);
        btnHome.setBounds(10,20,100,60);
        btnTambah.setBounds(10,90,100,60);
        btnData.setBounds(10,160,100,60);
        btnKaryawan.setBounds(480,10,100,60);   
        
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
                  new VHome_A();
              }
         });
    }

}

