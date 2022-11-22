import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


class Chatbot extends JFrame{
   private JTextArea ca= new JTextArea();
   private JTextField cf=new JTextField();
   private JButton b=new JButton();
   private JLabel l=new JLabel();

   Chatbot(){
       JFrame f=new JFrame();
       f.setDefaultCloseOperation(EXIT_ON_CLOSE);
       f.setVisible(true);
       f.setResizable(false);
       f.setLayout(null);
       f.setSize(400,400);
      // f.getContentPane().setBackground(Color.cyan);
       f.setTitle("ChatBot");
//adding Components
       f.add(ca);
       f.add(cf);


       //Setting up Chat Area
      ca.setSize(300,310);
      ca.setLocation(1,1);
      //ca.setBackground(Color .BLACK);
      //Setting up Buttons
       f.add(b);
       l.setText("SEND");
       b.add(l);
       b.setSize(400,20);
       b.setLocation(300,320);

       cf.setSize(300,20);
       cf.setLocation(1,320);

       b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           if(e.getSource()==b){

            String text=cf.getText();
            ca.append("You --->"+text+"\n");
            cf.setText("");

            if(text.contains("Hello")){
              replyMeth("Hello");
            }
            else if(text.contains("How are You"))
               replyMeth("I'm Good :) Thankyou for asking What about you");
               
            else
                replyMeth("Write us on mail for more information: xyz@mail.com");
           }
        }
       });

   }
   public void replyMeth(String s){
    ca.append("ChatBot--->"+s+"\n");
   }
}


public class ChatDemo {
    public static void main(String[] args) {
        new Chatbot();
    }
}
