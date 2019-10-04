package ca.lclbootcamp.gitexercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DisplayName("Exercise Tests")
class ExerciseTests {

    @Test
    @DisplayName("Exercise 1")
    void exercise1() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    @DisplayName("Exercise 2")
    void exercise2() {
        assertThat(2).isEqualTo(2);
    }

    @Test
    @DisplayName("Exercise 6")
    void exercise6() {
        assertThat(7).isEqualTo(7);
    }
}
