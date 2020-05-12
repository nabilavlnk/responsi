package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Model {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi";
    static final String USER = "root"; 
    static final String PASS = "";  
    
    Connection con;
    Statement stm;
    
    public Model(){
    try{
            Class.forName(JDBC_DRIVER);
            con = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Koneksi Berhasil!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi gagal");
        }
    }
    
    public void insertPegawai(String id_pegawai, String nama, String posisi, String alamat, String no_hp, String gaji, String jam_lembur, String tunjangan, String pajak, String total_gaji){
    try{
        String query = "INSERT INTO `pegawai` (`id_pegawai`, `nama`, `posisi`, `alamat`, `no_hp`, `gaji`, `jam_lembur`, `tunjangan`, `pajak`, `total_gaji`) VALUES ('"+id_pegawai+"', '"+nama+"', '"+posisi+"', '"+alamat+"', '"+no_hp+"', '"+gaji+"', '"+jam_lembur+"', '"+tunjangan+"', '"+pajak+"', '"+total_gaji+"')";
        stm = (Statement) con.createStatement();
        stm.executeUpdate(query);
        System.out.println("Berhasil Ditambahkan");
        JOptionPane.showMessageDialog(null, "Data berhasil ditambah");
        }
    catch(Exception sql){
        System.out.println(sql.getMessage());
        JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakDataPegawai(){ // menghitung jumlah baris yang ada
        int jmlData = 0; // nilai awal 0
        try{
            stm = con.createStatement();
            String query = "Select * from `pegawai`";
            ResultSet resultSet = stm.executeQuery(query);//pengambilan data dalam java dari database
            while(resultSet.next()){ // ambil nilai dari baris ke 0 sampai baris akhir
                jmlData++;
            }
            return jmlData; // mengembalikan julah data ke readMahasiswa
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[][] readPegawai(){ //dua dimensi baris-kolom
        try{
            int jmlData = 0;
            String data[][] = new String[getBanyakDataPegawai()][7]; 
            String query = "Select * from `pegawai`";
            ResultSet resultSet = stm.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_pegawai");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("posisi");
                data[jmlData][3] = resultSet.getString("gaji");
                data[jmlData][4] = resultSet.getString("jam_lembur");
                data[jmlData][5] = resultSet.getString("tunjangan");
                data[jmlData][6] = resultSet.getString("total_gaji");
                
                jmlData++;   
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

public void deletePegawai (String id_pegawai){
    try{
    String query = "DELETE FROM `pegawai` WHERE `id_pegawai` = '"+id_pegawai+"'";
    stm = con.createStatement();
    stm.executeUpdate(query);
    JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
    }
    catch(SQLException sql){
        System.out.println(sql.getMessage());
    }
}

public void editPegawai(String id_pegawai,String nama,String posisi, String alamat, String no_hp,String gaji, String jam_lembur, String tunjangan, String pajak, String total_gaji) {                                         
       
        try {
      
 String query ="UPDATE `pegawai` SET `id_pegawai` = '"+id_pegawai+"', `nama` = '"+nama+"',`posisi` = '"+posisi+"',`alamat`= '"+alamat+"',`no_hp` = '"+no_hp+"',`gaji`= '"+gaji+"',`jam_lembur`= '"+jam_lembur+"',`tunjangan`= '"+tunjangan+"',`pajak`= '"+pajak+"',`total_gaji`= '"+total_gaji+"' "
         + "WHERE `id_pegawai` = '"+id_pegawai+"'";
        stm = (Statement) con.createStatement();
        stm.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "data berhasil di edit");
                       
        } catch(SQLException sql){
            System.out.println(sql.getMessage());
    }
    }

public int getBanyakDataSearchPegawai(){
    int jmlData=0;
    try{
        stm = (Statement)con.createStatement();
        String query ="Select * from `pegawai`";
        ResultSet resultSet =stm.executeQuery(query);
        while(resultSet.next()){
            jmlData++;
        }
        return jmlData;
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
        System.out.println("SQL ERROR");
        return 0;
    }
}

public String[][] searchPegawai(String id){
    try{
        
        int jmlData = 0;
        String data[][]= new String[getBanyakDataSearchPegawai()][10];
        String query = "SELECT*FROM `pegawai` WHERE `id_pegawai` LIKE '%" + id + "%' ORDER BY `id_pegawai` ASC ";
        ResultSet resultSet =stm.executeQuery(query);
        while(resultSet.next()){
            data[jmlData][0] = resultSet.getString("id_pegawai");
            data[jmlData][1] = resultSet.getString("nama");
            data[jmlData][2] = resultSet.getString("posisi");
            data[jmlData][3] = resultSet.getString("alamat");
            data[jmlData][4] = resultSet.getString("no_hp");
            data[jmlData][5] = resultSet.getString("gaji");
            data[jmlData][6] = resultSet.getString("jam_lembur");
            data[jmlData][7] = resultSet.getString("tunjangan");
            data[jmlData][8] = resultSet.getString("pajak");
            data[jmlData][9] = resultSet.getString("total_gaji");
            jmlData++;
        }
        
        return data;
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
        System.out.println("SQL ERROR");
        return null;
    }
}
}