
This program demonstrates the ability to read data from multiple files into a new file according to user input. The input files respectively provide historical information from two Federal Reserve Data sets, the Federal Funds Rate and the Federal Reserve Discount Rate. 

The Federal Reserve Discount Rate is the interest rate at which banks may borrow directly from the Federal Reserve bank. The Federal Funds Rate is the interest rate banks are charged when they borrow funds from each other.

The program begins by providing a dropdown menu allowing the user to choose between three options: The first option option allows the user to print out a list of months for which the Federal Funds Rate was greater than the Federal Reserve Discount Rate to a file called 'results.csv'. The second option prints the converse to the file, i.e. the months for which the Discount Rate exceeded the Funds Rate. Pressing '3' causes the program to exit.

In order to achieve this result, the program creates two csv readers for the input files, and a file output stream and a print writer to handle the output file. It then prints the menu information, and makes use of a scanner and a switch statement to register the user's input. Each of the two non-exit options makes use of two for-loops to compare the data from the input files to each other and print out information only when the inequality tested for is met.

The pom.xml file includes opencsv version 4.6, a csv reader, as a maven dependency. The program as a whole was written in Java 12. 
