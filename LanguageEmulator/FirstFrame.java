import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Front extends JFrame implements ActionListener
{
JButton b1;
JLabel l1,l2,l3;


    public Front()
    {
    	setLayout(null);
		
    setTitle("Tourist Language Emulator");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
   
    ImageIcon MyImage = new ImageIcon("F:\\COLLEGE\\5th SEM\\Java\\BtechCSB\\Mahima11\\src\\Internship\\Front.jpg");
   // ("F:\\COLLEGE\\5th SEM\\Java\\BtechCSB\\Mahima11\\src\\Internship\\Front.jpg")));
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(1370,720,Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    setContentPane(new JLabel( image));
   
   
   
    
    b1=new JButton("Go");
    b1.setForeground(Color.BLACK);
    b1.setBounds(770,667,65,43);
    b1.addActionListener(this);
    add(b1,BorderLayout.SOUTH);
     
     
       l1 = new JLabel("Tourist");
       l1.setFont(new Font("Serif",Font.BOLD,54));
       l1.setForeground(Color.BLACK);
       l2 = new JLabel("Language");
       l2.setFont(new Font("Serif",Font.BOLD,54));
       l2.setForeground(Color.BLACK);
       l1.setBounds(720, 360, 533, 154);
       l2.setBounds(710, 389, 617, 266);
       l3 = new JLabel("Emulator");
       l3.setBounds(710, 460, 630, 300);
       l3.setFont(new Font("Serif",Font.BOLD,54));
       l3.setForeground(Color.BLACK);
       
       JTextArea editArea = new JTextArea(45,35);
       Font font = new Font(
               Font.MONOSPACED, 
               Font.PLAIN, 
               editArea.getFont().getSize());
       editArea.setFont(font);
       editArea.setBounds(670,250,350, 140);
       
       
       add(l1);
       add(l2);
       add(l3);
       add(editArea);
       setSize(768,359);
       setVisible(true);
    
   
    }
   
 public static void main(String args[])
    {
    new Front();
    }

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getActionCommand()=="Go") {
		this.setVisible(false);
		new MainModule().setVisible(true);
	}
	
}
   
} 

