OddEven-The OddEven program is a Java application designed to take user input for an array of integers, 
categorize them into odd and even numbers, and then display the odd and even numbers separately.

The main method is the entry point of the program.
It creates a Scanner object to read user input.
It prompts the user to enter the size of the array and then inputs the elements into the array.
It counts the number of even and odd numbers in the array while taking input.
It creates two separate arrays (even and odd) to store even and odd numbers, respectively.
It separates even and odd numbers from the numbers array into their respective arrays.
It then prints the even and odd numbers separately.
Finally, it closes the Scanner to prevent resource leaks.




NearestNeighbours-The NearestNeighbours program is a Java application that finds the index of the nearest neighbours in an array of integers. 
Nearest neighbours are defined as adjacent elements in the array with the smallest absolute difference between them.

findNearestNeighboursIndex Method:-This method takes an array of integers (arr) as input.
It checks if the array is null or has less than two elements. If so, it returns -1.
It initializes variables to keep track of the minimum distance and the index of the nearest neighbors.
It iterates through the array, calculating the absolute difference between each pair of adjacent elements.
It updates minDistance and nearestIndex if a closer pair of neighbors is found.
Finally, it returns the index of the first element of the nearest neighbors.

Main Method-The main method is the entry point of the program.
It creates a Scanner object to read user input.
It prompts the user to enter the number of elements in the array and then the elements themselves.
It calls the findNearestNeighboursIndex method to determine the index of the nearest neighbors.
If the index is found (index != -1), it prints the values of the nearest neighbors and the index of the first number.
If the array is null or too short, it prints an appropriate message.
Finally, it closes the Scanner to prevent resource leaks.





ArrayToArrayList- 
The ArrayArrayListConversion program is a Java application that demonstrates the conversion between arrays and ArrayLists. 
It allows the user to input elements into an array, converts the array into an ArrayList, and then converts the ArrayList back into an array.

The main method is the entry point of the program.
It initializes a Scanner object to read user input.
It prompts the user to enter the size of the array and the elements of the array.
Then, it calls two conversion methods and displays the results.

ConvertArrayToArrayList-This method takes an array of integers as input.
It creates an ArrayList and adds each element of the array to the ArrayList.
Finally, it returns the ArrayList.

ConvertArrayListToArray-This method takes an ArrayList of integers as input.
It creates an array of integers with the same size as the ArrayList.
It iterates over the ArrayList and assigns each element to the corresponding index in the array.
Finally, it returns the array.
