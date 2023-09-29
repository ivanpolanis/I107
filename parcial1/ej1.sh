#!/bin/bash
#Suponga que es administrador de un servidor de correo y se le ha encargado un listado con todos los nombres de usuario que poseen cuenta de mail.
#Se sabe que un usuario que tiene cuenta de mail, posee un directorio llamado mailDir en su directorio personal.
#Ademas de tener una cuenta de mail los usuarios del listado deben tener definido a bash como su shell por defecto.
#Para el listado solicitado se debe generar un archivo llamado listado.txt en el /var.

for line in $(cat /etc/passwd); do
  user=$(echo "$line" | cut -d ":" -f 1)
  home=$(echo "$line" | cut -d ":" -f 6)
  shell=$(echo "$line" | cut -d ":" -f 7)

  if [ $(sudo find $home -type d -name mailDir | wc -l) -ge 1 ] && [ "$shell" == "/bin/zsh" ]; then
    echo "$user" >> /var/listado.txt
  fi
done
