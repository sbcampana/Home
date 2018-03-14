package Java.main;

public class Room {

    String name;
    int numWindows;
    int numDoors;
    boolean lit;

    public Room(){

    }

    public Room(String name, int numWindows, int numDoors, boolean lit){
        this.name = name;
        this.numWindows = numWindows;
        this.numDoors = numDoors;
        this.lit = lit;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumWindows(int numWindows){
        this.numWindows = numWindows;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    public void setLit(boolean lit){
        this.lit = lit;
    }

    public String getName(){
        return this.name;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public boolean getLit() {
        return this.lit;
    }
}
