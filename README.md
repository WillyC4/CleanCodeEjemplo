# Clean Code Ejemplo  

## Descripción  
Este proyecto es un ejemplo práctico de Clean Code, donde se han aplicado principios de legibilidad, estructura y mantenimiento para mejorar la calidad del código. Se han utilizado herramientas automatizadas como PMD, CPD y Checkstyle para identificar y corregir problemas técnicos, además de realizar mejoras manuales para garantizar la claridad y eficiencia del código.  

## Herramientas utilizadas  
- **PMD**: Identificación de mejores prácticas y optimización de estructuras de código.  
- **CPD (Copy/Paste Detector)**: Detección de código duplicado para reducir redundancias.  
- **Checkstyle**: Verificación del cumplimiento de estándares de formato y documentación.  

## Instalación y Configuración  
### **1. Clonar el repositorio**  
```bash
git clone https://github.com/WillyC4/CleanCodeEjemplo.git
cd CleanCodeEjemplo
```

### **2. Construir el proyecto con Maven**  
En la raíz del proyecto, ejecuta:  
```bash
mvn clean install
```
Esto descargará las dependencias y construirá el proyecto.

### **4. Ejecutar el proyecto**  
Para ejecutar la aplicación desde la terminal, usa:  
```bash
mvn exec:java -Dexec.mainClass="com.miempresa.CManager"
```
Esto ejecutará la clase `CManager`.

## Funcionalidades principales  
- Gestión de clientes y órdenes con validaciones mejoradas.  
- Generación de reportes de clientes y órdenes.  
- Corrección de errores identificados por herramientas de análisis.  
- Refactorización según los principios de Clean Code.  

## Impacto de la refactorización  
El código ahora es más claro, organizado y alineado con buenas prácticas, facilitando su mantenimiento y escalabilidad. La combinación de herramientas automatizadas y revisión manual permitió corregir errores y mejorar la calidad general del proyecto.  
