package br.com.aleidaquadros.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Tipos de acesso que se pode ter. Modificadores:
 * PUBLIC
 * PRIVATE
 * PROTECTED
 */

 @RestController
 @RequestMapping("/users")

public class UserController {
    
    /**
     * String (texto)
     * Integer (int) números inteiros
     * Double (double) números decimais 0.0000
     * Float (float) Números decimais 0.000
     * Char (A C) caracteres
     * Date (data)
     * void sem retorno ao método
     */

     /*
      * Body
      */
      @PostMapping("/")
    public  void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
