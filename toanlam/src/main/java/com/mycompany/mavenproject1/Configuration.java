/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

/**
 *
 * @author oslamelon
 */
public class Configuration {
    public static final DateTimeFormatter FORMATTER = 
            new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy").toFormatter();
    public static final Scanner SC = new Scanner(System.in);
}
