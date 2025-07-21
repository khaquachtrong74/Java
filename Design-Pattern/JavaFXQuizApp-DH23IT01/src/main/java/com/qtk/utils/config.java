/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.utils;

import com.qtk.services.CategoryService;
import com.qtk.services.LevelService;
import com.qtk.services.QuestionServices;

/**
 *
 * @author admin
 */
public class config {

    public static final LevelService levelServices = new LevelService();
    public static final CategoryService catesServices = new CategoryService();
    public static final QuestionServices questionServices = new QuestionServices();
    
}
