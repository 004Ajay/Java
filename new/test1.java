import javax.swing.*;

public class test1{
 public static void main(String[] args) {
    JFrame f = new JFrame();
    // Or overload the constructor and give it a title:
    //JFrame F1 = new JFrame("Red Alert!");
    //add the frame
    JFrame f = new JFrame("Red Alert!");
    //set size: width, height (in pixels)
    f.setSize(450, 475);
    //set the location (x,y)
    f.setLocation(120, 60);
 }   
}

