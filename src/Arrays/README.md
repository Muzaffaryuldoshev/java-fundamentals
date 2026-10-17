## Arrays 
* `Array` is a fundamental data structure that helps to store multiple elements of the same data type

### Why `Array`
1. it allows for efficient access and manipulation of the data 
2. supports both primitive and non-primitive data types 
3. has a unique index number for each element 
4. offers efficient algorithm implementations for searching, sorting, and counting

### Declaring `Array`
- in a single line declaring --> int[] arr = new int[5];
- String[] arr = new String[5];
----
- array with curly braces -- > String[] arr = {"Hey", "Hello", "World"};
- Once `Array` is created, its size can not be changed.


- `Elements` of Array can be accessed by using the `Square bracket[]` and `index`
- `index` nums are inside the bracket 
- and indexes are `zero-based` in array
- ex: arr: int[] nums = {10,29,30};
  - ex: accessing: System.out.printlne(nums[0]); --> 10

### Length of Array 
- The array uses `length` property to store the number of current elements it holds
- ex: arr: String[] mountains = {"Everest", "Fuji", "Nanga Parbat"};
  - ex: System.out .println(`mountains.length` ); // 3


### Array's `Utility` Class 
- that is a special type of class that contains only `static methods` and `no instance variables`
- its imported from `java.util.Arrays;`
---
- Array to manipulate and to use as an example: String[] names = {"Ali", "Vali", "Sami"}; 
- int : double[] prices = {1.5, 2.0};  

| Method                          | Description                                                                    | Example                        |
|---------------------------------|--------------------------------------------------------------------------------|--------------------------------|
| `toString(arrVar)`              | Returns a `string` representation of the contents of this array                | Arrays.toString(names)         |
| `equals(arrVar1, arrVar2) `     | returns `boolean`, checks if both arrays are equal or not                      | Arrays.equals(a, b)            |
| `sort(arrVar)`                  | sorts the elements of an array in  escending order                             | Arrays.sort(nums);             |
| `binarySearch(arrVal)`          | Searches for the specified element in the array but after that array is sorted | Arrays.binarySearch(nums, 7);  |
| `copyOf(arrVar, length)`        | copies the specified array and returns a new array                             | Arrays.copyOf(nums, 3)         |
| `copyOfRange(arrVar, from, to)` | returns to a new array and copies the specified range of array                 | Arrays.copyOfRang(names, 3,5)  |
| `fill(arrVar, value)`           | assigns a variable to the specified array                                      | Arrays.fill(names, "Muzaffar") |
| `deepToString(arrVar)`          | returns a string representation of the multi-dimensional array                 | Arrays.deepToString(prices)    |

----

### for-each loop (Enhanced Loop)
- each-loop is used to simplify the iteration over the elements in an array or collection 
- iteration order and the number of iterations is fixed 

### for-each loop VS for loop
| For-Each Loop                                              | For-Loop                                               |                     
|------------------------------------------------------------|--------------------------------------------------------|
| Access all array elements from the first to the last       | Access some/all elements by using index                |
| Works only from the first to the last element of the array | can work through the array elements and works reversed |
| index can not be used                                      | index must be used                                     |                                    
| works only with one array                                  | simultaneously work with two or more array             |
| elements can not be modified                               | elements can be modified                               |
---- 
- if we iterate over elements and no need for the index, we should use for-each loop 
- if we need more control over the iteration process or require aceess to the index, the for loop will be good approach 






