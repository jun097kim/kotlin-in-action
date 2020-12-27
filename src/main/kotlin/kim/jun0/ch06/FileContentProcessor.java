package kim.jun0.ch06;

import java.io.File;
import java.util.List;

/* 자바 */
public interface FileContentProcessor {
    void processContents(File path, byte[] binaryContents, List<String> textContents);
}
