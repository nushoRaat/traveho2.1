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



public class RajshahiPlaces extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * 
 
     */
    
    DefaultListModel dm = new DefaultListModel();
    public RajshahiPlaces() {
        initComponents();
        
     addRowTOJtable();
        
        
        
        
        
    }
    
    
    public class Myclass
{
    
    String name;
    String des;
    int index;
    
    
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
        jTextField4 = new javax.swing.JTextField();
        back1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        table.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        table.setForeground(new java.awt.Color(0, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Places", "Description "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 51, 51));
        table.setRowHeight(50);
        table.setSelectionBackground(new java.awt.Color(0, 51, 51));
        table.setSelectionForeground(new java.awt.Color(102, 255, 102));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 2310, 260));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Place Of Rajshahi");
        jTextField4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField4.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField4.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 2310, 60));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/icons8-back-64.png"))); // NOI18N
        back1.setContentAreaFilled(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/backRaj.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2310, 1910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Rajshahi().setVisible(true);
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
            java.util.logging.Logger.getLogger(RajshahiPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RajshahiPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RajshahiPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RajshahiPlaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RajshahiPlaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables



public ArrayList listUser()
{
    
    ArrayList<Myclass> list = new ArrayList<Myclass>();
    
    
       
        try
        {
            
          Document doc = Jsoup.connect("https://www.lonelyplanet.com/bangladesh/rajshahi/attractions/a/poi-sig/355808").userAgent("Mozilla/17.0").get();
          
          Elements temp = doc.select("div.ListItem-container");
        
          int i =0;
          for(Element li:temp)
          {
              Myclass cl = new Myclass();
              
              i++;
              System.out.println(i+" "+li.getElementsByTag("a").first().text() );
               
                  cl.name =  li.getElementsByTag("a").first().text(); 
                  cl.des = li.getElementsByAttribute("style").first().text(); 
                  cl.index = i;
                  list.add(cl);
            
              
          }
          
          
        
        
        }
        
        catch(IOException e)
        {
            
        }
    
    
    
    return list;
    
}


public void addRowTOJtable()
{
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    
   ArrayList<Myclass> list = listUser();
   Object rowData[] = new Object[3];
   for(int i=0;i<list.size();i++)
   {
       rowData[0] = list.get(i).index;
       rowData[1] = list.get(i).name;
       rowData[2] = list.get(i).des;
       
       model.addRow(rowData);
       
   }
       
    
}


}
