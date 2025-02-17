package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;

public class CustomFileWriter implements IWriter
{
    private final BufferedWriter    _writer;

    public CustomFileWriter(BufferedWriter writer)
    {
        _writer = writer;
    }
    
    @Override
    public void write(String content)
    {
        try {
            _writer.write(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
