/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class VLogin_A extends JFrame {
     Connection con;
    java.sql.Statement stat;
    ResultSet rs;
    String sql;
    
   final JTextField fuser = new JTextField(10);
   final JTextField fpass = new JTextField(10);
   
   JLabel ltitle = new JLabel(" LOGIN ");
   JLabel luser = new JLabel(" Username ");
   JLabel lpass = new JLabel(" Password ");
   
   JButton btnLogin = new JButton("LOGIN");
   JButton btnBack = new JButton("BACK");

        VLogin_A() {
                
        setTitle("LOGIN");
	setSize(350,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
        
        add(ltitle);
	add(luser);
	add(fuser);
        add(lpass);
	add(fpass);
	add(btnLogin);  
        add(btnBack);  
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                sql = "SELECT * FROM admin WHERE username='"+fuser.getText()+"' AND password='"+fpass.getText()+"'";
                rs = stat.executeQuery(sql);
                if(rs.next()){
                    if(fuser.getText().equals(rs.getString("username")) && fpass.getText().equals(rs.getString("password"))){
                        JOptionPane.showMessageDialog(null, "berhasil login");
                        new VHome_A();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                    }
                }catch (Exception ex){
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VHome_P();
            }
        });
        setVisible(true);
        ltitle.setBounds(150,15,140,20);
	luser.setBounds(10,50,120,20);
	fuser.setBounds(130,50,150,20);
	lpass.setBounds(10,75,120,20);
	fpass.setBounds(130,75,150,20);
	btnLogin.setBounds(75,130,70,40);
        btnBack.setBounds(170,130,70,40);
	
   }
}
