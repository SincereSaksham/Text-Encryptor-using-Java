import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 

public class Gui implements ActionListener 
{
    JFrame frame = new JFrame();
    JLabel label = new JLabel(); 
    JButton button = new JButton();
    JButton button1 = new JButton(); 
    JButton button2 = new JButton(); 
    Image img = Toolkit.getDefaultToolkit().getImage("D:\\Enc1.png");
    
    
    Gui()
    {
        frame.setSize(500,500); 
        frame.setTitle("Syncrypt");
        frame.setIconImage(img);
        frame.getContentPane().setBackground(new Color(0,0,0)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false); 
        frame.setLocationRelativeTo(null);
        
       label.setText("Text Encryptor"); 
       label.setForeground(Color.green); 
       label.setFont(new Font("Times New Roman", Font.PLAIN,30)); 
       label.setVerticalAlignment(JLabel.TOP); 
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setBounds(70,90,300,250); 
       
       button.setBounds(90,150,100,25); 
       button.setText("ENCRYPT"); 
       button.setBackground(Color.green); 
       button.setFocusable(false);
       button.setBorder(null); 
       
       button1.setBounds(250,150,100,25);
       button1.setText("DECRYPT"); 
       button1.setBackground(Color.green); 
       button1.setFocusable(false); 
       button1.setBorder(null); 
       
       button2.setBounds(165,190,100,25);
       button2.setText("EXIT"); 
       button2.setBackground(Color.green); 
       button2.setFocusable(false); 
       button2.setBorder(null); 
       
       
       button.addActionListener(this); 
       button1.addActionListener(this); 
       button2.addActionListener(this); 
       
        
    
        frame.add(label);
        
        
        frame.add(button); 
        frame.add(button1); 
        frame.add(button2); 
        frame.setLayout(null); 
        frame.setVisible(true); 
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            frame.dispose(); 
            new Text(); 
        }
        
        if (e.getSource() == button1)
        {
            frame.dispose(); 
            new Dtext();  
        }
        
        if (e.getSource() == button2)
        System.exit(0);
    }
    
}