package netcafe;

import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;

public class CafeMenu extends JFrame {

    Font font = new Font("Unispace", Font.PLAIN, 12);
    static ArrayList<Menu> menu = Menu.menu();

    static JPanel cardsPanel;

    CafeMenu(String id) {
        init(id);
    }

    private void init(String id) {
        showFrame();
        setTitle("Net Cafe Management");
        JPanel pnl1 = new JPanel();

        setLayout(null);
        pnl1.setBounds(10, 20, 900, 700);
        pnl1.setBorder(BorderFactory.createLineBorder(new Color(7, 132, 181)));

        pnl1.setLayout(null);

        JLabel menuItemsLabel = new JLabel("Menu Items");
        menuItemsLabel.setBounds(400, 20, 100, 20);
        menuItemsLabel.setFont(font);

        cardsPanel = new JPanel();
        cardsPanel.setBounds(10, 50, 880, 640);
        cardsPanel.setBackground(new Color(65, 76, 80));
        cardsPanel.setLayout(new GridLayout(3, 5));

        for (int i = 0; i < menu.size(); i++) {
            CardPanel cardPanel = new CardPanel(menu.get(i), id);
            cardsPanel.add(cardPanel);
        }
        TextPanel textPanel = new TextPanel(cardsPanel, this, id);
        textPanel.setBounds(930, 20, 350, 700);

        pnl1.add(cardsPanel);
        pnl1.add(menuItemsLabel);
        this.add(pnl1);
        this.add(textPanel);
        this.setVisible(true);

    }

    public void showFrame() {
        this.setSize(1300, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(200, 5);
    }

}
