package Q_04;

public class Cats {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cats(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}
