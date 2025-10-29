/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.editer.demoweb.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@Slf4j
@CrossOrigin("/**")
@RestController
@RequestMapping("/api/home")
public class HomeController {
    
    @GetMapping
    public ResponseEntity getResult(@RequestParam(name = "text", required = true) String text){
        log.info(String.format("getResult -> Origin text: %s", text));
        return ResponseEntity.ok(text.toUpperCase());
    }
    
    @GetMapping("/count")
    public ResponseEntity getCount(@RequestParam(name = "text", required = true) String text){
        log.info(String.format("getCount -> Oring text: %s", text));
        return ResponseEntity.ok(text.length());
    }
}
