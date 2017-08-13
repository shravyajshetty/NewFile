//Java WindowAdapter Example
import java.awt.*;  
import java.awt.event.*;  
public class AdapterDemo1 {  

        Frame f;
        AdapterDemo1() {  
        f=new Frame("Window Adapter");  
        f.addWindowListener(new WindowAdapter() {  
                public void windowClosing(WindowEvent e) {  
                        f.dispose();  
                }  
        });  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
}

        public static void main(String[] args) {  
                new AdapterDemo1();  
        }  
}  

