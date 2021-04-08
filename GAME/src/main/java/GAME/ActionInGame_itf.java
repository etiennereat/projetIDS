package main.java.GAME;

public interface ActionInGame_itf{

    //avancer dans une direction
    public void moveTo(Direction d);
    //parler dans une direction
    public void talkTo(Direction d,String message);
    //crier a toute la zone où l'on se trouve
    public void scream(String message);

    /*----------------------------------------------------*/

    //attaquer dans une direction
    public void attackToward(Direction d);
}
