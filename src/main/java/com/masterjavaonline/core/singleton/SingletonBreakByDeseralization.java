package com.masterjavaonline.core.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SingletonBreakByDeseralization {

    private static SingletonBreakByDeseralization instance = new SingletonBreakByDeseralization();

    private SingletonBreakByDeseralization() {

    }

    public static SingletonBreakByDeseralization getInstance() {

        return instance;
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        SingletonBreakByDeseralization ob = SingletonBreakByDeseralization.getInstance();
        System.out.println(ob);

        File file = new File("file.dat");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream inputStream = new FileInputStream("file.dat");
        ObjectInputStream in = new ObjectInputStream(inputStream);
        ObjectInputStream inNew = new ObjectInputStream(inputStream);

        // code to serialize object goes here
        // code to deserialize saved object here
        SingletonBreakByDeseralization newObject = (SingletonBreakByDeseralization) in.readObject();
        // inputStream is the stream connected to the medium to which the object
        // was serialized, e.g., a file
        System.out.println(newObject);
        // re-initialize the same input stream or
        // use another inputstream to read the object once again
        SingletonBreakByDeseralization anotherObject = (SingletonBreakByDeseralization) inNew.readObject();
        System.out.println(anotherObject);
    }
}