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
