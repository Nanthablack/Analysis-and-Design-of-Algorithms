import javax.swing.*;
import java.awt.*;

class test extends JPanel {
    public static void main(String[] args){
        test m = new test();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Nanthawat Mingjindakul");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.fillRect(100,100,100,100);
        plot(g,400,400);
    }
    public void plot(Graphics g,int x ,int y){
        g.fillRect(x,y,100,100);
    }
}