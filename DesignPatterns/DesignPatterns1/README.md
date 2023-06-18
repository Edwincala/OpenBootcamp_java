# Patrones de diseño #

## Creacionales ##

### Singleton ###

Existe un principio que vulnera este patrón de diseño llamado "Principio de responsabilidad única", que limita a los 
patrones de diseño a que resuelvan solamente un problema en específico, puesto que este patrón resuelve dos situaciones 
a la vez: Garantizar que una clase tenga una única instancia y proporcionar un punto de acceso global a dicha instancia.

**Usos:** Es usado para controlar el acceso a algún recurso compartido como el caso de una conexión a una base de datos, ya que solo
permite una instancia de la clase, es decir, una sola conexión a la misma.

### Builder ###

Permite la construcción de objetos basados en una sola clase con distintos parámetros, disminuyendo la necesidad de 
crear múltiples clases que extienden de una clase base, haciendo el código más ordenado a nivel global, aunque puede 
hacer que la instanciación sea complicada al aumentar la cantidad de parámetros.

**Usos:** Este patrón puede ser usado para la creación de varias representaciones de una clase que tienen parámetros en 
común, con diferencias en detalles pequeños, como por ejemplo, al definir las características de varios modelos de 
producto a partir de un producto base.

### Factory ###

Similar al patrón *Builder*, es útil para la implementación de métodos estándar a partir de una interfaz. Es decir, la 
interfaz define los métodos que se deben implementar en las posibles variaciones que puedan existir, y cada variación 
las implementa a necesidad en cada una de las clases.

**Usos:** Cuando no se conoce la precisa cantidad de posibles implementaciones de los métodos, es posible definirlas por 
medio de la interfaz mencionada y sobreescribir los métodos a medida que sea necesario.

### Prototype ###

Este patrón permite copiar o clonar de manera exacta un objeto.

**Usos:** Cuando el código no deba depender de las clases que se necesiten clonar. Al clonar un objeto, también es 
posible modificar algunos de sus parámetros a necesidad, por lo que esto podría evitar la creación de subclases al usar 
el objeto predefinido. 

## Estructurales ##

### Adapter ###

Este patrón de diseño permite usar una clase no compatible con el resto del código, creando una clase adaptadora que 
permita implementar dicha clase junto con sus métodos en el código que ya se había obtenido previamente. 

Como analogía para comprender este patrón, cuando uno se va de viaje a otro país, es posible que los tipos de enchufe sean diferentes, 
por lo que recargar la batería de los dispositivos sea imposible, de no ser por un adaptador de enchufes.  

**Usos:** Crear una clase que permita que la clase con una interfaz extraña o diferente sea entendida por el resto del 
código. 

### Decorator ###

Este patrón permite que distintos métodos puedan aplicar una interfaz a su manera. Esto indica que la interfaz tiene 
unos métodos base, pero que las clases wrapper o envoltorios le añadan características nuevas a la implementación de 
dichos métodos. 

**Usos:** Asignar nuevas funcionalidades a objetos, estructurando la lógica de negocion en capas y que no sea posible 
extender el comportamiento mediante la herencia de clases.

### Facade ###

Este patrón de diseño permite facilitar el uso del software, permitiendo trabajar con una interfaz sencilla, aunque 
limitando las posibilidades de usar cada uno de los subsistemas por separado.

**Usos:** Crear una interfaz para el uso estrictamente necesario o requerido del software, al limitar las funcionalidades y 
facilitar el uso por parte del cliente.


Para obtener [más información...](https://refactoring.guru/es/design-patterns/)


