/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.newpackage;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import sun.management.Agent;

/**
 *
 * @author Asus
 */
public class dropmenu extends javax.swing.JPanel {

    Panel1 p1;
    /**
     * @return the submenu
     */
    public ArrayList<dropmenu> getSubmenu() {
        return submenu;
    }
    
    
    /**
     * Creates new form dropmenu
     */
    private final ArrayList<dropmenu>submenu = new ArrayList<>();
    
    public dropmenu(String name,dropmenu...submenu) {
        initComponents();
        names.setText(name);
       // icons.setIcon(icon);
        
        this.setSize(new Dimension(Integer.MAX_VALUE,52));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE,52));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE,52));
       
        for(int i= 0;i<submenu.length;i++)
        {
            this.submenu.add(submenu[i]);
            submenu[i].setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        names = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        icons = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        names.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        names.setText("Menu Name Here ...");

        icons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/newpackage/hotel50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icons, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(names, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(names, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(53, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean showing=false;
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        
        if (showing)
        {
            hideMenu();
            showing = false;
        }
        else{
            showMenu();
            showing = true;
        }
          
        
    }//GEN-LAST:event_formMousePressed

    
    private void showMenu(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                 for(int i= 0;i<submenu.size();i++)
                 {
                     sleep();
                     submenu.get(i).setVisible(true);
                 }
            }
        }).start();
    }
   
    
    
    private void hideMenu(){
        
              new Thread(new Runnable() {
            @Override
            public void run() {
                 for(int i= submenu.size()-1;i>=0;i--)
                 {
                     sleep();
                     submenu.get(i).setVisible(false);
                 }
            }
        }).start();
        
    }
    
    private void sleep()
    {
        try{
            Thread.sleep(20);
        }
        catch(Exception e){
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icons;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel names;
    // End of variables declaration//GEN-END:variables
}
