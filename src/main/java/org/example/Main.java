package org.example;


import org.example.Modelos.Cliente;
import org.example.ayudas.Licor;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Licor licorUno = new Licor();
        Licor licorDos = new Licor("Aguardiente antioqueño tapa verde","aguardiente","FLA", LocalDate.of(2024,10,31),29.0);
        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("Juan","1037626483","edad","direccion","jpcastelblanco23@hotmail.com")

    //accediendo a los atributos
        System.out.println(licorUno.getNombre());
        System.out.println(licorDos.getNombre());

    }

}







