package com.PrimeraAPITest.MiPrimeraAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Con esto se denota que la clase funge como controlador
@RequestMapping("/acciones") //Con esto se genera una notacion que se debe de tener antes de cada uno de los controladores de esta clase
public class SaludoController {

    @GetMapping("/saludo") //Se establece el metodo y la ruta con la cual se mostrara el saludo
    public String saludo(){
        return "Hola a todos";
    }

    @GetMapping("/saludo/{nombre}/{edad}") // Con el path variable toma lo que se tenga despues de la diagonal como una de las variables que se utilizaran en el cuerpo
    public String porPersona(@PathVariable String nombre, @PathVariable int edad) {
        return "Hey " + nombre + " tienes: " + edad + " años. :D";
    }
    

}
