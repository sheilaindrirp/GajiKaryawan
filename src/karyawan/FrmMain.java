package karyawan;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmMain extends javax.swing.JFrame {

    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlData = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGaji = new javax.swing.JTable();
        pnlGaji = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        pnlMenu1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        tbGaji = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        pnlKaryawan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbNIK = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tbNama = new javax.swing.JTextField();
        tbAlamat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbTanggal = new com.toedter.calendar.JDateChooser();
        tbTempat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbSimapn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PT. Sinergi Bangsa Mandiri");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(123, 31, 162));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PT. Sinergi Bangsa Mandiri");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 530, 60);

        jPanel3.setBackground(new java.awt.Color(106, 27, 154));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 70, 680, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 90);

        jPanel2.setBackground(new java.awt.Color(123, 31, 162));
        jPanel2.setLayout(null);

        jButton1.setText("Karyawan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 40, 130, 32);

        jButton2.setText("Gaji");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 80, 130, 32);

        jButton3.setText("Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(10, 120, 130, 32);

        pnlMenu.setBackground(new java.awt.Color(106, 27, 154));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(pnlMenu);
        pnlMenu.setBounds(0, 0, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 150, 170);

        pnlData.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Penggajian Karyawan");
        pnlData.add(jLabel14);
        jLabel14.setBounds(10, 10, 360, 40);

        tblGaji.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblGaji);

        pnlData.add(jScrollPane2);
        jScrollPane2.setBounds(10, 60, 360, 240);

        getContentPane().add(pnlData);
        pnlData.setBounds(180, 100, 360, 300);

        pnlGaji.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Penggajian Karyawan");
        pnlGaji.add(jLabel10);
        jLabel10.setBounds(10, 10, 360, 40);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        pnlGaji.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 360, 80);

        jPanel4.setBackground(new java.awt.Color(123, 31, 162));
        jPanel4.setLayout(null);

        pnlMenu1.setBackground(new java.awt.Color(106, 27, 154));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Masukkan Data Gaji");

        javax.swing.GroupLayout pnlMenu1Layout = new javax.swing.GroupLayout(pnlMenu1);
        pnlMenu1.setLayout(pnlMenu1Layout);
        pnlMenu1Layout.setHorizontalGroup(
            pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        pnlMenu1Layout.setVerticalGroup(
            pnlMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(pnlMenu1);
        pnlMenu1.setBounds(0, 0, 360, 30);

        lblNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNama.setText("Silahkan Pilih Nama Karyawan");
        jPanel4.add(lblNama);
        lblNama.setBounds(10, 40, 340, 16);
        jPanel4.add(tbGaji);
        tbGaji.setBounds(123, 70, 220, 24);

        jLabel13.setText("Jumlah Gaji");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(20, 70, 100, 20);

        jButton5.setText("Input Gaji");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(220, 100, 120, 32);

        pnlGaji.add(jPanel4);
        jPanel4.setBounds(10, 160, 360, 140);

        getContentPane().add(pnlGaji);
        pnlGaji.setBounds(170, 100, 380, 310);

        pnlKaryawan.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Masukkan Data Karyawan");
        pnlKaryawan.add(jLabel3);
        jLabel3.setBounds(10, 0, 360, 40);

        jLabel4.setText("NIK");
        pnlKaryawan.add(jLabel4);
        jLabel4.setBounds(10, 70, 150, 16);
        pnlKaryawan.add(tbNIK);
        tbNIK.setBounds(10, 90, 160, 24);

        jLabel5.setText("Nama Lengkap");
        pnlKaryawan.add(jLabel5);
        jLabel5.setBounds(10, 120, 150, 16);
        pnlKaryawan.add(tbNama);
        tbNama.setBounds(10, 140, 160, 24);
        pnlKaryawan.add(tbAlamat);
        tbAlamat.setBounds(10, 190, 160, 24);

        jLabel6.setText("Alamat");
        pnlKaryawan.add(jLabel6);
        jLabel6.setBounds(10, 170, 150, 16);
        pnlKaryawan.add(tbTanggal);
        tbTanggal.setBounds(200, 140, 160, 29);
        pnlKaryawan.add(tbTempat);
        tbTempat.setBounds(200, 90, 160, 24);

        jLabel8.setText("Tanggal Lahir");
        pnlKaryawan.add(jLabel8);
        jLabel8.setBounds(200, 120, 150, 16);

        jLabel9.setText("Tempat Lahir");
        pnlKaryawan.add(jLabel9);
        jLabel9.setBounds(200, 70, 150, 16);

        tbSimapn.setText("Simpan");
        tbSimapn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimapnActionPerformed(evt);
            }
        });
        pnlKaryawan.add(tbSimapn);
        tbSimapn.setBounds(267, 240, 90, 32);

        getContentPane().add(pnlKaryawan);
        pnlKaryawan.setBounds(170, 100, 390, 320);

        setSize(new java.awt.Dimension(566, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        pnlKaryawan.setVisible(false);
        pnlGaji.setVisible(false);
        pnlData.setVisible(true);
        
        getData();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void getData(){
        String kolom[] = {"No","NIK","Nama","Alamat","Lahir","Tanggal","Gaji"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM karyawan WHERE gaji IS NOT NULL";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nik = rs.getString(2);
               String nama = rs.getString(3);
               String alamat = rs.getString(4);
               String tmp_lahir = rs.getString(5);
               String tgl_lahir = rs.getString(6);
               String gaji = rs.getString(7);
               String data [] = {no,nik,nama,alamat,tmp_lahir,tgl_lahir,gaji};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       tblGaji.setModel(dtm);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pnlKaryawan.setVisible(true);
        pnlGaji.setVisible(false);
        pnlData.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pnlKaryawan.setVisible(false);
        pnlGaji.setVisible(true);
        pnlData.setVisible(false);
        
        sikat();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void sikat() {
       String kolom[] = {"No","NIK","Nama","Alamat","Lahir","Tanggal"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT * FROM karyawan WHERE gaji IS NULL";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nik = rs.getString(2);
               String nama = rs.getString(3);
               String alamat = rs.getString(4);
               String tmp_lahir = rs.getString(5);
               String tgl_lahir = rs.getString(6);
               String data [] = {no,nik,nama,alamat,tmp_lahir,tgl_lahir};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       tblData.setModel(dtm);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pnlKaryawan.setVisible(true);
        pnlGaji.setVisible(false);
        pnlData.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void tbSimapnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimapnActionPerformed
        // TODO add your handling code here:
        java.sql.Date sqldate = new java.sql.Date(tbTanggal.getDate().getTime());
        String SQL = "INSERT INTO karyawan (id,nik,nama,alamat,tmp_lahir,tgl_lahir,gaji) "
                + "VALUES(NULL,'"+tbNIK.getText()+"','"+tbNama.getText()+"',"
                + "'"+tbAlamat.getText()+"','"+tbTempat.getText()+"','"+sqldate+"',NULL)";
        System.out.println(SQL);
        int status = DBConn.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tbSimapnActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        if(baris != -1){
            lblNama.setText(tblData.getValueAt(baris,2).toString());
        }   
    }//GEN-LAST:event_tblDataMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int baris = tblData.getSelectedRow();
        String aydi = tblData.getValueAt(baris, 0).toString();
        String SQL = "UPDATE karyawan SET gaji='"+tbGaji.getText()+"' WHERE id="+aydi;
        int status = DBConn.execute(SQL);
        if (status == 1) {
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan","Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal disimpan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
        sikat();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNama;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlGaji;
    private javax.swing.JPanel pnlKaryawan;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMenu1;
    private javax.swing.JTextField tbAlamat;
    private javax.swing.JTextField tbGaji;
    private javax.swing.JTextField tbNIK;
    private javax.swing.JTextField tbNama;
    private javax.swing.JButton tbSimapn;
    private com.toedter.calendar.JDateChooser tbTanggal;
    private javax.swing.JTextField tbTempat;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblGaji;
    // End of variables declaration//GEN-END:variables

    
}
