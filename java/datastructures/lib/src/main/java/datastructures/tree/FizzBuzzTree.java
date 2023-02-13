package datastructures.tree;

// Java program to print Fizz Buzz

class FizzBuzzTree {
  public static String main(String[] args)
  {
    int n = 100;
    for (int i=0; i<=n; i++)
    {
      // Divisible by 3
       if (i%3==0)
        return ("Fizz");
     // Divisible by 5
       else if (i%5==0)
         return ("Buzz");
       // Divisible by 3 & 5
      if (i%15==0)
        return ("FizzBuzz");
      // Not ivisible by 3 or
      else // return number to string
        return ("");
    }
    return null;
  }
}
