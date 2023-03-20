public class Talkative implements Runnable{
    private int nbr;
    private String name;

    public Talkative(int nbr,String name) {
        this.nbr = nbr;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public int getNbr() {
        return nbr;
    }

    @Override
    public  void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println( this.getName()+" " + i +  " => " + this.getNbr());
        }
    }
}
