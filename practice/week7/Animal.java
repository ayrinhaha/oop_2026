package practice.week7;
public class Animal {
    private String family;
    private String specie;
    private String name;

    
    public Animal(String family, String specie, String name) {
        this.family = family;
        this.specie = specie;
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
