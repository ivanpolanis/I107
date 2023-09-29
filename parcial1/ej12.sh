#!/bin/bash

if [ $# -lt 2 ]; then
  echo Numero de parametros insuficientes.
  exit 1
fi

direc=$1

if [ ! -d $direc ]; then
  echo El directorio $direc no existe.
  exit 2
fi

arr=($@)
unset arr[0]
arr=${arr[@]}

for i in ${arr[@]}; do
  archivo="$direc/$i"
  if [ -e $archivo ]; then
    if [ -f $archivo ]; then
      if [ -r $archivo ]; then
        echo Usted posee permiso de lectura sobre el archivo $i.
      else
        echo Usted no posee permiso de lectura sobre el archivo $i.
      fi
      continue
    else
      if [ -w $archivo ]; then
        echo Usted posee permiso de escritura sobre el directorio $i.
      else
        echo Usted no posee permiso de escritura sobre el directorio $i.
      fi
      continue
    fi
  fi
done
