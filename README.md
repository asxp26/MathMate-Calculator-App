# Project Description

Calculator application implemented in Java using the Swing library for creating the graphical user interface (GUI). It extends the JFrame class and implements the ActionListener interface to handle button click events.

The calculator GUI consists of a text field for displaying the numbers and results, and various buttons for numeric input, arithmetic operations, and other functionalities like clearing, calculating percentages, square roots, trigonometric functions, etc.

The main logic of the calculator is implemented in the actionPerformed method, where the appropriate action is performed based on the button that was clicked. The calculator keeps track of the numbers entered (num1 and num2), the current operator (operator), and the result of the calculation (result).

The main method creates an instance of the CalculatorApp class and makes the GUI visible.

----------------------------------------------------------------------------------------------------------------------------------------

- The code begins with importing necessary packages and classes from the Java AWT and Swing libraries.
- The CalculatorApp class is declared, which extends the JFrame class and implements the ActionListener interface. This means the class can handle GUI events and has access to GUI components.
- The class declares private instance variables including text fields, buttons, and variables to store numbers, operators, and results.
- The constructor method CalculatorApp() is defined. It initializes the GUI components, sets up the layout, and configures event listeners for buttons.
- The actionPerformed() method is implemented to handle button click events. It checks the action command of the button that triggered the event and performs the corresponding action.
- The main logic of the calculator is implemented in the actionPerformed() method. It handles functionalities such as clearing the calculator, calculating percentages, square roots, and trigonometric functions. It also handles numeric input, decimal point input, and arithmetic operations like addition, subtraction, multiplication, and division. The result is displayed in the text field.
- The main() method creates an instance of the CalculatorApp class, making the calculator GUI visible.

----------------------------------------------------------------------------------------------------------------------------------------

Overall, this is a calculator application with basic arithmetic operations and additional functionalities such as percentage calculation, square root, and trigonometric functions. It provides a basic framework for a calculator GUI and handles user input to perform calculations and display the results.
