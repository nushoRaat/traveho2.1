/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import travel.newpackage.dropmenu;

/**
 *
 * @author Asus
 */
public class hotelBarishal extends javax.swing.JFrame {

    /**
     * Creates new form hotelBarishal
     */
    String n = null;
    String m = null;
    
    public hotelBarishal() throws IOException {
        initComponents();
        
             Document doc = Jsoup.connect("https://www.lonelyplanet.com/search?q=barishal").userAgent("mozilla/17.0").get();
        Elements temp = doc.select("div.styles__textContainer___JSbiH");
        //Document doc1 = Jsoup.connect("https://www.lonelyplanet.com/bangladesh/sylhet/hotels/hotel-valley-garden/a/lod/6f61115a-2178-4295-94b2-abc06a96c260/355817").userAgent("mozilla/17.0").get();
       // Elements temp1 = doc.select("styles__textArticle___OqHJQ styles__reviewBodyText___2rexg");
       
        int i=0;
        for(Element hotels:temp){
              i++;
              for(i=0;i<1;i++)
              {
                  String details = hotels.getElementsByTag("a").first().text();
                  String names = hotels.getElementsByTag("h3").first().text();
                  
                      n=names;
                      m=details;
                      execute();
                  
              }
        
        }
    }
    
       
    private void execute()
    {
        
        //ImageIcon hotelicon = new ImageIcon(getClass().getResource("/travel.newpackage/hotel50.png"));
        dropmenu link = new dropmenu(m);
        
        
        dropmenu hotelNames = new dropmenu(n,link);
      //dropmenu hotelNames1 = new dropmenu(m);
        
        addnames(hotelNames);
        
    }
    
    private void addnames(dropmenu...hotels){
        
        for(int i = 0;i<hotels.length;i++){
            
            nameD.add(hotels[i]);
            ArrayList<dropmenu>submenu = hotels[i].getSubmenu();
            for(dropmenu d:submenu){
                addnames(d);
            }
        }
        nameD.revalidate();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hrad = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        iconpan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameD = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hrad.setBackground(new java.awt.Color(0, 0, 153));
        hrad.setPreferredSize(new java.awt.Dimension(674, 150));

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hotels Of  Barishal");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-back-64.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hradLayout = new javax.swing.GroupLayout(hrad);
        hrad.setLayout(hradLayout);
        hradLayout.setHorizontalGroup(
            hradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hradLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        hradLayout.setVerticalGroup(
            hradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hradLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(hradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        getContentPane().add(hrad, java.awt.BorderLayout.PAGE_START);

        iconpan.setPreferredSize(new java.awt.Dimension(350, 393));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/dh.gif"))); // NOI18N

        javax.swing.GroupLayout iconpanLayout = new javax.swing.GroupLayout(iconpan);
        iconpan.setLayout(iconpanLayout);
        iconpanLayout.setHorizontalGroup(
            iconpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        iconpanLayout.setVerticalGroup(
            iconpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(iconpan, java.awt.BorderLayout.LINE_START);

        nameD.setBackground(java.awt.Color.white);
        nameD.setLayout(new javax.swing.BoxLayout(nameD, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(nameD);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(978, 682));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Barisal().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(hotelBarishal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotelBarishal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotelBarishal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotelBarishal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new hotelBarishal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(hotelBarishal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel body;
    private javax.swing.JPanel hrad;
    private javax.swing.JPanel iconpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nameD;
    // End of variables declaration//GEN-END:variables
}
