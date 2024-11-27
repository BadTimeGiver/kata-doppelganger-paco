package info.dmerej;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SafeCalculatorTest {
  @Test
  void should_not_throw_when_authorized() {
    // TODO: write a test to demonstrate the bug in SafeCalculator.add()

    //Given
    Authorizer authorizer = () -> true;
    SafeCalculator safeCalculator = new SafeCalculator(authorizer);

    //When
    
    int sum = safeCalculator.add(1, 1);


    //Then

    //assert sum == 2;
    assertEquals(2, sum);


  }
}
