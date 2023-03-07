public class Pokemon {
    private boolean alive = true;

    public void cute(){
        System.out.println("This pokemon is really cute!");
    }
    
    public void levelFive(){
        System.out.println("This pokemon is level five");
    }

    //accesor
    public boolean getAlive(){
        return alive;
    }

    //mutators
    public void setAlive(boolean a){
        this.alive = a;
    }

}