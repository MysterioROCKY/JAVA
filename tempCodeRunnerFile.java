import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame {
    public static void main(String[] args) {
        // Create a frame
        java.awt.Frame frame = new java.awt.Frame("My AWT Frame");

        // Create a label
        Label label = new Label("Hello, Java AWT!");
        
        // Create a button
        Button button = new Button("Click me");

        // Set layout manager (FlowLayout by default)
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Add a window listener to handle the closing of the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the visibility of the frame
        frame.setVisible(true);
    }
}
