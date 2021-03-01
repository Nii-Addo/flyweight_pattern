package io.turntabl;

public class WrongPlayer {
    private String name;

    private String weapon;

    private String mission;

    public WrongPlayer(){}

    public WrongPlayer(String name,String weapon,String mission){
        this.name=name;
        this.weapon=weapon;
        this.mission=mission;
    }

    public void shoot(){
        System.out.println("I am shooting");
    }
}

///Just dont do anything like this
class DontDOThis{

    WrongPlayer wrongPlayer=new WrongPlayer("KillerAlumi","cutlass","GoKillTlc");
    //Call wrong player to do something eg wrongPlayer.shoot()
}
