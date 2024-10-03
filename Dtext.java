import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

public class Dtext extends EncryptDecrypt implements ActionListener
{
    
    JFrame frame = new JFrame(); 
    JLabel label2 = new JLabel(); 
    JButton button = new JButton(); 
    JButton button1 = new JButton(); 
    JTextField text = new JTextField(20); 
    JTextField keyfield = new JTextField(20);
    Image img = Toolkit.getDefaultToolkit().getImage("D:\\Enc1.png");
    
    public Dtext()
    {
        frame.setSize(500,500); 
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setIconImage(img);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); 
        frame.setResizable(false);  
        frame.setLocationRelativeTo(null);
        
        JLabel label = new JLabel ();
        label.setText("Enter your text");
        label.setFont(new Font("Times New Roman", Font.PLAIN,20));
        label.setBounds(170,30,200,100); 
        label.setForeground(Color.green);
        
        JLabel label1 = new JLabel(); 
        label1.setText("Enter key"); 
        label1.setFont(new Font("Times New Roman",Font.PLAIN,20)); 
        label1.setBounds(190,140,200,100); 
        label1.setForeground(Color.green);
        
        
        label2.setFont(new Font("Times New Roman",Font.PLAIN,14)); 
        label2.setBounds(170,210,240,120); 
        
        
        text.setBounds(80,100,300,30); 
        text.setForeground(Color.green); 
        text.setFont(new Font("",Font.PLAIN,15)); 
        text.setBackground(Color.black);
        text.setCaretColor(Color.green); 
        
        keyfield.setBounds(177,212,100,30); 
        keyfield.setForeground(Color.green); 
        keyfield.setFont(new Font("Consolas",Font.PLAIN,15)); 
        keyfield.setBackground(Color.black); 
        keyfield.setCaretColor(Color.green); 
        
        button.setText("Decrypt"); 
        button.setBounds(180,300,100,25); 
        button.setFocusable(false); 
        button.setForeground(Color.black); 
        button.setBackground(Color.green); 
        button.setBorder(null); 
        button.addActionListener(this); 
        
        
        button1.setText("Back"); 
        button1.setBounds(180,340,100,25); 
        button1.setFocusable(false); 
        button1.setForeground(Color.black); 
        button1.setBackground(Color.green); 
        button1.setBorder(null); 
        button1.addActionListener(this); 
         
        
        frame.add(label); 
        frame.add(label1); 
        frame.add(label2); 
        frame.add(text);
        frame.add(keyfield); 
        frame.add(button); 
        frame.add(button1); 
        frame.setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource() == button)
       {
           String str = text.getText();
           int k = Integer.parseInt(keyfield.getText()); 
           
           label2.setForeground(Color.black); 
           
           if(keycheck(str,k) == false) 
           {
                
                label2.setForeground(Color.green); 
                label2.setText("Wrong Key! Try again");
            
           }
           
           else
           {
             str = Decrypt(str,k); 
             new Print(str); 
           }
       }
    
    if (e.getSource() == button1)
       {
           frame.dispose(); 
           new Gui(); 
       }
}
}