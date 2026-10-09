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

### Splitting And Joining 
| Method             | What it does                                                 | Example                                                             |
|--------------------|--------------------------------------------------------------|---------------------------------------------------------------------|
| `.split(specChar)` | The argument is a regex, so special characters need escaping | ex: String[] names = csv.split(",");                                |
| `.join()`          | joins strings together                                       | ex:  String joined = String.join("-", names);   // "ali-vali-sami"  |

### Extracting and modifying
| Method                             | What it does                                             | Example                                                                 |
|------------------------------------|----------------------------------------------------------|-------------------------------------------------------------------------|
| `.substring(index)`                | extracts unti a given index                              | ex: s.substring(4);      // "mation"                                    |
| `.substring(2indexes)`             | extracts between given indexes inclusive and exclusive   | esx: s.substring(0, 4);   // "auto"    (start inclusive, END EXCLUSIVE) |
| `.replace("char out","char in")`   | replaces given char in a string (treats as plain text)   | ex: "a.b.c".replace(".", "-");       // "a-b-c"                         |
| `replaceAll(pattern, replacement)` | replaces all matches while replaces() does first match   | ex: a1b22c".replaceAll("\\d", "");  // "abc                             |
| `toUpperCase()`                    | turns full string into Uppercase                         | ex: "Java".toUpperCase();        // "JAVA"                              |
| `toLowerCase()`                    | turns full string into Lowercase                         | ex; "Java".toLowerCase();        // "java"                              |
| `trim()`                           | removes leading/trailing spaces                          | ex:  "  hi  ".trim();             // "hi"                               |
| `strip() `                         | removes leading/trailing spaces but java11+              | ex: "  hi  ".strip();            // "hi"                                |
| `repeat(index)`                    | repeats string as what index is given in a method        | ex: "ab".repeat(3);              // "ababab"                            |
| `concat()`                         | joins two Strings or char also and the same as str + str | ex: "Java".concat("!");          // "Java!"                             |

### Conversion
| Method               | What it does                          | Example                                                           |
|----------------------|---------------------------------------|-------------------------------------------------------------------|
| `toCharArray()`      | turns a string into chars in an array | ex: char[] chars = "Java".toCharArray();     // ['J','a','v','a'] |
| `valueOf(value)`     | converts  into String                 | ex: String s1 = String.valueOf(42);           // "42"             |
| `Integer.parseInt()` | returns String int to real  int       | ex:  int n = Integer.parseInt("42");           // String → int    |



