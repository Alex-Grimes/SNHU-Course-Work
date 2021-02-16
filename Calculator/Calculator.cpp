/*
 * Calculator.cpp
 *
 *  Date: 11/9/20
 *  Author: Alexander Grimes 
 */
#include <ostream>
#include <iostream>
#include <string>
using namespace std; // added namespace to allow the use of cout and cin

int main(){         // corrected main to return a int not void

	char statement[100];
	int op1, op2;
	char operation;
	char answer = ('y');

	while (answer== 'y' || answer == 'Y') // added or statment to allow for uppercase entry need to find way to incorporate tolower instead
	{
		cout << "Enter expression" <<endl;
		cin >> op1 >> operation >> op2; // corrected the order or entrys
		if (operation == '+'){ // brackets missing on every if statement
			cout << op1 << " + " << op2 << " = " << op1 + op2 << endl;
		}
		if (operation == '-'){
			cout << op1 << " - " << op2 << " = " << op1 - op2 << endl; // added the missing semicolons
		}
		if (operation == '*'){
			cout << op1 << " * " << op2 << " = " << op1 * op2 << endl; // corrected output to represent multiplication and not division
		}
		if (operation == '/'){
			cout << op1 << " / " << op2 << " = " << op1 / op2 << endl; // corrected output to represent division and not multipicatioon
		}

		cout << "Do you wish to evaluate another expression? " << endl;
		cin >> answer; // added tolower to make the response always be lower case

		if (answer == 'n' || 'N') { // if statment to allow the program to complete

						cout << "Program Finished." << endl;
		}
	}
}







