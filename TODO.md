#The TODO List For our project
#Please append to this file as needed and note when items are completed don't push code that will break other code only push what works with out effecting other parts of the program.


getName() <strong>done - Robert</strong>

getDateTime() <strong>done - Robert</strong>

getAirFare() TODO: 
will throw number format exception if empty (OTHER TODO item 1 will fix this issue)
Regex contained in NumberTextField.java allows for multiple digits past decimal place ex "75.859999999"

see OTHER TODO Item 1

see OTHER TODO Item 2
            
getCarFees() TODO:
Text Fields, buttons, and labels need to be placed in to a grid frame for proper
alignment see the getMeals method code between: //charge frame and //end charge frame
use this as a template to create the grid frame don't use the navbox portion this method

see OTHER TODO Item 1

see OTHER TODO Item 2
              

getHotelRegFees() TODO:
Text Fields, buttons, and labels need to be placed in to a grid frame for proper
alignment see the getMeals method code between: //charge frame and //end charge frame
use this as a template to create the grid frame don't use the navbox portion this method

see OTHER TODO Item 1

see OTHER TODO Item 2
              

getMeals() TODO ---> This is Robert's problem don't Touch
           
<strong>OTHER TODO</strong>                

1) We need a global change to all the get methods instead of using  ".setPromptText()" methods
 all text fields taking a monetary value should be using ".setText(00.00)" that way in the input
is skipped by the user 00.00 is used automatically this will give a similar effet as the prompt
text ,but also do the job of initialzing our variable with a 00 amount with out the user having to do
extra steps.

2) Make sure all nextButton.setOnAction calls set variables and make sure all text fields make use of NumbertTextField.java
  along with an updated regex to ensure proper number formating

3)Remove duplicate commenting

4)Create new method for writing and displaying the file as well as performing all calculations and displaying the data. Right now we don't have validated and properly formatted data when this happens the we can perform calculations in the mean time this method can be layed to to: create, open, close the file, display the file the file name should be the value of nameDepartDate"Expenses.txt". The heading and non calculated information can be made with out have the calculated data.

5)Start the word doc to document our project at least template information headins etc.. until we are able to put the other information in like pseudo code, uml test data etc

