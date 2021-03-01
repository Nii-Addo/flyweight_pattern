package io.turntabl;

public class Killer implements Player{

    private final String name;
    private final String TASK;
    private String weapon;

    public Killer() {
        TASK = "KILL ALL NATIONAL SECURITY OPERATIVES";
        name="Killer";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Killer has weapon "
                + weapon + "|" + " His task is to " + TASK);
    }

    @Override
    public void shoot() {
        System.out.println("Killer fired weapon,one blowman down");
    }

    @Override
    public String getName() {
        return name;
    }

}
