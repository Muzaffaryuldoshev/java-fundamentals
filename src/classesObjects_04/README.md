## Classes and Objects 
### 2 types of classes 

* Built-In Classes -- they are already defined classes in java standard library, also called pre-defined classes 
* Custom classes -- classes created by a user or developer to improve flexibility of a programm. 

* A class is the blueprint or templete from which specific type of objects is ccreated. 
* An object is an instance of a class and it has Fields(State) and Methods (Behaviors)
* Field and method of a class is called Members of a claass 

### Instance Variables and Methods 
* Fields and Methods that belong to any instances of a class are called intance variables and instance methods 


## Java Memory Managment (JVM)
* Memory managment -- the process of allocation adn de-allocation of objects 
* Java has an automatic memory managment 
* Java memory is divided into 2 parts 
 1. JVM Java Memory Structure 
    1. Stack - it stores methods and local variables , if it gets full, StackOverFlowError happens 
    2. Heap - it stores objects and instance variables , if it gets full,OutOfMemory happens
  2. Garbage collection 
     * a programm that runs automatically when JVM determines that the memory is running low 
     * its impossible to predict that garbage colllect when to run 
     * that is the procces of removing unused objects and freeeing space for new ones.


## User Input 
* that refers to a data provided by a user during runtime procces. 
* User input can be obtained by Scanner class (java.util.package) in java library
* Scanner input = new Scanner(System.in);