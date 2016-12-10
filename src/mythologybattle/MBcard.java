/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mythologybattle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;

/**
 *
 * @author Charles
 */
public class MBcard {
    EnumMap<battleCard,String> battleUnitRoll = new EnumMap<>(battleCard.class);
    EnumMap<battleCard,String> battleUnitAgst = new EnumMap<>(battleCard.class);
    EnumMap<battleCard,String> battleUnitType = new EnumMap<>(battleCard.class);
    EnumMap<battleCard,String> battleUnitSpec = new EnumMap<>(battleCard.class);
    
    public enum card {
        Nattack ("/mythologybattle/resource/NattackP.png"),
        Nbuild  ("/mythologybattle/resource/NbuildP.png"),
        Nexplore("/mythologybattle/resource/NexploreP.png"),
        Ngather ("/mythologybattle/resource/NgatherP.png"),
        Nnextage("/mythologybattle/resource/NnextageP.png"),
        Nrecruit("/mythologybattle/resource/NrecruitP.png"),
        Ntrade  ("/mythologybattle/resource/NtradeP.png"),
        Gattack ("/mythologybattle/resource/GattackP.png"),
        Gbuild  ("/mythologybattle/resource/GbuildP.png"),
        Gexplore("/mythologybattle/resource/GexploreP.png"),
        Ggather ("/mythologybattle/resource/GgatherP.png"),
        Gnextage("/mythologybattle/resource/GnextageP.png"),
        Grecruit("/mythologybattle/resource/GrecruitP.png"),
        Gtrade  ("/mythologybattle/resource/GtradeP.png"),
        Eattack ("/mythologybattle/resource/EattackP.png"),
        Ebuild  ("/mythologybattle/resource/EbuildP.png"),
        Eexplore("/mythologybattle/resource/EexploreP.png"),
        Egather ("/mythologybattle/resource/EgatherP.png"),
        Enextage("/mythologybattle/resource/EnextageP.png"),
        Erecruit("/mythologybattle/resource/ErecruitP.png"),
        Etrade  ("/mythologybattle/resource/EtradeP.png"),
        /******************************************************/
        GtradeR1    ("/mythologybattle/resource/gtrader1.png"),
        GtradeR2    ("/mythologybattle/resource/gtrader2.png"),
        GgatherR1   ("/mythologybattle/resource/ggatherr1.png"),
        GgatherR2   ("/mythologybattle/resource/ggatherr2.png"),
        GgatherR3   ("/mythologybattle/resource/ggatherr3.png"),
        GgatherR4   ("/mythologybattle/resource/ggatherr4.png"),
        GbuildR1    ("/mythologybattle/resource/gbuildr1.png"),
        GbuildR2    ("/mythologybattle/resource/gbuildr2.png"),
        GbuildR3    ("/mythologybattle/resource/gbuildr3.png"),
        GbuildR4    ("/mythologybattle/resource/gbuildr4.png"),
        GattackR1   ("/mythologybattle/resource/gattackr1.png"),
        GattackR2   ("/mythologybattle/resource/gattackr2.png"),
        GattackR3   ("/mythologybattle/resource/gattackr3.png"),
        GattackR4   ("/mythologybattle/resource/gattackr4.png"),
        GattackR5   ("/mythologybattle/resource/gattackr5.png"),
        GexploreR1  ("/mythologybattle/resource/gexplorer1.png"),
        GexploreR2  ("/mythologybattle/resource/gexplorer2.png"),
        GexploreR3  ("/mythologybattle/resource/gexplorer3.png"),
        GnextageR1  ("/mythologybattle/resource/gnextager1.png"),
        GnextageR2  ("/mythologybattle/resource/gnextager2.png"),
        GnextageR3  ("/mythologybattle/resource/gnextager3.png"),
        GrecruitR1  ("/mythologybattle/resource/grecruitr1.png"),
        GrecruitR2  ("/mythologybattle/resource/grecruitr2.png"),
        GrecruitR3  ("/mythologybattle/resource/grecruitr3.png"),
        GrecruitR4  ("/mythologybattle/resource/grecruitr4.png"),
        
        NattackR1   ("/mythologybattle/resource/nattackr1.png"),
        NattackR2   ("/mythologybattle/resource/nattackr2.png"),
        NattackR3   ("/mythologybattle/resource/nattackr3.png"),
        NattackR4   ("/mythologybattle/resource/nattackr4.png"),
        NbuildR1    ("/mythologybattle/resource/nbuildr1.png"),
        NbuildR2    ("/mythologybattle/resource/nbuildr2.png"),
        NbuildR3    ("/mythologybattle/resource/nbuildr3.png"),
        NbuildR4    ("/mythologybattle/resource/nbuildr4.png"),
        NexploreR1  ("/mythologybattle/resource/nexplorer1.png"),
        NexploreR2  ("/mythologybattle/resource/nexplorer2.png"),
        NexploreR3  ("/mythologybattle/resource/nexplorer3.png"),
        NgatherR1   ("/mythologybattle/resource/ngatherr1.png"),
        NgatherR2   ("/mythologybattle/resource/ngatherr2.png"),
        NgatherR3   ("/mythologybattle/resource/ngatherr3.png"),
        NgatherR4   ("/mythologybattle/resource/ngatherr1.png"),
        NnextageR1  ("/mythologybattle/resource/nnextager1.png"),
        NnextageR2  ("/mythologybattle/resource/nnextager2.png"),
        NrecruitR1  ("/mythologybattle/resource/nrecruitr1.png"),
        NrecruitR2  ("/mythologybattle/resource/nrecruitr2.png"),
        NrecruitR3  ("/mythologybattle/resource/nrecruitr3.png"),
        NrecruitR4  ("/mythologybattle/resource/nrecruitr4.png"),
        NtradeR1    ("/mythologybattle/resource/ntrader1.png"),
        NtradeR2    ("/mythologybattle/resource/ntrader2.png"),
        
        EattackR1   ("/mythologybattle/resource/eattackr1.png"),
        EattackR2   ("/mythologybattle/resource/eattackr2.png"),
        EattackR3   ("/mythologybattle/resource/eattackr3.png"),
        EattackR4   ("/mythologybattle/resource/eattackr4.png"),
        EattackR5   ("/mythologybattle/resource/eattackr5.png"),
        EattackR6   ("/mythologybattle/resource/eattackr6.png"),
        EbuildR1    ("/mythologybattle/resource/ebuildr1.png"),
        EbuildR2    ("/mythologybattle/resource/ebuildr2.png"),
        EbuildR3    ("/mythologybattle/resource/ebuildr3.png"),
        EbuildR4    ("/mythologybattle/resource/ebuildr4.png"),
        EexploreR1  ("/mythologybattle/resource/eexplorer1.png"),
        EexploreR2  ("/mythologybattle/resource/eexplorer2.png"),
        EexploreR3  ("/mythologybattle/resource/eexplorer3.png"),
        EgatherR1   ("/mythologybattle/resource/egatherr1.png"),
        EgatherR2   ("/mythologybattle/resource/egatherr2.png"),
        EnextageR1  ("/mythologybattle/resource/enextager1.png"),
        EnextageR2  ("/mythologybattle/resource/enextager2.png"),
        EnextageR3  ("/mythologybattle/resource/enextager3.png"),
        ErecruitR1  ("/mythologybattle/resource/erecruitr1.png"),
        ErecruitR2  ("/mythologybattle/resource/erecruitr2.png"),
        ErecruitR3  ("/mythologybattle/resource/erecruitr3.png"),
        ErecruitR4  ("/mythologybattle/resource/erecruitr4.png"),
        ErecruitR5  ("/mythologybattle/resource/erecruitr5.png"),
        EtradeR1    ("/mythologybattle/resource/etrader1.png"),;
        private final String cardImage;
        
        private card(String resourcePath){
            this.cardImage = resourcePath;
        }
        
        public String getPath(){
            return this.cardImage;
        }
    };
    
    public enum battleCard {
        //Norse
        cNorseHero ("/mythologybattle/resource/cnorsehero.png"),
        dwarf      ("/mythologybattle/resource/dwarf.png"),
        froseGiant ("/mythologybattle/resource/frosegiant.png"),
        hNorseHero ("/mythologybattle/resource/hnorsehero.png"),
        huskarl    ("/mythologybattle/resource/huskarl.png"),
        jarl       ("/mythologybattle/resource/jarl.png"),
        mNorseHero ("/mythologybattle/resource/mnorsehero.png"),
        nidhogg    ("/mythologybattle/resource/nidhogg.png"),
        throwingAxe("/mythologybattle/resource/throwingaxeman.png"),
        troll      ("/mythologybattle/resource/troll.png"),
        valkyrie   ("/mythologybattle/resource/valkyrie.png"),
        //Greek
        centaur    ("/mythologybattle/resource/centaur.png"),
        cGreekHero ("/mythologybattle/resource/cgreekhero.png"),
        cyclops    ("/mythologybattle/resource/cyclops.png"),
        hGreekHero ("/mythologybattle/resource/hgreekhero.png"),
        hippokon   ("/mythologybattle/resource/hippokon.png"),
        hoplite    ("/mythologybattle/resource/hoplite.png"),
        hydra      ("/mythologybattle/resource/hydra.png"),
        manticore  ("/mythologybattle/resource/manticore.png"),
        medusa     ("/mythologybattle/resource/medusa.png"),
        mGreekHero ("/mythologybattle/resource/mgreekhero.png"),
        minotaur   ("/mythologybattle/resource/minotaur.png"),
        toxotes    ("/mythologybattle/resource/toxotes.png"),
        //Egypt
        anubite    ("/mythologybattle/resource/anubite.png"),
        chariotarcher("/mythologybattle/resource/chariotarcher.png"),
        elephant   ("/mythologybattle/resource/elephant.png"),
        mummy      ("/mythologybattle/resource/mummy.png"),
        pharaoh    ("/mythologybattle/resource/pharaoh.png"),
        phoenix    ("/mythologybattle/resource/phoenix.png"),
        priest     ("/mythologybattle/resource/priest.png"),
        scorpionman("/mythologybattle/resource/scorpionman.png"),
        sonofosiris("/mythologybattle/resource/sonofosiris.png"),
        spearman   ("/mythologybattle/resource/spearman.png"),
        sphinx     ("/mythologybattle/resource/sphinx.png"),
        wadjet     ("/mythologybattle/resource/wadjet.png");
        private final String battleCardImage;
        
        private battleCard(String resourcePath){
            this.battleCardImage = resourcePath;
        }
        public String getPath(){
            return this.battleCardImage;
        }
    }
    
    /*******************************/
    protected ArrayList<card> randomCardCulture(String culture){
        ArrayList<card> cardC = new ArrayList<>();
        switch(culture){
            case"norse":
                cardC.add(card.NattackR1);
                cardC.add(card.NattackR2);
                cardC.add(card.NattackR3);
                cardC.add(card.NattackR4);
                cardC.add(card.NattackR4);
                cardC.add(card.NbuildR1);
                cardC.add(card.NbuildR1);
                cardC.add(card.NbuildR2);
                cardC.add(card.NbuildR2);
                cardC.add(card.NbuildR2);
                cardC.add(card.NbuildR3);
                cardC.add(card.NbuildR4);
                cardC.add(card.NexploreR1);
                cardC.add(card.NexploreR1);
                cardC.add(card.NexploreR1);
                cardC.add(card.NexploreR2);
                cardC.add(card.NexploreR2);
                cardC.add(card.NexploreR3);
                cardC.add(card.NgatherR1);
                cardC.add(card.NgatherR1);
                cardC.add(card.NgatherR1);
                cardC.add(card.NgatherR1);
                cardC.add(card.NgatherR2);
                cardC.add(card.NgatherR3);
                cardC.add(card.NnextageR1);
                cardC.add(card.NnextageR1);
                cardC.add(card.NnextageR1);
                cardC.add(card.NnextageR2);
                cardC.add(card.NrecruitR1);
                cardC.add(card.NrecruitR1);
                cardC.add(card.NrecruitR2);
                cardC.add(card.NrecruitR2);
                cardC.add(card.NrecruitR3);
                cardC.add(card.NrecruitR3);
                cardC.add(card.NrecruitR4);
                cardC.add(card.NtradeR1);
                cardC.add(card.NtradeR1);
                cardC.add(card.NtradeR1);
                cardC.add(card.NtradeR1);
                cardC.add(card.NtradeR2);
            break;
            case"greek":
                cardC.add(card.GattackR1);
                cardC.add(card.GattackR1);
                cardC.add(card.GattackR2);
                cardC.add(card.GattackR2);
                cardC.add(card.GattackR3);
                cardC.add(card.GattackR3);
                cardC.add(card.GattackR5); 
                cardC.add(card.GbuildR1);
                cardC.add(card.GbuildR1);
                cardC.add(card.GbuildR2);
                cardC.add(card.GbuildR2);
                cardC.add(card.GbuildR2);
                cardC.add(card.GbuildR3);
                cardC.add(card.GbuildR4);
                cardC.add(card.GexploreR1);
                cardC.add(card.GexploreR2);
                cardC.add(card.GexploreR2);
                cardC.add(card.GexploreR3);
                cardC.add(card.GexploreR3);
                cardC.add(card.GgatherR1);
                cardC.add(card.GgatherR1);
                cardC.add(card.GgatherR1);
                cardC.add(card.GgatherR1);
                cardC.add(card.GgatherR1);
                cardC.add(card.GgatherR2);
                cardC.add(card.GgatherR4);
                cardC.add(card.GnextageR1);
                cardC.add(card.GnextageR1);
                cardC.add(card.GnextageR2);
                cardC.add(card.GnextageR3);
                cardC.add(card.GrecruitR1);
                cardC.add(card.GrecruitR1);
                cardC.add(card.GrecruitR2);
                cardC.add(card.GrecruitR2);
                cardC.add(card.GrecruitR3);
                cardC.add(card.GrecruitR3);
                cardC.add(card.GrecruitR4);
                cardC.add(card.GtradeR1);
                cardC.add(card.GtradeR1);
                cardC.add(card.GtradeR1);
                cardC.add(card.GtradeR1);
                cardC.add(card.GtradeR1);
                cardC.add(card.GtradeR2);
            break;
            case"egypt":
                cardC.add(card.EattackR1);
                cardC.add(card.EattackR1);
                cardC.add(card.EattackR2);
                cardC.add(card.EattackR2);
                cardC.add(card.EattackR3);
                cardC.add(card.EattackR5);
                cardC.add(card.EbuildR1); 
                cardC.add(card.EbuildR1);
                cardC.add(card.EbuildR2);
                cardC.add(card.EbuildR2);
                cardC.add(card.EbuildR3);
                cardC.add(card.EbuildR4);
                cardC.add(card.EexploreR1);
                cardC.add(card.EexploreR1);
                cardC.add(card.EexploreR2);
                cardC.add(card.EexploreR2);
                cardC.add(card.EexploreR3);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR1);
                cardC.add(card.EgatherR2);
                cardC.add(card.EnextageR1);
                cardC.add(card.EnextageR1);
                cardC.add(card.ErecruitR1);
                cardC.add(card.ErecruitR1);
                cardC.add(card.ErecruitR2);
                cardC.add(card.ErecruitR3);
                cardC.add(card.ErecruitR5);
                cardC.add(card.EtradeR1);
                cardC.add(card.EtradeR1);
                cardC.add(card.EtradeR1);
                cardC.add(card.EtradeR1);
                cardC.add(card.EtradeR1);
                cardC.add(card.EtradeR1);
            break;
        }
        Collections.shuffle(cardC);
        return cardC;
    }
    
    protected void initUnitRoll(){
        //Norse
        battleUnitRoll.put(battleCard.cNorseHero, "5");
        battleUnitRoll.put(battleCard.dwarf,      "4");
        battleUnitRoll.put(battleCard.froseGiant, "7");
        battleUnitRoll.put(battleCard.hNorseHero, "6");
        battleUnitRoll.put(battleCard.huskarl,    "3");
        battleUnitRoll.put(battleCard.jarl,       "3");
        battleUnitRoll.put(battleCard.mNorseHero, "8");
        battleUnitRoll.put(battleCard.nidhogg,    "7");
        battleUnitRoll.put(battleCard.throwingAxe,"3");
        battleUnitRoll.put(battleCard.troll,      "6");
        battleUnitRoll.put(battleCard.valkyrie,   "5");
        //Greek
        battleUnitRoll.put(battleCard.centaur,    "5");
        battleUnitRoll.put(battleCard.cGreekHero, "5");
        battleUnitRoll.put(battleCard.cyclops,    "6");
        battleUnitRoll.put(battleCard.hGreekHero, "6");
        battleUnitRoll.put(battleCard.hippokon,   "3");
        battleUnitRoll.put(battleCard.hoplite,    "3");
        battleUnitRoll.put(battleCard.hydra,      "6");
        battleUnitRoll.put(battleCard.manticore,  "5");
        battleUnitRoll.put(battleCard.medusa,     "5");
        battleUnitRoll.put(battleCard.mGreekHero, "5");
        battleUnitRoll.put(battleCard.minotaur,   "5");
        battleUnitRoll.put(battleCard.toxotes,    "3");
        //Egypt
        battleUnitRoll.put(battleCard.anubite,    "5");
        battleUnitRoll.put(battleCard.chariotarcher,"3");
        battleUnitRoll.put(battleCard.elephant,   "3");
        battleUnitRoll.put(battleCard.mummy,      "5");
        battleUnitRoll.put(battleCard.pharaoh,    "6");
        battleUnitRoll.put(battleCard.phoenix,    "6");
        battleUnitRoll.put(battleCard.priest,     "4");
        battleUnitRoll.put(battleCard.scorpionman,"5");
        battleUnitRoll.put(battleCard.sonofosiris,"8");
        battleUnitRoll.put(battleCard.spearman,   "3");
        battleUnitRoll.put(battleCard.sphinx,     "5");
        battleUnitRoll.put(battleCard.wadjet,     "5");
    }
    
    protected void initUnitAgst(){
        //Norse
        battleUnitAgst.put(battleCard.cNorseHero, "4m");
        battleUnitAgst.put(battleCard.dwarf,      "7g");
        battleUnitAgst.put(battleCard.froseGiant, "2w,4t");
        battleUnitAgst.put(battleCard.hNorseHero, "4m");
        battleUnitAgst.put(battleCard.huskarl,    "4c");
        battleUnitAgst.put(battleCard.jarl,       "4h,4a");
        battleUnitAgst.put(battleCard.mNorseHero, "4m");
        battleUnitAgst.put(battleCard.nidhogg,    "4k");
        battleUnitAgst.put(battleCard.throwingAxe,"3w,4f");
        battleUnitAgst.put(battleCard.troll,      "4c");
        battleUnitAgst.put(battleCard.valkyrie,   "4a");
        //Greek
        battleUnitAgst.put(battleCard.centaur,    "3a,3f");
        battleUnitAgst.put(battleCard.cGreekHero, "4m");
        battleUnitAgst.put(battleCard.cyclops,    "4t");
        battleUnitAgst.put(battleCard.hGreekHero, "4m");
        battleUnitAgst.put(battleCard.hippokon,   "4h,4a");
        battleUnitAgst.put(battleCard.hoplite,    "3c,1t");
        battleUnitAgst.put(battleCard.hydra,      "4w");
        battleUnitAgst.put(battleCard.manticore,  "4k");
        battleUnitAgst.put(battleCard.medusa,     "6g");
        battleUnitAgst.put(battleCard.mGreekHero, "");
        battleUnitAgst.put(battleCard.minotaur,   "4c");
        battleUnitAgst.put(battleCard.toxotes,    "4f,3w");
        //Egypt
        battleUnitAgst.put(battleCard.anubite,    "4a");
        battleUnitAgst.put(battleCard.chariotarcher,"3f,3w");
        battleUnitAgst.put(battleCard.elephant,   "2t");
        battleUnitAgst.put(battleCard.mummy,      "");
        battleUnitAgst.put(battleCard.pharaoh,    "4m");
        battleUnitAgst.put(battleCard.phoenix,    "4k");
        battleUnitAgst.put(battleCard.priest,     "5m");
        battleUnitAgst.put(battleCard.scorpionman,"4t");
        battleUnitAgst.put(battleCard.sonofosiris,"4m");
        battleUnitAgst.put(battleCard.spearman,   "3c,4h");
        battleUnitAgst.put(battleCard.sphinx,     "6g");
        battleUnitAgst.put(battleCard.wadjet,     "4c");        
    }
    
    protected void initUnitType(){
        //Norse
        battleUnitType.put(battleCard.cNorseHero, "h");
        battleUnitType.put(battleCard.dwarf,      "k");
        battleUnitType.put(battleCard.froseGiant, "g");
        battleUnitType.put(battleCard.hNorseHero, "h");
        battleUnitType.put(battleCard.huskarl,    "w");
        battleUnitType.put(battleCard.jarl,       "c");
        battleUnitType.put(battleCard.mNorseHero, "h");
        battleUnitType.put(battleCard.nidhogg,    "f");
        battleUnitType.put(battleCard.throwingAxe,"a");
        battleUnitType.put(battleCard.troll,      "w");
        battleUnitType.put(battleCard.valkyrie,   "c");
        //Greek
        battleUnitType.put(battleCard.centaur,    "c");
        battleUnitType.put(battleCard.cGreekHero, "h");
        battleUnitType.put(battleCard.cyclops,    "g");
        battleUnitType.put(battleCard.hGreekHero, "h");
        battleUnitType.put(battleCard.hippokon,   "c");
        battleUnitType.put(battleCard.hoplite,    "w");
        battleUnitType.put(battleCard.hydra,      "g");
        battleUnitType.put(battleCard.manticore,  "f");
        battleUnitType.put(battleCard.medusa,     "k");
        battleUnitType.put(battleCard.mGreekHero, "h");
        battleUnitType.put(battleCard.minotaur,   "w");
        battleUnitType.put(battleCard.toxotes,    "a");
        //Egypt
        battleUnitType.put(battleCard.anubite,    "c");
        battleUnitType.put(battleCard.chariotarcher,"c");
        battleUnitType.put(battleCard.elephant,   "g");
        battleUnitType.put(battleCard.mummy,      "m");
        battleUnitType.put(battleCard.pharaoh,    "h");
        battleUnitType.put(battleCard.phoenix,    "f");
        battleUnitType.put(battleCard.priest,     "h");
        battleUnitType.put(battleCard.scorpionman,"g");
        battleUnitType.put(battleCard.sonofosiris,"h");
        battleUnitType.put(battleCard.spearman,   "w");
        battleUnitType.put(battleCard.sphinx,     "k");
        battleUnitType.put(battleCard.wadjet,     "w");         
    }
    
    protected void initUnitSpec(){
        //norse
        battleUnitSpec.put(battleCard.dwarf,      "1,2");//no wall//gold +2
        battleUnitSpec.put(battleCard.hNorseHero, "3");//dice +2//no tie
        battleUnitSpec.put(battleCard.huskarl,    "3");
        battleUnitSpec.put(battleCard.mGreekHero, "4");//elimin unit, add unit
        battleUnitSpec.put(battleCard.nidhogg,    "5");//build -2
        battleUnitSpec.put(battleCard.valkyrie,   "6");//elimin unit, favor +2
        //greek
        battleUnitType.put(battleCard.cyclops,    "7");//throw
        battleUnitType.put(battleCard.hGreekHero, "8");//retreat
        battleUnitType.put(battleCard.hydra,      "9");//elimin unit, dice +1
        battleUnitType.put(battleCard.medusa,     "10");//win tie
        battleUnitType.put(battleCard.mGreekHero, "11");//add oppo dice
        
        
    }
    
    protected ArrayList<card> permanCardCulture(String culture){
        ArrayList<card> permanCardC = new ArrayList<>();
        switch(culture){
            case"norse":
                permanCardC.add(card.Nattack); //1
                permanCardC.add(card.Nbuild);  //2
                permanCardC.add(card.Nexplore);//3
                permanCardC.add(card.Ngather); //4
                permanCardC.add(card.Nnextage);//5
                permanCardC.add(card.Nrecruit);//6
                permanCardC.add(card.Ntrade);  //7
            break;
            case"greek":
                permanCardC.add(card.Gattack); //1
                permanCardC.add(card.Gbuild);  //2
                permanCardC.add(card.Gexplore);//3
                permanCardC.add(card.Ggather); //4
                permanCardC.add(card.Gnextage);//5
                permanCardC.add(card.Grecruit);//6
                permanCardC.add(card.Gtrade);  //7
            break;
            case"egypt":
                permanCardC.add(card.Eattack); //1
                permanCardC.add(card.Ebuild);  //2
                permanCardC.add(card.Eexplore);//3
                permanCardC.add(card.Egather); //4
                permanCardC.add(card.Enextage);//5
                permanCardC.add(card.Erecruit);//6
                permanCardC.add(card.Etrade);  //7
            break;
        }
        return permanCardC;
    }
    
    protected ArrayList<battleCard> battleUnitCulture(String culture){
        ArrayList<battleCard> battleU = new ArrayList<>();
        if (culture.equalsIgnoreCase("norse")){
            battleU.add(battleCard.cNorseHero);
            battleU.add(battleCard.dwarf);
            battleU.add(battleCard.froseGiant);
            battleU.add(battleCard.hNorseHero);
            battleU.add(battleCard.huskarl);
            battleU.add(battleCard.jarl);
            battleU.add(battleCard.mNorseHero);
            battleU.add(battleCard.nidhogg);
            battleU.add(battleCard.throwingAxe);
            battleU.add(battleCard.troll);
            battleU.add(battleCard.valkyrie);          
        } else if (culture.equalsIgnoreCase("greek")) {
            battleU.add(battleCard.centaur);
            battleU.add(battleCard.cGreekHero);
            battleU.add(battleCard.cyclops);
            battleU.add(battleCard.hGreekHero);
            battleU.add(battleCard.hippokon);
            battleU.add(battleCard.hoplite);
            battleU.add(battleCard.hydra);
            battleU.add(battleCard.manticore);
            battleU.add(battleCard.medusa);
            battleU.add(battleCard.mGreekHero);
            battleU.add(battleCard.minotaur);
            battleU.add(battleCard.toxotes);
        } else if (culture.equalsIgnoreCase("egypt")){
            battleU.add(battleCard.anubite);
            battleU.add(battleCard.chariotarcher);
            battleU.add(battleCard.elephant);
            battleU.add(battleCard.mummy);
            battleU.add(battleCard.pharaoh);
            battleU.add(battleCard.phoenix);
            battleU.add(battleCard.priest);
            battleU.add(battleCard.scorpionman);
            battleU.add(battleCard.sonofosiris);
            battleU.add(battleCard.spearman);
            battleU.add(battleCard.sphinx);
            battleU.add(battleCard.wadjet);
        }
        return battleU;
    }   
}