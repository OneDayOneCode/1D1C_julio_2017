#include <iostream>

using namespace std;

/*
**
*** El programa lo que hace es decir cual es tu signo zodiacal en base al dia y mes de nacimiento
**
*/


class Signo_Zodiacal
{
    private:
      int dia, mes;
      string nombre;

    public:

      void obtener_nombre()
      {
          cout<<"Nombre:";
          cin>>this->nombre;
      }

      string getNombre()
      {
          return this->nombre;
      }

      void obtener_dia_de_nacimiento()
      {
          cout<<"Dia de nacimiento:";
          cin>>this->dia;
      }

      void obtener_mes_de_nacimiento()
      {
          cout<<"Mes de nacimiento:";
          cin>>this->mes;
      }

      string signo_zodiacal()
      {
                  // Use un switch case para no tener que anidar tantos if-else, de esta manera evalue los meses posteriormente los dias para decicidr el signo...
          switch (this->mes) {
              case 1:    if(this->dia >= 1 && this->dia <= 31){
                                              // Evaluo el limite
                                    return this->dia >= 20 ? "Acuario." : "Capricornio"; // Use el operador ternario para evaluar los dias y evitar anidar tantos if-else
                         } else {
                                    return "[error] El mes de enero no dispone de esa cantidad de dias"; // En caso de que el dia no tenga ese numero de dias se evalua y se toma como la parte false
                         }
              break;

              case 2:   if(this->dia >= 1 && this->dia <= 28){
                                  return this->dia >= 19 ? "Psicis." : "Acuario.";
                        } else {
                                return "[error] El mes de febrero no dispone de esa cantidad de dias";
                        }
              break;

              case 3:   if(this->dia >= 1 && this->dia <= 31){
                                  return this->dia >= 21 ? "Aries." : "Psicis.";
                        } else {
                                  return "[error] El mes de marzo no dispone de esa cantidad de dias";
                        }
              break;

              case 4:   if(this->dia >= 1 && this->dia <= 30){
                                  return this->dia >= 20 ? "Tauro." : "Aries.";
                        } else {
                                  return "[error] El mes de abril no dispone de esa cantidad de dias";
                        }
              break;

              case 5:   if(this->dia >= 1 && this->dia <= 31){
                                  return this->dia >= 21 ?  "Geminis." : "Tauro.";
                        } else {
                                  return "[error] El mes de mayo no dispone de esa cantidad de dias";
                        }
              break;

              case 6:   if(this->dia >= 1 && this->dia <= 30){
                                  return this->dia >= 21 ? "Cancer." : "Geminis.";
                        } else {
                                 return "[error] El mes de junio no dispone de esa cantidad de dias";
                        }
              break;

              case 7:   if(this->dia >= 1 && this-> dia <= 31){
                                    return this->dia >= 23 ? "Leo." : "Cancer.";
                        } else {
                                    return "[error] El mes de julio no dispone de esa cantidad de dias";
                        }
              break;

              case 8:   if(this->dia >= 1 && this->dia <= 31){
                                    return this->dia >= 23 ? "Virgo." : "Leo.";
                        } else {
                                  return "[error] El mes de agosto no dispone de esa cantidad de dias";
                        }
              break;

              case 9:  if(this->dia >= 1 && this->dia <= 30){
                                    return this->dia >= 23 ? "Libra." : "Virgo.";
                        } else {
                                    return "[error] El mes de septiembre no dispone de esa cantidad de dias";
                        }
              break;

              case 10:  if(this->dia >= 1 && this->dia <= 31){
                                      return this->dia >= 23 ? "Escorpio." : "Libra.";
                        } else {
                                      return "[error] El mes de octubre no dispone de esa cantidad de dias";
                        }
              break;

              case 11:  if(this->dia >= 1 && this->dia <= 30){
                                      return this->dia >= 22 ? "Sagitario." : "Escorpio.";
                        } else {
                                      return "[error] El mes de noviembre no dispone de esa cantidad de dias";
                        }
              break;

              case 12:  if(this->dia >= 1 && this->dia <= 31){
                                    return this->dia >= 22 ? "Capricornio." : "Sagitario.";
                        } else {
                                  return "[error] El mes de dicimebre no dispone de esa cantidad de dias";
                        }
              break;

              default:  return "[error] Mes no valido";
              break;
          }
      }

};

int main()
{
    Signo_Zodiacal signo;

    cout<<"Se debe tener encuenta que el mes de nacimiento debe ser numerico.\nEmpezemos ... "<<endl;

    signo.obtener_nombre();
    signo.obtener_dia_de_nacimiento();
    signo.obtener_mes_de_nacimiento();

    cout<<"\n\nNombre:"<<signo.getNombre()<<"\nSigno Zodiacal:"<<signo.signo_zodiacal();
}
