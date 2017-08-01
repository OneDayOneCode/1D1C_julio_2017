#include <iostream>
using namespace std;

/*
 *  Pequeño ejemplo de una edad menor usando
 *  punteros.
 */

int main ()
{
   int edades[5], edadMenor (int *a, int nPersonas);

   cout << "Digite 5 edades con espacios\nEdades:";
   
   for(int i = 0; i < 5; i++) cin >> edades[i];

   cout << "La edad menor es " << edadMenor (edades, 5) << endl;

}

int edadMenor (int *a, int nPersonas)
{
    int menor;
    menor =* a;

    for(int i = 0; i < nPersonas; i++) if (*(a + i) < menor)
        menor =* (a + i);
    return menor;
}
