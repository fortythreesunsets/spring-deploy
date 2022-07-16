## Despliegue de apps Spring Boot en heroku

1. Generar archivo `.gitignore` en https://www.toptal.com/developers/gitignore/ con archivos Java, Maven e IntelliJ y agregar `.idea` en `#Generated Files`
2. Crear archivo `system.properties` en la raíz del proyecto con el contenido:
`java.runtime.version=17`
3. Agregar al pom.xml:
```
<plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-resources-plugin</artifactId>
   <version>3.1.0</version>
</plugin>
```
4. Tener configurado git en la computadora:

`git config --global user.name "fortythreesunsets"`

`git config --global user-email fortythreesunsets@example.com`

5. Crear archivo Procfile sin extensión con el contenido:

`web: java -Dserver.port=$PORT $JAVA_OPTS -jar target/spring-deploy-0.0.1-SNAPSHOT.jar`

6. Subir el proyecto a GitHub desde IntelliJ IDEA desde la opción VSC > Share Project on GitHub

7. Desde Heroku, crear app y elegir método GitHub y buscar el repositorio

8. Habilitar deploy automático y ejecutar Deploy (manual la primera vez)
