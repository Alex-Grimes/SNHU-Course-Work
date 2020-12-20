/*
 * Banking app.cpp
 *
 *  Date: 11/29/20
 *  Author: Alexander Grimes
 */
#include "printReport.h"
#include <iostream>
using namespace std;

PrintReport::PrintReport() {

	initialInvestment = 0; // initialize all values to 0.
	monthlyDeposit = 0;
	annualInterest = 0;
	numYears = 0;
}


PrintReport::PrintReport(double t_initialInvestment,
		double t_monthlyDeposit, double t_annualInterest, int t_numYears) {
	initialInvestment = t_initialInvestment;
	monthlyDeposit = t_monthlyDeposit;
	annualInterest = t_annualInterest;
	numYears = t_numYears;
}

PrintReport::~PrintReport() {
	// Auto-generated destructor stub
}


void PrintReport::getInput() { // Prompt user for input values
	cout << "Please Enter your Initial Investment Amount: " << endl;
	cin >> initialInvestment;
	cout << "Please Enter your Monthly Deposit: " << endl;
	cin >> monthlyDeposit;
	cout << "Please Enter the Annual Interest: " << endl;
	cin >> annualInterest;
	cout << "Please Enter the Number of years: " << endl;
	cin >> numYears;
	cout << "Press any key to continue..." << endl;
	system("pause");
}

bool PrintReport::checkInput() {
	if (initialInvestment < 0 || monthlyDeposit < 0 || annualInterest < 0) {
		return false; // no negative values allowed
	}
	if (numYears <= 0) {
		return false; // numYears must be greater than 0.
	}
	return true;
}


void PrintReport::displayInput() {
	cout << "Initial Investment Amount: $" << initialInvestment << endl;
	cout << "Monthly Deposit: $" << monthlyDeposit << endl;
	cout << "Annual Interest: " << annualInterest << "%" << endl;
	cout << "Number of years: " << numYears << endl;
}


void PrintReport::displayPrintReport(bool t_additionalDeposits) {
	double additionalDeposit = monthlyDeposit;
	if (t_additionalDeposits == false) {
		
		additionalDeposit = 0;
		cout << "=========================================================" << endl;
		cout << "Balance and Interest Without Additional Monthly Deposits"
				<< endl;
	} else {
		// yes additional deposits
		cout << "=========================================================" << endl;
		cout << " Balance and Interest With Additional Monthly Deposits"
				<< endl;
	}

	int monthsRemaining = numYears * 12;
	int month = 1;
	double openingAmount = initialInvestment;
	double depositedAmount = additionalDeposit;
	double total = openingAmount + depositedAmount;
	double interest = total * ((annualInterest / 100.0) / 12.0);
	double closingBalance = total + interest;
	double lastYearBalance = openingAmount;
	double yearEndEarnedInterest;

	cout << "=========================================================" << endl;
	cout << " Year\tYear End Balance\tYear End Earned Interest" << endl;
	cout << "---------------------------------------------------------" << endl;
	
	while (monthsRemaining > 0) {
		if (month % 12 == 0) {
			yearEndEarnedInterest = (closingBalance - lastYearBalance
					- (depositedAmount * 12));
			printf("%d\t$%*.2f%\t\t$%*.2f\n", month / 12, 9, closingBalance, 9,
					yearEndEarnedInterest);
			lastYearBalance = closingBalance;
		}
		
		monthsRemaining -= 1; // increment/decrement month counters
		month += 1;

		
		openingAmount = closingBalance;
		total = openingAmount + depositedAmount;
		interest = total * ((annualInterest / 100.0) / 12.0);
		closingBalance = total + interest;
	}
}
