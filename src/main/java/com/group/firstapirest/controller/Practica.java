package com.group.firstapirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

@RestController
@RequestMapping("/api")
public class Practica {

    @GetMapping("/suma")
    public Map<String, Object> suma(){

        int x = 5;
        int y = 10;
        int resultado = x+y;
        String mensaje = "El resultado es: "+resultado;

        Map<String, Object> retornar = new HashMap<>();
        retornar.put("mensaje", mensaje);

        return retornar;

    }

    @GetMapping("/resta")
    public Map<String, Object> restar(){
        int x = 15;
        int y = 10;
        int resultado = x-y;
        String mensaje = "El resultado de la resta es: "+resultado;

        Map<String, Object> responder = new HashMap<>();
        responder.put("mensaje: ",mensaje);

        return responder;
    }

    @GetMapping("/multiplicacion")
    public Map<String, Object> multiplicacion(){
        int x = 5;
        int y = 10;
        int resultado = x*y;
        String mensaje = "El resultado es: "+resultado;

        Map<String, Object> responder = new HashMap<>();
        responder.put("mensaje: ",mensaje);

        return responder;
    }

    @GetMapping("/division")
    public Map<String, Object> division(){
        int x = 50;
        int y = 10;
        int resultado = x/y;
        String mensaje = "El resultado es: "+resultado;

        Map<String, Object> responder = new HashMap<>();
        responder.put("mensaje: ",mensaje);

        return responder;
    }

    @GetMapping("/mayor")
    public Map<String, Object> mayorQue(){
        int x = 10;
        int y = 15;
        String mensaje = "";
        if (x > y){
            mensaje = "El numero "+x+" es mayor que el numero "+y;
        }else {
            mensaje = "El numero "+y+" es mayor que el numero "+x;
        }if (x == y){
            mensaje = "Los numeros son iguales";
        }

        Map<String, Object> responder = new LinkedHashMap<>();
        responder.put("primer numero", x);
        responder.put("segundo numero", y);
        responder.put("resultado", mensaje);

        return responder;
    }




}
