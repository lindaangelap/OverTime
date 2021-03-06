/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DetailLemburController;
import controller.DetailLemburControllerAdmin;
import controller.JenisLemburController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Asus
 */
public class DetailLemburViaAdminView extends javax.swing.JInternalFrame {

    private String header[] = {"NO", "Kode Detail Lembur", "Lama Lembur", "Nama Pegawai", "Tanggal Lembur"};
    private String[] headerTable = {"kd_detail_lembur",
        "kd_lembur", "nip", "tgl_lembur"};
    DetailLemburControllerAdmin dlc;
    private List<String> datas;

    /**
     * Creates new form DetailLembur
     */
    public DetailLemburViaAdminView() {
        initComponents();
        datas = new ArrayList<>();
        dlc = new DetailLemburControllerAdmin();
        datas = dlc.bindingALL(tblDetilLembur, header);
        dlc.loadLembur(cmbLamaLembur);
        dlc.loadPegawai(cmbPegawai);
        
//        txtKdLembur.setEnabled(false);
//        getWaktu();
        setJam();
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetilLembur = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDetilLembur = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        cmbLamaLembur = new javax.swing.JComboBox<>();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        cmbPegawai = new javax.swing.JComboBox<>();
        cmbCari = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        lblTime = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tblDetilLembur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDetilLembur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetilLemburMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetilLembur);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Lembur"));

        jLabel1.setText("Kode Detail Lembur");

        jLabel2.setText("Lama Lembur");

        jLabel3.setText("NIP");

        jLabel4.setText("Tanggal Lembur");

        txtDetilLembur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetilLemburActionPerformed(evt);
            }
        });
        txtDetilLembur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDetilLemburKeyPressed(evt);
            }
        });

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(cmbLamaLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(cmbPegawai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDetilLembur, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDetilLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbLamaLembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cmbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Detail Lembur", "Lama Lembur", "Nama Pegawai", "Tanggal Lembur" }));

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTime.setPreferredSize(new java.awt.Dimension(100, 17));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Form Detail Lembur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnCari)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDetilLemburActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetilLemburActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetilLemburActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        datas = new ArrayList<>();
        datas = dlc.bindingSearch(tblDetilLembur, header,
                headerTable[cmbCari.getSelectedIndex()],
                txtCari.getText());
        
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblDetilLemburMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetilLemburMouseClicked
        txtDetilLembur.setText(tblDetilLembur.getValueAt(tblDetilLembur.getSelectedRow(), 1) + "");
         cmbLamaLembur.setSelectedItem(getCombo(false).get(tblDetilLembur.getSelectedRow()));
//        txtKdLembur.setText(tblDetilLembur.getValueAt
//        (tblDetilLembur.getSelectedRow(), 2)+"");
        cmbPegawai.setSelectedItem(getCombo(true).get(tblDetilLembur.getSelectedRow()));
        txtTanggal.setDate((Date)(tblDetilLembur.getValueAt(tblDetilLembur.getSelectedRow(), 4)));
//        (tblDepartments.getSelectedRow(), 2)+"");
        txtDetilLembur.setEnabled(false);
        btnHapus.setEnabled(true);
        btnSimpan.setEnabled(true);
    }//GEN-LAST:event_tblDetilLemburMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        boolean hasil = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        
            hasil = dlc.insert(txtDetilLembur.getText(), cmbLamaLembur.getSelectedItem().toString(),
                    (cmbPegawai.getSelectedItem().toString()), txtTanggal.getDate().getTime() + "",
                    txtDetilLembur.isEnabled());
        
        String pesan = "Gagal menyimpan data";
        if (hasil) {
            pesan = "Berhasil menyimpan data";
        }
        JOptionPane.showMessageDialog(this, pesan);
        datas = dlc.bindingALL(tblDetilLembur, header);
        reset();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Apakah mau dihapus?");
        if (i == 0) {
            String pesan = "Gagal Hapus";
            boolean hasil = dlc.
                    delete(txtDetilLembur.getText());
            if (hasil) {
                pesan = "Berhasil hapus";
            }
            JOptionPane.showMessageDialog(this, pesan);
            dlc.bindingALL(tblDetilLembur, header);
            reset();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtDetilLemburKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDetilLemburKeyPressed
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_txtDetilLemburKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbCari;
    private javax.swing.JComboBox<String> cmbLamaLembur;
    private javax.swing.JComboBox<String> cmbPegawai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblDetilLembur;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtDetilLembur;
    private com.toedter.calendar.JDateChooser txtTanggal;
    // End of variables declaration//GEN-END:variables

    public void reset() {
        txtDetilLembur.setText("");
        cmbLamaLembur.setSelectedIndex(0);
        cmbPegawai.setSelectedIndex(0);
        txtTanggal.setDate(new Date());
        txtDetilLembur.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
//        getWaktu();
    }

    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getJam() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        return dateFormat.format(time);
    }

//    private void getWaktu() {
//        String dateStart = "09:00:00";
//        Date dateStop = new Date();
//
//        //Konvert dalam bentuk 24 jam (00-23)
//        DateFormat format = new SimpleDateFormat("HH:mm:ss");
//
//        Date d1 = null;
//        Date d2 = null;
//
//        try {
//            d1 = format.parse(dateStart);
//            d2 = dateStop;
//
//            //dalam milliseconds
//            long milli = d2.getTime() - d1.getTime();
//
//            long detik = (milli / 1000) % 60;
//            long menit = milli / (60 * 1000) % 60;
//            long jam = milli / (60 * 60 * 1000) % 24;
////            long diffDays = milli / (24 * 60 * 60 * 1000);
//
//            //jika lebih dari 45menit bulatkan ke atas
//            if (menit >= 45) {
//                jam = jam + 1;
//            } else {
//                jam = jam;
//            }
//            
//            if (jam >= 4) {
//                jam = 4;
//            }else{
//                jam = jam;
//            }
//
//            txtKdLembur.setText(jam + "");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private String getKdLembur() {
//        String kdLembur;
//        if (txtKdLembur.equals(1)) {
//            kdLembur = "LB001";
//        } else if (txtKdLembur.equals(2)) {
//            kdLembur = "LB002";
//        } else if (txtKdLembur.equals(3)) {
//            kdLembur = "LB003";
//        } else {
//            kdLembur = "LB004";
//        }
//        return kdLembur;
//    }
    public final void setJam() {
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "", nol_menit = "", nol_detik = "";

                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();

                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }

                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);

                lblTime.setText(jam + ":" + menit + ":" + detik + "");
            }
        };
        new Timer(1000, taskPerformer).start();
    }

    private List<String> getCombo(boolean isLembur) {
        List<String> isi = new ArrayList<>();
        String[] daftar = new String[datas.size()];
        for (String data : datas) {
            daftar = data.split(";");
            if (isLembur) {
                isi.add(daftar[1]);
            } else {
                isi.add(daftar[0]);
            }
        }
        return isi;
    }
}
