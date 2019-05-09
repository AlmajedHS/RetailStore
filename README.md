This is a RetailStore project.

The goal of the project is that you enter a bill, and the code will count to you
the total amount you need to pay after applying discounts.

There are multiple ways to test the code:

1-	Using the Store class, there is a min method that will ask some information about the customer, then it will ask about the bill content. 

You could run the Store class using an IDE or compile it and run it.

2-	I created a Test class called StoreTest, in this class you could implement a function using the same way the other functions in this class are decleared. In each function, you will see that first I created a customer, then I created the bill for the customer, then I used the method I developed.

I used maven in developing this test class, so there are multiple ways to run it. All of them require that you have maven in your pc
The first way is to run the class from the IDE.
The second way is to go to the directory of the project, then run the following command: mvn compile then run the following command mvn clean package. 

By doing the second way, you will see the results of the tests, with each tests describing itself and the result. Also, you will see a coverage report. 
 

In order to build the project from the command line, as I mentioned, you will need maven. Go the project directory and run mvn compile. Running mvn clean package







