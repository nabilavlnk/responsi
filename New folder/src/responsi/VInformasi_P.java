/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class VInformasi_P extends JFrame{
    
    JLabel linfo1 = new JLabel("klik tombol gaji untuk menghitung gaji anda");
    JLabel linfo2 = new JLabel("klik tombol data untuk melihat data sudah masuk atau belum");
    JLabel linfo4 = new JLabel ("PETUNJUK KARYAWAN");
    JButton btnBack = new JButton("BACK");
    
    VInformasi_P(){
        //background
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
	setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
         
        add(linfo1);
        add(linfo2);
        add(linfo4);
        add(btnBack);

        setVisible(true);
        linfo1.setBounds(120,70,400,40);
        linfo2.setBounds(120,100,400,40);
        linfo4.setBounds(170,20,600,30);
        btnBack.setBounds(200,200,100,40);   
        
        btnBack.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new VHome_P();
                  MVC mvc = new MVC();
                  dispose();
              }
        });

    }

}