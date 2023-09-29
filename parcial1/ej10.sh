#!/bin/bash
#Realiza un script de Bash que almacene en un arreglo los nombres de todos los usuarios del sistema que tengan un patrón, que se recibe como parámetro del script, en su nombre de usuario. Una vez almacenados, deberá presentar al usuario un menú que le permita realizar las siguientes operaciones sobre la lista obtenida:
# - listar: lista en la salida estandar, de a uno por linea, los nombres de usuarios que se encuentran actualmente en el arreglo.
# - eliminar: presenta la lista de usuarios con sus indices y luego le pide al usuario que indique el índice del elemento que desee eliminar del arreglo.
# - contar: presenta en la salida estándar la cantidad de elementos que actualmente tiene el arreglo.

if [ $# -eq 0 ]; then
  echo Se debe pasar el patron como parametro.
  exit 1
fi

arr=($(cat /etc/passwd | cut -d ":" -f 1 | grep $1))

listar() {
  for i in ${arr[@]}; do
    echo $i
  done
}

eliminar() {
  for ((i = 0; i < ${#arr[@]}; i++)); do
    echo [$i] ${arr[$i]}
  done
  echo Ingrese el indice del elemento a borrar:
  read indice
  if [ $indice -lt 0 ] || [ $indice -ge ${#arr[@]} ]; then
    echo Indice fuera de rango.
    return 1
  fi
  unset arr[$indice]
  arr=(${arr[@]})
}

contar() {
  echo ${#arr[@]}
}

while true; do
  select i in listar eliminar contar salir; do
    case $i in
      listar)
        listar
        ;;
      eliminar)
        eliminar
        ;;
      contar)
        contar
        ;;
      salir)
        exit 0
        ;;
    esac
  done
done
