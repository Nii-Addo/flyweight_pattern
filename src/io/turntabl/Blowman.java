package io.turntabl;

public class Blowman  implements Player{

    private final String name;
    private final String TASK;
    private String weapon;

    public Blowman() {
        TASK = "ASSASSINATE ALL INVADERS";
        name="Blowman";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Blowman has weapon "
                + weapon + "|" + "Her Task is to " + TASK);
    }

    @Override
    public void shoot() {
        System.out.println("Blowman fired weapon,one killer down");
    }

    @Override
    public String getName() {
        return name;
    }

}
