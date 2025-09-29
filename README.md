# OOPsShowcase

A collection of Java projects demonstrating **Object-Oriented Programming (OOPs)** concepts such as:

- Classes & Objects  
- Inheritance  
- Encapsulation  
- Polymorphism  
- Abstraction  

This repository is designed to showcase practical implementations of OOPs concepts in Java.

---

## 📌 Projects

### 1. ComplexNumbers
Operations on complex numbers using a `Complex` class.

**Concepts used:** Classes, Objects, Static Methods, Encapsulation  

**Project Description:**  
- Supports addition, subtraction, and multiplication of complex numbers  
- Prints complex numbers in a readable format  

Usuage


Complex c = new Complex(2, 3);
Complex d = new Complex(64, 48);

Complex sum = Complex.add(c, d);
sum.printComplex();

Sample Output :
66 + 51i
-62 - 45i
-32 + 288i

2.	ShapeHierarchy
Demonstrates Abstraction, Inheritance, and Polymorphism.

Concepts used: Abstract Classes, Method Overriding, Polymorphism

Project Description:

Abstract class Shape with abstract methods area() and perimeter()

Subclasses: Circle (radius), Rectangle (length, width)

Polymorphic references to store different shapes

Usage:

Shape circle = new Circle(2);
circle.print();

Shape rectangle = new Rectangle(2, 3);
rectangle.print();


Sample Output:

Circle rad is : 2.0
Circle area is : 12.56
Circle perimeter is : 12.56

Rectangle length is : 2.0
Rectangle width is : 3.0
Rectangle area is : 6.0
Rectangle perimeter is : 10.0
