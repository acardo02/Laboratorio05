# Laboratorio05

## Preguntas 

### Pregunta 1
### ¿Qué diferencia existe entre navegar dentro de la aplicación utilizando Navigation Component o hacer uso de intents?

Navigation es declarativo, mientras que intents es imperativo. Navigation puede ser más conveniente y eficiente para aplicaciones grandes,
mientras que intents puede ser mejor para una interacción mas directa.

### Pregunta 2
### Menciona los componentes fundamentales de Navigation Component
NavController, NavGraph, NavHost.

### Pregunta 3
### Mencione algunas de las ventajas del Navigation Graph

Estructura organizada, Manejo automatico del back stack, Mejora de rendimiento .

# Laboratorio 06
## Preguntas

### Pregunta 1
### ¿En qué consiste el patrón de diseño Repository?

Es un patrón de diseño que aísla la capa de datos del resto de la aplicación.


### Pregunta 2
### ¿Qué es el ViewModel?

Es una lógica empresarial o un contenedor de estado a nivel de pantalla que expone el estado a la IU y
encapsula la lógica empresarial relacionada.


# Laboratorio 07
## Preguntas

### Pregunta 1
### ¿Qué ventajas tiene el utilizar LiveData?

Garantiza que la IU coincida con el estado de los datos, sin fugas de memoria, datos siempre actualizados.

### Pregunta 2
### ¿Qué patrón de diseño utiliza LiveData?

El patron observer.

### Pregunta 3
### Menciona que se debe agregar al Gradle para poder implementar DataBinding

Habilitar el databinding con
dataBinding {
    enabled: true
}

### Pregunta 4
### ¿Qué es DataBinding? Menciona sus ventajas frente a findViewById

Es una función de Android que permite vincular los elementos de la interfaz de usuario (UI)
de una aplicación directamente a los datos de la aplicación.

ventajas: se ahorra lineas de codigo porque no necesitas declarar los views, los errores ocurren en tiempo de compilacion,
si ocurre un error se sabe antes de ejecutar la app. 

# Laboratorio 08
## Preguntas 

### Pregunta 1
### ¿Cuál es la principal ventaja de utilizar Recycler View?

Su capacidad para manejar grandes conjuntos de datos de manera eficiente.

### Pregunta 2
### Menciona los componentes de RecyclerView y la función que tiene cada uno de ellos

List Item: Este archivo de diseño define la estructura visual y los elementos de diseño de la
vista de cada elemento, ya sea texto, imágenes, botones, etc

ViewHolder: se utiliza para almacenar una referencia a la vista de cada elemento de la lista

Adapter: se encarga de vincular los datos de una lista o de un conjunto de datos con las vistas que se muestran en pantalla





