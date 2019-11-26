package screen_saver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class ColorFrame extends JFrame {
    @Autowired
    private Color color;

    @PostConstruct
    private void init(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void moveToRandomLocation(){
        Random random = new Random();
        setLocation(random.nextInt(1500), random.nextInt(1100));
        getContentPane().setBackground(kuku());
        repaint();
    }

    @Lookup
    protected  Color kuku(){
        System.out.println(123);
        return null;}



}










