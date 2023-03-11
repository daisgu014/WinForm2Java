import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Bai3 extends JFrame implements ActionListener {


    private JComboBox cb;
    public Bai3(){


        String Combo[] ={"White","Green","Blue","Yellow","Red"};
        cb= new JComboBox(Combo);
        getContentPane().setBackground(Color.white);
        cb.addActionListener(this);
        cb.setBounds(150,100,100,30);
        setSize(400,400);
        add(cb);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        HashMap<String, Color> colorHashMap =  new HashMap<>();
        colorHashMap.put("White",Color.WHITE);
        colorHashMap.put("Green",Color.green);
        colorHashMap.put("Blue",Color.blue);
        colorHashMap.put("Yellow",Color.yellow);
        colorHashMap.put("Red",Color.red);
        String color = cb.getSelectedItem().toString();
        System.out.println(color);
        getContentPane().setBackground(colorHashMap.get(color));

    }

    public static void main(String[] args) {
        new Bai3();
    }
}
