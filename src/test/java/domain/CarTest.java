package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_생성() {
        Car car = new Car("kiwik");
        Assertions.assertThat(car).isNotNull();
    }
}
