package fr.example.a2_sound.models;

public class AlbumItems {

    private String name;
    private String memo;
    private double prix;

    public AlbumItems(String name, String memo, double prix){
        this.name = name;
        this.memo = memo;
        this.prix = prix;
    }

    public String getName(){ return  name;}

    public double getPrix() { return prix; }

    public String getMemo() {
        return memo;
    }
}
