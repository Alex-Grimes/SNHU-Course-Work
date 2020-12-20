/*
 * Banking app.cpp
 *
 *  Date: 11/29/20
 *  Author: Alexander Grimes
 */
#ifndef PRINTREPORT_H_
#define PRINTREPORT_H_

class PrintReport {
public:
	PrintReport(); // default constructor
	PrintReport(double t_initialInvestment, double t_monthlyDeposit,
			double t_annualInterest, int t_numYears); 
	virtual ~PrintReport();

	void displayPrintReport(bool additionalDeposits);
	void getInput(); 
	void displayInput(); 
	bool checkInput(); 

private:
	double initialInvestment; 
	double monthlyDeposit; 
	double annualInterest; 
	int numYears; 
};

#endif /* PRINTREPORT_H_ */
