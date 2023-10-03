|Criterio/Solución|Opción 1|Opción 2|
|---|---|---|
|*Abstracción del mundo real*\\ ¿Considera que los objetos del mundo real están modelados en el sistema? ¿Hay una organización entre las clases?|Si, los objetos del mundo real se encuentran modelados en el sistema. Si bien hay una organización, no considero que sea la mejor.| Si, los objetos del mundo real se encuentran modelados en el sistema. Considero que la organización elegida es la adecuada|
|*Duplicación de código* \\ ¿Hay duplicación de código? ¿Es necesaria o puede ser evitada?|Si, hay duplicación de código. La misma no es necesaria y puede ser evitada eligiendo otra manera de representar el problema.|No, no considero que haya duplicación de código ya que se utilizo una muy buena representación para el problema.|
|*Re-uso de código* \\ ¿Se re-usa código? ¿Puede el código actual ser re-usado si el sistema crece para abarcar otros tipos de elementos audiovisuales?|No, no se reutiliza código, sino que por cada elemento se vuelve a crear una clase con todas sus propiedades aunque haya algunas que compartan entre sí.|Si, se reutiliza código. Depende el tipo de elemento que se quiera agregar habría que redaptar el código, pero si, se podría.|
|*Mantenimiento del programa* \\ ¿Qué cambios aparecen si se quiere agregar el DVD? ¿Qué tan fácil es cambiar el código?| Si se quiere agregar un DVD, deberia crearse una nueva clase que repetiría caracteristicas del CD probablemente.| Si se quiere agregar un DVD, se crearia una nueva clase DVD que extienda de la clase MultiMediaItem, y se le agregarían las cosas especificas del mismo.|


a. Falso, una clase abstracta no necesariemente debe tener un método abstracto. Una clase abstracta puede contener métodos concretos además de abstractos.

b. Falso. Se pueden definir constructores en una clase abstracta. De hecho, es común definir constructores en una clase abstracta para inicializar variables de instancia compartidas o realizar otras tareas de inicialización comunes para las clases hijas.

c. Verdadero. No se puede declarar un metodo abstracto en una clase no abstracta, pero si se le puede dar implementación.

d. Verdadero. Si una clase B extiende una clase abstracta A, debe implementar todos los métodos abstractos definidos en la clase abstracta A, a menos que la clase B también sea declarada como abstracta.
