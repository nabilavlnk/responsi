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
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;


public class VData_P extends JFrame{
    JLabel linfo4 = new JLabel ("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    JButton btnHome = new JButton("HOME");
    JButton btnGaji = new JButton("GAJI");
    JButton btnData = new JButton("DATA");
    JButton btnInformasi = new JButton("INFORMASI");
    JButton btnAdmin = new JButton("ADMIN");
    JButton btnShow = new JButton("SHOW");
    
    JScrollPane scroll;
    DefaultTableModel model;
    String kolom[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", ""
            + "Total Gaji"};
    JTable table;
    JScrollPane sp;
    JTextArea ta = new JTextArea();
    
    VData_P(){
        //background
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
	setSize(600,400);
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
        add(btnGaji);
        add(btnData);
        add(btnInformasi);
        add(btnAdmin);
        add(btnShow);
        
        linfo4.setBounds(160,330,600,30);
        btnHome.setBounds(10,20,100,60);
        btnGaji.setBounds(10,90,100,60);
        btnData.setBounds(10,160,100,60);
        btnInformasi.setBounds(10,230,100,60);
        btnAdmin.setBounds(470,10,100,60); 
        btnShow.setBounds(250,290,100,40);
        
        setVisible(true);
        
        
         btnHome.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  MVC mvc = new MVC();
                  mvc.Home();
                  dispose();
              }
        });
        
        btnGaji.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  MVC mvc = new MVC();
                  mvc.Gaji_P();
                  dispose();
              }
         });
        
        btnData.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  MVC mvc = new MVC();
                  mvc.Data_P();
                  dispose();
              }
         });
        
        btnInformasi.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  MVC mvc = new MVC();
                  mvc.Informasi_P();
                  dispose();
              }
         });
        
    }
}
