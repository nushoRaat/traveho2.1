/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

/**
 *
 * @author Asus
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        page2 = new javax.swing.JPanel();
        dhaka = new javax.swing.JButton();
        chittagong = new javax.swing.JButton();
        khulna = new javax.swing.JButton();
        rajshahi = new javax.swing.JButton();
        rangpur = new javax.swing.JButton();
        sylhet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mymensingh = new javax.swing.JButton();
        barishal = new javax.swing.JButton();
        secondpage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        page2.setMaximumSize(new java.awt.Dimension(1200, 800));
        page2.setMinimumSize(new java.awt.Dimension(1200, 650));
        page2.setOpaque(false);
        page2.setPreferredSize(new java.awt.Dimension(1200, 650));

        dhaka.setBackground(new java.awt.Color(51, 0, 51));
        dhaka.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        dhaka.setForeground(new java.awt.Color(255, 255, 255));
        dhaka.setText("Dhaka");
        dhaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dhakaActionPerformed(evt);
            }
        });

        chittagong.setBackground(new java.awt.Color(51, 0, 51));
        chittagong.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        chittagong.setForeground(java.awt.Color.white);
        chittagong.setText("Chittagong");
        chittagong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chittagongActionPerformed(evt);
            }
        });

        khulna.setBackground(new java.awt.Color(51, 0, 51));
        khulna.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        khulna.setForeground(java.awt.Color.white);
        khulna.setText("Khulna");
        khulna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khulnaActionPerformed(evt);
            }
        });

        rajshahi.setBackground(new java.awt.Color(51, 0, 51));
        rajshahi.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rajshahi.setForeground(java.awt.Color.white);
        rajshahi.setText("Rajshahi");
        rajshahi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rajshahiActionPerformed(evt);
            }
        });

        rangpur.setBackground(new java.awt.Color(51, 0, 51));
        rangpur.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        rangpur.setForeground(java.awt.Color.white);
        rangpur.setText("Rangpur");
        rangpur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rangpurActionPerformed(evt);
            }
        });

        sylhet.setBackground(new java.awt.Color(51, 0, 51));
        sylhet.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        sylhet.setForeground(java.awt.Color.white);
        sylhet.setText("Sylhet");
        sylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sylhetActionPerformed(evt);
            }
        });

        mymensingh.setBackground(new java.awt.Color(51, 0, 51));
        mymensingh.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        mymensingh.setForeground(java.awt.Color.white);
        mymensingh.setText("Mymensingh");
        mymensingh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mymensinghActionPerformed(evt);
            }
        });

        barishal.setBackground(new java.awt.Color(51, 0, 51));
        barishal.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        barishal.setForeground(java.awt.Color.white);
        barishal.setText("Barishal");
        barishal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barishalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout page2Layout = new javax.swing.GroupLayout(page2);
        page2.setLayout(page2Layout);
        page2Layout.setHorizontalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barishal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rajshahi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rangpur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sylhet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chittagong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(khulna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mymensingh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(page2Layout.createSequentialGroup()
                        .addComponent(dhaka, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(732, 732, 732))
        );
        page2Layout.setVerticalGroup(
            page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page2Layout.createSequentialGroup()
                .addGroup(page2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1)
                        .addGap(504, 504, 504))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dhaka, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chittagong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(khulna, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rajshahi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rangpur, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sylhet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mymensingh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barishal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(page2, gridBagConstraints);

        secondpage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/travel_tips_ted38143822_thumbnail.jpg"))); // NOI18N
        secondpage.setMaximumSize(new java.awt.Dimension(1200, 687));
        secondpage.setMinimumSize(new java.awt.Dimension(1200, 687));
        secondpage.setPreferredSize(new java.awt.Dimension(1200, 687));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(secondpage, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rajshahiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rajshahiActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Rajshahi().setVisible(true);
    }//GEN-LAST:event_rajshahiActionPerformed

    private void dhakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dhakaActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Dhaka().setVisible(true);
    }//GEN-LAST:event_dhakaActionPerformed

    private void chittagongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chittagongActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Chittagong().setVisible(true);
        
    }//GEN-LAST:event_chittagongActionPerformed

    private void khulnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khulnaActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Khulna().setVisible(true);
    }//GEN-LAST:event_khulnaActionPerformed

    private void rangpurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rangpurActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Rangpur().setVisible(true);
        
    }//GEN-LAST:event_rangpurActionPerformed

    private void sylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sylhetActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new sylhet().setVisible(true);
    }//GEN-LAST:event_sylhetActionPerformed

    private void mymensinghActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mymensinghActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Mymensing().setVisible(true);
        
    }//GEN-LAST:event_mymensinghActionPerformed

    private void barishalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barishalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Barisal().setVisible(true);
    }//GEN-LAST:event_barishalActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barishal;
    private javax.swing.JButton chittagong;
    private javax.swing.JButton dhaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton khulna;
    private javax.swing.JButton mymensingh;
    private javax.swing.JPanel page2;
    private javax.swing.JButton rajshahi;
    private javax.swing.JButton rangpur;
    private javax.swing.JLabel secondpage;
    private javax.swing.JButton sylhet;
    // End of variables declaration//GEN-END:variables
}
