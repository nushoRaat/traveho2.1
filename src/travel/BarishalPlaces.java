/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author tashf
 */



public class BarishalPlaces extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * 
 
     */
    
    DefaultListModel dm = new DefaultListModel();
    public BarishalPlaces() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        back1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        table.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        table.setForeground(new java.awt.Color(0, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Kuakata Sea Beach", "Kuakata beach is a beautiful beach in the southern part of Bangladesh. It is located in Patuakhali district of Barisal Division. It is known as the 'daughter of the sea'. It is believed that in the 18th century, the Arakans migrated to this region from Burma after being driven out by the Mughal rulers. They dug a lot of wells (Kua in Bengali) to meet the need of drinking water. Probably the name Kuakata has been derived from digging of Kua."},
                {"2", "Barishal Divisional Museum", "Barisal Divisional Museum has been established in the old Collectorate building of the district. The building itself is a historical monument that was built in the British era. The government of Bangladesh declared the building as a protected archaeological site in 2003. In 2005, the work of transforming the building into a museum has been started."},
                {"3", "Durga Shagar", "Durga Sagar is located at Swarupkathi - Barisal Road, Madhabpasha, Barisal - 8213. Besides this nature attraction, there are five more nature attractions listed in Barisal. There's also thirteen attractions listed in this district in other categories. You will find the exact location of Durga Sagar on the map above."},
                {"4", "Lakutia Zamidar Bari", "Lakutia Zamindar Bari is located at Babur Bazar Chhoy Mile Shorok, Barisal. Besides this landmark, there are nine more landmarks listed in Barisal. There's also nine attractions listed in this district in other categories. You will find the exact location of Lakutia Zamindar Bari on the map above."},
                {"5", "Fatrar Char", "Fatrar Char is located at Kuakata, Patuakhali. Besides this nature attraction, there are five more nature attractions listed in Patuakhali. There's also nine attractions listed in this district in other categories. You will find the exact location of Fatrar Char on the map above."},
                {"6", "Kirtipasha Zamidar Bari", "Kirtipasha Zamindar Bari is located at Kirtipasha Bazar Road, Kirtipasha, Jhalokati. Besides this landmark, there are ten more landmarks listed in Jhalokati. There's also two attractions listed in this district in other categories. You will find the exact location of Kirtipasha Zamindar Bari on the map above."}
            },
            new String [] {
                "Index", "Places", "Description "
            }
        ));
        table.setGridColor(new java.awt.Color(204, 255, 204));
        table.setRowHeight(50);
        table.setRowMargin(2);
        table.setSelectionBackground(new java.awt.Color(0, 51, 51));
        table.setSelectionForeground(new java.awt.Color(102, 255, 102));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 2460, 320));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 102, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Place of Barishal");
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 2460, 60));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-back-64.png"))); // NOI18N
        back1.setContentAreaFilled(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/backbori.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2460, 2110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Barisal().setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        
         int index = table.getSelectedRow();
        
        TableModel model = table.getModel();
        
        String locations = model.getValueAt(index, 1).toString();
        
        GoogleMaps Gm = new GoogleMaps();
        
        Gm.location = locations;
        
        Gm.search();
        
        
        
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(BarishalPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarishalPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarishalPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarishalPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarishalPlaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables






}