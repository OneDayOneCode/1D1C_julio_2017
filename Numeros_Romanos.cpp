#include <iostream>

using namespace std;

/*
**** Programa que convierte un numero decimal a romano es del 1 al 100
*/


class Numeros_Romanos
{
	private:

		int numero_decimal;
		string unidad[10], decena[10];

		void mensaje_error(int numero) 
		{

				if(numero != 0){ //Se tratan los errores como el limite 100, si es negativo o si esta fuera del limite

					if(numero <= 100){

						string mensaje =  numero == 100 ?  "\nNumero romano :C" : "El numero es negativo, debe ser positivo.";
						cout<<mensaje<<endl;
				
					} else {
								
						cout<<"\nNumero fuera del limite, el limite es  del 1 al 100."<<endl;										
										
					}
	
				} else {
													
					cout<<"El numero es cero, no es admitido debe ser un numero del 1 al 100."<<endl;
				}
		}		
	

	public:

		void obtener_numero_decimal()
		{
			cout<<"<======={Convertidor de numeros decimales a  numeros romanos}=======>\n"<<"Numero:";
			cin>>this->numero_decimal;
		}
	

		void unidades()
		{
			this->unidad[0] = "";
			this->unidad[1] = "I";
			this->unidad[2] =  "II";
			this->unidad[3] =  "III";
			this->unidad[4] =  "IV";
			this->unidad[5] =  "V";
			this->unidad[6] = "VI";
			this->unidad[7] = "VII";
			this->unidad[8] = "VIII";
			this->unidad[9] = "IX";
		}

		void decenas()
		{
			this->decena[0] = "";
			this->decena[1] = "X";
			this->decena[2] =  "XX";
			this->decena[3] =  "XXX";
			this->decena[4] =  "LX";
			this->decena[5] =  "L";
			this->decena[6] = "LX";
			this->decena[7] = "LXX";
			this->decena[8] = "LXXX";
			this->decena[9] = "XC";
		}

		void convertir_a_romano()
		{
			if(this->numero_decimal >= 1 && this->numero_decimal <= 99){ //Uso una estructura de control de flujo para poner un limite en conversiones es 100.
				
				cout<<"\nNumero romano:";

				//Uso del operador ternario: evaluo el numero si el residiuo de el numero decimal/10 es 0 entonces solo se asigna el numero como tal dividio entre 					10. Ejemplo 20/10 = 2 sino solo extraigo la parte entera de la misma 21/10 = 2.1 pero uso (cast) para que de 2

				cout<<this->decena[this->numero_decimal%10 == 0 ? this->numero_decimal/10 : (int) this->numero_decimal/10];			
				cout<<this->unidad[this->numero_decimal >= 0 && this->numero_decimal <= 9 ? this->numero_decimal : this->numero_decimal%10]<<endl; 

				//Uso el operador ternario para decir que si esta en el rango del 1 al 9 entonces solo se asignara como tal si no, ejemplo 21 solo se extrae el 				residuo que es 1.					
			
			} else {

				this->mensaje_error(this->numero_decimal); //Como esta parte solo convierte  a numeros romanos, los mensajes de errores se tratan arriba.

			}
		}
};


int main()
{

	Numeros_Romanos numerosR;
	numerosR.obtener_numero_decimal();
	numerosR.unidades();
	numerosR.decenas();
	numerosR.convertir_a_romano();
}
 
