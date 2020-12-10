public class setMaker {
    String name;
    String height;
    String mass;
    String hairColor;
    String skinColor;
    String eyeColor;
    String birthYear;
    String gender;
    String homeworld;
    String species;

    public setMaker(String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, String species){
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeworld = homeworld;
        this.species = species;
    }

    public void displayChar(){
        System.out.println(name+","+height+","+mass+","+hairColor+","+skinColor+","+eyeColor+","+birthYear+","+gender+","+homeworld+","+species);
    }
}

