package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HofstadterTest {
  @Test
  void itReturnsTheZerothElementInTheSequence() {
    Hofstadter h = new Hofstadter();
    assertEquals(0, h.gSequence_Naive(0));
    assertEquals(0, h.gSequence_Memoized(0));
  }
}
