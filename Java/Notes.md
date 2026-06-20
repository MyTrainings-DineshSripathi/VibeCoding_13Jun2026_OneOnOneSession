# Java Programming Language

Java is a **high-level, object-oriented programming (OOP) language** widely used for building backend systems, enterprise applications, Android applications, and more.

> **Note:** Java is primarily an **object-oriented language**, while JavaScript supports multiple paradigms and is often associated with **functional programming** concepts.

---

## Why Java?

* Platform-independent (**Write Once, Run Anywhere**)
* Strongly and statically typed
* Secure and robust
* Rich ecosystem and libraries
* Commonly used for backend development

---

# Object-Oriented Programming (OOP)

Object-Oriented Programming is a programming paradigm that organizes code into **classes** and **objects**.

The four main principles of OOP are:

1. **Encapsulation**
2. **Inheritance**
3. **Polymorphism**
4. **Abstraction**

---

## 1. Class

A **class** is a blueprint or template used to create objects.

It defines the **properties (data)** and **behaviors (methods)** that objects of that class will have.

### Syntax

```java
class ClassName {
    // Properties
    // Constructors
    // Methods
}
```

### Components of a Class

A class can contain:

* Variables (Fields)
* Objects (References)
* Enums
* Constructors
* Methods

---

### Variables (Fields)

Variables are used to store data.

Java is a **statically typed language**, which means you must specify the data type of each variable before using it.

### Primitive Data Types

| Category        | Data Type | Description                                           |
| --------------- | --------- | ----------------------------------------------------- |
| Integer Numbers | `byte`    | 8-bit signed integer                                  |
| Integer Numbers | `short`   | 16-bit signed integer                                 |
| Integer Numbers | `int`     | 32-bit signed integer (default)                       |
| Integer Numbers | `long`    | 64-bit signed integer                                 |
| Decimal Numbers | `float`   | 32-bit floating-point number                          |
| Decimal Numbers | `double`  | 64-bit floating-point number (default)                |
| Character       | `char`    | Stores a single character using single quotes (`'A'`) |
| Boolean         | `boolean` | Stores `true` or `false`                              |

### Non-Primitive Data Types

* `String` → A sequence of characters enclosed in double quotes (`"Hello"`).
* Arrays
* Classes
* Interfaces
* Enums

### Example

```java
int age = 25;
double salary = 50000.50;
char grade = 'A';
boolean isActive = true;
String name = "Robert";
```

---

### Objects (References)

Objects are references to instances of other classes.

```java
Student student = new Student();
```

Here, `student` is a reference variable that points to a `Student` object.

---

### Enum

An **enum** (enumeration) is a special type used to define a fixed set of constant values.

### Example

Consider a swipe machine that can have only two states:

* `IN`
* `OUT`

```java
enum Status {
    IN,
    OUT
}
```

Usage:

```java
Status currentStatus = Status.IN;
```

Enums improve code readability and prevent invalid values.

---

## 2. Constructors

A constructor is a special method used to initialize objects.

It is automatically called when an object is created using the `new` keyword.

### Important Points

* The constructor name must be the same as the class name.
* Constructors do not have a return type.
* Constructors help initialize object properties.

### Types of Constructors

#### Default Constructor

If you do not define any constructor, the Java compiler automatically provides a default constructor.

```java
class Student {
}
```

---

#### User-Defined Constructor

When you create your own constructor, the compiler no longer provides the default constructor.

### Syntax

```java
public ClassName(parameters) {

}
```

### Example

```java
class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Creating an object:

```java
Person person = new Person("Robert", 35);
```

---

## 3. Methods

Methods are blocks of reusable code that perform specific tasks.

### Syntax

```java
public returnType methodName(parameters) {

    // Statements

    return value; // Optional
}
```

### Example

```java
public String getName() {
    return name;
}
```

### Calling a Method

To access a non-static method, you must use an object.

```java
Person person = new Person("Robert", 35);

String personName = person.getName();
```

---

## 2. Object

An **object** is an instance of a class.

Objects are created from classes and occupy memory during program execution.

### Syntax

```java
ClassName objectName = new ClassName();
```

Or

```java
ClassName objectName = new ClassName(value1, value2);
```

### Example

```java
Person person = new Person("Robert", 35);
```

Here:

* `new` creates an object in memory.
* The constructor initializes the object.
* `person` stores the reference to that object.

---

## Real-World Example: Class vs Object

Imagine you want to build a house.

* An engineer creates a **blueprint**.
* The blueprint contains all the details about the house.
* You cannot live inside the blueprint.
* Construction workers use the blueprint to build the actual house.

### Mapping the Example

| Real World | Programming |
| ---------- | ----------- |
| Blueprint  | Class       |
| House      | Object      |

A class defines the structure, while an object is the real instance created from that structure.

---

## Other OOP Concepts

### 3. Inheritance

Inheritance allows one class to acquire the properties and methods of another class.

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
}
```

---

### 4. Abstraction

Abstraction hides implementation details and exposes only essential information to the user.

It can be achieved using:

* Abstract classes
* Interfaces

---

### 5. Encapsulation

Encapsulation means bundling data and methods together into a single unit and restricting direct access to the data.

This is typically achieved using:

* Private variables
* Public getter and setter methods

---

### 6. Polymorphism

Polymorphism means "many forms."

It allows the same method to behave differently based on the object or parameters.

There are two types:

* Method Overloading (Compile-time Polymorphism)
* Method Overriding (Runtime Polymorphism)

---

# Summary

* **Class** → Blueprint for creating objects
* **Object** → Instance of a class
* **Constructor** → Initializes objects
* **Method** → Defines behavior
* **Variable** → Stores data
* **Enum** → Represents fixed constants
* **Inheritance** → Reuse existing code
* **Abstraction** → Hide implementation details
* **Encapsulation** → Protect data
* **Polymorphism** → Enable multiple behaviors

Java's object-oriented nature makes it a powerful choice for developing scalable and maintainable backend applications.
