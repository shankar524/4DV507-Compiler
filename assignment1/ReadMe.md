## About
This is assignment 1 for course **Compiler(4DV507)**. As part of this assignment I have added grammar in ANTLR specification to identify and parse OFP(One-File program).

#### File Structure
|  File/Folder | Purpose  |
|---|---|
|  Expression.g4 |  Contains Lexer and Parser rules based on ANTLR |
| generated  |  Contains auto generated Java code |
|  tests |  Contains tons of OFP programs that were used as test case |

#### Setup
To run this project following software and programs are needed:

1. Ensure [Java](https://www.java.com/en/download/) and [JRE](https://www.oracle.com/java/technologies/downloads/) are pre-installed.
2. Download ANTLR Jar toolkit from [here](https://www.antlr.org/download.html) and save it in JAR path



### OFP specification:
Here as speciations of OFP(One-File program):

General structure:->
- Always consists of a single file (with postfix .ofp, as in One-File Program)
- OFP program consists of one or more functions.
- the execution starts in the function with signature `void main()`.
- No fields and global variable are allowed.

Function structure:->
- OFP program consists of one or more functions.
- contains return type(or void)
- has a name(identifier)
- zero or more parameters
- has body enclosed in curly braces
```java
float max(float x, float y) {
    if (x > y)
        return x;
    else
    return y;
}
```
- Non void function should have at least one return statement(void function has no returns).
- returned type must have type agreement with function declaration

Control structure:
- Has only 2 control statement `while` and `if`.
```java
while(i<100) {
    n = n+ i
    i++;
}
```
```java
if (x>y)
    max = x;
else if (y>x)
    max = y;
else # x equals y
    max = y
```