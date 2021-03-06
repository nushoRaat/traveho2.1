/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Rangpur extends javax.swing.JFrame {

    /**
     * Creates new form Rangpur
     */
    public Rangpur() {
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

        icon_of_restaurent = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        sidecolor = new javax.swing.JPanel();
        Hotels = new javax.swing.JButton();
        HistoricalPlaces = new javax.swing.JButton();
        Restaurants = new javax.swing.JButton();
        icon_of_historical_place = new javax.swing.JLabel();
        icon_of_hotel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_of_restaurent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-restaurant-100.png"))); // NOI18N
        getContentPane().add(icon_of_restaurent, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, -1));

        Back.setBackground(new java.awt.Color(0, 102, 102));
        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-back-64.png"))); // NOI18N
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, -1));

        sidecolor.setBackground(new java.awt.Color(153, 255, 153,65));

        Hotels.setBackground(new java.awt.Color(0, 102, 153));
        Hotels.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hotels.setForeground(java.awt.Color.white);
        Hotels.setText("Hotels");
        Hotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotelsActionPerformed(evt);
            }
        });

        HistoricalPlaces.setBackground(new java.awt.Color(0, 102, 153));
        HistoricalPlaces.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HistoricalPlaces.setForeground(java.awt.Color.white);
        HistoricalPlaces.setText("Historical Places");
        HistoricalPlaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricalPlacesActionPerformed(evt);
            }
        });

        Restaurants.setBackground(new java.awt.Color(0, 102, 153));
        Restaurants.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Restaurants.setForeground(java.awt.Color.white);
        Restaurants.setText("Restaurants");
        Restaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaurantsActionPerformed(evt);
            }
        });

        icon_of_historical_place.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/hisyoPlace.jpg"))); // NOI18N

        icon_of_hotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-hotel-building-100.png"))); // NOI18N

        javax.swing.GroupLayout sidecolorLayout = new javax.swing.GroupLayout(sidecolor);
        sidecolor.setLayout(sidecolorLayout);
        sidecolorLayout.setHorizontalGroup(
            sidecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidecolorLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(sidecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_of_historical_place, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon_of_hotel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(sidecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistoricalPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hotels, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Restaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        sidecolorLayout.setVerticalGroup(
            sidecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidecolorLayout.createSequentialGroup()
                .addGroup(sidecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidecolorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(HistoricalPlaces, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidecolorLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(icon_of_historical_place)))
                .addGroup(sidecolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidecolorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Hotels, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Restaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidecolorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icon_of_hotel)))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        getContentPane().add(sidecolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/rang.jpg1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        setSize(new java.awt.Dimension(976, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaurantsActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        try {
            new RangRest().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Rangpur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RestaurantsActionPerformed

    private void HistoricalPlacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricalPlacesActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
            new RangpurPlaces().setVisible(true);

    }//GEN-LAST:event_HistoricalPlacesActionPerformed

    private void HotelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotelsActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        try {
            new hotelRangpur().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Rangpur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HotelsActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Rangpur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rangpur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rangpur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rangpur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rangpur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton HistoricalPlaces;
    private javax.swing.JButton Hotels;
    private javax.swing.JButton Restaurants;
    private javax.swing.JLabel icon_of_historical_place;
    private javax.swing.JLabel icon_of_hotel;
    private javax.swing.JLabel icon_of_restaurent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel sidecolor;
    // End of variables declaration//GEN-END:variables
}
