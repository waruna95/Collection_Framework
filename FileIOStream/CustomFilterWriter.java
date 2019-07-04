package FileIOStream;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

class CustomFilterWriter extends FilterWriter {
    CustomFilterWriter(Writer out) {
        super(out);
    }
    public void write(String str) throws IOException {
        super.write(str);
    }
}