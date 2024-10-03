import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 
import java.awt.FlowLayout;
import javafx.scene.input.Clipboard;
import java.awt.*;
 

public class Print implements ActionListener
{
    JFrame frame = new JFrame ();
    JButton button = new JButton();
    JButton button1 = new JButton(); 
    JButton button2 = new JButton();
    Image img = Toolkit.getDefaultToolkit().getImage("D:\\Enc1.png");
    JTextArea area;
    
    public Print(String s)
    {
        frame.setSize(500,500); 
        frame.setTitle("Syncrypt");
        frame.setIconImage(img);
        frame.getContentPane().setBackground(new Color(0,0,0)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        area = new JTextArea(s);
        area.setBounds(20,10,445,400);   
        area.setForeground(Color.green);
        area.setBackground(Color.black);
        area.setFont(new Font("" , Font.PLAIN,20)); 
        area.setLineWrap(true); 
        
        area.setCaretColor(Color.green); 
        
        button.setText("Home"); 
        button.setBounds(180,360,100,25); 
        button.setFocusable(false); 
        button.setForeground(Color.black); 
        button.setBackground(Color.green); 
        button.setBorder(null); 
        button.addActionListener(this); 
        
        button1.setText("Quit"); 
        button1.setBounds(180,400,100,25); 
        button1.setFocusable(false); 
        button1.setForeground(Color.black); 
        button1.setBackground(Color.green); 
        button1.setBorder(null); 
        button1.addActionListener(this); 
        
        
         
        frame.add(button); 
        frame.add(button1); 
       // frame.add(button2); 
        frame.add(area); 
        frame.setVisible(true); 
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e )
    {
        if (e.getSource() == button)
        {
            frame.dispose(); 
            new Gui(); 
        }
        
        if (e.getSource() == button1)
        {
            System.exit(0); 
        }
        
        
    }
    
}