#Patrones de diseño#

##Creacionales##

###Singleton###

Existe un principio que vulnera este patrón de diseño llamado "Principio de responsabilidad única", que limita a los 
patrones de diseño a que resuelvan solamente un problema en específico, puesto que este patrón resuelve dos situaciones 
a la vez: Garantizar que una clase tenga una única instancia y Proporcionar un punto de acceso global a dicha instancia.

*Usos:* Es usado para controlar el acceso a algún recurso compartido como el caso de una conexión a una base de datos, ya que solo
permite una instancia de la clase, es decir, una sola conexión a la misma.


