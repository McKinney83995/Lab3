package org.example;

public class Hofstadter {
  // Your implementations of the sequence goes here.
  // Recall that you can calculate the nth term, G(n), using:
  // G(n) = n - G(G(n-1))
  // G(0) = 0
  public int gSequence_Naive(int n) {
    if (n == 0)
      return 0;
    else
      return (n - gSequence_Naive(gSequence_Naive(n - 1)));
  }

  public Integer gSequence_Memoized(Integer n) {
    int[] acc= new int[n+1]; //adjusted so that elements can alwayys be accessed as arr[n]
    return (gSequence_Memoized(n, acc));
  }

  private int gSequence_Memoized(Integer n, int acc[]) {
    if (n == 0)
      return 0;
    else {
      if (acc[n]== 0) {
        acc[n] = n - gSequence_Memoized(gSequence_Memoized(n - 1, acc), acc);
      }
      return acc[n];
    }
  }

}