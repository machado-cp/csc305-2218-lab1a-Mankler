package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String[] args) {
    Example ex = new Example();
    int total = 0;

    System.out.println(ex.sameName(""));

    while (total <= 100) {
      int num = ex.getNums()[0];
      total += num;
    }

    System.out.println(total);
  }
}

