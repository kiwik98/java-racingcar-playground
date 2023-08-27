package viewer.input;


import java.util.Scanner;

public class ConsoleInputViewer implements InputViewer {
    private static String START_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static String COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final Scanner READER = new Scanner(System.in);
    @Override
    public String start() {
        System.out.println(START_MESSAGE);
        return READER.nextLine();
    }

    @Override
    public int count() {
        System.out.println(COUNT_MESSAGE);
        return READER.nextInt();
    }
}
