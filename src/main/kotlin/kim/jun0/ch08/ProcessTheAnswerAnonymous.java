package kim.jun0.ch08;

import kotlin.jvm.functions.Function1;

import static kim.jun0.ch08.ProcessTheAnswer.ProcessTheAnswer.processTheAnswer;

/* 자바 */
public class ProcessTheAnswerAnonymous {
    public static void main(String[] args) {
        processTheAnswer(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer number) {
                System.out.println(number);
                return number + 1;
            }
        });
    }
}
