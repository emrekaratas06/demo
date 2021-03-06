
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emrek
 */

public class DersProgramiEkrani extends javax.swing.JDialog {
    DefaultTableModel model;
    Dersİslemleri islemler =  new Dersİslemleri();
   
       /**
     * Creates new form DersProgramiEkrani
     */
    public DersProgramiEkrani(java.awt.Frame parent, boolean modal) {
      super(parent, modal);
        initComponents();
        model = (DefaultTableModel) ders_tablosu.getModel();
        dersGoruntule();
    }
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ad_alani = new javax.swing.JLabel();
        soyad_alani = new javax.swing.JLabel();
        brans_alani = new javax.swing.JLabel();
        sinifsecim_alani = new javax.swing.JComboBox<>();
        subesecim_alani = new javax.swing.JComboBox<>();
        dersekle_alani = new javax.swing.JButton();
        mesaj_alani = new javax.swing.JLabel();
        derssil_alani = new javax.swing.JButton();
        guncelle_alani = new javax.swing.JButton();
        derssaatisayisi_alani = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ders_tablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DERS PROGRAMI EKRANI");

        sinifsecim_alani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5. Sınıf", "6. Sınıf", "7. Sınıf", "8. Sınıf" }));

        subesecim_alani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        dersekle_alani.setText("Ekle");
        dersekle_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dersekle_alaniActionPerformed(evt);
            }
        });

        mesaj_alani.setForeground(new java.awt.Color(153, 0, 0));

        derssil_alani.setText("Sil");
        derssil_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derssil_alaniActionPerformed(evt);
            }
        });

        guncelle_alani.setText("Güncelle");
        guncelle_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelle_alaniActionPerformed(evt);
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
                        .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soyad_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(brans_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sinifsecim_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subesecim_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mesaj_alani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(derssaatisayisi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dersekle_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(derssil_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guncelle_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brans_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinifsecim_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subesecim_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dersekle_alani)
                    .addComponent(derssil_alani)
                    .addComponent(guncelle_alani)
                    .addComponent(derssaatisayisi_alani))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        ders_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ad", "soyad", "brans", "sinif", "sube", "derssaatisayisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ders_tablosu);
        if (ders_tablosu.getColumnModel().getColumnCount() > 0) {
            ders_tablosu.getColumnModel().getColumn(0).setResizable(false);
            ders_tablosu.getColumnModel().getColumn(1).setResizable(false);
            ders_tablosu.getColumnModel().getColumn(2).setResizable(false);
            ders_tablosu.getColumnModel().getColumn(3).setResizable(false);
            ders_tablosu.getColumnModel().getColumn(4).setResizable(false);
            ders_tablosu.getColumnModel().getColumn(5).setResizable(false);
            ders_tablosu.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void dersekle_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dersekle_alaniActionPerformed
      mesaj_alani.setText("");
        String id= id_alani.getText();
        String ad  =  ad_alani.getText();
        String soyad = soyad_alani.getText();
        String brans = brans_alani.getText();
        String sinif=String.valueOf(sinifsecim_alani.getSelectedItem());
        String sube = String.valueOf(subesecim_alani.getSelectedItem());
        String derssaatisayisi = derssaatisayisi_alani.getText();
        islemler.dersEkle(Integer.valueOf(id),ad,soyad,brans,sinif,sube, derssaatisayisi);
        
        dersGoruntule();
        
        mesaj_alani.setText("Yeni Ders Başarıyla Eklendi...");  // TODO add your handling code here:
    }//GEN-LAST:event_dersekle_alaniActionPerformed

    private void guncelle_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelle_alaniActionPerformed
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String brans = brans_alani.getText();
        String sinif=String.valueOf(sinifsecim_alani.getSelectedItem());
        String sube = String.valueOf(subesecim_alani.getSelectedItem());
        String derssaatisayisi = derssaatisayisi_alani.getText();
        int selectedrow = ders_tablosu.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                mesaj_alani.setText("Ders Tablosu şu anda boş. ");
            }
            else {
                mesaj_alani.setText("Lütfen güncellenecek bir ders seçin.");
            }
        }
        else {
           
           int id_a= Integer.parseInt(id); //int id = (int)model.getValueAt(selectedrow,0);
           
            islemler.dersGuncelle(id_a,ad,soyad,brans,sinif,sube,derssaatisayisi);
            
            dersGoruntule();
            
            mesaj_alani.setText("Çalışan başarıyla güncellendi...");
        }  // TODO add your handling code here:
    }//GEN-LAST:event_guncelle_alaniActionPerformed

    private void derssil_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_derssil_alaniActionPerformed
        mesaj_alani.setText("");
      
       int selectedrow = ders_tablosu.getSelectedRow();
       
       if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               mesaj_alani.setText("Ders tablosu şu anda boş...");
           }
           else {
               mesaj_alani.setText("Lütfen silinecek bir ders seçin...");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           islemler.dersSil(id);
           
           dersGoruntule();
           
           mesaj_alani.setText("Çalışan sınıfa dersi başarıyla silindi...");
        
       }        // TODO add your handling code here:
    }//GEN-LAST:event_derssil_alaniActionPerformed

     private void ders_tablosuMouseClicked(java.awt.event.MouseEvent evt) {                                             
      
        int selectedrow = ders_tablosu.getSelectedRow();
        
        id_alani.setText(model.getValueAt(selectedrow,1).toString());
        ad_alani.setText(model.getValueAt(selectedrow,2).toString());
        soyad_alani.setText(model.getValueAt(selectedrow,3).toString());
        brans_alani.setText(model.getValueAt(selectedrow,4).toString());
        sinifsecim_alani.setSelectedItem(model.getValueAt(selectedrow,5).toString());
        subesecim_alani.setSelectedItem(model.getValueAt(selectedrow,6).toString());
        derssaatisayisi_alani.setText(model.getValueAt(selectedrow,7).toString());
    } 
        public void dersGoruntule() {
        
               model.setRowCount(0);
        
        ArrayList<DersProgrami> dersler = new ArrayList<DersProgrami>();
        
        
        dersler = islemler.dersleriGetir();
        
        if (dersler != null ) {
            
            for (DersProgrami ders : dersler) {
                Object[] eklenecek = {ders.getId(), ders.getAd(),ders.getSoyad(),ders.getBrans(),ders.getSinif(), ders.getSube(),ders.getDerssaatisayisi()};
                
                model.addRow(eklenecek);
        
            }
            
        }
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
            java.util.logging.Logger.getLogger(DersProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DersProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DersProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DersProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DersProgramiEkrani dialog = new DersProgramiEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
     public void gelenVeriler(String ad, String soyad, String brans, String id){
        ad_alani.setText(ad);
        soyad_alani.setText(soyad);
        brans_alani.setText(brans);
        id_alani.setText(id);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad_alani;
    private javax.swing.JLabel brans_alani;
    private javax.swing.JTable ders_tablosu;
    private javax.swing.JButton dersekle_alani;
    private javax.swing.JLabel derssaatisayisi_alani;
    private javax.swing.JButton derssil_alani;
    private javax.swing.JButton guncelle_alani;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_alani;
    private javax.swing.JComboBox<String> sinifsecim_alani;
    private javax.swing.JLabel soyad_alani;
    private javax.swing.JComboBox<String> subesecim_alani;
    // End of variables declaration//GEN-END:variables
}
