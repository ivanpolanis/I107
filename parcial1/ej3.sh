#!/bin/bash
#Escriba un script que reciba una cantidad desconocida de parámetros al momento de su invocación (debe validar que al menos se reciba uno).
#Cada parámetro representa la ruta absoluta de un archivo o directorio en el sistema. El script deberá iterar por todos los parámetros recibidos, y:
#Si el parámetro es un archivo existente en el File System deberá comprimirlo dejando el archivo en lugar del original.
#Si el parámetro es un directorio existente en el File System:
# Si tiene permiso de Lectura deberá empaquetarlo y comprimirlo.
# Si tiene permiso de escritura deberá eliminarlo junto con todo su contenido.
#Si el parámetro no es un elemento del File System, deberá contarlo e indicar la cantidad total al finalizar el script.

if [ $# -eq 0 ]; then
  exit 1
fi

for i in $@; do

  if [ -e $i ]; then
    if [ -f $i ]; then
      gzip $i
    fi
    if [ -d $i ] && [ -r $i ]; then
      tar -czf empaquetado.tar.gz $i
    elif [ -d $i ] && [ -w $i ]; then
      rm -r $i
    fi
  else
    cant=$(expr $cant + 1)
  fi
done

echo La cantidad de archivos inexistentes es $cant

exit 0
