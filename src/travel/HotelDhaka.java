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
import travel.newpackage.MenuItem;
import travel.newpackage.dropmenu;

/**
 *
 * @author Asus
 */
public class HotelDhaka extends javax.swing.JFrame {

    /**
     * Creates new form HotelDhaka
     */
     String n = null ;
     String m = null ;
    public HotelDhaka() throws IOException {
        initComponents();
       

        // this.setExtendedState(Frame.MAXIMIZED_BOTH);
        
        Document doc = Jsoup.connect("https://www.lonelyplanet.com/bangladesh/dhaka/hotels/a/lod/355783").userAgent("mozilla/17.0").get();
        Elements temp = doc.select("div.ListItem-container");
       
       
        int i=0;
        for(Element hotels:temp){
              i++;
              for(i=0;i<1;i++)
              {
                  String name = hotels.getElementsByTag("h2").first().text();
                  String details = hotels.getElementsByTag("a").first().text();
                  
                      n=name;
                      m=details;
                      execute();
                    // executeD();
                  
              }
        
        }
                   
        
    }
    
    private void execute()
    {
        
        //ImageIcon hotelicon = new ImageIcon(getClass().getResource("/travel.newpackage/hotel50.png"));
        dropmenu link = new dropmenu(m);
        
        
        dropmenu hotelNames = new dropmenu(n,link);
        
        addnames(hotelNames);

    }
    
  /*  private void executeD()
    {
        MenuItem details = new MenuItem("Staff 002");
       // MenuItem details = new MenuItem(m);
        addDetails(details);
    }*/
    
    private void addnames(dropmenu...hotels){
        
        for(int i = 0;i<hotels.length;i++){
            
            menus.add(hotels[i]);
            ArrayList<dropmenu>submenu = hotels[i].getSubmenu();
            for(dropmenu d:submenu){
                addnames(d);
                 //p1 = new Panel1(m);
                  //detail.add(p1);
                     // p1.setVisible(true);
            }
            
        }
        menus.revalidate();
        
    }
    
   /* private void addDetails(MenuItem...menu){
        
                for(int i = 0;i<menu.length;i++){
            
            detailspan.add(menu[i]);
           ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for(MenuItem a:menu){
                addDetails(a);
               
            }
            
        }
        detailspan.revalidate();
     
   }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dropM = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        head.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Hotels of Dhaka");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-back-64.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(head, java.awt.BorderLayout.PAGE_START);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/ch(1).gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(350, 16));
        getContentPane().add(jLabel2, java.awt.BorderLayout.LINE_START);

        menus.setBackground(new java.awt.Color(255, 255, 255));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout dropMLayout = new javax.swing.GroupLayout(dropM);
        dropM.setLayout(dropMLayout);
        dropMLayout.setHorizontalGroup(
            dropMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );
        dropMLayout.setVerticalGroup(
            dropMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        getContentPane().add(dropM, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(947, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Dhaka().setVisible(true);
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
            java.util.logging.Logger.getLogger(HotelDhaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelDhaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelDhaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelDhaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HotelDhaka().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(HotelDhaka.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPanel dropM;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    // End of variables declaration//GEN-END:variables
}
