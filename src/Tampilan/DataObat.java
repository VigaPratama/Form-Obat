/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tampilan;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Me
 */
public class DataObat extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form DataObat
     */
    public DataObat() {
        initComponents();
        datatabel();
    }
    
    protected void aktif(){
        KObat.setEnabled(true);
        NObat.setEnabled(true);
        JObat.setEnabled(true);
        HObat.setEnabled(true);
        StokObat.setEnabled(true);
        KObat.requestFocus();
    }
    
    protected void kosong(){
        KObat.setText("");
        NObat.setText("");
        JObat.setText("");
        SatuanObat.setSelectedIndex(0);
        HObat.setText("");
        StokObat.setText("");
        bcari.setText("Cari");
    }
    
    protected void datatabel(){
        Object[] Baris ={"Kode Obat", "Nama Obat", "Jenis Obat", "Satuan", "Harga", "Stok"};
        tabmode  = new DefaultTableModel(null, Baris);
        tabelObat.setModel(tabmode);
        String sql = "select * from obat";
        try{
           java.sql.Statement stat = conn.createStatement();
           ResultSet hasil = stat.executeQuery(sql);
           while(hasil.next()){
              String a = hasil.getString("Kode_Obat");
              String b = hasil.getString("Nama_Obat");
              String c = hasil.getString("Jenis_Obat");
              String d = hasil.getString("Satuan");
              String e = hasil.getString("Harga");
              String f = hasil.getString("Stok");
           }
           
        }catch(Exception e){
           
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        KObat = new javax.swing.JTextField();
        NObat = new javax.swing.JTextField();
        JObat = new javax.swing.JTextField();
        SatuanObat = new javax.swing.JComboBox<>();
        HObat = new javax.swing.JTextField();
        StokObat = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bsave = new javax.swing.JButton();
        bedit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelObat = new javax.swing.JTable();
        txcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Obat");

        jLabel2.setText("Nama Obat");

        jLabel3.setText("Jenis Obat");

        jLabel4.setText("Satuan");

        jLabel5.setText("Harga");

        jLabel6.setText("Stok");

        KObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KObatActionPerformed(evt);
            }
        });

        NObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NObatActionPerformed(evt);
            }
        });

        SatuanObat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCS", "Botol", "Unit" }));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nama : Viga Pratama");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("NPM : 201943501706");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("DATA OBAT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        bsave.setBackground(new java.awt.Color(0, 102, 255));
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bedit.setBackground(new java.awt.Color(255, 102, 0));
        bedit.setForeground(new java.awt.Color(255, 255, 255));
        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bdelete.setBackground(new java.awt.Color(255, 0, 0));
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        tabelObat.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelObat);

        txcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcariActionPerformed(evt);
            }
        });

        bcari.setBackground(new java.awt.Color(102, 255, 51));
        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsave)
                                .addGap(18, 18, 18)
                                .addComponent(bedit)
                                .addGap(18, 18, 18)
                                .addComponent(bdelete))
                            .addComponent(SatuanObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HObat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NObat, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(KObat)
                            .addComponent(JObat)
                            .addComponent(StokObat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txcari, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bcari))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(KObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcari))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SatuanObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StokObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsave)
                    .addComponent(bedit)
                    .addComponent(bdelete))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KObatActionPerformed

    private void NObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NObatActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String sql = "insert into obat value (?,?,?,?,?,?)";
          try {
           PreparedStatement stat = conn.prepareStatement(sql);
           stat.setString(1, KObat.getText());
           stat.setString(2, NObat.getText());
           stat.setString(3, JObat.getText());
           stat.setString(4, SatuanObat.getSelectedItem().toString());
           stat.setString(5, HObat.getText());
           stat.setString(6, StokObat.getText());
           stat.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
           kosong();
           KObat.requestFocus();
           datatabel();
           
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal Disimpan"+e);
        }
    }//GEN-LAST:event_bsaveActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        // TODO add your handling code here:
         try{
       String sql = "update obat set Nama_Obat=?, Jenis_Obat=?, Satuan=?, Harga=? ,Stok=? where Kode_Obat=?";
            PreparedStatement stat = conn.prepareStatement (sql);
            stat.setString(1, NObat.getText());
           stat.setString(2, JObat.getText());
           stat.setString(3, SatuanObat.getSelectedItem().toString());
           stat.setString(4, HObat.getText());
           stat.setString(5, StokObat.getText());
           stat.setString(6, KObat.getText());
           stat.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
           kosong();
           KObat.requestFocus();
           datatabel();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal diubah"+e);
        }
    }//GEN-LAST:event_beditActionPerformed

    private void txcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcariActionPerformed

    private void tabelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelObatMouseClicked
        // TODO add your handling code here:
        int bar = tabelObat.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        
        KObat.setText(a);
        NObat.setText(b);
        JObat.setText(c);
        SatuanObat.setSelectedItem(d);
        HObat.setText(e);
        StokObat.setText(e);
        
    }//GEN-LAST:event_tabelObatMouseClicked

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        // TODO add your handling code here:
   int ok = JOptionPane.showConfirmDialog(null, "hapus", "Konfirmasi Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
            String sql = "delete from obat where Kode_Obat = '"+KObat.getText()+"'";
            try{
               PreparedStatement stat = conn.prepareStatement(sql);
               stat.executeUpdate();
               JOptionPane.showMessageDialog(null, "data berhasil dihapus");
               kosong();
               KObat.requestFocus();
               datatabel();
            }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // TODO add your handling code here:
        Object [] Baris = {"Kode Obat", "Nama Obat", "Jenis Obat", "Satuan", "Harga", "Stok"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelObat.setModel(tabmode);
        String sql = "select * from obat where Nama_Obat like '%"+txcari.getText()+"%'";
        try{
           java.sql.Statement stat = conn.createStatement();
           ResultSet hasil = stat.executeQuery(sql);
           while(hasil.next()){
            String a = hasil.getString("Kode_Obat");
            String b = hasil.getString("Nama_Obat");
            String c = hasil.getString("Jenis_Obat");
            String d = hasil.getString("Satuan");
            String e = hasil.getString("Harga");
            String f = hasil.getString("Stok");
            
            String[] data={a,b,c,d,e,f};
            tabmode.addRow(data);
           }
        } catch(Exception e){
        
        }
    }//GEN-LAST:event_bcariActionPerformed

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
            java.util.logging.Logger.getLogger(DataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HObat;
    private javax.swing.JTextField JObat;
    private javax.swing.JTextField KObat;
    private javax.swing.JTextField NObat;
    private javax.swing.JComboBox<String> SatuanObat;
    private javax.swing.JTextField StokObat;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bsave;
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
    private javax.swing.JTable tabelObat;
    private javax.swing.JTextField txcari;
    // End of variables declaration//GEN-END:variables
}
