#!/bin/bash
#Realice un script que verifique cada 3 minutos si existe el archivo /var/log/any-service/error.log. Si el archivo existe y dentro de el hay al menos una linea con el texto "FATAL ERROR:" debemos comprimir y empaquetar el contenido del directorio /var/log/usr-service, fuardarlo en un directorio que es pasado como parámetro al script y además causar la terminación del script apropiadamente.
#Cuando el script termina debemos informar por la salida estandar la cantidad de lineas del archivo que contenian el texto "FATAL ERROR".

lines=0
file=/var/log/any-service/error.log
while true; do
  if [ -f $file ]; then
    for line in $(cat $file); do
      if [ $(grep "FATAL ERROR" | wc -l) -ne 0 ]; then
        ((lines++))
      fi
    done
    if [ $lines -ne 0 ]; then
      tar -czf parcial.tar.gz /var/log/usr-service
      break
    fi
  fi
  sleep 180
done

echo $lines lineas contenian el string "FATAL ERROR"
