# JavaMenuManager
Creator: Ben Mighall

This code is essentially practice with aggregation, where the code processes and outputs data from five hard-coded restaurants with ten entrees each. The code sorts the entrees in each given restaurant by cost, and outputs the entrees at each restaurant that are lower than $10 in price.

Entree is a simple base class with setters, getters, two constructors and a toString. 
Restaurant and Location are intermediate classes where most of the actual work occurs: sorting, average cost calculation, and price filtering; Restaurant has an ArrayList of Entree objects, and Location has an ArrayList of Restaurant objects. 
Driver is another rather simple class with an instance of Location, the hard-coded restaurant/entree data and operation method calls.
Output.txt is a copy of the text output from the console upon running the program.

This code was written as part of coursework for University of Mississippi class CSCI 112 (Computer Science II). 
