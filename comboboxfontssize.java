import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JComboBox;
class Comboboxfont implements ItemListener{
      JComboBox <Integer> j;
      JLabel label;
      JFrame f;
      Comboboxfont b;
     
      Comboboxfont(){
     f = new JFrame("Select text size");
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f.setLayout(new FlowLayout());
     Integer []  s = {10,20,30,35,40,50};///generic type do not support int primitive type
     j = new JComboBox (s);
     j.setBounds(50,50,10,20);
     f.add(j);
     f.setSize(1000,1000);
     f.setVisible(true);
     label = new JLabel();
     j.addItemListener(this);
     label.setForeground(Color.RED);
     Font f1 = new Font("Serif",Font.BOLD,10);
     label.setFont(f1);
     label.setText("Select the size of the text from combobox");
    
     
     f.add(label);
     }

     public void itemStateChanged(ItemEvent e) {
       int i =  j.getSelectedIndex();
     
                 
       if(i==0){//10
        
           label.setForeground(Color.RED);
           Font f1 = new Font("Serif",Font.BOLD,10);
           label.setFont(f1);
           label.setText("Select the size of the text from combobox");        
      }
       else if(i==1){//20
            label.setForeground(Color.RED);
            Font f1 = new Font("Serif",Font.BOLD,20);
            label.setFont(f1);
             label.setText("Select the size of the text from combobox");
    }
        else if(i==2)//30
    {
      label.setForeground(Color.RED);
      Font f1 = new Font("Serif",Font.BOLD,30);
      label.setFont(f1);
      label.setText("Select the size of the text from combobox");
      f.add(label);
     } 
     else if(i==3)//35
    {
      label.setForeground(Color.RED);
      Font f1 = new Font("Serif",Font.BOLD,35);
      label.setFont(f1);
      label.setText("Select the size of the text from combobox");
      f.add(label);
     } 
     else if(i==4)//40
     {
       label.setForeground(Color.RED);
       Font f1 = new Font("Serif",Font.BOLD,40);
       label.setFont(f1);
       label.setText("Select the size of the text from combobox");
       f.add(label);
      } 
      else if(i==5)//50
      {
        label.setForeground(Color.RED);
        Font f1 = new Font("Serif",Font.BOLD,50);
        label.setFont(f1);
        label.setText("Select the size of the text from combobox");
        f.add(label);
       } 
     }
     
        public static void main(String[] args) {
            Comboboxfont b = new Comboboxfont();
        }
      }
