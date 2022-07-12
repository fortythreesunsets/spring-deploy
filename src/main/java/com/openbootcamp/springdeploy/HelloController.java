package com.openbootcamp.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")    // Inyectar una propiedad de application.properties
    String message;

//    @Value("${app.varexample}")
//    String username;

    @GetMapping("/hola")
    public String holaMundo() {
        System.out.println(message);
//        System.out.println(username);

        return "Hola mundo desde HelloController";
    }

    @GetMapping("/")
    public String bootstrap() {
        return """
                <!doctype html>
                <html lang="en">
                    <head>
                       <meta charset="utf-8">
                       <meta name="viewport" content="width=device-width, initial-scale=1">
                       <title>Bootstrap demo</title>
                       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
                     </head>
                     <body>
                       <h1>Hola desde Hello Controller</h1>
                       <a class="btn btn-primary" href="https://www.google.com">Google</a>
                       <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
                     </body>
                </html>
                """;
    }
}
