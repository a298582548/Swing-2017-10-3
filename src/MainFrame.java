import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public Container cp;
    private JButton bt1 = new JButton("範例");
    private JButton bt2 = new JButton("加密");
    private JLabel lb1 = new JLabel("key=");
    private JTextArea jtaA = new JTextArea("3");
    private JButton bt3 = new JButton("");
    private JButton bt4 = new JButton("EXIT");
    private JPanel pa1 = new JPanel(new GridLayout(7,1,3,3));
    private  JTextArea jtaW = new JTextArea();
    private  JTextArea jtaT = new JTextArea();
    private JScrollPane jscW = new JScrollPane(jtaW);
    private JScrollPane jscT = new JScrollPane(jtaT);
    private JTextArea jkey = new JTextArea();
    private int v1 = 0;
    public MainFrame() {
        initComp();

    }
    private void initComp() {
        this.setBounds(200,300,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));

        cp.add(pa1,BorderLayout.CENTER);
        cp.add(jscW,BorderLayout.WEST);
        cp.add(jscT,BorderLayout.EAST);
        jtaW.setLineWrap(true);
        jtaT.setLineWrap(true);
        jtaW.setPreferredSize(new Dimension(200,3000));
        jtaT.setPreferredSize(new Dimension(200,3000));
        pa1.add(bt1);
        pa1.add(bt2);
        pa1.add(lb1);
        pa1.add(jtaA);
        pa1.add(bt3);
        pa1.add(bt4);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaW.setText("The curriculum provided by this department " +
                        "includes basic courses, core curriculums, major programs" +
                        "and free electives giving the curriculum design richness " +
                        "and diversity. Courses such as “Mobile and Internet Application”, " +
                        "“Semi-conductor Systems”, “Big Data Analytics”, and “Artificial Intelligence” " +
                        "stand out and are highly practical. Students can choose courses depending on their " +
                        "interests or take courses from other departments to work towards a double major to" +
                        " develop their professional ability and second skill.");
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[] = jtaW.getText().toCharArray();
                int len = data.length, key = Integer.parseInt(jkey.getText());
                for (int i = 0; i < data.length; i++) {
                    data[i] += key;
                }
                String str = data[i];
                jtaT.setText(new String(data));
            }
        });
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}