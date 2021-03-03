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
 * @author tashf
 */
public class GoogleMaps {
    
    String location;
    
    public void search()
    {
        
           try {
           
           location = location.replace(" ", "+");
            
            String url ="https://www.google.com/maps/search/"+location+"/";
            
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(GoogleMap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
