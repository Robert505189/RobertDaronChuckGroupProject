#The TODO List For our project
#Please append to this file as needed and note when items are completed don't push code that will break other code only push what works with out effecting other parts of the program.

---------------------------------------------------------------------------
getName() <strong>DONE - Robert</strong>
---------------------------------------------------------------------------
getDateTime() <strong>DONE - Robert</strong>
---------------------------------------------------------------------------
getAirFare() TODO: 
will throw number format exception if empty (OTHER TODO item 1 will fix this issue)
Regex contained in NumberTextField.java allows for multiple digits past decimal place ex "75.859999999"

see OTHER TODO Item 1

see OTHER TODO Item 2
---------------------------------------------------------------------------           
getCarFees() TODO:
change input to LABEL TEXT FIELD only REMOVE add Button we will only accept a total for the trip
place in grid pane use code between: //charge frame and //end charge frame in the getMeals()
as a template to create charge frame grid don't use the navbox portion for this method

see OTHER TODO Item 1

see OTHER TODO Item 2
              
---------------------------------------------------------------------------
getHotelRegFees() TODO:
change input to LABEL TEXT FIELD only REMOVE add Button we will only accept a total for the trip
place in grid pane use code between: //charge frame and //end charge frame in the getMeals()
as a template to charge frame grid don't use the navbox portion for this method

see OTHER TODO Item 1

see OTHER TODO Item 2
              
---------------------------------------------------------------------------
getMeals()<strong>DONE - Robert</strong>
           
<strong>OTHER TODO</strong>                

1) We need a global change to all the get methods instead of using  ".setPromptText()" methods
all text fields taking a monetary value should be using ".setText(0.0)" that way in the input
is skipped by the user 00.00 is used automatically this will give a similar effet as the prompt
text ,but also do the job of initialzing our variable with a 00 amount with out the user having to do extra steps.
---------------------------------------------------------------------------
2) Make sure all nextButton.setOnAction calls set member variables and make sure all text fields make use of NumbertTextField.java along with an updated regex to ensure proper number formating
---------------------------------------------------------------------------
3)Remove duplicate commenting
---------------------------------------------------------------------------
4)Create new method for writing and displaying the file as well as performing all calculations and displaying the data. Right now we don't have validated and properly formatted data when this happens the we can perform calculations in the mean time this method can be layed to to: create, open, close the file, display the file the file name should be the value of nameDepartDate"Expenses.txt". The heading and non calculated information can be made with out have the calculated data.
---------------------------------------------------------------------------
5)Start the word doc to document our project at least template information headins etc.. until we are able to put the other information in like pseudo code, uml test data etc
---------------------------------------------------------------------------
6)Change all float vars to double change all Float.parseFloat calls to Double.parseDouble accordingly

