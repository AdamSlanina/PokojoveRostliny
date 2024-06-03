package com.engeto.rostliny;

import java.util.ArrayList;
import java.util.List;

public class PlantList {
    private List<Plant> plantList;
    private List<PlantList> list;

    public PlantList(){
        this.plantList=new ArrayList<>();
        this.plantList=new ArrayList<>();
    }

    public List<Plant> getPlantList() {
        return plantList;
    }

    public void setPlantList(List<Plant> plantList) {
        this.plantList = plantList;
    }

    public List<PlantList> getList() {
        return list;
    }

    public void setList(List<PlantList> list) {
        this.list = list;
    }

    public void addPlant(Plant plant){
        this.plantList.add(plant);
    }

    public void removePlant(int i) throws PlantListException{
        if(i > plantList.size()){
            throw new PlantListException("There is no plant on this index");
        }
        this.plantList.remove(i);
    }


    public Plant getPlantAtIndex(int i)throws PlantListException{
        if(i > plantList.size()){
            throw new PlantListException("There is no plant on this index");
        }
        return this.plantList.get(i);
    }
}
