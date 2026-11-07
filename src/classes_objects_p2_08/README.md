### Constructor 
- `constructor` - is a method that is automatically called when an object is created. 
- why we need a constructor? 
  - to initialize the state of an object when itis created 


- there must be a contstructor in a class with the same name but wihtout return type

- **3 types of constructor**
1. default constructor - automatically crearted if not done manually 
2. no-argument constructor - constructor wiht no arguments 
3. parameterized constructor - accepts arguements and allowd to pass custom value when creating an object 
--- 

- `this` keyword is used to refernct the current object 

### Constructor overloading 
- creating multiple constructors with the same name but different credentials 

### Constructor chaining 
- this is the process of calling one constructor from another constructor which makes the code less duplicated and more readeble 
- `this()` keyword is used to achieve that 
- and `this()` keyword must be the first line of the code in a constructor method 


#### difference between this and this() keyword.
| this                                   | this()                                                                         |
|----------------------------------------|--------------------------------------------------------------------------------|
| used only with objects                 | used with constructors only                                                    |
| refers to the current object           | refers to the construcot of the same class that matches with passed parameters |
| .operator is used to assess the member | .operator used to assess the but only matching parameters are passed           |


### Initializer blocks
- the initializer block is used to initialize instance data member and it runs each time when an instance of the class is creared 


### differences between constructor and a method 
| Constructor                                         | Method                                                     |
|-----------------------------------------------------|------------------------------------------------------------|
| initializes the variable of the class               | used to define the behaviour (functionalities)of the class |
| no return type                                      | return type is a must have                                 |
| gets invoked automatically when object creation     | gets invoked explicitly                                    |
| default cons gets created in case if no constructor | no default method                                          |
| its name must be the same as class name             | its name may or may not be the same                        |


### static keyword 
- `modifiers` - keywords that are used to define the scope of proramming elements from variables to classes 
- `access modifiers` - public, default, protected, private
- `non-access modifiers` - static, final, abstract

**static modifier** - used to declare a class member that belongs to the class itself, not to individuals or instances of the class   
- there are `static` variables, methods, blocks

### static variables or class variables or global variables 
- static variables are common to all the intances of the class 
- a single copy of class's static variable is shared by all instances of the class 

### 4 types of variables 
1. static variable 
2. local variable 
3. parameter 
4. instance variable 


### Static methods and Import 
- a static method is a method that belongs to the class  
- static keyword is used before method's return type to make it static 
- it can be called using the class name without creating  an instance of the class 
- cannot access instance variables or non-static methods directly 


### static import 
- feature that allows us to access static members of a class directly without qualifying them with the class name 
- `import static com.example.util.MathUtil.* ;` - example of wildcard

























