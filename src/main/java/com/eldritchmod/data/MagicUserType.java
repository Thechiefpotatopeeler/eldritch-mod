package com.eldritchmod.data;

public class MagicUserType {
    
    public enum MagicUserTypes {
        /*
        Magic users must choose a path to gain more power, once they do so, they must go down the path unlocking new abilities.
        The types of magic have two paths each, wizards are those who choose to study the magic through research, spellcasting, and spellcrafting,
        whereas sorcerers are those who choose to study magic through immersion and practice, having greater ability with magical combat and casting spells
        as opposed to greater ability at researching and developing spells. When starting out, a mage must choose between Soul, Astral, Nethengeic, or Abyssal.

        Once a magic user has reached a great enough ability, they will become an eldritch mage, and will go down the path of eldritch wizardry or
        eldritch sorcery. Once they have completed their path into eldritch magic (universal magic of all types), they will have the choice of becoming
        one of the two special types, necromancer or life giver. Once at the eldritch stage, a mage can perform spells of any of the other types within their respecive
        division of wizrdry or sorcery, but once they reach the special types, they can perform both wizardry, and sorcery, but they must choose what they do with their
        power, will they bring life to those who have lost it, or will they bring life where it was not before.
        */
        NONE,
        NECROMANCER,
        LIFE_GIVER,
        SOUL_SORCERER,
        ASTRAL_SORCERER,
        NETHENGEIC_SORCERER,
        ABYSSAL_SORCERER,
        ELDRITCH_SORCERER,
        SOUL_WIZARD,
        ASTRAL_WIZARD,
        NETHENGEIC_WIZARD,
        ABYSSAL_WIZARD,
        ELDRITCH_WIZARD        
    }

    private MagicUserTypes magicUserType = MagicUserTypes.ELDRITCH_WIZARD;

    public void set(MagicUserTypes type) {//Allows for the setting of the magic user type
        this.magicUserType = type;
    }    
    public MagicUserTypes getType(){//Allows for the getting of the magic user type
        return this.magicUserType;
    }
}