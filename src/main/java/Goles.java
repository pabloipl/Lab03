public class Goles {
    int goles;

    public Goles(){
        goles=3;
    }

    @Override
    public String toString() {
        return "Goles{" +
                "goles=" + goles +
                '}';
    }

    public void editarGoles(int goles){
        this.goles=goles+1;
    }
}