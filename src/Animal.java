public class Animal {
    private String name;
    private boolean isDog;
    public Animal(String name, boolean isDog){
        this.name = name;
        this.isDog = isDog;
    }
    public Animal(String name){
        this.name = name;
    }
    public Animal(boolean isDog){
        this.isDog = isDog;
    }
    public Animal(){
    }

    public String getName(){
        return name;
    }
    public boolean getIsDog(){
        return isDog;
    }
    @Override public String toString(){
        return getName() + " is a dog? " + getIsDog();
    }
}
