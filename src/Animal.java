import java.util.ArrayList;
import java.util.Scanner;
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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Second set of assignments: Objects in lists
        //Objects in lists First exercise
        ArrayList<Animal> animals = new ArrayList<>();
        while(true){
            System.out.println("Please enter a name: ");
            String animalName = scanner.nextLine();
            boolean isDog;
            if(animalName.equals("")){
                break;
            } else {
                System.out.println("Is it a dog? Yes or No?");
                String dog = scanner.nextLine();
                if (dog.equalsIgnoreCase("yes")) {
                    isDog = true;
                } else {
                    isDog = false;
                }
            }
            animals.add(new Animal(animalName,isDog));
        }
        for(Animal entry: animals){
            System.out.println(entry.toString());
        }


    }
}