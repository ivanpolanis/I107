#!/bin/bash
#Escribir un script de Bash que agregue a un arreglo los nombres de los archivos del directorio /var/log que tengan el texto "access" en su nombre y los agregue a un arreglo. Luego implemente las siguientes funciones sobre ese arreglo:
# cantidad: imprime la cantidad de archivos del directorio /var/log que tengan el texto access en su nombre.
# listar: imprime los nombres de todos los archivos del directorio /var/log que tengan el texto "access" en su nombre
# eliminar: recibe como primer parámetro un indice del arreglo y como segundo parámetro la cadena "lógico" o "físico". Si el segundo parámetro es "lógico", solo borra la entrada en el arreglo, si es "físico" borra la entrada en el arreglo y en el FileSystem.

arr=($(ls /var/log | grep access))

cantidad() {
  echo ${#arr[@]}
}

listar() {
  echo ${arr[@]}
}

eliminar() {
  if [ $1 -gt ${#arr[@]} ]; then
    exit 1
  fi
  if [ $2 == "fisico" ]; then
    rm /var/log/${arr[$1]}
    unset arr[$1]
  elif [ $2 == "logico "]; then
    unset arr[$1]
  fi
}

listar

eliminar 1 fisico

listar
echo $(ls /var/log | grep access)
