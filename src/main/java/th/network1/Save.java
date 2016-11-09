/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.network1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author shcherbakov
 */
public class Save {

    public void serial(Object ts, String str) throws IOException {
        FileOutputStream fos;
        fos = new FileOutputStream(str);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(ts);
        oos.flush();
        oos.close();
    }

    public Object load(String str) throws IOException, ClassNotFoundException {
        FileInputStream fos;
        fos = new FileInputStream(str);
        ObjectInputStream ois = new ObjectInputStream(fos);
        Object temp = ois.readObject();
        ois.close();
        return temp;
    }
}
