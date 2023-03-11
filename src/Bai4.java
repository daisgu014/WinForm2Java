import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Bai4 extends JFrame implements ActionListener{
    private Container c;
    private JLabel label;
    private JRadioButton rb1,rb2,rb3,rb4,rb5;
    public Bai4(){
    setTitle("Image");
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 200, 1200, 800);


        ButtonGroup bg=new ButtonGroup();
        rb1 = new JRadioButton("Fish");
        rb1.setBounds(50,50,100,50);
        rb2 = new JRadioButton("Cat");
        rb2.setBounds(50,100,100,50);
        rb3 = new JRadioButton("Dog");
        rb3.setBounds(50,150,100,50);
        rb4 = new JRadioButton("Rabbit");
        rb4.setBounds(50,200,100,50);
        rb5 = new JRadioButton("Pig");
        rb5.setBounds(50,250,100,50);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);
        bg.add(rb5);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
        rb5.addActionListener(this);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);
        rb1.setSelected(true);
        c = this.getContentPane();
        label = new JLabel();
        label.setIcon(new ImageIcon("images/fish.png"));
        Dimension size = label.getPreferredSize();
        label.setBounds(200,50 , size.width, size.height);
        c.add(label);
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        HashMap<String, String > images = new HashMap<>();
        images.put("Fish","images/fish.png");
        images.put("Cat","images/cat.png");
        images.put("Dog","images/dog.png");
        images.put("Rabbit","images/rabbit.jpg");
        images.put("Pig","images/pig.png");
        if(rb1.isSelected()){
            label.setIcon(new ImageIcon(images.get(rb1.getText())));
        }
        if(rb2.isSelected()){
            label.setIcon(new ImageIcon(images.get(rb2.getText())));
        }
        if(rb3.isSelected()){
            label.setIcon(new ImageIcon(images.get(rb3.getText())));
        }
        if(rb4.isSelected()){
            label.setIcon(new ImageIcon(images.get(rb4.getText())));
        }
        if(rb5.isSelected()){
            label.setIcon(new ImageIcon(images.get(rb5.getText())));
        }
    }
    public static void main(String[] args) {
    new Bai4();
    }


}
