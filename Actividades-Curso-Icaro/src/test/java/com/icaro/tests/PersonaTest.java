package com.icaro.tests;

import com.icaro.Persona;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PersonaTest {

    @Test
    public void validarNombre() {
        Persona persona = new Persona("Cesar", "Mejia", 30);

        Assert.assertEquals(persona.getNombre(), "Cesar", "El nombre no es Cesar!!");
    }

    @Test
    public void validarEdad() {
        Persona persona = new Persona("Cesar", "Mejia", 30);

        Assert.assertEquals(persona.getEdad(), 30);
    }

    @Test(enabled = false)
    public void validarApellido() {
        Persona persona = new Persona("Cesar", "Mejia", 30);

        Assert.assertEquals(persona.getApellido(), "Mejia");
    }

    @Test
    public void validarSaludo() {
        Persona persona = new Persona("Pepe", "Messi", 30);

        Assert.assertTrue(persona.saludo().equals("Hola, soy Pepe Messi"));
    }

    @Test
    public void validarNombreYEdad() {
        Persona persona = new Persona("Cesar", "Mejia", 30);

        Assert.assertEquals(persona.getNombre(), "Cesar");
        Assert.assertEquals(persona.getEdad(), 30);
    }
}
