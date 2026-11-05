### Java Lang Classes - Wrappwe Class 
- Wrapper class converts primitive data types into objects 

| PPrimitive Type | Wrapper Class |
|-----------------|---------------|
| byte            | Byte          |
| short           | Short         |
| int             | Integer       |
| long            | Long          |
| float           | Float         |
| double          | Double        |
| char            | Character     |
| boolean         | Boolean       |

- **Creating Wrapper Classes**
- `valueOf` method creates a Wrapper class for a given primitive or String 

| Method                      | Return Type |
|-----------------------------|-------------|
| Integer.valueOf(intVal)     | Integer     |
| Integer.valueOf(str)        | Integer     |
| Double.valueOf(doubleVal)   | Double      |
| Doouble.valueOf(str)        | Double      |
| Character.valueOf(char)     | Character   |
| Boolean.valueOf(booleanVal) | Boolean     |
| Boolean.valueOf(booleanVal) | Boolean     |
| Long.valueOf(str)           | Long        |
| Long.valueOf(longValue)     | Long        |
| Short.valueOf(shortValue)   | Short       |
| Short.valueOf(str)          | Short       |
| Byte.valueOf(byteVal)       | Byte        |
| Byte.valueOf(str)           | Byte        |

#### AutoBoxing vs Unboxing 
- AutoBoxing - The process of automatically converting primitive data types into wrapper class objects
- Unboxing - the process of automatically copnverting wrapper class objects intp primitive data types 

### Parsing a String 
- everytime parsnig a string int int or  to digit, digits have to be extracted first 


### Math Class 
- a utility class in java.lang library package that provides methods and constants for common math calcs

  | Method / Constant | Return Type              | Description                                                             |
  |-------------------|--------------------------|-------------------------------------------------------------------------|
  | `max(x, y)`       | int, long, float, double | Returns the number with the highest value                               |
  | `min(x, y)`       | int, long, float, double | Returns the number with the lowest value                                |
  | `abs(x)`          | int, long, float, double | Returns the absolute value of x                                         |
  | `pow(x, y)`       | double                   | Returns the value of x to the power of y                                |
  | `sqrt(x)`         | double                   | Returns the square root of x                                            |
  | `random()`        | double                   | Returns a random number between 0 (inclusive) and 1 (exclusive)         |
  | `round(x)`        | int, long                | Returns the value of x rounded to its nearest mathematical integer      |
  | `floor(x)`        | double                   | Returns the value of x rounded down to its nearest mathematical integer |
  | `ceil(x)`         | double                   | Returns the value of x rounded up to its nearest mathematical integer   |
  | `PI`              | double                   | Represents the value of pi (3.141592653589793)                          |

### Collection Framework
- set-of-ready-to-use classes and interfaces that provide a standarized way to manage and manipulate groups of objects.
---
- **List**
1. ArrayList
2. LinkedList
3. Vector 
4. Stack
---
**Queue**
1. Priority Queue 
2. Deque
3. ArrayDeque
---
**Set**
1. HashSet 
2. SortedSet 
3. TreeSet
4. LinkedHashSet

### ArrayList 
- a part of the java collections framework and provides implementation of a dynamic array data structure.
- Dynamic Sizing
- doen't support primitives
- Maintain insertion order 
- Generic Class 

- **Creating an arrayList**
- ArrayList <Strin>g str = new ArrayList<String>(); --> Complicated 
- ArrayList <String> str = new ArrayList<>(); --> simplified 
- ArrrayList <Integer> ints = new ArrayList<>(); data type of arrList can not be a primitive 


- **ArrayList Methods**

| Methods              | Explanation                                                                    |
|----------------------|--------------------------------------------------------------------------------|
| add(element)         | appends a specific element to the end of a list                                |
| add(index, element)  | insert a specific element at a specified position in a list                    |
| size()               | returns number of elements in a list                                           |
| get(index)           | returns the element at the given  index                                        |
| set(index,element)   | replaces the element at the given index with given element                     |
| remove(object)       | removes first occurance of the given element from list                         |
| remove(index)        | removes value at given index                                                   |
| indexOf(obj)         | returns the index of given element for the first occurance -1 for  no element  |
| lastIndexOf(obj)     | returns index of last occcurance of a given element                            |
| contains(obj)        | returns true if a specified elememnt is on the list                            |
| isEmpty()            | returns true if list is empty                                                  |
| clear()              | removes all elements from a list                                               |
| -------------------- | ------------------------------------------------------------------------------ |

### Collection Iterface Bulk operations 
- bulk operations perform operations on entire collections 

| Methods           | Explanations                                                                                                |
|-------------------|-------------------------------------------------------------------------------------------------------------|
| addAll(list)      | adds all elements from a collection to a target collection                                                  |
| containsAll(list) | returns true if target collection contains all elements in the specified collection                         |
| removeAll(list)   | removes from target collection all elements that are contained in a specified collection                    |
| retainAll()       | it retains only those elements in the target collection that are also contained in the specified collection |
| clear()           | removes all elements from the collection                                                                    |

### Collections Utility Class 

| Method                           | Explanation                                                                                     |
|----------------------------------|-------------------------------------------------------------------------------------------------|
| sort(list)                       | sorts the elements of given list in natural order                                               |
| binarySearch(list,val)           | searches for specified value in asorted list in ascending order using a binary search algorithm |
| min(list)                        | returns to min in a collection, according to natural order                                      |
| max(list)                        | returns to max in a collection, according to natural order                                      |
| fill(list, val)                  | replaces all elementa of the list with specified value                                          |
| copy(list, list)                 | copies elements of a source list to the destined list                                           |
| reverse(list)                    | reverse order of the elements in the list                                                       |
| shuffle(list)                    | randomly reorders the elements in the list                                                      |
| rotate(list, val)                | rotates the elements in the list by specified distance                                          |
| replaceAll(list, oldVal, newVal) | replaces  occurances of oldValue with new value in the list                                     |
| frequency(list, val)             | returns the frequency of occurences of a val in the list                                        |





