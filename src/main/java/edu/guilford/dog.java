package edu.guilford;

public class dog {

    // Attributes
    private String name;
    private String breed;
    private int age;
    private String color;
    private int barked = 0;

    // Constructor
    public dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // create another constructor that sets default values
    public dog() {
        this.name = "Fido";
        this.breed = "Lab";
        this.age = 1;
        this.color = "Black";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setBarked(int barked) {
        this.barked = barked;
    }

    public int getBarked() {
        return barked;
        
    }

    

    @Override
    public String toString() {
        return "dog [name=" + name + ", breed=" + breed + ", age=" + age + ", color=" + color + "]";
    }

    // Create a method that makes the dog bark

    public void bark() {
        System.out.println("Woof! Woof!");
        barked++;
    }






}
