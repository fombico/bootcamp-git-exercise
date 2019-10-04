package ca.lclbootcamp.gitexercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DisplayName("Exercises 5")
class Exercise5Tests {

    @Test
    @DisplayName("Exercise 5")
    void exercise5() {
        assertThat(5).isEqualTo(5);
    }

}
