#!/bin/bash

if [ $# -lt 2 ]; then
  exit 1
fi

if [ ! -f /var/log/access.$1.log ]; then
  echo "El archivo no existe"
  exit 2
fi

arr=($@)
unset arr[0]
arr=(${arr[@]})
count=()

for ip in ${arr[@]}; do
  count+=(0)
done

IFS=$'\n'
for line in $(cat /var/log/access.$1.log); do
  for ((i = 0; i < ${#arr[@]}; i++)); do
    echo $i
    if [ $(echo $line | grep -w ${arr[$i]} | wc -l) -eq 1 ]; then
      count[i]=$(expr ${count[i]} + 1)
      break
    fi
  done
done

for ((i = 0; i < ${#arr[@]}; i++)); do
  echo ${arr[$i]}:${count[$i]}
done
