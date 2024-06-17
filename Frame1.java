import java.awt.*;
import java.awt.event.*;

public class Frame1 {
    public Frame1() {
        // Create an instance of Frame
        Frame frame = new Frame("SANYAM");

        // Create a label to add to the frame
        Label label = new Label("Hello, Java!");
       

        Button b = new Button("Close");
       

        // Add the label to the frame
        frame.add(label);
        frame.add(b);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the layout manager (optional)
        frame.setLayout(new FlowLayout());

        // Add a window listener to handle the closing of the frame
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
        
         //button
        b.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    frame.dispose();
                }
        });

       

        // Set the visibility of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of MyFrameInConstructor
        new Frame1();
    }
}
