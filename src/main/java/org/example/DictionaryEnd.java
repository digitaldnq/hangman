package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class DictionaryEnd {
    public static HashMap<Integer, String> deserializedHashMap(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(
                    filePath);

            ObjectInputStream ois
                    = new ObjectInputStream(fis);

            HashMap<Integer, String> map = (HashMap) ois.readObject();

            ois.close();
            fis.close();
            return map;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException obj2) {
            System.out.println("Class not found");
            obj2.printStackTrace();
        }
        return new HashMap<>();
    }
}
