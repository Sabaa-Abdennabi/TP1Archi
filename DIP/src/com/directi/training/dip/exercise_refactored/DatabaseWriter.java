package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class DatabaseWriter implements IWriter{
    private final MyDatabase _myDb;

    public DatabaseWriter(MyDatabase myDb) {
        _myDb = myDb;
    }

    @Override()
    public void write(String content) throws IOException{
        _myDb.write(content);
    }
}
