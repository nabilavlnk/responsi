package responsi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VGaji_P extends JFrame {
    JLabel lid = new JLabel("ID Pegawai : ");
    JLabel lnama = new JLabel("Nama : ");
    JLabel lposisi = new JLabel("Posisi : ");
    JLabel lalamat = new JLabel("Alamat : ");
    JLabel lnohp = new JLabel("No HP : ");
    JLabel lgaji = new JLabel("Gaji Pokok : ");
    JLabel ljam = new JLabel("Jam Lembur : ");
    JLabel ltunjangan = new JLabel("Tunjangan : ");
    JLabel lpajak = new JLabel("Pajak : ");
    JLabel ltotgaji = new JLabel("Total Gaji : ");
    
    JTextField tid = new JTextField();
    JTextField tnama = new JTextField();
    String[] posisi =
                {"Direktur","Manager","Programmer","Marketing"};
    JComboBox cbposisi = new JComboBox(posisi);
    JTextField talamat = new JTextField();
    JTextField tnohp = new JTextField();
    JTextField tgaji = new JTextField();
    JTextField tjam = new JTextField();
    JTextField ttunjangan = new JTextField();
    JTextField tpajak = new JTextField();
    JTextField ttotgaji = new JTextField();
    
    JLabel linfo4 = new JLabel ("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    JButton btnHome = new JButton("HOME");
    JButton btnGaji = new JButton("GAJI");
    JButton btnData = new JButton("DATA");
    JButton btnInformasi = new JButton("INFORMASI");
    JButton btnAdmin = new JButton("ADMIN");
    JButton btnHitung = new JButton("Hitung");
    JButton btnSimpan = new JButton("Simpan");
    
    VGaji_P(){
        //background
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
	setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
         
        add(linfo4);
        add(btnHome);
        add(btnGaji);
        add(btnData);
        add(btnInformasi);
        add(btnAdmin);
        add(btnHitung);
        add(btnSimpan);
        
        setVisible(true);
        
        linfo4.setBounds(160,330,600,30);
        btnHome.setBounds(20,20,100,60);
        btnGaji.setBounds(20,90,100,60);
        btnData.setBounds(20,160,100,60);
        btnInformasi.setBounds(20,230,100,60);
        btnAdmin.setBounds(470,20,100,60); 
        btnHitung.setBounds(470,200,100,60);
        btnSimpan.setBounds(470,270,100,60);
        
        //input data
        add(lid).setBounds(130,40,100,20);
        add(lnama).setBounds(130,70,100,20);
        add(lposisi).setBounds(130,100,100,20);
        add(lalamat).setBounds(130,130,100,20);
        add(lnohp).setBounds(130,160,100,20);
        add(lgaji).setBounds(130,190,100,20);
        add(ljam).setBounds(130,220,100,20);
        add(ltunjangan).setBounds(130,250,100,20);
        add(lpajak).setBounds(130,280,100,20);
        add(ltotgaji).setBounds(130,310,100,20);
        
        add(tid).setBounds(230,40,200,20);
        add(tnama).setBounds(230,70,200,20);
        add(cbposisi).setBounds(230,100,100,20);
        add(talamat).setBounds(230,130,300,20);
        add(tnohp).setBounds(230,160,150,20);
        add(tgaji).setBounds(230,190,150,20);
        add(tjam).setBounds(230,220,100,20);
        add(ttunjangan).setBounds(230,250,150,20);
        add(tpajak).setBounds(230,280,150,20);
        add(ttotgaji).setBounds(230,310,150,20);
        
        add(tid);
        add(tnama);
        add(cbposisi);
        add(talamat);
        add(tnohp);
        add(tgaji);
        add(tjam);
        add(ttunjangan);
        add(tpajak);
        add(ttotgaji);
        
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
        
        btnHitung.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  //rumus
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
        return cbposisi.getSelectedItem().toString();
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
     public String getjam_lembur(){
        return tjam.getText();
    }
    public String gettunjangan(){
        return ttunjangan.getText();
    }
    public String getpajak(){
        return tpajak.getText();
    }
    public String gettotal_gaji(){
        return ttotgaji.getText();
    }
      
}
