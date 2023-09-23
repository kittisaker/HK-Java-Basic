# Learn Java with Hacker Rank

## Day : 1

###  Java Stdin and Stdout I

* read input from stdin (standard input).
* write output to stdout (standard output).
</br>
<b>read input from stdin is by using the Scanner class (Example)</b>

```java
Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
```

if our input is :
```
Hi 5
```

Our code will prnt :
```
myString is: Hi
myInt is: 5
```

</br>
<b>Task</b></br>
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.
</br>
</br>Sample Input :
```
42
100
125
```
</br>Sample Output :
```
42
100
125
```

<details>
<summary>Solution.java</summary>

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();
        scanner.close();

        System.out.println(userInput1);
        System.out.println(userInput2);
        System.out.println(userInput3);
    }
}
```
</details>

### If-Else
<b>Task</b></br>
Given an integer, n, perform the following conditional actions:
    - If n is odd, print Weird
    - If n is even and in the inclusive range of 2 to 5, print Not Weird .
    - If n is even and in the inclusive range of 6 to 20, print Weird
    - If n is even and greater than 20, print Not Weird
    - Complete the stub code provided in your editor to print whether or not  is weird.
</br>Constraints
```
1 <= n <= 100
```

</br>Sample Input : 0
```
3
```

Sample Output : 0
```
Weird
```
</br>Sample Input : 1
```
24
```
Sample Output : 1
```
Not Weird
```

<details>
<summary>Solution.java</summary>

```java
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String result = "";
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(n % 2 == 1){
            result = "Weird";
        }if(n % 2 == 0){
            for(int i = 2; i <= 5; i++){
                if(n == i){
                    result = "Not Weird";
                }
            }
            for(int i = 6; i <= 20; i++){
                if(n == i){
                    result = "Weird";
                }
            }
            if(n > 20){
                result = "Not Weird";
            }
        }
        System.out.println(result);
    }
}
```
</details>

### Java Stdin and Stdout II

sfsdgfsdfsa

sgsdagdas

gsgsdgasgs
---

<details>
<summary>.java</summary>

```java

```
</details>