package com.task.two;

public class Theater {
    private String name;
    private int seatingCapacity;
    private int availableSeats;

    public Theater() {
    }

    public Theater(String name, int seatingCapacitys) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.availableSeats = seatingCapacitys;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(this.name);
        stringBuilder.append("\nSeating Capacity: ").append(this.seatingCapacity);
        stringBuilder.append("AvailableSeats: ").append(this.availableSeats);
        return stringBuilder.toString();
    }
    public boolean bookSeat(){
        if(availableSeats > 0){
            availableSeats--;
            return true;
        }return false;
    }
    public void cancelSeat(){
        if(availableSeats < seatingCapacity){
            availableSeats++;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

}
