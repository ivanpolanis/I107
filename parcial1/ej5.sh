#!/bin/bash
#Escribir un script de Bash que reciba un nombre de usuario como parámetro. Sie l usuario ingresado como parámetro NO es un usuario del sistema el script debe finalizar con el código de error 1. En caso contrario, debe verificar cada 30 segundos si el susuario esta logueado.
#Al detectar que está logueado debe registrar un archivo llamado access-<USERNAME>.log el nombre del usuario junto con la feche en que se lo detectó. No debe borrar el contenido previo de este archivo y este archivo debe escribirlo en una ubicación apropiada del file system. Al detectar 30 veces que el usuario está logueado el script debe finalizar con el código de error 0.

if [ $# -lt 1 ]; then
  exit 1
fi

if [ $(cat /etc/passwd | cut -d ":" -f 1 | grep -w $1 | wc -l) -eq 0 ]; then
  exit 1
fi

i=0
while [ $i -lt 30 ]; do
  if [ $(who | grep -w $1 | wc -l) -gt 0 ]; then
    ((i++))
    echo $1 - $(date) >> /var/log/access-$1.log
  fi
  sleep 30
done

exit 0
