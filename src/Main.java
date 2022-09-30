import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main{

    public static void main(String[] args) {
        int wdth = 200;
        int hight = 100;
        JFrame frame;
        JLabel label = new JLabel();
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(new Dimension(wdth,hight));
        frame.add(label);
        frame.setTitle("Time ");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        while (true) {
            Date satTime = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm ss a");
            label.setText(dateFormat.format(satTime));
            try {
                label.setText(dateFormat.format(satTime));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
