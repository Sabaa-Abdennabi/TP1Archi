package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class EncodingModule {
    private final IReader _reader;
    private final IWriter _writer;

    public EncodingModule(IReader reader, IWriter writer) {
        _reader = reader;
        _writer = writer;
    }

    public void encode() throws IOException {
        String inputString = _reader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        _writer.write(encodedString);
    }

}
