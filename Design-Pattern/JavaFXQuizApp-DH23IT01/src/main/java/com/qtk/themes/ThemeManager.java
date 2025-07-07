/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.themes;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public class ThemeManager {
    private static ThemeFactory themeFactory;
    public static void setLightThemeFactory(ThemeFactory t){
        themeFactory = t;
    }
    public static void applyTheme(Scene scence){
        scence.getRoot().getStylesheets().clear();
        scence.getRoot().getStylesheets().add(themeFactory.getStyleSheet());
    }
}
