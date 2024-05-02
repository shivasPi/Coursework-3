import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GadgetShop {
    private List<Gadget> gadgets = new ArrayList<>();
    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField,
            phoneNumberField, durationField, downloadField, downloadSizeField, displayNumberField;
    private JFrame frame;

    public GadgetShop() {
        // Create frame
        frame = new JFrame("Gadget Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 2, 5, 5));

        // Initialize text fields
        modelField = new JTextField();
        priceField = new JTextField();
        weightField = new JTextField();
        sizeField = new JTextField();
        creditField = new JTextField();
        memoryField = new JTextField();
        phoneNumberField = new JTextField();
        durationField = new JTextField();
        downloadSizeField = new JTextField();
        displayNumberField = new JTextField();

        // Add components to frame
        frame.add(new JLabel("Model:"));
        frame.add(modelField);
        frame.add(new JLabel("Price:"));
        frame.add(priceField);
        frame.add(new JLabel("Weight:"));
        frame.add(weightField);
        frame.add(new JLabel("Size"));
        frame.add(sizeField);
        frame.add(new JLabel("Initial Credit:"));
        frame.add(creditField);
        frame.add(new JLabel("Initial Memory:"));
        frame.add(memoryField);
        frame.add(new JLabel("Phone Number"));
        frame.add(phoneNumberField);
        frame.add(new JLabel("Duration"));
        frame.add(durationField);
        frame.add(new JLabel("Download Size"));
        frame.add(downloadSizeField);
        frame.add(new JLabel("Display Number"));
        frame.add(displayNumberField);

        // Initialize buttons
        JButton addMobileButton = new JButton("Add Mobile");
        JButton addMP3Button = new JButton("Add MP3");
        JButton clearButton = new JButton("Clear");
        JButton displayAllButton = new JButton("Display All");
        JButton makeACallButton = new JButton("Make a Call");
        JButton downloadMusicButton = new JButton("Download Music");
        JButton deleteMusicButton = new JButton("Delete Music");

        // Add buttons to frame
        frame.add(addMobileButton);
        frame.add(addMP3Button);
        frame.add(clearButton);
        frame.add(displayAllButton);
        frame.add(makeACallButton);
        frame.add(downloadMusicButton);
        frame.add(deleteMusicButton);

        // Add action listeners to the buttons
        addMobileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMobile();
            }
        });

        addMP3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addMP3();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        displayAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAll();
            }
        });

        makeACallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeACall();
            }
        });

        downloadMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                downloadMusic();
            }
        });
        
        deleteMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteMusic();
            }
        });

        // Pack and display the frame
        frame.pack();
        frame.setVisible(true);
    }

    // Method to read model Field
    private String getModel() {
        return modelField.getText();
    }

    // Method to read price Field
    private double getPrice() {
        return Double.parseDouble(priceField.getText());
    }

    // Method to read weight Field
    private int getWeight() {
        return Integer.parseInt(weightField.getText());
    }

    // Method to read size field
    private String getSize() {
        return sizeField.getText();
    }

    // Method to read initial credit field
    private int getInitialCredit() {
        return Integer.parseInt(creditField.getText());
    }

    // Method to read initial memory field
    private int getInitialMemory() {
        return Integer.parseInt(memoryField.getText());
    }

    // Method to read phone number field
    private String getPhoneNumber() {
        return phoneNumberField.getText();
    }

    // Method to read duration field
    private int getDuration() {
        return Integer.parseInt(durationField.getText());
    }

    // Method to read download size field
    private int getDownloadSize() {
        return Integer.parseInt(downloadSizeField.getText());
    }

    // Method to handle display number input
    private int getDisplayNumber() {
        try {
            int displayNumber = Integer.parseInt(displayNumberField.getText());
            if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                JOptionPane.showMessageDialog(frame, "Display Number is invalid");
                return -1;
            }
            return displayNumber;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Display number that you enter must be an integer.");
            return -1;
        }
    }

    // Action method for adding a mobile
    private void addMobile() {
        String model = getModel();
        double price = getPrice();
        int weight = getWeight();
        String size = getSize();
        int credit = getInitialCredit();

        Mobile mobile = new Mobile(model, price, weight, size, credit);
        gadgets.add(mobile);
    }

    // Action method for adding an MP3
    private void addMP3() {
        String model = getModel();
        double price = getPrice();
        int weight = getWeight();
        String size = getSize();
        int memory = getInitialMemory();
        MP3 mp3 = new MP3(model, price, weight, size, memory);
        gadgets.add(mp3);
    }
    
     // Action method to clear all fields
    private void clearFields() {
        modelField.setText("");
        priceField.setText("");
        weightField.setText("");
        sizeField.setText("");
        creditField.setText("");
        memoryField.setText("");
        phoneNumberField.setText("");
        durationField.setText("");
        downloadSizeField.setText("");
        displayNumberField.setText("");
    }
    
    // Action method to display all gadgets
    private void displayAll() {
        for (int i = 0; i < gadgets.size(); i++) {
            System.out.println("Display Number: " + i);
            Gadget g = gadgets.get(i).display();
        }
        }
        
  // Action method for making a call
private void makeACall() {
    for (int i = 0; i < gadgets.size(); i++) {
        System.out.println("Display Number: " + i);
        gadgets.get(i).display();
}
int displayNumber = getDisplayNumber();
     if (displayNumber != -1) {
         Mobile mobile = (Mobile) gadgets.get(displayNumber);
         String phoneNumber = getPhoneNumber();
         mobile.makePhoneCall(phoneNumber, duration);
}
}

 // Action method for downloading music
 private void downloadMusic() {
     int displayNumber = getDisplayNumber();
     if (displayNumber != -1) {
      MP3 mp3 = (MP3) gadgets.get(displayNumber); 
      int downloadSize = getDownloadSize();
      mp3downloadMusic(downloadSize);
 }
}

public static void main(String[] args) {
    // Create an instance/new instance of GadgetShop
    new GadgetShop();
}
    }

