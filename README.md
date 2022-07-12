## Despliegue de apps Spring Boot en heroku

1. Crear archivo `system.properties` en la raíz del proyecto con el contenido:
`java.runtime.version=17`
2. Agregar al pom.xml:

`<plugin>
   <groupId>org.apache.maven.plugins</groupId>
   <artifactId>maven-resources-plugin</artifactId>
   <version>3.1.0</version>
</plugin>`
3. Tener configurado git en la computadora:

`git config --global user.name "fortythreesunsets"`
`git config --global user-email fortythreesunsets@example.com`

2. Crear archivo Procfile sin extensión con el contenido:

`web: java -Dserver.port=$PORT $JAVA_OPTS -jar target/spring-deploy-0.0.1-SNAPSHOT.jar`
4. Subir el proyecto a GitHub desde IntelliJ IDEA desde la opción VSC > Share Project on GitHub
5. Desde Heroku, crear app y elegir método GitHub y buscar el repositorio
6. Habilitar deploy automático y ejecutar Deploy (manual la primera vez)
7. Para monitorear la app, ir a la pestaña Overview en Heroku