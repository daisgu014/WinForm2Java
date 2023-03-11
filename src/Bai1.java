import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai1 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private int count;

    public Bai1() {
        count = 0;

        // Khởi tạo button và label
        button = new JButton("Click");
        label = new JLabel(""+count);

        // Đăng ký sự kiện ActionListener cho button
        button.addActionListener(this);
        setLayout(new FlowLayout());

        // Thêm button và label vào frame
        add(button);
        button.setSize(50,50);
        add(label);

        // Cài đặt kích thước frame và hiển thị
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        // Tăng biến đếm lên 1 và cập nhật label
        count++;
        label.setText(""+count);
    }

    public static void main(String[] args) {
        new Bai1();
    }
}
