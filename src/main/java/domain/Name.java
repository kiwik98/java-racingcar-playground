package domain;


public class Name {
    public static final int MAX_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validateLength(name);
            this.name = name;
    }

    private void validateLength(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("이름이 비어있습니다.");
        }
        if(name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("이름은 5글자 이하만 생성할 수 있습니다.");
        }
    }

}
