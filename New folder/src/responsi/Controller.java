package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller {
    
    Model   model;
    VGaji_P vGaji_P;
    VData_P vData_P;
    VHome_P vHome_P;
    VInformasi_P vInformasi_P;
    
    
    Controller(VGaji_P vGaji_P, Model model){
        this.model = model;
        this.vGaji_P = vGaji_P;
        
        vGaji_P.btnHitung.addActionListener((ActionEvent e) -> {
            
        });
        
        vGaji_P.btnSimpan.addActionListener((ActionEvent e) -> {
            if(vGaji_P.getid_pegawai().equals("")
                    || vGaji_P.getnama().equals("")
                    || vGaji_P.getposisi().equals("")
                    || vGaji_P.getalamat().equals("")
                    || vGaji_P.getno_hp().equals("")
                    || vGaji_P.getgaji().equals("")
                    || vGaji_P.getjam_lembur().equals("")
                    || vGaji_P.gettunjangan().equals("")
                    || vGaji_P.getpajak().equals("")
                    || vGaji_P.gettotal_gaji().equals("")
                    ) {
                JOptionPane.showMessageDialog(null, "Field tdk boleh kosong");
            } else{
                
                String id_pegawai = vGaji_P.getid_pegawai();
                String nama = vGaji_P.getnama();
                String posisi = vGaji_P.getposisi();
                String alamat = vGaji_P.getalamat();
                String no_hp = vGaji_P.getno_hp();
                String gaji = vGaji_P.getgaji();
                String jam_lembur = vGaji_P.getjam_lembur();
                String tunjangan = vGaji_P.gettunjangan();
                String pajak = vGaji_P.getpajak();
                String total_gaji = vGaji_P.gettotal_gaji();
                
                model.insertPegawai(id_pegawai, nama, posisi, alamat, no_hp, gaji, jam_lembur, tunjangan, pajak, total_gaji);
            }
    });
        
        
    }
    
    Controller(VData_P vData_P, Model model ){
        this.vData_P = vData_P;
        this.model = model;
        
        if(model.getBanyakDataPegawai() != 0){
            String dataPegawai[][] = model.readPegawai();
            vData_P.table.setModel((new JTable(dataPegawai, vData_P.kolom)).getModel());
            
        } else{
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    }
    
    Controller(VHome_P vHome_P, Model model ){
        this.vHome_P = vHome_P;
        this.model = model;
        
 
    }
    
    Controller(VInformasi_P vInformasi_P, Model model ){
        this.vInformasi_P = vInformasi_P;
        this.model = model;
        
 
    }
    
}
