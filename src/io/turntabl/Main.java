package io.turntabl;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Random r = new Random();
    private static String[] characterType = {"Killer", "Blowman"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    private static List<Player> players=new ArrayList<Player>();
    static int numberOfBlowmen=0;
    static int numberOfKillers=0;

    //
    public static String getRandomCharacterType()
    {
        int randInt = r.nextInt(characterType.length);

        return characterType[randInt];
    }

    //
    public static String getRandomWeapon()
    {
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }

    //
    public static void startGame(List<Player> players){
        for (int i=0;i<players.size();i++) {
            int randInt = r.nextInt(players.size());
            Player p=players.get(randInt);
            if(numberOfBlowmen >0 && numberOfKillers >0 ){
                p.shoot();
                if(p.getClass()==Blowman.class){
                    players.remove(players.stream().filter(x->x.getClass()==Killer.class).findFirst().get());
                    numberOfKillers-=1;
                }
                else{
                    players.remove(players.stream().filter(x->x.getClass()==Blowman.class).findFirst().get());
                    numberOfBlowmen-=1;
                }
            }
        }
    }

    //Lets kick off with the PlayStation 99 K.MORISSON EDITION,Nima Call of Duty........
    public static void main(String[] args) {
        int numberOfCharactersToDemo = 10;

        System.out.println("*************************Creating Characters***********************************");
        for (int i = 0; i < numberOfCharactersToDemo; i++)
        {

            Player p = PlayerFactory.getPlayer(getRandomCharacterType());
            p.assignWeapon(getRandomWeapon());
            p.mission();

            //
            players.add(p);
            if (p.getClass() == Blowman.class){
                numberOfBlowmen+=1;
            }
            else{
                numberOfKillers+=1;
            }
        }

        System.out.println("*************************General Statistics***********************************");
        System.out.println("blowmen="+numberOfBlowmen);
        System.out.println("killers =" + numberOfKillers);

        System.out.println("*************************Mission Starting***********************************");
        startGame(players);

        System.out.println("************************* Who won the fight? ***********************************");
        for (Player p:players) {
            System.out.println(p.getName());
        }

        System.out.println("*************************Mission Complete***********************************");
    }
}
