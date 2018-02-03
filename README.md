# Number Iterator

This is a command line Java application that simulates iteration with custom commands

## Description

This program will iterate though a sequence of integers starting from 0 up to
and including a given number which will then apply the following rules


- output the number and “FOO” only when the integer is divisible by 3
- output the number and “BAR” only when the integer is divisible by 5
- but when the integer is divisible by both 3 and 5 then don’t write the above,
  output the number and “BAZ” instead
  
  

## Example Input and Output:
    
a)

	Enter a number greater than 0:
    5
    Number : 0 BAZ
    Number : 3 FOO
    Number : 5 BAR


b)

	Enter a number greater than 0:
    15
    Number : 0 BAZ
    Number : 3 FOO
    Number : 5 BAR
    Number : 6 FOO
    Number : 9 FOO
    Number : 10 BAR
    Number : 12 FOO
    Number : 15 BAZ



## Compile, Test, Run and Packaging

- Compile: `mvn compile`

- Test: `mvn test`

- Packaging: `mvn package`, compiled jar in *target/* folder

- Run: `java -jar <compiled jar in target folder>`


## Creating new Commands

Implement the Command Interface and implement your own execution method.

Implement a new CommandBuilder to change the conditions for executing commangds. 


