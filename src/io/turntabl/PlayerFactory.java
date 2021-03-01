package io.turntabl;

import java.util.HashMap;

public class PlayerFactory {

    private static HashMap<String, Player> characterStore = new HashMap<String, Player>();

    public static Player getPlayer(String type)
    {
        Player p = null;
        if (characterStore.containsKey(type)){
            p = characterStore.get(type);
        }
        else{
            switch(type)
            {
                case "Killer":
                    System.out.println("Killer Created");
                    p = new Killer();
                    break;
                case "Blowman":
                    System.out.println("Blowman Created");
                    p = new Blowman();
                    break;
                default :
                    System.out.println("Character not known!");
            }

                // Once created insert it into the HashMap
            characterStore.put(type, p);
            }
            return p;
        }
}
