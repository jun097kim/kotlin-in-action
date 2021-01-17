package kim.jun0.ch08;

import static kim.jun0.ch08.ProcessTheAnswer.ProcessTheAnswer.processTheAnswer;

/* 자바 */
public class ProcessTheAnswerLambda {
    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);
    }
}
