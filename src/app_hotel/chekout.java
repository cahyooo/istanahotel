/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_hotel;

import com.itextpdf.text.Paragraph;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author asus
 */
public class chekout extends javax.swing.JFrame {

    /**
     * Creates new form chekout
     */
    Connection con;
    Statement stat;
    ResultSet rs;
    public chekout() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal=Calendar.getInstance();
        tglsekarang.setText(myformat.format(cal.getTime()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pelanggan = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tglsekarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        in = new javax.swing.JTextField();
        out = new javax.swing.JTextField();
        tiga = new javax.swing.JTextField();
        empat = new javax.swing.JTextField();
        satu = new javax.swing.JTextField();
        enam = new javax.swing.JTextField();
        dua = new javax.swing.JTextField();
        tujuh = new javax.swing.JTextField();
        lima = new javax.swing.JTextField();
        lapan = new javax.swing.JTextField();
        sembilan = new javax.swing.JTextField();
        sepu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_pelanggan.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tbl_pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Pelanggan", "Jenis Kelamin", "No Handphone", "Chek In", "Chek Out", "Lama Menginap", "tipe Kamar", "No Kamar", "Harga total", "Total Bayar", "Kembalian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_pelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pelanggan);
        if (tbl_pelanggan.getColumnModel().getColumnCount() > 0) {
            tbl_pelanggan.getColumnModel().getColumn(0).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(1).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(2).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(3).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(4).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(5).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(6).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(7).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(8).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(9).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(10).setResizable(false);
            tbl_pelanggan.getColumnModel().getColumn(11).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 1360, 520));

        txtcari.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        txtcari.setBorder(null);
        jPanel1.add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 200, 260, 50));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 830, 130, 120));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 850, 270, 80));

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 200, 90, 60));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 960, 160, 70));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 170, 60));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 210, 70));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 160, 80));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 850, 270, 80));

        tglsekarang.setEditable(false);
        tglsekarang.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        tglsekarang.setBorder(null);
        jPanel1.add(tglsekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/chek out baru.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 80, 90, -1));
        jPanel1.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 130, 70, -1));
        jPanel1.add(tiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 100, 50));
        jPanel1.add(empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 110, 30));
        jPanel1.add(satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 160, 50));
        jPanel1.add(enam, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 90, 30));
        jPanel1.add(dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 110, 60));
        jPanel1.add(tujuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 100, 20));
        jPanel1.add(lima, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 80, 20));
        jPanel1.add(lapan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 210, 120, 40));
        jPanel1.add(sembilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 100, 30));
        jPanel1.add(sepu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 110, 20));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        tampildata();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    public void excel() throws FileNotFoundException, IOException{
 try{
 Class.forName("com.mysql.jdbc.Driver");
 com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) 
DriverManager.getConnection("jdbc:mysql://localhost:3306/db_hotel","root","");;
 com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) 
koneksi.createStatement();
 FileOutputStream fileOut;
 // Hasil Export
 fileOut = new FileOutputStream("D:/Data Pelanggan.xls");
 HSSFWorkbook workbook = new HSSFWorkbook();
 HSSFSheet worksheet = workbook.createSheet("Sheet 0");
 // Nama Field
 Row row1 = worksheet.createRow((short)0);
 row1.createCell(0).setCellValue("ID");
 row1.createCell(1).setCellValue("Nama");
 row1.createCell(2).setCellValue("Jenis Kelamin");
 row1.createCell(3).setCellValue("No Handphone");
 row1.createCell(4).setCellValue("Tanggal Chek In");
 row1.createCell(5).setCellValue("Tanggal Chek Out");
 row1.createCell(6).setCellValue("Lama Menginap");
 row1.createCell(7).setCellValue("Tipe Kamar");
 row1.createCell(8).setCellValue("No Kamar");
 row1.createCell(9).setCellValue("Harga Total");
 row1.createCell(10).setCellValue("Total Bayar");
 row1.createCell(11).setCellValue("Kembali");

 Row row2 ;
 ResultSet rs = statement.executeQuery("select* from pelanggan");
 while(rs.next()){
 int a = rs.getRow();
row2 = worksheet.createRow((short)a);
 // Sesuaikan dengan Jumlah Field
 row2.createCell(0).setCellValue(rs.getString(1));
 row2.createCell(1).setCellValue(rs.getString(2));
 row2.createCell(2).setCellValue(rs.getString(3));
 row2.createCell(3).setCellValue(rs.getString(4));
 row2.createCell(4).setCellValue(rs.getString(5));
 row2.createCell(5).setCellValue(rs.getString(6));
 row2.createCell(6).setCellValue(rs.getString(7));
 row2.createCell(7).setCellValue(rs.getString(8));
 row2.createCell(8).setCellValue(rs.getString(9));
 row2.createCell(9).setCellValue(rs.getString(10));
  row2.createCell(10).setCellValue(rs.getString(11));


  
 
 }
 workbook.write(fileOut);
 fileOut.flush();
 fileOut.close();
 rs.close();
 statement.close();
 koneksi.close();
 JOptionPane.showMessageDialog(this,"Save to Excel Success !!");
 }catch(ClassNotFoundException e){
 System.out.println(e);
 }catch(SQLException ex){
 System.out.println(ex);
 }catch(IOException ioe){
 System.out.println(ioe);
 }
}
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String id=satu.getText();
        String Nama=dua.getText();
        String jk=tiga.getText();
        String nohp=empat.getText();
        String TipeK=enam.getText();
        String nok=tujuh.getText();
        
        String ckin=in.getText();
        String ckout=out.getText();
        String lminap=lima.getText();
        String hargatot=lapan.getText();
        String bayar=sembilan.getText();
        String kmbli=sepu.getText();
        
//        String path="D:\\";
        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
        try{
            PdfWriter.getInstance(doc, new FileOutputStream("D:/Bill_Pelanggan/"+id+"_"+Nama+".pdf"));
            doc.open();
            Paragraph pg1= new Paragraph("***************************************************************************************************************\n");
            doc.add(pg1);
            Paragraph pg2= new Paragraph("                                                               ISTANA HOTEL                                              \n");
            doc.add(pg2);
            doc.add(pg1);
            Paragraph pg3= new Paragraph("\t Bill ID : "+id+"\n Nama : "+Nama+"\n Jenis Kelamin : "+jk+"\n No HandPhone : "+nohp+"");
            doc.add(pg3);
            doc.add(pg1);
            Paragraph pg4= new Paragraph("\t Chek In : "+ckin+"\n Chek Out : "+ckout+"\n Lama Menginap : "+lminap+" Malam \n Jenis Kamar : "+TipeK+"\n No Kamar : "+nok+"");
            doc.add(pg4);
            doc.add(pg1);
            Paragraph pg5= new Paragraph("\t Harga Keseluruhan : Rp. "+hargatot+"\n Jumlah Bayar : Rp. "+bayar+"\n Kembalian : Rp.  "+kmbli+"");
            doc.add(pg5);
            doc.add(pg1);
            Paragraph pg6= new Paragraph("                                                      Terimkasih Atas Kunjungan Anda :D                                              \n");
            doc.add(pg6);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        doc.close();
           int a= JOptionPane.showConfirmDialog(null, "Ingin Print Bill ?","Select",JOptionPane.YES_NO_OPTION);
        
        if(a==0){
            try{
                if((new File("D:/Bill_Pelanggan/"+id+"_"+Nama+".pdf)")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler D:/Bill_Pelanggan/"+id+"_"+Nama+".pdf");
                        
            }
                else{
                    System.out.println("File Is Note Exists");
                    deletedata();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void tbl_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_pelangganMouseClicked
        // TODO add your handling code here:
        try {
 
int row =tbl_pelanggan.getSelectedRow();
String tabel_klik=(tbl_pelanggan.getModel().getValueAt(row, 0).toString());
java.sql.Statement stm = con.createStatement();
java.sql.ResultSet sql = stm.executeQuery("select *from pelanggan where id='"+tabel_klik+"'");
 if(sql.next()){
 String id = sql.getString("id");
 satu.setText(id);
 String nama = sql.getString("Nama");
dua.setText(nama);
 String jk = sql.getString("Jenis_Kelamin");
tiga.setText(jk);
 String nope = sql.getString("No_Hp");
empat.setText(nope);
String tgl_in = sql.getString("chek_in");
in.setText(tgl_in);
String tgl_out = sql.getString("chek_out");
out.setText(tgl_out);
String inap = sql.getString("lama_menginap");
lima.setText(inap);
String pass = sql.getString("tipe_kamar");
enam.setText(pass);
String kamar = sql.getString("no_kamar");
tujuh.setText(kamar);
String hargatot = sql.getString("hargatotal");
lapan.setText(hargatot);
String totalbayar = sql.getString("totalbayar");
sembilan.setText(totalbayar);
String kmbl = sql.getString("kembalian");
sepu.setText(kmbl);
 }
} catch (Exception e) {}
    }//GEN-LAST:event_tbl_pelangganMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        caridata();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new chekin().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new register().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        
        
        try {
            // TODO add your handling code here:
            excel();
        } catch (IOException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }



    }//GEN-LAST:event_jLabel9MouseClicked
void caridata(){
DefaultTableModel tbl=new DefaultTableModel();
tbl.addColumn("Id");
tbl.addColumn("Nama Pelanggan");
tbl.addColumn("Jenis Kelamin");
tbl.addColumn("No Handphone");
tbl.addColumn("Lama Menginap");
tbl.addColumn("Tipe Kamar");
tbl.addColumn("No Kamar");
tbl.addColumn("Harga Total");
tbl.addColumn("Total Bayar");
tbl.addColumn("Kembalian");
try{
String sql="SELECT * FROM pelanggan WHERE id like '%"+txtcari.getText()+"%'";
stat=con.createStatement();
rs=stat.executeQuery(sql);
while(rs.next()){
tbl.addRow(new Object[]{rs.getString(1),rs.getString(2),
rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
}
tbl_pelanggan.setModel(tbl);
}catch(Exception e){}
}
    void deletedata(){
try {
stat = con.createStatement();
stat.executeUpdate("Delete from pelanggan where id= '" +satu.getText() + "'");
 JOptionPane.showMessageDialog(null, "Chek Out Berhasil");
 } catch (Exception e) {
 e.printStackTrace();
 } 
}
   
    void tampildata(){
DefaultTableModel tbl=new DefaultTableModel();
tbl.addColumn("Id");
tbl.addColumn("Nama Pelanggan");
tbl.addColumn("Jenis Kelamin");
tbl.addColumn("No Handphone");
tbl.addColumn("Tanggal Chek In");
tbl.addColumn("Tanggal Chek Out");
tbl.addColumn("Lama Menginap");
tbl.addColumn("Tipe Kamar");
tbl.addColumn("No Kamar");
tbl.addColumn("Harga Total");
tbl.addColumn("Total Bayar");
tbl.addColumn("Kembalian");

try{
String sql="select*from pelanggan";
stat=con.createStatement();
rs=stat.executeQuery(sql);
while(rs.next()){
tbl.addRow(new Object[]{rs.getString(1),rs.getString(2),
rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
}
tbl_pelanggan.setModel(tbl);
}catch(Exception e){}
    
    }
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
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chekout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dua;
    private javax.swing.JTextField empat;
    private javax.swing.JTextField enam;
    private javax.swing.JTextField in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lapan;
    private javax.swing.JTextField lima;
    private javax.swing.JTextField out;
    private javax.swing.JTextField satu;
    private javax.swing.JTextField sembilan;
    private javax.swing.JTextField sepu;
    private javax.swing.JTable tbl_pelanggan;
    private javax.swing.JTextField tglsekarang;
    private javax.swing.JTextField tiga;
    private javax.swing.JTextField tujuh;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables

    private void exists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
