



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
public class About extends  JFrame {


    public static void Panel(){

         JFrame frame = new JFrame("About Ulano TextEditor");
         JLabel label1 = new JLabel("Black Power ® Ulano TextEditor ");
         JLabel label2 = new JLabel("Version 1.1");
         JLabel label3 = new JLabel("Copyright © 2011-2012 Vagos.Inc");
         JLabel label4 = new JLabel("Created By: David Acosta Díaz"+" "+"ID: 2010-0142");
         JLabel label5 = new JLabel();
         ImageIcon icon = new ImageIcon("C:/Documents and Settings/Administrador/Mis documentos/NetBeansProjects/Ulano TextEditor/src/ulanotexteditor/black1.png");
         label5.setIcon(icon);

         JPanel panel = new JPanel();
         panel.setSize(50,50);
         panel.add(label1);
         panel.add(label2);
         panel.add(label3);
         panel.add(label4);
         panel.add(label5);
         
         frame.add(panel);
         frame.setBounds(500,0,245,264);
         frame.setSize(350,350);
         frame.setVisible(true);


    }

}
