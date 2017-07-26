#include <iostream>
using namespace std;

int main()
{
	int a;
	int b;
	char oper;
	
	cout << "Digite la operacion a realizar sin espacios:\n\nOperacion:";
	cin >> a >> oper >> b;
	
	switch(oper)
	{
		case '+':
				 cout << a << "+" << b << "=" << (a + b) << endl;
		break;
		
		case '-':
				cout << a << "-" << b << "=" << (a - b) << endl;
		break;
	
		case '*':
				cout << a << "*" << b << "=" << (a * b) << endl;
		break;
	
		case '/':
				cout << a << "/" << b << "=" << (a / b) << endl;
		break;
	
		default:
				cout << "La operacion no existe" << endl;
		break;
	}
}
