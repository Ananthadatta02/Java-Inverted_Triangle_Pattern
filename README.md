# Java Inverted Triangle Pattern

## Description
This repository contains a Java program that prints an **inverted right-angled triangle number pattern**. The program utilizes nested loops to generate a structured numerical output, demonstrating basic Java programming concepts such as loops and control structures.

## Program Code
```java
package number_patterns;
public class InvertedRightAngledTriangle 
{
    public static void main(String[] args)
    {
        int a = 5;
        for(int i = 1; i <= 4; i++) 
        {
            for(int j = 1; j <= a; j++)
                System.out.print(j);
            a--;
            System.out.println();
        }
    }
}
```

## How It Works
### 1. **Variable Initialization:**
   - `int a = 5;` initializes the maximum number of columns for the first row.
   
### 2. **Outer Loop (Rows Iteration):**
   - The outer loop (`for(int i = 1; i <= 4; i++)`) controls the number of rows printed.
   - Since the pattern has **4 rows**, the loop runs **4 times**.
   
### 3. **Inner Loop (Column Iteration):**
   - The inner loop (`for(int j = 1; j <= a; j++)`) prints numbers from `1` to `a`.
   - The value of `a` starts from **5** and decreases after each row.
   
### 4. **Decrementing `a` to Reduce Column Count:**
   - After each row, `a--` decreases the number of columns printed in the next row.
   - This creates the inverted right-angled triangle effect.

### 5. **Printing the Numbers:**
   - `System.out.print(j);` prints numbers sequentially.
   - `System.out.println();` moves to the next line after completing a row.

## Expected Output
```
12345
1234
123
12
```

## Key Concepts Demonstrated
- **Nested Loops** (Outer loop for rows, Inner loop for columns)
- **Loop Control Variables** (`i`, `j`, and `a` for managing iteration)
- **Pattern Printing Logic** (Using decrementing values to form the pattern)

## Clone the repository:
   ```sh
   git clone https://github.com/Ananthadatta02/Java-Inverted_Triangle_Pattern.git
   ```
