# Analizador de Datos de Clientes

Hola, mi nombre es Alexis Sinue González Medina.

Este es un sistema que limpia, transforma y ordena datos crudos provenientes de formularios web, aplicando técnicas avanzadas de aplanamiento de datos y ordenamientos funcional.

## Tecnologías Utilizadas
**Lenguaje:** Java
**IDE:** Eclipse IDE

## Requerimientos Técnicos
**Limpieza de Datos:** Dada una lista de objetos Cliente con datos incompletos o anidados, usar Stream.flatMap para normalizar y limpiar nombres duplicados.

**Consumo de Datos:** Implementar la interfaz funcional Consumer para persistir (imprimir/loguear) los registros procesados.
**Estructura Universal:**Crear una estructura Genérica que permita almacenar cualquier tipo de entidad, siempre que cuente con un identificador único (ID).

**Ordenamiento Dinámico:** Usar sorted con un Comparator definido mediante una Lambda para ordenar a los clientes por su fecha de registro.
