import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Bai5 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;
    JCheckBox jCheckBox1,jCheckBox2,jCheckBox3,jCheckBox4;
    public static ArrayList<Product> productListFake = new ArrayList<>();

    public static Product findProductNameByString(String name){
        Product product = null;
        if(!name.isEmpty()) {
            name.trim();
            int num = name.indexOf("(");
            String nameAfter = name.substring(0, num);
            if (productListFake.size() > 0) {
                for (Product p : productListFake) {
                    if (p.getName().equalsIgnoreCase(nameAfter)) {
                        product = p;
                    }
                }
            } else {
                System.out.println("Khong co phan tu");
            }
        }
        return product;
    }
    public Bai5(){

        setSize(500,500);

        CheckboxGroup checkboxGroup = new CheckboxGroup();
        label = new JLabel("Menu");
        label.setBounds(60,60,100,60);
        Product product1 = new Product("Pizza",25);
        Product product2 = new Product("Burger",20);
        Product product3 = new Product("Tea",5);
        Product product4 = new Product("Coffee",10);
        productListFake.add(product1);
        productListFake.add(product2);
        productListFake.add(product3);
        productListFake.add(product4);
        jCheckBox1 = new JCheckBox(product1.display());
        jCheckBox1.setBounds(100,100,100,50);
        jCheckBox2 = new JCheckBox(product2.display());
        jCheckBox2.setBounds(100,150,100,50);
        jCheckBox3 = new JCheckBox(product3.display());
        jCheckBox3.setBounds(100,200,100,50);
        jCheckBox4 = new JCheckBox(product4.display());
        jCheckBox4.setBounds(100,250,100,50);
        button = new JButton("Order");
        button.setBounds(100,300,100,50);
        add(label);
        add(jCheckBox1);
        add(jCheckBox2);
        add(jCheckBox3);
        add(jCheckBox4);
        add(button);
        jCheckBox1.addActionListener(this);
        jCheckBox2.addActionListener(this);
        jCheckBox3.addActionListener(this);
        jCheckBox4.addActionListener(this);
        button.addActionListener(this);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static String Order(ArrayList<Product> productsOrder){
        String print="";
        String line = "\n---------------";
        int cout=0;
        ArrayList<String> listProduct = new ArrayList<>();
        for (Product p: productsOrder){
            String product = p.display1() + "\n";
            cout+=p.getPrice();
            listProduct.add(product);
        }
        for (String s : listProduct){
            print+=s;
        }
        String total = "\nTotal: "+cout;
        return print+line+total;
    }
    ArrayList<Product> productsOrder = new ArrayList<>();
    Product orderProduct;
    @Override
    public void actionPerformed(ActionEvent e) {
        productsOrder.clear();
        if(jCheckBox1.isSelected()){
            orderProduct=findProductNameByString(jCheckBox1.getText());
            productsOrder.add(orderProduct);
        }
        if(jCheckBox2.isSelected()){
            orderProduct=findProductNameByString(jCheckBox2.getText());
            productsOrder.add(orderProduct);
        }
        if(jCheckBox3.isSelected()){
            orderProduct=findProductNameByString(jCheckBox3.getText());
            productsOrder.add(orderProduct);
        }
        if(jCheckBox4.isSelected()){
            orderProduct=findProductNameByString(jCheckBox4.getText());
            productsOrder.add(orderProduct);
        }
        if(e.getSource()==button){
            if(productsOrder.size()<=0){
                JOptionPane.showMessageDialog(this,"Vui lòng chọn sản phẩm cần thanh toán");
            }else{
                JOptionPane.showMessageDialog(this,Order(productsOrder).trim());
            }
        }

    }


    public static void main(String[] args) {
        new Bai5();
    }
}
