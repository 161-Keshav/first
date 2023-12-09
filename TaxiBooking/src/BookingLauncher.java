import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingLauncher extends JFrame implements ActionListener {
    public BookingLauncher(){
        super();
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,650);
        setLocationRelativeTo(null);
        setVisible(true);
        addGUIComponents();
    }

    public void addGUIComponents() {
        JLabel label = new JLabel("Select the Option:");
        label.setBounds(15, 15, 350, 60);
        label.setFont(new Font("Dialog", Font.BOLD, 20));
        add(label);

        JRadioButton option1 = new JRadioButton("0->Book Taxi", true);
        option1.setBounds(25, 70, 280, 50);
        option1.setFont(new Font("Dialog", Font.ITALIC, 20));


        JRadioButton option2 = new JRadioButton("1->Print Details");
        option2.setBounds(25, 100, 300, 60);
        option2.setFont(new Font("Dialog", Font.ITALIC, 20));

        ButtonGroup btn = new ButtonGroup();
        btn.add(option1);
        btn.add(option2);
        add(option1);
        add(option2);

        option1.addActionListener(this);

    }
        public void actionPerformed(ActionEvent e) {
        if(option1.isSelected())
        {

    }

    }


}
