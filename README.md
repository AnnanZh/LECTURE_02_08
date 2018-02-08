# LECTURE_02_08

# Exceptions

To define a new exception type

* Decide what kind of exception you want to extend
    * `Exception`
    * `RuntimeException`
    * something more specific
* Create a new class that extends the appropriate class
* The body of that class can typically be empty, because
   all of the inherited methods do exactly what you need.
 
```java
public class BadSuitException extends IllegalArgumentException {}
```

# But why?

Why create an exception with a specific name that is exactly the same
as `IllegalArgumentException`?

A: Because it allows us to distinguish between different kinds of `IllegalArgumentException` things.

Example:

```java

public void doSomethingWithCards(char suit, int num, char other) {
  ...
  if (suit != 'H' &&
      suit != 'C' &&
      suit != 'D' &&
     suit != 'S') {
  throw new BadSuitException();
 }
 if (num < 1 || num > 10) {
   throw new IllegalArgumentException("num should be between 1 and 10 inclusive");
 }
 ...
}
```

Then somewhere else:

```java
try {
   // some code goes here
   // PEDAGOGICAL NOTE: The order of the catch phrases below is important.
   //  DO YOU SEE WHY?
} catch (BadSuitException bse) {
   System.err.println("Sorry, that is not a correct suit.  Suit should be H,D,C or S");
} catch (IllegalArgumentException iae) {
   System.err.println("Sorry, one of your arguments is incorrect.");
}
```
