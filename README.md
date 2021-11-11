TinyPDG
=======

A library for building intraprocedural PDGs for Java programs


TinyPDG is a library for building control flow graphs (CFGs) and program dependency graphs (PDGs) from Java source code. It also includes functionality to detect code clones by using the built PDGs. 




**How to run?**

- Command line arguments:

```
-d target directory 
-o output file path 
-s 5(size) 
-t 1(thread number) 
-C on(use control dependency) 
-D on(use date dependency) 
-E on(use execution dependency) 
-M on(merging consecutive similar nodes)
```
