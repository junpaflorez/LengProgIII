# Taller 2 - Programación Avanzada

> **Nota:** Es necesario tener claros los conocimientos de POO. Lee con cuidado y sigue las instrucciones para obtener un producto final completo.

## Objetivo

Crear una calculadora con mascota usando tres clases principales: `Menu`, `Mascota` y `Calculadora`.

---
---

## Clases y Responsabilidades

### 1. Menu (2.0)
Se encarga de llamar las funciones, y de tener el main de la aplicacion, esta clase es un equivalente al master del taller.

- `menu()`: Ciclo principal con las siguientes opciones:  (1.6)
    
    - `Saludo mascota`:  Llama a `saludo()` de Mascota  (0.2)
    - `Baile mascota`:  Llama a `baile()` de Mascota  (0.18)
    - `Suma`:  Recibe dos números, llama a `suma()` de Calculadora y muestra resultado  (0.18)
    - `Resta`:  Recibe dos números, llama a `resta()` de Calculadora y muestra resultado  (0.18)
    - `Multiplicación`:  Recibe dos números, llama a `multiplicacion()` y muestra resultado  (0.18)
    - `División`:  Recibe dos números, llama a `division()` y muestra resultado  (0.18)
    - `Salir`:  Finaliza el programa  (0.18)
    - `Opción inválida`:  Llama a `error()` de Mascota  (0.14)

- `error()`: Identifica errores en la selección del menú y llama a la función `error()` de Mascota.  (0.4)

---
### 2. Mascota (1.0)

Representa la mascota y muestra mensajes en pantalla.

**Funciones principales:**

- `saludo()`: Muestra un mensaje de saludo.  (0.25)
- `baile()`: Muestra un mensaje que representa el baile.  (0.25)
- `error()`: Muestra el mensaje "parece que seleccionaste una opción inválida".  (0.25)
- `DarResultado(double resultado)`: Muestra el resultado de las operaciones.  (0.25)

---

### 3. Calculadora (2.0)

Realiza las operaciones matemáticas.

**Funciones principales:**

- `suma(double a, double b)`: Devuelve la suma.  (0.5)
- `resta(double a, double b)`: Devuelve la resta.  (0.5)
- `multiplicacion(double a, double b)`: Devuelve la multiplicación.  (0.5)
- `division(double a, double b)`: Devuelve la división (validar que b ≠ 0).  (0.5)

---

## Recomendaciones

- Organiza tu código en archivos separados por clase.
- Valida las entradas del usuario.
- Usa comentarios para explicar partes importantes del código.

---
## Mascotas sugeridas

A continuación, puedes elegir una mascota para tu proyecto. Cada una tiene una personalidad y un mensaje especial:

---

### 🦉 Búho

Inteligente y muy hablador.

```
 ___
{o,o}  
/)  )  Si quieres ser sofisticado y claro, usame, no hay nadie mejor.
 " " 

```
`String`: " ___\n{o,o}\n/)  )"+ "   Respuesta" +"\n \" \" "

### 🐦 Gorrión

Pequeño, respondón y de mal carácter.
```
 ,_,  
(.,.) 
(   )  Rapido!!!, elijeme y sabras que es guiar a un usuario
 " "
```
---
`String`: " ,_,\n(.,.)\n(   )"+ "   Respuesta"+ "\n \" \" "

### 🐶 Perro

Fiel, juguetón y muy amigable.
```
 /^ ^\  
/ 0 0 \ 
V\ Y /V 
 / - \   Solo recuerda una cosa... El mejor amigo del hombre!!! 
 |    \ 
 || (__V
```
`String`: " /^ ^\\\n/ 0 0 \\\nV\\ Y /V\n / - \\"+ "   respuesta" +"\n |    \\\n || (__V"

### 🐮 Vaca

Famosa, sabe hablar con los usuarios.
```
       (__)     
\------(oo)     
 ||    (__)  Soy la vaca lola, tengo canciones a mi nombre, que mas quieres?
 ||w--||
```
`String`: "       (__)\n\\------(oo)\n ||    (__)"+"   respuesta"+"\n ||w--||"

### 🐰 Conejo

Fuerte, poderoso y esponjoso.
```
( \_/ )
(=o.o=)  conmigo encontraras el camino de la excelencia muchach@, ademas recuerda.... Soy batman!
("")_("")
```
`String`: "( \\_/ )\n(=o.o=)" + "   respuesta" + "\n(\"\")_(\"\")"