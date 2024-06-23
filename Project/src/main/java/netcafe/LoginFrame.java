package netcafe;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import org.kordamp.ikonli.dashicons.Dashicons;
import org.kordamp.ikonli.swing.FontIcon;

public class LoginFrame extends JFrame {

    Font font = new Font("Unispace", Font.PLAIN, 15);
    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton loginButton;
    private boolean isVisible = false;

    public LoginFrame() {
        init();
    }

    private void init() {
        setVisible(true);
        setResizable(false);
        setTitle("Net Cafe Manager");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(65, 76, 80));
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Sign in");
        loginButton.putClientProperty(FlatClientProperties.STYLE, "background: #0784b5; foreground: #FFFFFF;");
        loginButton.setFocusPainted(true);

        // Username label
        JLabel labUsername = new JLabel("Username: ");
        labUsername.setFont(font);
        labUsername.setForeground(new Color(7, 132, 181));
        FontIcon userIcon = FontIcon.of(Dashicons.ADMIN_USERS);
        userIcon.setIconSize(16);
        userIcon.setIconColor(Color.white);
        labUsername.setIcon(userIcon);

        // Password Label
        JLabel labPassword = new JLabel("Password: ");
        labPassword.setFont(font);
        labPassword.setForeground(new Color(7, 132, 181));
        FontIcon passIcon = FontIcon.of(Dashicons.LOCK);
        passIcon.setIconSize(16);
        passIcon.setIconColor(Color.white);
        labPassword.setIcon(passIcon);

        // components' container & components edit
        JPanel container = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "fill,250:280"));
        container.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%);");

        JLabel title = new JLabel("ADMIN LOGIN");
        title.setFont(new Font("Unispace", Font.PLAIN, 16));
        title.setForeground(new Color(7, 132, 181));
        //Reveal password
        passwordField.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true");

        // Adding components
        container.add(title);
        container.add(labUsername);
        container.add(usernameField);
        container.add(labPassword);
        container.add(passwordField);
        container.add(loginButton);
        add(container);

        // Login Button's event
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            try {
                if (username.isEmpty() || password.isEmpty()) {
                    throw new Exception();
                }
                if (username.equals("Admin")) {
                    if (password.equals("123456789")) {
                        JOptionPane.showMessageDialog(this, "Successfully sign in!");
                        CafeMainMenu menu = new CafeMainMenu();
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect username or password!");
                        usernameField.setText("");
                        passwordField.setText("");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password!");
                    usernameField.setText("");
                    passwordField.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Missing username or password");
            }

        });
        pack();
    }

    public void showFrame() {
        this.setTitle("Login");
        this.setSize(400, 280);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(600, 200);
    }

}
