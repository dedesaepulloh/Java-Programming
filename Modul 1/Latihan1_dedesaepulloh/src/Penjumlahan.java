/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dede S
 */
public class Penjumlahan extends javax.swing.JFrame {

    /**
     * Creates new form Penjumlahan
     */
    public Penjumlahan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1_dedesaepulloh = new javax.swing.JLabel();
        jLabel2_dedesaepulloh = new javax.swing.JLabel();
        jLabel3_dedesaepulloh = new javax.swing.JLabel();
        angka1TF_dedesaepulloh = new javax.swing.JTextField();
        angka2TF_dedesaepulloh = new javax.swing.JTextField();
        HasilTF_dedesaepulloh = new javax.swing.JTextField();
        tambahBT_dedesaepulloh = new javax.swing.JButton();
        hapusBT_dedesaepulloh = new javax.swing.JButton();
        keluarBT_dedesaepulloh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1_dedesaepulloh.setText("Angka Pertama");

        jLabel2_dedesaepulloh.setText("Angka Kedua");

        jLabel3_dedesaepulloh.setText("Hasil Pertambahan");

        tambahBT_dedesaepulloh.setText("TAMBAH");
        tambahBT_dedesaepulloh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBT_dedesaepullohActionPerformed(evt);
            }
        });

        hapusBT_dedesaepulloh.setText("HAPUS");
        hapusBT_dedesaepulloh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusBT_dedesaepullohMouseClicked(evt);
            }
        });

        keluarBT_dedesaepulloh.setText("KELUAR");
        keluarBT_dedesaepulloh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarBT_dedesaepullohMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3_dedesaepulloh)
                            .addComponent(jLabel1_dedesaepulloh)
                            .addComponent(jLabel2_dedesaepulloh))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(angka1TF_dedesaepulloh)
                            .addComponent(angka2TF_dedesaepulloh, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(HasilTF_dedesaepulloh)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tambahBT_dedesaepulloh)
                        .addGap(32, 32, 32)
                        .addComponent(hapusBT_dedesaepulloh)
                        .addGap(32, 32, 32)
                        .addComponent(keluarBT_dedesaepulloh)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_dedesaepulloh)
                    .addComponent(angka1TF_dedesaepulloh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2_dedesaepulloh)
                    .addComponent(angka2TF_dedesaepulloh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3_dedesaepulloh)
                    .addComponent(HasilTF_dedesaepulloh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahBT_dedesaepulloh)
                    .addComponent(hapusBT_dedesaepulloh)
                    .addComponent(keluarBT_dedesaepulloh))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBT_dedesaepullohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBT_dedesaepullohActionPerformed
        // TODO add your handling code here:
        Double hasilTambah = (Double.parseDouble(angka1TF_dedesaepulloh.getText())) + (Double.parseDouble(angka2TF_dedesaepulloh.getText()));
        HasilTF_dedesaepulloh.setText(Double.toString(hasilTambah));
    }//GEN-LAST:event_tambahBT_dedesaepullohActionPerformed

    private void hapusBT_dedesaepullohMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusBT_dedesaepullohMouseClicked
        // TODO add your handling code here:
        angka1TF_dedesaepulloh.setText("");
        angka2TF_dedesaepulloh.setText("");
        HasilTF_dedesaepulloh.setText("");
    }//GEN-LAST:event_hapusBT_dedesaepullohMouseClicked

    private void keluarBT_dedesaepullohMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarBT_dedesaepullohMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarBT_dedesaepullohMouseClicked

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
            java.util.logging.Logger.getLogger(Penjumlahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjumlahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjumlahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjumlahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjumlahan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HasilTF_dedesaepulloh;
    private javax.swing.JTextField angka1TF_dedesaepulloh;
    private javax.swing.JTextField angka2TF_dedesaepulloh;
    private javax.swing.JButton hapusBT_dedesaepulloh;
    private javax.swing.JLabel jLabel1_dedesaepulloh;
    private javax.swing.JLabel jLabel2_dedesaepulloh;
    private javax.swing.JLabel jLabel3_dedesaepulloh;
    private javax.swing.JButton keluarBT_dedesaepulloh;
    private javax.swing.JButton tambahBT_dedesaepulloh;
    // End of variables declaration//GEN-END:variables
}