/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.qtk.themes;
import com.qtk.javafxquizapp.dh23it01.App;
import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum themes {
    DEFAULT {
        @Override
        public void updateTheme(Scene s) {
            
            ThemeManager.setLightThemeFactory(new DefaultThemeFactory());
            ThemeManager.applyTheme(s);
        }
    }, DARK {
        @Override
        public void updateTheme(Scene s) {
            
            ThemeManager.setLightThemeFactory(new DarkThemeFactory());
            ThemeManager.applyTheme(s);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene s) {
            
            ThemeManager.setLightThemeFactory(new LightThemeFactory());
            ThemeManager.applyTheme(s);
        }
    };
    public abstract void updateTheme(Scene s);
}
