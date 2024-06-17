import java.awt.*;
import java.awt.event.*;

public class FrameDialog {
    public FrameDialog() {
        // Create an instance of Frame
        Frame frame = new Frame("Ubaid");

        // Create a label to add to the frame
        Label label = new Label("Hello, Java!");
       

        Button b = new Button("Show Dialog");
       

        // Add the label to the frame
        frame.add(label);
        frame.add(b);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the layout manager (optional)
        frame.setLayout(new FlowLayout());

        // Add a window listener to handle the closing of the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // code for dialog from here 
                
                Dialog d = new Dialog(frame, "Dialog box", true);

                d.setLayout(new FlowLayout());

                Button db = new Button("Close");
                d.add(db);
                db.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        d.dispose();
                    }

                });

                d.setSize(200, 100);
                d.setVisible(true);
            }
                // to here.............
        });

        // Set the visibility of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of MyFrameInConstructor
        new FrameDialog();
    }
}
