package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements IReader {
    private final URL _url;

    public NetworkReader(URL url) {
        _url = url;
    }

    @Override
    public String read() throws IOException {
        InputStream in = _url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        return content.toString();

    }

}
