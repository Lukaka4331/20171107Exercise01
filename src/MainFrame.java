import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{



    private JLabel JL1=new JLabel("EFSFSDFSDFSFS");
    private  JPanel jil=new JPanel();
public MainFrame(){
    initComp();
}
private void initComp(){


    this.setBounds(200,200,200,200);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    Container cp;
    cp=this.getContentPane();

    cp.setLayout(new BorderLayout(3,3));
    cp.add(jil,BorderLayout.CENTER);
   jil.add(JL1);
    JL1.setOpaque(true);

    JL1.setForeground(Color.BLUE);
    JL1.setBackground(Color.CYAN);


}





}
