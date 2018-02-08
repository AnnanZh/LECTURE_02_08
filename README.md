# LECTURE_02_08

# Today in lab

* Finish up proj00
* Please tell your mentor if you think you will be staying with your repo/pair, or are thinking of switching.
* Work on lab02
* if you are done with both, ask mentor how to create a proj01 branch to get started on proj01
* In general, don't make changes to master (or any other branch) if you have an outstanding pull request on that branch,
    unless those changes are really SUPPOSED to be part of that pull request.

# Exceptions

To define a new exception type

* Decide what kind of exception you want to extend
    * `Exception`
    * `RuntimeException`
    * something more specific
    * We'll come back to which kind in a moment...
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

# Checked vs. Unchecked Exceptions

Some expections, if the method can throw the exception (directly, or indirectly), you have to
* declare that the method throws the exception OR
* you have to wrap the dangerous code in a try/catch

The book says: you have to catch or "duck".
* NOTE: "duck" is not a technical term!  It is ideosyncratic to our textbook.
* A better way to say it is: you have to declare that the exception is thrown...
* Which essentially delegates responsibility to whoever is calling your method.

It's like "full disclosure".

# Merge conflicts

Jeff really wants to know about Merge conflicts.
He wants to know what would happen.

