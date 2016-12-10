package mythologybattle;

import java.util.ArrayList;
import java.util.Random;

/**
 * Project Mythology Battle
 * Term Project For CECS 543
 * Group Member Qianyi(Charles) Tang; Yunzan(Ned) Hu
 * Current Iteration: Iteration I
 * @author Qianyi Tang
 */
public class MBplayer {
    ArrayList<String> totalCulture = new ArrayList<String>();
    Random random = new Random();
    protected class player{
        protected String playerCulture;
        //resource cube
        protected int    rCube,oCube,bCube,gCube,goCube;
        //resource cube on production
        protected int    rCubeP,oCubeP,bCubeP,gCubeP,goCubeP;
        //red cube on vectory card
        protected int    rCubeOnTLA;
        protected int    rCubeOnMB;
        protected int    rCubeOnTW;
        protected int    rCubeOnTLB;
        //handcard
        protected ArrayList<MBcard.card> handCard = new ArrayList<>();
        //age
        protected String playerAge;
        //building
        protected ArrayList<MBproduction.buildingType> building = new ArrayList<>();
        //battle unit
        protected ArrayList<MBcard.battleCard> battleCard = new ArrayList<>();
        /*************************/
        protected ArrayList<MBcard.card> randomCard = new ArrayList<>();
        //ProductionTile
        protected ArrayList<MBproduction.terrainTypeEnum> tile = new ArrayList<>();
        }   
    class hPlayer   extends player{       
    }
    class aiPlayer1 extends player{        
    }
    class aiPlayer2 extends player{
    }
    
    protected void initPlayer(){
        totalCulture.add("norse");
        totalCulture.add("greek");
        totalCulture.add("egypt");
        setCubes("human","orange",4);
        setCubes("human","blue"  ,4);
        setCubes("human","green" ,4);
        setCubes("human","golden",4);
        setCubes("ai1"  ,"orange",4);
        setCubes("ai1"  ,"blue"  ,4);
        setCubes("ai1"  ,"green" ,4);
        setCubes("ai1"  ,"golden",4);
        setCubes("ai2"  ,"orange",4);
        setCubes("ai2"  ,"blue"  ,4);
        setCubes("ai2"  ,"green" ,4);
        setCubes("ai2"  ,"golden",4);
        setPlayerAge("human","archaic");
        setPlayerAge("ai1","archaic");
        setPlayerAge("ai2","archaic");
    }
    
    hPlayer humanPlayer = new hPlayer();
    aiPlayer1 aiPlayer1 = new aiPlayer1();
    aiPlayer2 aiPlayer2 = new aiPlayer2();
    
    protected void setHumanCulture(String culture){
        if (totalCulture.indexOf(culture) != -1){
            humanPlayer.playerCulture = culture;
            totalCulture.remove(culture);
            setAICulture1(totalCulture.get(random.nextInt(2)));
        }
      }
    
    protected void setAICulture1(String culture){
        if (totalCulture.indexOf(culture) != -1){
            aiPlayer1.playerCulture = culture;
            totalCulture.remove(culture);
            setAICulture2(totalCulture.get(random.nextInt(1)));
        }
      }
    
    protected void setAICulture2(String culture){
        if (totalCulture.indexOf(culture) != -1){
            aiPlayer2.playerCulture = culture;
        }
      }
    
    protected String getHumanCulture(){
        return humanPlayer.playerCulture;
      }
    
    protected String getAICulture1(){
        return aiPlayer1.playerCulture;
      }
    
    protected String getAICulture2(){
        return aiPlayer2.playerCulture;
      }
    
    protected boolean setCubes(String player, String color, int cube){        
        switch(player){
            //HumanPlayer
            case"human":
                switch(color){
                    case"red":
                        if(humanPlayer.rCube+cube>0)
                        {
                        humanPlayer.rCube += cube;
                        return true;
                        }
                        
                        return false;
                    case"orange":
                        if(humanPlayer.oCube+cube>0)
                        {
                        humanPlayer.oCube += cube;
                        return true;
                        }
                        return false;
                    case"blue":
                        if(humanPlayer.bCube+cube>0)
                        {
                        humanPlayer.bCube += cube;
                        return true;
                        }
                        return false;
                    case"green":
                        if(humanPlayer.gCube+cube>0)
                        {
                        humanPlayer.gCube += cube;
                        return true;
                        }
                        return false;
                    case"golden":
                        if(humanPlayer.goCube+cube>0)
                        {
                        humanPlayer.goCube += cube;
                        return true;
                        }
                        return false;
                    default:
                    return false;
                }
            //AI1
            case"ai1":
                switch(color){
                    case"red":
                        if(aiPlayer1.rCube+cube>0)
                        {
                        aiPlayer1.rCube += cube;
                        return true;
                        }
                        return false;
                    case"orange":
                        if(aiPlayer1.oCube+cube>0)
                        {
                        aiPlayer1.oCube += cube;
                        return true;
                        }
                        return false;
                    case"blue":
                        if(aiPlayer1.bCube+cube>0)
                        {
                        aiPlayer1.bCube += cube;
                        return true;
                        }
                        return false;
                    case"green":
                        if(aiPlayer1.gCube+cube>0)
                        {
                        aiPlayer1.gCube += cube;
                        return true;
                        }
                        return false;
                    case"golden":
                        if(aiPlayer1.goCube+cube>0)
                        {
                        aiPlayer1.goCube += cube;
                        return true;
                        }
                        return false;
                    default:
                    return false;
                }
            //AI2
            case"ai2":
                switch(color){
                    case"red":
                        if(aiPlayer2.rCube+cube>0)
                        {
                        aiPlayer2.rCube += cube;
                        return true;
                        }
                        return false;
                    case"orange":
                        if(aiPlayer2.oCube+cube>0)
                        {
                        aiPlayer2.oCube += cube;
                        return true;
                        }
                        return false;
                    case"blue":
                        if(aiPlayer2.bCube+cube>0)
                        {
                        aiPlayer2.bCube += cube;
                        return true;
                        }
                        return false;
                    case"green":
                        if(aiPlayer2.gCube+cube>0)
                        {
                        aiPlayer2.gCube += cube;
                        return true;
                        }
                        return false;
                    case"golden":
                        if(aiPlayer2.goCube+cube>0)
                        {
                        aiPlayer2.goCube += cube;
                        return true;
                        }
                        return false;
                        default:
                    return false;
                }
        }
        return false;
    } 
    
    protected void addCubesOnProduction(String player, String color, int cube){        
        switch(player){
            //HumanPlayer
            case"human":
                switch(color){
                    case"red":
                        humanPlayer.rCubeP += cube;
                        break;
                    case"orange":
                        humanPlayer.oCubeP += cube;
                        break;
                    case"blue":
                        humanPlayer.bCubeP += cube;
                        break;
                    case"green":
                        humanPlayer.gCubeP += cube;
                        break;
                    case"golden":
                        humanPlayer.goCubeP += cube;
                        break;
                    default:
                    break;
                }
            break;
            //AI1
            case"ai1":
                switch(color){
                    case"red":
                        aiPlayer1.rCubeP += cube;
                        break;
                    case"orange":
                        aiPlayer1.oCubeP += cube;
                        break;
                    case"blue":
                        aiPlayer1.bCubeP += cube;
                        break;
                    case"green":
                        aiPlayer1.gCubeP += cube;
                        break;
                    case"golden":
                        aiPlayer1.goCubeP += cube;
                        break;
                    default:
                    break;
                }
            break;
            //AI2
            case"ai2":
                switch(color){
                    case"red":
                        aiPlayer2.rCubeP += cube;
                        break;
                    case"orange":
                        aiPlayer2.oCubeP += cube;
                        break;
                    case"blue":
                        aiPlayer2.bCubeP += cube;
                        break;
                    case"green":
                        aiPlayer2.gCubeP += cube;
                        break;
                    case"golden":
                        aiPlayer2.goCubeP += cube;
                        break;
                    default:
                    break;
                }
            break;
            default:
            break;
        }
    }
    
    protected void setCubesOnCard(String player, String card, int cube){
        switch(player){
            //HumanPlayer
            case"human":
                switch(card){
                    case"tla":
                        humanPlayer.rCubeOnTLA += cube;
                        break;
                    case"mb":
                        humanPlayer.rCubeOnMB  += cube;
                        break;
                    case"tw":
                        humanPlayer.rCubeOnTW  += cube;
                        break;
                    case"tlb":
                        humanPlayer.rCubeOnTLB += cube;
                        break;
                    default:
                    break;
                }
            break;
            //AI1
            case"ai1":
                switch(card){
                    case"tla":
                        aiPlayer1.rCubeOnTLA += cube;
                        break;
                    case"mb":
                        aiPlayer1.rCubeOnMB  += cube;
                        break;
                    case"tw":
                        aiPlayer1.rCubeOnTW  += cube;
                        break;
                    case"tlb":
                        aiPlayer1.rCubeOnTLB += cube;
                        break;
                    default:
                    break;
                }
            break;
            //AI2
            case"ai2":
                switch(card){
                    case"tla":
                        aiPlayer2.rCubeOnTLA += cube;
                        break;
                    case"mb":
                        aiPlayer2.rCubeOnMB  += cube;
                        break;
                    case"tw":
                        aiPlayer2.rCubeOnTW  += cube;
                        break;
                    case"tlb":
                        aiPlayer2.rCubeOnTLB += cube;
                        break;
                    default:
                    break;
                }
            break;
            default:
            break;
        }
    }
    
    protected void setPlayerAge(String player, String age){
        switch(player){
            //HumanPlayer
            case"human":
                switch(age){
                    case"archaic":
                        humanPlayer.playerAge = "archaic";
                        break;
                    case"classical":
                        humanPlayer.playerAge = "classical";
                        break;
                    case"heroic":
                        humanPlayer.playerAge = "heroic";
                        break;
                    case"mythic":
                        humanPlayer.playerAge = "mythic";
                        break;
                    default:
                    break;
                }
            break;
            //AI1
            case"ai1":
                switch(age){
                    case"archaic":
                        aiPlayer1.playerAge = "archaic";
                        break;
                    case"classical":
                        aiPlayer1.playerAge = "classical";
                        break;
                    case"heroic":
                        aiPlayer1.playerAge = "heroic";
                        break;
                    case"mythic":
                        aiPlayer1.playerAge = "mythic";
                        break;
                    default:
                    break;
                }
            break;
            //AI2
            case"ai2":
                switch(age){
                    case"archaic":
                        aiPlayer2.playerAge = "archaic";
                        break;
                    case"classical":
                        aiPlayer2.playerAge = "classical";
                        break;
                    case"heroic":
                        aiPlayer2.playerAge = "heroic";
                        break;
                    case"mythic":
                        aiPlayer2.playerAge = "mythic";
                        break;
                    default:
                    break;
                }
            break;
            default:
            break;
        }
    }

    protected String getPlayerAge(String player){
        String age = null;
        switch(player){
            case"human":
                age = humanPlayer.playerAge;
            break;
            case"ai1":
                age = aiPlayer1.playerCulture;
            break;
            case"ai2":
                age = aiPlayer2.playerCulture;
            break;
            default:
            break;
        }
        return age;
    }
    
    protected ArrayList<MBcard.card> getHandCard(String player){
        ArrayList<MBcard.card> hCard = new ArrayList<>();
        switch(player){
            case"human":
                hCard = humanPlayer.handCard;
            break;
            case"ai1":
                hCard = aiPlayer1.handCard;
            break;
            case"ai2":
                hCard= aiPlayer2.handCard;
            break;
            default:
            break;
        }
        return hCard;
    }
    
    protected MBcard.card AIhandCard(String player,int card){
        MBcard.card ai = null;
        if (player.equalsIgnoreCase("ai1")){
        if (aiPlayer1.playerCulture.equalsIgnoreCase("norse")){
        if (card == 1){
            ai = MBcard.card.Nattack;
            
        }
        if (card == 2){
            ai =(MBcard.card.Nbuild);
       
        }
        if (card == 3){
            ai =(MBcard.card.Nexplore);
          
        }
        if (card == 4){
            ai =(MBcard.card.Ngather);
          
        }
        if (card == 5){
            ai =(MBcard.card.Nnextage);

        }
        if (card == 6){
            ai =(MBcard.card.Nrecruit);
        
        }
        } else if (aiPlayer1.playerCulture.equalsIgnoreCase("greek")){
        if (card == 1){
            ai =(MBcard.card.Gattack);

        }
        if (card == 2){
            ai =(MBcard.card.Gbuild);
   
        }
        if (card == 3){
            ai =(MBcard.card.Gexplore);
     
        }
        if (card == 4){
            ai =(MBcard.card.Ggather);
   
        }
        if (card == 5){
            ai =(MBcard.card.Gnextage);
       
        }
        if (card == 6){
            ai =(MBcard.card.Grecruit);
   
        }
        }  else if (aiPlayer1.playerCulture.equalsIgnoreCase("egypt")){
        if (card == 1){
            ai =(MBcard.card.Eattack);

        }
        if (card == 2){
            ai =(MBcard.card.Ebuild);

        }
        if (card == 3){
            ai =(MBcard.card.Eexplore);
      
        }
        if (card == 4){
            ai =(MBcard.card.Egather);

        }
        if (card == 5){
            ai =(MBcard.card.Enextage);
   
        }
        if (card == 6){
            ai =(MBcard.card.Erecruit);
         
        }
        }
        }
        if (player.equalsIgnoreCase("ai2")){
        if (aiPlayer2.playerCulture.equalsIgnoreCase("norse")){
        if (card == 1){
            ai =(MBcard.card.Nattack);
           
        }
        if (card == 2){
            ai =(MBcard.card.Nbuild);
         
        }
        if (card == 3){
            ai =(MBcard.card.Nexplore);
    
        }
        if (card == 4){
            ai =(MBcard.card.Ngather);

        }
        if (card == 5){
            ai =(MBcard.card.Nnextage);
         
        }
        if (card == 6){
            ai =(MBcard.card.Nrecruit);
       
        }
        } else if (aiPlayer2.playerCulture.equalsIgnoreCase("greek")){
        if (card == 1){
            ai =(MBcard.card.Gattack);
         
        }
        if (card == 2){
            ai =(MBcard.card.Gbuild);
      
        }
        if (card == 3){
            ai =(MBcard.card.Gexplore);
          
        }
        if (card == 4){
            ai =(MBcard.card.Ggather);
  
        }
        if (card == 5){
            ai =(MBcard.card.Gnextage);
    
        }
        if (card == 6){
            ai =(MBcard.card.Grecruit);
      
        }
        }  else if (aiPlayer2.playerCulture.equalsIgnoreCase("egypt")){
        if (card == 1){
            ai =(MBcard.card.Eattack);
         
        }
        if (card == 2){
            ai =(MBcard.card.Ebuild);
     
        }
        if (card == 3){
            ai =(MBcard.card.Eexplore);
           
        }
        if (card == 4){
            ai =(MBcard.card.Egather);
 
        }
        if (card == 5){
            ai =(MBcard.card.Enextage);
     
        }
        if (card == 6){
            ai =(MBcard.card.Erecruit);
  
        }
        }
        }
        return ai;
    }
    
    protected void cubeTrans(String player, String color){
        switch(player){
            //HumanPlayer
            case"human":
                switch(color){
                    case"red":
                        humanPlayer.rCube += humanPlayer.rCubeP;
                        break;
                    case"orange":
                        humanPlayer.oCube += humanPlayer.oCubeP;
                        break;
                    case"blue":
                        humanPlayer.bCube += humanPlayer.bCubeP;
                        break;
                    case"green":
                        humanPlayer.gCube += humanPlayer.gCubeP;
                        break;
                    case"golden":
                        humanPlayer.goCube += humanPlayer.goCubeP;
                        break;
                    default:
                    break;
                }
            break;
            //AI1
            case"ai1":
                switch(color){
                    case"red":
                        aiPlayer1.rCube += aiPlayer1.rCubeP;
                        break;
                    case"orange":
                        aiPlayer1.oCube += aiPlayer1.oCubeP;
                        break;
                    case"blue":
                        aiPlayer1.bCube += aiPlayer1.bCubeP;
                        break;
                    case"green":
                        aiPlayer1.gCube += aiPlayer1.gCubeP;
                        break;
                    case"golden":
                        aiPlayer1.goCube += aiPlayer1.goCubeP;
                        break;
                    default:
                    break;
                }
            break;
            //AI2
            case"ai2":
                switch(color){
                    case"red":
                        aiPlayer2.rCube += aiPlayer2.rCubeP;
                        break;
                    case"orange":
                        aiPlayer2.oCube += aiPlayer2.oCubeP;
                        break;
                    case"blue":
                        aiPlayer2.bCube += aiPlayer2.bCubeP;
                        break;
                    case"green":
                        aiPlayer2.gCube += aiPlayer2.gCubeP;
                        break;
                    case"golden":
                        aiPlayer2.goCube += aiPlayer2.goCubeP;
                        break;
                    default:
                    break;
                }
            break;
            default:
            break;
        }
    }
    
    protected int getCubes(String player, String color){
        int cube = 0;
        switch(player){
            //HumanPlayer
            case"human":
                switch(color){
                    case"red":
                        cube = humanPlayer.rCube;
                        break;
                    case"orange":
                        cube = humanPlayer.oCube;
                        break;
                    case"blue":
                        cube = humanPlayer.bCube;
                        break;
                    case"green":
                        cube = humanPlayer.gCube;
                        break;
                    case"golden":
                        cube = humanPlayer.goCube;
                        break;
                    default:
                    break;
                }
            break;
            //AI1
            case"ai1":
                switch(color){
                    case"red":
                        cube = aiPlayer1.rCube;
                        break;
                    case"orange":
                        cube = aiPlayer1.oCube;
                        break;
                    case"blue":
                        cube = aiPlayer1.bCube;
                        break;
                    case"green":
                        cube = aiPlayer1.gCube;
                        break;
                    case"golden":
                        cube = aiPlayer1.goCube;
                        break;
                    default:
                    break;
                }
            break;
            //AI2
            case"ai2":
                switch(color){
                    case"red":
                        cube = aiPlayer2.rCube;
                        break;
                    case"orange":
                        cube = aiPlayer2.oCube;
                        break;
                    case"blue":
                        cube = aiPlayer2.bCube;
                        break;
                    case"green":
                        cube = aiPlayer2.gCube;
                        break;
                    case"golden":
                        cube = aiPlayer2.goCube;
                        break;
                    default:
                    break;
                }
            break;
            default:
            break;
        }
        return cube;
    }
    
    protected void removeHCard(String player, MBcard.card hCard){
        switch(player){
            case"human":
                humanPlayer.handCard.remove(hCard);
            break;
            case"ai1":
                aiPlayer1.handCard.remove(hCard);
            break;
            case"ai2":
                aiPlayer2.handCard.remove(hCard);
            break;
            default:
            break;
        }
    }
    
    protected void addBuilding(String player, MBproduction.buildingType build){
        switch(player){
            case"human":
                humanPlayer.building.add(build);
            break;
            case"ai1":
                aiPlayer1.building.add(build);
            break;
            case"ai2":
                aiPlayer2.building.add(build);
            break;
            default:
            break;
        }
    }
    
    protected void removeBuilding(String player, int i){
        switch(player){
            case"human":
                humanPlayer.building.remove(i);
            break;
            case"ai1":
                aiPlayer1.building.remove(i);
            break;
            case"ai2":
                aiPlayer2.building.remove(i);
            break;
            default:
            break;
        }
    }
    protected void removeTile(String player, int i){
        switch(player){
            case"human":
                humanPlayer.tile.remove(i);
            break;
            case"ai1":
                aiPlayer1.tile.remove(i);
            break;
            case"ai2":
                aiPlayer2.tile.remove(i);
            break;
            default:
            break;
        }
    }
    protected int checkBuildings(String player, MBproduction.buildingType build){
        int check = -1;
        switch(player){
            case"human":
                check = humanPlayer.building.indexOf(build);
            break;
            case"ai1":
                check = aiPlayer1.building.indexOf(build);
            break;
            case"ai2":
                check = aiPlayer2.building.indexOf(build);
            break;
            default:
            break;
        }
        return check;
    }
    
    protected void nextAges(String player){
        switch(player){
            case"human":
                switch(humanPlayer.playerAge){
                    case"archaic":
                        humanPlayer.playerAge = "classical";
                    break;
                    case"classical":
                        humanPlayer.playerAge = "heroic";
                    break;
                    case"heroic":
                        humanPlayer.playerAge = "mythic";
                    break;    
                };
            break;
            case"ai1":
                switch(aiPlayer1.playerAge){
                    case"archaic":
                        aiPlayer1.playerAge = "classical";
                    break;
                    case"classical":
                        aiPlayer1.playerAge = "heroic";
                    break;
                    case"heroic":
                        aiPlayer1.playerAge = "mythic";
                    break;
                };
            break;
            case"ai2":
                switch(aiPlayer2.playerAge){
                    case"archaic":
                        aiPlayer2.playerAge = "classical";
                    break;
                    case"classical":
                        aiPlayer2.playerAge = "heroic";
                    break;
                    case"heroic":
                        aiPlayer1.playerAge = "mythic";
                    break;
                };
            break;
            default:
            break;
        }
    }
    
    protected void addUnit(String player ,MBcard.battleCard battle){
       switch(player){
            case"human":
                humanPlayer.battleCard.add(battle);
            break;
            case"ai1":
                aiPlayer1.battleCard.add(battle);
            break;
            case"ai2":
                aiPlayer2.battleCard.add(battle);
            break;
            default:
            break;
        } 
    }
    
    protected void initBattleUnit(){
        switch(humanPlayer.playerCulture){
            case"norse":
                initAddNorse("human");
            break;
            case"greek":
                initAddGreek("human");
            break;
            case"egypt":
                initAddEgypt("human");
            break;
        }
        switch(aiPlayer1.playerCulture){
            case"norse":
                initAddNorse("ai1");
            break;
            case"greek":
                initAddGreek("ai1");
            break;
            case"egypt":
                initAddEgypt("ai1");
            break;
        }
        switch(aiPlayer2.playerCulture){
            case"norse":
                initAddNorse("ai2");
            break;
            case"greek":
                initAddGreek("ai2");
            break;
            case"egypt":
                initAddEgypt("ai2");
            break;
        }      
    }
    
    protected void initAddNorse(String player){
        addUnit(player,MBcard.battleCard.jarl);
        addUnit(player,MBcard.battleCard.jarl);
        addUnit(player,MBcard.battleCard.huskarl);
        addUnit(player,MBcard.battleCard.huskarl);
        addUnit(player,MBcard.battleCard.throwingAxe);
        addUnit(player,MBcard.battleCard.throwingAxe);
    }
    
    protected void initAddGreek(String player){
        addUnit(player,MBcard.battleCard.toxotes);
        addUnit(player,MBcard.battleCard.toxotes);
        addUnit(player,MBcard.battleCard.hoplite);
        addUnit(player,MBcard.battleCard.hoplite);
        addUnit(player,MBcard.battleCard.hippokon);
        addUnit(player,MBcard.battleCard.hippokon);
    }
    
    protected void initAddEgypt(String player){
        addUnit(player,MBcard.battleCard.spearman);
        addUnit(player,MBcard.battleCard.spearman);
        addUnit(player,MBcard.battleCard.elephant);
        addUnit(player,MBcard.battleCard.elephant);
        addUnit(player,MBcard.battleCard.chariotarcher);
        addUnit(player,MBcard.battleCard.chariotarcher);
    }
    
    protected void removeUnit(String player ,MBcard.battleCard battle){
       switch(player){
            case"human":
                humanPlayer.battleCard.remove(humanPlayer.battleCard.indexOf(battle));
            break;
            case"ai1":
                aiPlayer1.battleCard.remove(aiPlayer1.battleCard.indexOf(battle));
            break;
            case"ai2":
                aiPlayer2.battleCard.remove(aiPlayer2.battleCard.indexOf(battle));
            break;
            default:
            break;
        } 
    }
    
    protected ArrayList<MBcard.battleCard> getUnit(String player){
        ArrayList<MBcard.battleCard> unit = new ArrayList<>();
        switch(player){
            case"human":
                unit = humanPlayer.battleCard;
            break;
            case"ai1":
                unit = aiPlayer1.battleCard;
            break;
            case"ai2":
                unit = aiPlayer2.battleCard;
            break;
            default:
            break;
        } 
        return unit;
    }
           
    protected int getCubesOnCard(String player, String card){
        int cube = 0;
        switch(player){
            //HumanPlayer
            case"human":
                switch(card){
                    case"tla":
                        cube = humanPlayer.rCubeOnTLA;
                        break;
                    case"mb":
                        cube = humanPlayer.rCubeOnMB;
                        break;
                    case"tw":
                        cube = humanPlayer.rCubeOnTW;
                        break;
                    case"tlb":
                        cube = humanPlayer.rCubeOnTLB;
                        break;
                    default:
                    break;
                }
            break;
            //AI1
            case"ai1":
                switch(card){
                    case"tla":
                        cube = aiPlayer1.rCubeOnTLA;
                        break;
                    case"mb":
                        cube = aiPlayer1.rCubeOnMB;
                        break;
                    case"tw":
                        cube = aiPlayer1.rCubeOnTW;
                        break;
                    case"tlb":
                        cube = aiPlayer1.rCubeOnTLB ;
                        break;
                    default:
                    break;
                }
            break;
            //AI2
            case"ai2":
                switch(card){
                    case"tla":
                        cube = aiPlayer2.rCubeOnTLA;
                        break;
                    case"mb":
                        cube = aiPlayer2.rCubeOnMB;
                        break;
                    case"tw":
                        cube = aiPlayer2.rCubeOnTW;
                        break;
                    case"tlb":
                        cube = aiPlayer2.rCubeOnTLB;
                        break;
                    default:
                    break;
                }
            break;
            default:
            break;
        }
        return cube;
    }
    /*******************************/
    protected boolean checkCubes(String player, String color, int cube){        
        switch(player){
            //HumanPlayer
            case"human":
                switch(color){
                    case"red":
                        if(humanPlayer.rCube+cube>=0)
                        {
                        return true;
                        }
                        
                        return false;
                    case"orange":
                        if(humanPlayer.oCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"blue":
                        if(humanPlayer.bCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"green":
                        if(humanPlayer.gCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"golden":
                        if(humanPlayer.goCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    default:
                    return false;
                }
            //AI1
            case"ai1":
                switch(color){
                    case"red":
                        if(aiPlayer1.rCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"orange":
                        if(aiPlayer1.oCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"blue":
                        if(aiPlayer1.bCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"green":
                        if(aiPlayer1.gCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"golden":
                        if(aiPlayer1.goCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    default:
                    return false;
                }
            //AI2
            case"ai2":
                switch(color){
                    case"red":
                        if(aiPlayer2.rCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"orange":
                        if(aiPlayer2.oCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"blue":
                        if(aiPlayer2.bCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"green":
                        if(aiPlayer2.gCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                    case"golden":
                        if(aiPlayer2.goCube+cube>=0)
                        {
                        return true;
                        }
                        return false;
                        default:
                    return false;
                }
        }
        return false;
    } 
}

