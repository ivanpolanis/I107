#!/bin/bash
#Realice un script que implemente a través de la utilización de arreglos las siguientes funciones:
# - insert <elemento>: la funcion insert recibe 1 parámetro (debe validar que asi sea). Agrega al final del arreglo el elemento recibido como parametro.
# - rellenar <n>: esta función intera n veces solicitando al usuario que ingrese un patrón de texto y lo agrega al final del arreglo. Debe validar que se reciba 1 parámetro.
# - select <elemento>: La función select recibe 1 parametro (debe validar que así sea):
#     - Si el parámetro es *, entonces imprimirá todos los elementos del arreglo.
#     - Si el parámetro es distinto a *. debera verificar si en el arreglo existe un elemento que sea igual al parametro. Si existe deberá imprimirlo en pantalla, en caso contrario imprimirá "Elemento no encontrado."
# - delete <elemento>: la funcion de recibe 1 parámetro (debe validar que así sea):
#     - Si el parámetro es *, entonces eliminar todos los elementos del arreglo.
#     - Si el parámetro es distinto a *, deberá verificar si en el arreglo existe un elemento que sea igual al parametro. Si existe deberá eliminarlo, caso contraro imprimira "Elemento no encontrado.".

arr=()

insert() {
  if [ $# -ne 1 ]; then
    return 1
  fi
  arr+=$1
}

rellenar() {
  if [ $# -ne 1 ]; then
    return 1
  fi
  for ((i = 0; i < $1; i++)); do
    read input
    arr+=($input)
  done
}

selectt() {
  if [ $# -ne 1 ]; then
    return 1
  fi

  if [ "$1" == \* ]; then
    echo ${arr[@]}
  else
    for i in ${arr[@]}; do
      if [ $i == $1 ]; then
        echo $i
        return 0
      fi
    done
    echo Elemento no encontrado.
  fi

}

delete() {
  if [ $# -ne 1 ]; then
    return 1
  fi

  if [ "$1" == \* ]; then
    unset arr
  else
    for ((i = 0; i < ${#arr[@]}; i++)); do
      if [ ${arr[$i]} == $1 ]; then
        unset arr[$i]
        return 0
      fi
    done
    echo Elemento no encontrado.
  fi

}

rellenar 2
selectt anashe

delete anashe

selectt \*
