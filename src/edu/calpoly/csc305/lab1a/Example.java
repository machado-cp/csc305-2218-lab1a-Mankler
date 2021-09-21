package edu.calpoly.csc305.lab1a;

class Example {
  private static final  int X = 4;
  private final String name;
  private final int[] nums;

  public Example() {
    name = "";
    nums = new int[] {1, 2, 3, X};
  }

  boolean sameName(String otherName) {

    return otherName.equals(name);
  }

  public int[] getNums() {

    return nums;
  }
}  
