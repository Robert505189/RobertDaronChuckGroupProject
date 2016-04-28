##The TODO List For our project##
##Please append to this file as needed and note when items are completed don't push code that will break other code only push what works with out effecting other parts of the program. The project is nearly done I submited major additions / changes about 0530 this morning  4/28 please see this current to do list to finish.
               
***


##HIGH PRIORITY TO ENSURE PROPER CALCS
1. <strong>*Make sure all nextButton.setOnAction calls set member variables and make sure all text fields make use of NumberTextField.java along with an updated regex to ensure proper number formating*</strong> most methods should do this except maybe the getcarFees() and getHotelRegFees() as I changed these to fit the getMeals() Plese double check each method except the getMeals() as this works how it should and was a major pain to make so please don't change this. Also please make sure all NumberTextField.java Text Fields use .setText("0.00") not .setPrompt() that way if the user wants to skip the input box the 0.00 value is already there with it us having to add it programtically see getAirfare() as an example.


***
####LOW PRIORITY
2. Remove duplicate commenting


***
##HIGH PRIORITY
3. Start the word doc to document our project the program is complete enough pseudo can be started


***
##HIGH PRIORITY
4. TEST TEST TEST!!!! still throws the ocassional error, the calculations are done in write file method and were a major pain to write I think they are done correctly but until the FIRST TODO ITEM IS COMPLETE THESE CALCS MAY NOT WORK PROPERLY

***
##MEDIUM PRIORITY
5. Update the regex to only accept two digits paste the decimal ex. 79.99999 is not valid should only be 79.99



