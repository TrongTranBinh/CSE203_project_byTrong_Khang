package netcafe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class CustomerManage {

    ArrayList<Customer> list = new ArrayList<>();

    public CustomerManage() {
        loadFile();
    }

    public ArrayList<Customer> getList() {
        return list;
    }

    public void loadFile() {
        try {
            FileInputStream f = new FileInputStream("PClist.txt");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Customer cus = null;
            while ((cus = (Customer) inStream.readObject()) != null) {
                list.add(cus);
            }
            inStream.close();
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            System.out.print("Class not found!");
        }
    }

    public void saveFile() {
        try {
            FileOutputStream f = new FileOutputStream("PClist.txt");
            ObjectOutputStream outstream = new ObjectOutputStream(f);
            for (Customer cus : list) {
                outstream.writeObject(cus);
            }
            outstream.close();
        } catch (IOException e) {

        }
    }
}
