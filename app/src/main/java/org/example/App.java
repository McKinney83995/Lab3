package org.example;

public class App {
  public static void main(String[] args) {
    int trials = 1000000;

    Hofstadter hofstadter = new Hofstadter();

    for (int n = 0; n <= 15; ++n) {
      long totalTime_naive = 0, totalTime_memo = 0;

      System.out
          .println("N: " + n + "\n");

      for (int i = 1; i <= trials; ++i) {
        long startTime = System.nanoTime();
        hofstadter.gSequence_Memoized(n);
        long endTime = System.nanoTime();
        totalTime_memo += (endTime - startTime);

        startTime = System.nanoTime();
        hofstadter.gSequence_Naive(n);
        endTime = System.nanoTime();
        totalTime_naive += (endTime - startTime);
      }

      System.out // out put the average run time for each algorithm
          .println("Naive Hofstadter Average run time: " + totalTime_naive / trials +
              "\nMemoized Hofstadter Average run time: " + totalTime_memo / trials);
    }

  }
}
