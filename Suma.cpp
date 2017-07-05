#include <iostream>

using namespace std;

/*
**
*** Este programa esta escrito C++ lo que hace es una simple suma
**
*/

class Suma //Se define la clase
{

	private: 

		int numero_1, numero_2;

	public:

		void obtener_numero_1() //Se obtiene el numero 1
		{
			std::cout<<"Numero 1:";
			std::cin>>this->numero_1;
		}

		void obtener_numero_2() //Se obtiene el numero 2
		{
			std::cout<<"Numero 2:";
			std::cin>>this->numero_2;
		}

		int obtener_suma() //Se obtiene el resultado de la suma 
		{
			return this->numero_1 + this->numero_2; //Se regresa,el resultado de la suma
		}

};


int main()
{
	Suma numero; //Se declara el objeto
	numero.obtener_numero_1();
	numero.obtener_numero_2();
	
	cout<<"El resultado de la suma es:"<<numero.obtener_suma()<<endl;
}
