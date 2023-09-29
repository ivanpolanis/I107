#!/bin/bash
#Se desea saber el uso del consumo de recursos del sistema por parte de los usuarios. Desarrolle un script que se correrá ingresando como argumento los nombre de los usuarios de los cuales se necesita obtener dicha información, no se sabe cuántos son con anticipación.
#Para la realización del script debe definir las siguientes funciones:
#esta_logueado(): devuelve true si el usuario pasado como argumento está logueado.
#cant_procesos(): devuelve la cantidad de procesos que está corriendo un usuario.
#uso_de_procesos(): devuelve true si el usuario pasado como argumento, usando la función cant_procesos, está corriendo más de 100 procesos.
#Utilizando la funcionalidad anterior, el script debe guardar en un archivo de log, en una ubicación apropiada del file system, el nombre de los usuarios que estén corriendo más de 100 procesos junto con la fecha de ejecución del script.

if [ $# -eq 0 ]; then
  echo Se debe pasar al menos un usuario como argumento
  exit 1
fi

esta_logueado() {
  if [ $(who | grep -w $1 | wc -l) -ne 0 ]; then
    return 1
  fi
  return 0
}

cant_procesos() {
  esta_logueado $1
  if [ $? -eq 1 ]; then
    return $(ps -aux | grep -w $1 | wc -l)
  fi
  return 0
}

uso_de_procesos() {
  cant_procesos $1
  if [ $? -ge 100 ]; then
    return 1
  fi
  return 0
}

echo $(date) >> /var/reporte.txt
for user in "$@"; do
  uso_de_procesos $user
  if [ $? -eq 1 ]; then
    echo $1 >> /var/reporte.txt
  fi
done
cat /var/reporte.txt
