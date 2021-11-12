#!/bin/bash

rm -rf output && mkdir output
for file in `find . -name "*.dot" -type f`; do
    echo "dot file: $file"
    dot -Tpng $file -o output/$file.png
done
