public class Water extends Pokemon{
    private boolean resistFire = true;


    public void weakToGrass(){
        System.out.println("This pokemoen is weak to grass");
    }

    public void waterGun(){
        System.out.println("This pokemons can use water gun");
    }

    //accesor
    public boolean getResistWater(){
        return resistFire;
    }

    //mutators
    public void setResistWater(boolean r){
        this.resistFire = r;
    }
}
