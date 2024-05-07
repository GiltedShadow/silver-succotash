// CEIS420_Norment_Xavier_Project_pt1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <time.h>
using namespace std;

int main()
{
	double start, stop;
	start = clock();
	for (int i = 0; i < 100; i++)
	{
		cout << " The number is " << i << endl;
	}

	stop = clock();
	
	cin.ignore();

	double startTwo, stopTwo;
	startTwo = clock();
	for (int x = 0; x < 100; x++)
	{
		printf(" The number is %d \n", x);
	}

	stopTwo = clock();

	cout << "It took " << (double(stop - start) / CLOCKS_PER_SEC) << " seconds for cout" << endl;
	cout << "It took " << (double(stopTwo - startTwo) / CLOCKS_PER_SEC) << " seconds for printf" << endl;
	cin.ignore();
}


// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
