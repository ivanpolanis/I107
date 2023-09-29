#!/bin/bash

municipios=()

archivo=/home/ivan/municipios.txt
if [ ! -f $archivo ]; then
  echo El archivo no existe.
  exit 1
fi

existeMunicipio() {
  if [ $(echo ${municipios[@]} | grep -w $1 | wc -l) -eq 0 ]; then
    return 0
  fi
  return 1
}

agregarMunicipio() {
  if [ $# -ne 1 ]; then
    echo Es necesario enviar el nombre del municipio.
    exit 1
  fi
  existeMunicipio $1
  if [ $? -eq 0 ]; then
    municipios+=($1)
  fi
}

listarMunicipio() {
  for i in ${municipios[@]}; do
    echo $i
  done
}

cantidadMunicipio() {
  echo ${#municipios[@]}
}

municipioMasPoblado() {
  poblacion=0
  mun=""
  IFSOLD=$IFS
  IFS=$'\n'
  for i in $(cat $archivo); do
    actMun=$(echo $i | cut -d " " -f 1)
    actPob=$(echo $i | cut -d " " -f 2)
    if [ $actPob -gt $poblacion ]; then
      poblacion=$actPob
      mun=$actMun
    fi
  done
  IFS=$IFSOLD
  echo El municipio más poblado es $mun con una poblacion de $poblacion.
}

for i in $(cat $archivo | cut -d " " -f 1); do
  agregarMunicipio $i
done

while true; do
  select option in listar cantidad poblado salir; do
    case $option in
      listar)
        listarMunicipio
        ;;
      cantidad)
        cantidadMunicipio
        ;;
      poblado)
        municipioMasPoblado
        ;;
      salir)
        exit 0
        ;;
      *)
        echo Opcion no valida
        ;;
    esac
  done
done
