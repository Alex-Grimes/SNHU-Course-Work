#include <iostream>

#include "printReport.h"
using namespace std;

int main() {

	PrintReport Report = PrintReport();
	try {
		Report.getInput();
		if (Report.checkInput() == false) {

			cout << "Invalid Entry, must be a positive number, please restart." << endl;
			return 0;
		}
		Report.displayInput();

		Report.displayPrintReport(false);
		Report.displayPrintReport(true);
	} catch (const exception &e) {
		cout << "Error: Invalid Entry, please restart." << endl;
	}
	return 0;
}
