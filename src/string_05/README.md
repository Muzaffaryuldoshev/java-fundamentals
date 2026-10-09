## String 

* String is a non-primitive data type and it is representation of sequences of characters 
* it is immmutable which means once created, can't be changed 
* it is located inside the java.lang package 


* String pool -- special memory area in the HEAP that stores unique instances of String literal. if that literal already
    exists in the pool, a reference to pooled instance is retured.


* two ways of creating a String 

  1. String literal -- String str = "Hello World".
     * JVM Keeps the string literal in the String pool inside Heap memory 
  2. By the new keyword -- String strNew = new String("Hello World); 
     * Each usage of new keyword craeted a new instance object in the Heap Memory and they are not saved in the String pool 
     * Rather that are saved in the Heap as a new object.


## `==` vs `.equals()`

`==` compares the values stored in the variables.
- **Primitives:** the variable holds the actual value, so `==` compares values.
- **Objects:** the variable holds a reference, so `==` checks whether both variables point to the **same object**.

`.equals()` compares the **content** of objects. By default (from `Object`) it behaves like `==`, so a class must override it to compare fields. `String` already does.

### Strings
- `"Hello"` literals are stored in the **String pool** and reused, so two literals with the same text are the same object.
- `new String("Hello")` always creates a separate object outside the pool.
- `str1 == str2` is `false` for a literal and a `new String`, but `str1.equals(str2)` is `true`.
- Always compare Strings with `.equals()`.

`.equalsIgnoreCase(String str)` returns **true** if the strings have the same characters in the same order
regardless of their case, and **false** otherwise


## `methods` in String with their `functionalities` 

### `Length` and `access` 
| Method      | What it does                                | Example            |
|-------------|---------------------------------------------|--------------------|
| `length()`  | counnts number of chars                     | ex: str.length();  |
| `charAt(i)` | char at Index(i) "Starts from 0"            | ex: str.charAt(i); |
| `isEmpty()` | True if length is 0                         | ex: str.isEmpty(): |
| `isBlank()` | True if empty or only white space in string | ex: str.isBlank(); |

### `Comparison`
| Method                | What it does                       | Example                         |
|-----------------------|------------------------------------|---------------------------------|
 | `.equals()`           | Content comparison, case-sensitive | ex: str.equals(str1)            |
| `equalsIgnoreCase(s)` | Content comparison, ignores case   | ex: str.equalsIgnoreCase(str1)  |

### `Searching` 
| Method           | What it does                      | Example                              |
|------------------|-----------------------------------|--------------------------------------|
| `contains(s)`    | True if the text appears anywhere | "automation".contains("mat") → true  |
| `indexOf(x) `    | Index of first occurrence, or -1  | "banana".IndexOf('a') → 1            |
| `lastIndexOf(x)` | Index of last occurrence, or -1   | "banana".lastIndexOf('a') → 5        |
| `startsWith(s)`  | True if it begins with s          | 	"Java".startsWith("Ja") → true      |
| `endsWith(s)`    | True if it ends with s            | "test.java".endsWith(".java") → true |
