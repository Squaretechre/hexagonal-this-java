package infra;

import domain.ObtainPoems;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class PoetryLibraryResourceFileAdapter implements ObtainPoems {
    private String fileName;

    public PoetryLibraryResourceFileAdapter(String fileName) {
        this.fileName = fileName;
    }

    public String getMeAPoem() {
        try {
            InputStream fileStream = PoetryLibraryResourceFileAdapter.class.getClassLoader().getResourceAsStream(fileName);
            return IOUtils.toString(fileStream, Charset.defaultCharset());

        } catch (IOException e) {
            return "";
        }
    }
}
