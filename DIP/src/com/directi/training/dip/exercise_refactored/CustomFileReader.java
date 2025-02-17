package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.IOException;

public class CustomFileReader implements IReader {
    private final BufferedReader _reader;

    public CustomFileReader(BufferedReader reader) {
        _reader = reader;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = _reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        return content.toString();
    }

}
