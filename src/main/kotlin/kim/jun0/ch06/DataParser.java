package kim.jun0.ch06;

import java.util.List;

/* 자바 */
public interface DataParser<T> {
    void parseData(String input, List<T> output, List<String> errors);
}
