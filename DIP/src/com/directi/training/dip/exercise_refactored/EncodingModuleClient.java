package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        IReader fileReader = new CustomFileReader(
                new BufferedReader(new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt")));
        IWriter fileWriter = new CustomFileWriter(
                new BufferedWriter(new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt")));
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        IReader networkReader = new NetworkReader(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        IWriter databaseWriter = new DatabaseWriter(new MyDatabase());
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter);
        networkEncodingModule.encode();
    }
}
