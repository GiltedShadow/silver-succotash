// CEIS420_Norment_Xavier_Project_pt1.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

/* Snapshot of beginning code that had a memory leak
* 
#define _CRTDBG_MAP_ALLOC
#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <crtdbg.h>
#include <string>
void memLeak()
{
	int *p = new int;
	char * string1 = new char[20];
	char * string2 = new char[25];
	strcpy(string1, "Sheldon");
	string2 = string1;
	delete p;
}
int main(int argc, char* argv[])
{
	memLeak();
	_CrtDumpMemoryLeaks();
	return 0;
}

* 
*/
#define _CRTDBG_MAP_ALLOC
#define _CRT_SECURE_NO_WARNINGS
#include <stdlib.h>
#include <crtdbg.h>
#include <string>
void memLeak()
{
	int* p = new int;
	char* string1 = new char[20];
	char* string2 = new char[25];
	strcpy(string1, "Sheldon");
	strcpy(string2, string1);
	delete p;
	delete[] string1;
	delete[] string2;
	

}
int main(int argc, char* argv[])
{
	memLeak();
	_CrtDumpMemoryLeaks();
	return 0;
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
