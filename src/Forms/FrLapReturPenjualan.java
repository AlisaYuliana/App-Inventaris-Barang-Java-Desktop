package Forms;

import Tools.KoneksiDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.text.SimpleDateFormat;


public class FrLapReturPenjualan extends javax.swing.JInternalFrame {

        KoneksiDB getCnn = new KoneksiDB();
    Connection _Cnn;
    String sqlselect, vkd_prodi, vprodi;
    SimpleDateFormat tglinput = new SimpleDateFormat("yyyy-MM-dd");
    public FrLapReturPenjualan() {
        initComponents();
    }

    private void cetakLaporan1(){
    String pth = System.getProperty("user.dir") + "/laporan/rpReturJual1.jrxml";
    String logo = System.getProperty("user.dir") + "/laporan/";
    try{
        Map<String, Object> parameters = new HashMap<>();
        _Cnn = null;
        _Cnn = getCnn.getConnection();
        parameters.put("parLogo", logo);
        JasperReport jrpt = JasperCompileManager.compileReport(pth);
        JasperPrint jprint = JasperFillManager.fillReport(jrpt, parameters, _Cnn);
        
        JasperViewer.viewReport(jprint, false);
    }catch(SQLException | JRException ex){
        JOptionPane.showMessageDialog(this, "Error Method cetakLaporan1(): "
        + ex, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
    private void cetakLaporan2(){
    String pth = System.getProperty("user.dir") + "/laporan/rpReturJual2.jrxml";
    String logo = System.getProperty("user.dir") + "/laporan/";
    try{
        Map<String, Object> parameters = new HashMap<>();
        _Cnn = null;
        _Cnn = getCnn.getConnection();
        parameters.put("parLogo", logo);
        JasperReport jrpt = JasperCompileManager.compileReport(pth);
        JasperPrint jprint = JasperFillManager.fillReport(jrpt, parameters, _Cnn);
        
        JasperViewer.viewReport(jprint, false);
    }catch(SQLException | JRException ex){
        JOptionPane.showMessageDialog(this, "Error Method cetakLaporan2(): "
        + ex, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
    private void cetakLaporan3(){
    String pth = System.getProperty("user.dir") + "/laporan/rpReturJual3.jrxml";
    String logo = System.getProperty("user.dir") + "/laporan/";
    try{
        Map<String, Object> parameters = new HashMap<>();
        _Cnn = null;
        _Cnn = getCnn.getConnection();
        parameters.put("parLogo", logo);
        parameters.put("parTgl", tglinput.format(dtTgl.getDate()));
        JasperReport jrpt = JasperCompileManager.compileReport(pth);
        JasperPrint jprint = JasperFillManager.fillReport(jrpt, parameters, _Cnn);
        
        JasperViewer.viewReport(jprint, false);
    }catch(SQLException | JRException ex){
        JOptionPane.showMessageDialog(this, "Error Method cetakLaporan3(): "
        + ex, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
    private void cetakLaporan4(){
    String pth = System.getProperty("user.dir") + "/laporan/rpReturJual4.jrxml";
    String logo = System.getProperty("user.dir") + "/laporan/";
    try{
        Map<String, Object> parameters = new HashMap<>();
        _Cnn = null;
        _Cnn = getCnn.getConnection();
        parameters.put("parLogo", logo);
        parameters.put("parTgl", tglinput.format(dtTgl.getDate()));
        JasperReport jrpt = JasperCompileManager.compileReport(pth);
        JasperPrint jprint = JasperFillManager.fillReport(jrpt, parameters, _Cnn);
        
        JasperViewer.viewReport(jprint, false);
    }catch(SQLException | JRException ex){
        JOptionPane.showMessageDialog(this, "Error Method cetakLaporan4(): "
        + ex, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        rbMotor = new javax.swing.JRadioButton();
        rbSparepart = new javax.swing.JRadioButton();
        panel2 = new javax.swing.JPanel();
        btnCetak1 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        btnCetak2 = new javax.swing.JButton();
        dtTgl = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/EXY.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo_xyz.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Laporan Retur Penjualan");

        jLabel3.setText("Form ini digunakan untuk cetak data Retur Penjualan");

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Pilih Barang"));
        panel1.setOpaque(false);

        buttonGroup1.add(rbMotor);
        rbMotor.setText("Motor");
        rbMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMotorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbSparepart);
        rbSparepart.setText("Sparepart");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(rbMotor)
                .addGap(55, 55, 55)
                .addComponent(rbSparepart)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMotor)
                    .addComponent(rbSparepart))
                .addContainerGap())
        );

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cetak Semua Data Retur Penjualan"));
        panel2.setOpaque(false);

        btnCetak1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/print_preview.png"))); // NOI18N
        btnCetak1.setText("Cetak");
        btnCetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetak1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnCetak1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCetak1)
                .addContainerGap())
        );

        panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cetak per Hari/Bulan"));
        panel3.setOpaque(false);

        btnCetak2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/print_preview.png"))); // NOI18N
        btnCetak2.setText("Cetak");
        btnCetak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetak2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(dtTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCetak2)
                .addGap(56, 56, 56))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCetak2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetak2ActionPerformed
        if(rbMotor.isSelected()){
            cetakLaporan4();
        }else if(rbSparepart.isSelected()){
            cetakLaporan3();
        }else{
            JOptionPane.showMessageDialog(this, "Anda belum memilih Barang!");
        }
    }//GEN-LAST:event_btnCetak2ActionPerformed

    private void btnCetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetak1ActionPerformed
        if(rbMotor.isSelected()){
            cetakLaporan2();
        }else if(rbSparepart.isSelected()){
            cetakLaporan1();
        }else{
            JOptionPane.showMessageDialog(this, "Anda belum memilih Barang!");
        }
    }//GEN-LAST:event_btnCetak1ActionPerformed

    private void rbMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMotorActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak1;
    private javax.swing.JButton btnCetak2;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dtTgl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JRadioButton rbMotor;
    private javax.swing.JRadioButton rbSparepart;
    // End of variables declaration//GEN-END:variables
}
