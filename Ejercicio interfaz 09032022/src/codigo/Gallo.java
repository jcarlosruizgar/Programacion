package codigo;

public class Gallo implements Cantable{

    Boolean crestaRoja;

    @Override
    public void cantar() {
        System.out.println("Kikiriki.");
    }

    public Gallo() {
    }

    public Gallo(Boolean crestaRoja) {
        this.crestaRoja = crestaRoja;
    }

    public Boolean getCrestaRoja() {
        return crestaRoja;
    }

    public void setCrestaRoja(Boolean crestaRoja) {
        this.crestaRoja = crestaRoja;
    }
}
