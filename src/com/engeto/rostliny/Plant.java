package com.engeto.rostliny;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Plant {
    private String name;
    private List<String> notes;
    private LocalDate planted;
    private LocalDate watering;
    private int frequencyOfWatering;

    public Plant(String name, ArrayList<String> notes, LocalDate planted, LocalDate watering, int frequencyOfWatering){
        this.name=name;
        this.notes=notes;
        this.planted=planted;
        this.watering=watering;
        this.frequencyOfWatering=frequencyOfWatering;
    }
    public Plant(String name,LocalDate planted,int frequencyOfWatering){
        this.name=name;
        this.planted=planted;
        this.frequencyOfWatering=frequencyOfWatering;
        this.notes=new ArrayList<>();
        this.watering=LocalDate.now();

    }
    public Plant(String name){
        this.name=name;
        this.planted=LocalDate.now();
        this.frequencyOfWatering=7;
        this.notes=new ArrayList<>();
        this.watering=LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) throws PlantException {
        if(watering.isBefore(getPlanted())){
            throw new PlantException("The plant is not yet planted");
        }
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if(frequencyOfWatering<=0){
            throw new PlantException("Frequency must be higher than number 0");
        }
        this.frequencyOfWatering=frequencyOfWatering;
    }

    public void getWateringInfo(){
        System.out.println(name);
        System.out.print("/");
        System.out.print(watering);
        System.out.print(watering.plusDays(frequencyOfWatering));
    }
}

