/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qtk.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Question {
    private int id;
    private String content;
    private String hint;
    private String image;
    private Category category;
    private Level level;
    private List<Choice> choices = new ArrayList<>();
    private Question(Builder build){
        this.id = build.id;
        this.content = build.content;
        this.hint = build.hint;
        this.image = build.image;
        this.category = build.category;
        this.level = build.level;
        this.choices = build.choices;
    }
    public static class Builder{
        private int id;
        private String content;
        private String hint;
        private String image;
        private Category category;
        private Level level;
        private List<Choice> choices = new ArrayList<>();
        
        public Builder(String content, Category c, Level l) throws Exception{
            if(content == null || content.isEmpty() || c == null || l == null)
                throw new Exception("Invalid Value!");
            this.content = content;
            this.category = c;
            this.level = l;
        }
<<<<<<< HEAD
        public Builder(int id, String content) throws Exception{
            
            this.content = content;
            this.id = id;
        }
=======
>>>>>>> 388dd9927440df30ddcdf1e6eb35113e30aabff4
        public Builder addHint(String hint){
            this.hint = hint;
            return this;
        }
        public Builder addImage(String image){
            this.image = image;
            return this;
        }
        public Builder addChoice(Choice c){
            this.choices.add(c);
            return this;
        }
<<<<<<< HEAD
        public Builder addAllChoice(List<Choice> choices){
            this.choices.addAll(choices);
            return this;
        }
=======
>>>>>>> 388dd9927440df30ddcdf1e6eb35113e30aabff4
        public Question build(){
            return new Question(this);
        }
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the level
     */
    public Level getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(Level level) {
        this.level = level;
    }

    /**
     * @return the choices
     */
    public List<Choice> getChoices() {
        return choices;
    }

    /**
     * @param choices the choices to set
     */
    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
    
}