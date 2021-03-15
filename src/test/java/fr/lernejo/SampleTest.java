package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {

    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "4, 7, 11"
    })
    void add_behaves_as_expected(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.ADD, a, b);

        Assertions.assertThat(result).isEqualTo(expectedResult);


    }

    @Test
    void add_behaves_as_expected_2() {
        int result = sample.op(Sample.Operation.MULT, 0, 3);

        Assertions.assertThat(result).isEqualTo(0);


    }
}
