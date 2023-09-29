#!/bin/bash
#Realice un script que agregue todos los nombres de usuario del sistema a un arreglo e implemente las siguiente funciones:
# - existe <parametro1>: devuelve 0 si el usuario existe en el arreglo, 1 en caso contrario.
# - eliminar_usuario <parametro1>: si el usuario pasado como parámetro existe en el arreglo lo elimina del mismo. Caso contrario devuelve codigo de error 2.
# - usuarios_con_patron <parametro1>: recorre el arreglo e imprime en pantalla los nombres de los usuarios en cuyos caracteres aparece el patrón pasado como parámetro.
# - cantidad: imprime la cantidad totald e usuarios en el arreglo.
# - usuarios: imprime todos los nombres de los usuarios que estan en el arreglo.

arr=($(cat /etc/passwd | cut -d ":" -f 1))

existe() {
  for i in ${arr[@]}; do
    if [ $i == $1 ]; then
      return 0
    fi
  done
  return 1
}

eliminar_usuario() {
  for ((i = 0; i < ${#arr[@]}; i++)); do
    if [ $1 == "${arr[$i]}" ]; then
      unset arr[$i]
    fi
  done
}

usuarios_con_patron() {
  for i in ${arr[@]}; do
    if [ $(echo $i | grep $1 | wc -l) -eq 1 ]; then
      echo $i
    fi
  done
}

cantidad() {
  echo ${#arr[@]}
}

usuarios() {
  echo ${arr[@]}
}

usuarios_con_patron i

cantidad
usuarios
