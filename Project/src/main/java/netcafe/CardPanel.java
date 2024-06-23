package netcafe;

import javax.swing.*;
import javax.xml.stream.FactoryConfigurationError;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPanel extends JPanel {

    private Color foreground = new Color(7, 132, 181);
    private SpinnerNumberModel model;
    private JSpinner spinner;
    private JCheckBox checkBox;

    CardPanel(Menu item, String id) {
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.setLayout(null);

        // For add an image to the label
        JLabel label = new JLabel();
        ImageIcon imageIcon = new ImageIcon(item.getImage());
        label.setIcon(imageIcon);
        label.setLayout(new BorderLayout());

        label.setBounds(3, 3, 170, 100);
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImage);
        label.setIcon(imageIcon);

        // add the title
        JLabel titleLabel = new JLabel(item.getTitle());
        titleLabel.setBounds(65, 100, 150, 30);
        titleLabel.setForeground(foreground);

        // add the price
        JLabel priceLabel = new JLabel("Price:    " + item.getPrice());
        priceLabel.setBounds(10, 125, 120, 30);
        priceLabel.setForeground(foreground);
        // add the quantity

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(10, 150, 70, 30);
        quantityLabel.setForeground(foreground);

        // add the spinner for the quantity
        model = new SpinnerNumberModel(1, 1, 10, 1);
        spinner = new JSpinner(model);
        spinner.setBounds(80, 150, 50, 30);

        // add the purchase to add the item
        JLabel purchaseLabel = new JLabel("Purchase:");
        purchaseLabel.setBounds(10, 180, 70, 30);
        checkBox = new JCheckBox();
        checkBox.setBorderPaintedFlat(false);
        checkBox.setBounds(80, 180, 50, 30);
        checkBox.setForeground(foreground);

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    TextPanel.viewCafe(titleLabel.getText(), item.getPrice(), spinner.getValue().toString(), id);
                } else {
                    TextPanel.removeItem(titleLabel.getText(), item.getPrice(), spinner.getValue().toString());
                }
            }
        });

        this.add(checkBox);
        this.add(purchaseLabel);
        this.add(spinner);
        this.add(quantityLabel);
        this.add(priceLabel);
        this.add(label);
        this.add(titleLabel);

    }

    public void resetCheckBoxAndSpinner() {
        checkBox.setSelected(false); // Uncheck the checkbox
        spinner.setValue(1); // Set spinner value to 1
    }

}
