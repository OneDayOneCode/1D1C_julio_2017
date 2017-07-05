#include <iostream>

/*
**
*** Este programa esta escrito C++ lo que hace es una simple suma
**
*/

using namespace std;

class Suma //Se define la clase
{

	private: 

		int numero_1, numero_2;

	public:

		void obtener_numero_1() //Metodo para obtener el numero 1
		{
			std::cout<<"Numero 1:";
			std::cin>>this->numero_1;
		}

		void obtener_numero_2() //Metodo para obtener el numero 2
		{
			std::cout<<"Numero 2:";
			std::cin>>this->numero_2;
		}

		int obtener_suma() //Metodo para obtener la suma numero 
		{
			return this->numero_1 + this->numero_2; //Se retorna la suma
		}

};


int main() //Metodo principal
{
	Suma numero; //Se declara el objeto
	numero.obtener_numero_1();
	numero.obtener_numero_2();
	
	cout<<"El resultado de la suma es:"<<numero.obtener_suma()<<endl;
}
