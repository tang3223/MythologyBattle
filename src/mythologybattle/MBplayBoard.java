package mythologybattle;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Project Mythology Battle
 * Term Project For CECS 543
 * Group Member Qianyi(Charles) Tang; Yunzan(Ned) Hu
 * Current Iteration: Iteration I
 * @author Qianyi Tang
 */
public class MBplayBoard {
    MBplayer players = new MBplayer();
    MBproduction productions = new MBproduction();
    MBcard cards = new MBcard();
    mythologyBattleGui gui;
    Random dice = new Random();
    Random aiRandom = new Random();
    Random aiRandom2 = new Random();
    boolean randomCardBuff;
    
    protected void selectTerrain(){
       
    }
    
    protected void initGame(){
        players.initPlayer();
        productions.initProduction();
        productions.initTerrainResource();
        cards.initUnitRoll();
        cards.initUnitAgst();
        cards.initUnitSpec();
        cards.initUnitType();
    } 
    
    //select culture while initializing
    protected void selectCulture(String culture){
        players.setHumanCulture(culture);
        initRcard();
        players.initBattleUnit();
    }
    
    protected String humanCulture(){
        return players.getHumanCulture();
    }
    
    protected String AICulture1(){
        return players.getAICulture1();
    }
    
    protected String AICulture2(){
        return players.getAICulture2();
    }
    
    protected MBproduction.terrainTypeEnum getIndiTerrain(int index){
        return productions.terrainPool.get(index);
    }
    
    protected ArrayList<MBproduction.terrainTypeEnum> getPool(){
        return productions.terrainPool;
    }
    
    protected void exileTerrain(MBproduction.terrainTypeEnum tile){
        productions.exileProduction(tile);
    }
    
    protected ArrayList<String> fetchTilePicPath(int tile){
        ArrayList<MBproduction.terrainTypeEnum> localTerrain;
        ArrayList<String> picPath = new ArrayList<>();
        localTerrain = productions.drawProduction(tile);
        for (int i = 0; i < tile; i++){
            picPath.add(localTerrain.get(i).getPath());;          
        }
        return picPath;
    }
    
    protected void runSquence(int coordinate, JLabel selected){
    }
    
    protected void TileSelected(int tile) {
        
    }
    
    protected void setCube(String player, String color, int cube){
       players.setCubes(player, color, cube);
    }
    
    protected void setCubeOnCard(String player, String card, int cube){
       players.setCubesOnCard(player, card, cube);
    }
    
    protected int getVectCube(String player, String card){
        return players.getCubesOnCard(player, card);
    }
    
    protected ArrayList<MBcard.card> getPermaCardGp(String culture){
        return cards.permanCardCulture(culture);
    }
    
    protected void changeHandCard(String player, String operation, MBcard.card card){
        switch(player){
            case"human":
                switch(operation){
                    case"remove":
                        if(!players.humanPlayer.handCard.isEmpty()){
                            players.humanPlayer.handCard.remove(card);
                        }
                    break;
                    case"add":
                        players.humanPlayer.handCard.add(card);
                    break;
                    default:
                    break;                        
                }
            break;
            case"ai1":
                switch(operation){
                    case"remove":
                        if(!players.aiPlayer1.handCard.isEmpty()){
                            players.aiPlayer1.handCard.remove(card);
                        }
                    break;
                    case"add":
                        players.aiPlayer1.handCard.add(card);
                    break;
                    default:
                    break;                        
                }
            break;
            case"ai2":
                switch(operation){
                    case"remove":
                        if(!players.aiPlayer2.handCard.isEmpty()){
                            players.aiPlayer2.handCard.remove(card);
                        }
                    break;
                    case"add":
                        players.aiPlayer2.handCard.add(card);
                    break;
                    default:
                    break;                        
                }
            break;
        }
    }
    
    protected String getAge(String player){
       return players.getPlayerAge(player);
    }
    
    protected ArrayList<MBcard.card> getHandCardGp(String player){
        return players.getHandCard(player);
    }
    protected void updateProductionResourceCube(String player, 
            MBproduction.terrainTypeEnum tile){
        String cubeType = tile.toString().substring(
                tile.toString().length()-1, tile.toString().length());       
        switch(player){
            case"human":
                switch(cubeType){
                    case"A":
                        players.addCubesOnProduction(player, 
                               "blue", productions.getResourceCube(tile));
                    break;
                    case"G":
                        players.addCubesOnProduction(player, 
                               "golden", productions.getResourceCube(tile));
                    break;
                    case"W":
                        players.addCubesOnProduction(player, 
                               "orange", productions.getResourceCube(tile));
                    break;
                    case"F":
                        players.addCubesOnProduction(player, 
                               "green", productions.getResourceCube(tile));
                    break;
                    default:
                    break;
               }
            break;
            case"ai1":
                switch(cubeType){
                    case"A":
                        players.addCubesOnProduction(player, 
                               "blue", productions.getResourceCube(tile));
                    break;
                    case"G":
                        players.addCubesOnProduction(player, 
                               "golden", productions.getResourceCube(tile));
                    break;
                    case"W":
                        players.addCubesOnProduction(player, 
                               "orange", productions.getResourceCube(tile));
                    break;
                    case"F":
                        players.addCubesOnProduction(player, 
                               "green", productions.getResourceCube(tile));
                    break;
                    default:
                    break;
               }
            break;
            case"ai2":
                switch(cubeType){
                    case"A":
                        players.addCubesOnProduction(player, 
                               "blue", productions.getResourceCube(tile));
                    break;
                    case"G":
                        players.addCubesOnProduction(player, 
                               "golden", productions.getResourceCube(tile));
                    break;
                    case"W":
                        players.addCubesOnProduction(player, 
                               "orange", productions.getResourceCube(tile));
                    break;
                    case"F":
                        players.addCubesOnProduction(player, 
                               "green", productions.getResourceCube(tile));
                    break;
                    default:
                    break;
               }
            break;
        }
    }
    
    protected void gather(String player, String color){
        players.cubeTrans(player, color);
    }
    
    protected int getcube(String player, String color){
        return players.getCubes(player, color);
    }
    
    protected void removeHandCard(String player, MBcard.card hCard){
        players.removeHCard(player, hCard);
    }
    
    protected void trade(String player, String cubeCost, int cubeC,
            String cubeL, int cubeCL,
            String cubeR, int cubeCR){
        //cost of using trade card
        players.setCubes(player, cubeCost, cubeC);
        //cubes waiting to be reduced
        players.setCubes(player, cubeL, cubeCL);
        //cubes waiting to be added
        players.setCubes(player, cubeR, cubeCR);
    }
    
    protected boolean build(String player, String buildTile){
        switch(buildTile){
            case"armory":
                if(players.checkCubes(player, "orange", -3)&
                players.checkCubes(player, "golden", -2))
                {
                    players.setCubes(player, "orange", -3);
                    players.setCubes(player, "golden", -2);
                    players.addBuilding(player, MBproduction.buildingType.armory);
                    return true;
                }
                noResourceDia();
                return false;
            case"woodWork":
                if(players.checkCubes(player, "golden", -3)&
                players.checkCubes(player, "green", -2))
                {
                    players.setCubes(player, "golden", -3);
                    players.setCubes(player, "green", -2);
                    players.addBuilding(player, MBproduction.buildingType.woodWork);
                    return true;
                }
                noResourceDia();
                return false;
            case"market":
                if(players.checkCubes(player, "golden", -3)&
                players.checkCubes(player, "blue", -2))
                {
                    players.setCubes(player, "golden", -3);
                    players.setCubes(player, "blue", -2);
                    players.addBuilding(player, MBproduction.buildingType.market);
                    return true;
                }
                noResourceDia();
                return false;
            case"house":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "green", -2))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "green", -2);
                    players.addBuilding(player, MBproduction.buildingType.house);
                    return true;
                }
                noResourceDia();
                return false;
            case"monument":
                if(players.checkCubes(player, "golden", -2)&
                players.checkCubes(player, "green", -2))
                {
                    players.setCubes(player, "golden", -2);
                    players.setCubes(player, "green", -2);
                    players.addBuilding(player, MBproduction.buildingType.monument);
                    return true;
                }
                noResourceDia();
                return false;
            case"granary":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "golden", -3))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "golden", -3);
                    players.addBuilding(player, MBproduction.buildingType.granary);
                    return true;
                }
                noResourceDia();
                return false;
            case"storeHouse":
                if(players.checkCubes(player, "blue", -2)&
                players.checkCubes(player, "golden", -2)&
                players.checkCubes(player, "green", -2)&
                players.checkCubes(player, "orange", -2))
                {
                    players.setCubes(player, "blue", -2);
                    players.setCubes(player, "golden", -2);
                    players.setCubes(player, "green", -2);
                    players.setCubes(player, "orange", -2);
                    players.addBuilding(player, MBproduction.buildingType.storeHouse);
                    return true;
                }
                noResourceDia();
                return false;
            case"siegeEngine":
                if(players.checkCubes(player, "orange", -3)&
                players.checkCubes(player, "golden", -2))
                {
                    players.setCubes(player, "orange", -3);
                    players.setCubes(player, "golden", -2);
                    players.addBuilding(player, MBproduction.buildingType.siegeEngine);
                    return true;
                }
                noResourceDia();
                return false;
            case"greatTemple":
                if(players.checkCubes(player, "blue", -4)&
                players.checkCubes(player, "golden", -4)&
                players.checkCubes(player, "green", -4)&
                players.checkCubes(player, "orange", -4))
                {
                    players.setCubes(player, "blue", -4);
                    players.setCubes(player, "golden", -4);
                    players.setCubes(player, "green", -4);
                    players.setCubes(player, "orange", -4);
                    players.addBuilding(player, MBproduction.buildingType.greatTemple);
                    return true;
                }
                noResourceDia();
                return false;
            case"wall":
                if(players.checkCubes(player, "orange", -3)&
                players.checkCubes(player, "golden", -3))
                {
                    players.setCubes(player, "orange", -3);
                    players.setCubes(player, "golden", -3);
                    players.addBuilding(player, MBproduction.buildingType.wall);
                    return true;
                }
                noResourceDia();
                return false;
            case"wonder":
                if(players.checkCubes(player, "blue", -10)&
                players.checkCubes(player, "golden", -10)&
                players.checkCubes(player, "green", -10)&
                players.checkCubes(player, "orange", -10))
                {
                    players.setCubes(player, "blue", -10);
                    players.setCubes(player, "golden", -10);
                    players.setCubes(player, "green", -10);
                    players.setCubes(player, "orange", -10);
                    players.addBuilding(player, MBproduction.buildingType.wonder);
                    return true;
                }
                noResourceDia();
                return false;
            case"goldMint":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "green", -3))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "green", -3);
                    players.addBuilding(player, MBproduction.buildingType.goldMint);
                    return true;
                }
                noResourceDia();
                return false;
            case"quarry":
                if(players.checkCubes(player, "golden", -1)&
                players.checkCubes(player, "green", -4))
                {
                    players.setCubes(player, "golden", -1);
                    players.setCubes(player, "green", -4);
                    players.addBuilding(player, MBproduction.buildingType.quarry);
                    return true;
                }
                noResourceDia();
                return false;
            case"tower":
                if(players.checkCubes(player, "orange", -3)&
                players.checkCubes(player, "golden", -3))
                {
                    players.setCubes(player, "orange", -3);
                    players.setCubes(player, "golden", -3);
                    players.addBuilding(player, MBproduction.buildingType.tower);
                    return true;
                }
                noResourceDia();
                return false;
            default:
            noResourceDia();
                return false;               
        }
    }
    
    protected int checkBuilding(String player, MBproduction.buildingType build){
        return players.checkBuildings(player, build);
    }
    
    protected void nextAge(String player){
        switch(player){
            case"human":
                switch(players.humanPlayer.playerAge){
                    case"archaic":
                        if(players.checkCubes(player, "blue", -4)&
                        players.checkCubes(player, "golden", -4)&
                        players.checkCubes(player, "green", -4)&
                        players.checkCubes(player, "orange", -4))
                        {
                            players.setCubes(player, "blue", -4);
                            players.setCubes(player, "golden", -4);
                            players.setCubes(player, "green", -4);
                            players.setCubes(player, "orange", -4);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"classical":
                        if(players.checkCubes(player, "blue", -5)&
                        players.checkCubes(player, "golden", -5)&
                        players.checkCubes(player, "green", -5)&
                        players.checkCubes(player, "orange", -5))
                        {
                            players.setCubes(player, "blue", -5);
                            players.setCubes(player, "golden", -5);
                            players.setCubes(player, "green", -5);
                            players.setCubes(player, "orange", -5);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"heroic":
                        if(players.checkCubes(player, "blue", -6)&
                        players.checkCubes(player, "golden", -6)&
                        players.checkCubes(player, "green", -6)&
                        players.checkCubes(player, "orange", -6))
                        {
                            players.setCubes(player, "blue", -6);
                            players.setCubes(player, "golden", -6);
                            players.setCubes(player, "green", -6);
                            players.setCubes(player, "orange", -6);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;    
                };
            break;
            case"ai1":
                switch(players.aiPlayer1.playerAge){
                     case"archaic":
                        if(players.checkCubes(player, "blue", -4)&
                        players.checkCubes(player, "golden", -4)&
                        players.checkCubes(player, "green", -4)&
                        players.checkCubes(player, "orange", -4))
                        {
                            players.setCubes(player, "blue", -4);
                            players.setCubes(player, "golden", -4);
                            players.setCubes(player, "green", -4);
                            players.setCubes(player, "orange", -4);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"classical":
                        if(players.checkCubes(player, "blue", -5)&
                        players.checkCubes(player, "golden", -5)&
                        players.checkCubes(player, "green", -5)&
                        players.checkCubes(player, "orange", -5))
                        {
                            players.setCubes(player, "blue", -5);
                            players.setCubes(player, "golden", -5);
                            players.setCubes(player, "green", -5);
                            players.setCubes(player, "orange", -5);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"heroic":
                        if(players.checkCubes(player, "blue", -6)&
                        players.checkCubes(player, "golden", -6)&
                        players.checkCubes(player, "green", -6)&
                        players.checkCubes(player, "orange", -6))
                        {
                            players.setCubes(player, "blue", -6);
                            players.setCubes(player, "golden", -6);
                            players.setCubes(player, "green", -6);
                            players.setCubes(player, "orange", -6);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;    
                };
            break;
            case"ai2":
                switch(players.aiPlayer2.playerAge){
                     case"archaic":
                        if(players.checkCubes(player, "blue", -4)&
                        players.checkCubes(player, "golden", -4)&
                        players.checkCubes(player, "green", -4)&
                        players.checkCubes(player, "orange", -4))
                        {
                            players.setCubes(player, "blue", -4);
                            players.setCubes(player, "golden", -4);
                            players.setCubes(player, "green", -4);
                            players.setCubes(player, "orange", -4);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"classical":
                        if(players.checkCubes(player, "blue", -5)&
                        players.checkCubes(player, "golden", -5)&
                        players.checkCubes(player, "green", -5)&
                        players.checkCubes(player, "orange", -5))
                        {
                            players.setCubes(player, "blue", -5);
                            players.setCubes(player, "golden", -5);
                            players.setCubes(player, "green", -5);
                            players.setCubes(player, "orange", -5);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"heroic":
                        if(players.checkCubes(player, "blue", -6)&
                        players.checkCubes(player, "golden", -6)&
                        players.checkCubes(player, "green", -6)&
                        players.checkCubes(player, "orange", -6))
                        {
                            players.setCubes(player, "blue", -6);
                            players.setCubes(player, "golden", -6);
                            players.setCubes(player, "green", -6);
                            players.setCubes(player, "orange", -6);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                };
            break;
            default:
            break;
        }
    }
    /********************************/
    //need to be modified
    protected boolean recruit(String player ,MBcard.battleCard battle){
        //Norse
        if (battle == MBcard.battleCard.cNorseHero){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "golden", -3))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "golden", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.dwarf){
            if(players.checkCubes(player, "green", -2)&
            players.checkCubes(player, "golden", -2))
            {
                players.setCubes(player, "green", -2);
                players.setCubes(player, "golden", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.froseGiant){
            if(players.checkCubes(player, "green", -4)&
                players.checkCubes(player, "blue", -2))
            {
                players.setCubes(player, "green", -4);
                players.setCubes(player, "blue", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.hNorseHero){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "golden", -3))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "golden", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.huskarl){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "golden", -2))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "golden", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.jarl){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "golden", -1))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "golden", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.mNorseHero){
            if(players.checkCubes(player, "green", -4)&
            players.checkCubes(player, "blue", -4))
            {
                players.setCubes(player, "green", -4);
                players.setCubes(player, "blue", -4);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.nidhogg){
            if(players.checkCubes(player, "golden", -4)&
            players.checkCubes(player, "blue", -1))
            {
                players.setCubes(player, "golden", -4);
                players.setCubes(player, "blue", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.throwingAxe){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "orange", -1))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "orange", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.troll){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "orange", -2))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "orange", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.valkyrie){
            if(players.checkCubes(player, "golden", -1)&
            players.checkCubes(player, "blue", -3))
            {
                players.setCubes(player, "golden", -1);
                players.setCubes(player, "blue", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } 
        //Greek  
          else if (battle == MBcard.battleCard.centaur){
            if(players.checkCubes(player, "orange", -3)&
            players.checkCubes(player, "blue", -1))
            {
                players.setCubes(player, "orange", -3);
                players.setCubes(player, "blue", -1);
                players.addUnit(player, battle);
                return true;
            }
              noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.cGreekHero){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "golden", -3))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "golden", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.cyclops){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "blue", -3))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "blue", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.hGreekHero){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "golden", -4))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "golden", -4);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.hippokon){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "golden", -1))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "golden", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.hoplite){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "orange", -1))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "orange", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.hydra){
            if(players.checkCubes(player, "golden", -2)&
            players.checkCubes(player, "blue", -2))
            {
                players.setCubes(player, "golden", -2);
                players.setCubes(player, "blue", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.manticore){
            if(players.checkCubes(player, "green", -2)&
            players.checkCubes(player, "blue", -2))
            {
                players.setCubes(player, "green", -2);
                players.setCubes(player, "blue", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.medusa){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "blue", -3))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "blue", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.mGreekHero){
            if(players.checkCubes(player, "golden", -4)&
            players.checkCubes(player, "blue", -4))
            {
                players.setCubes(player, "golden", -4);
                players.setCubes(player, "blue", -4);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.minotaur){
            if(players.checkCubes(player, "green", -2)&
            players.checkCubes(player, "orange", -2))
            {
                players.setCubes(player, "green", -2);
                players.setCubes(player, "orange", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.toxotes){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "orange", -1))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "orange", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } 
        //Egypt
          else if (battle == MBcard.battleCard.anubite){
            if(players.checkCubes(player, "golden", -3)&
            players.checkCubes(player, "blue", -1))
            {
                players.setCubes(player, "golden", -3);
                players.setCubes(player, "blue", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.chariotarcher){
            if(players.checkCubes(player, "orange", -1)&
            players.checkCubes(player, "golden", -1))
            {
                players.setCubes(player, "orange", -1);
                players.setCubes(player, "golden", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.elephant){
            if(players.checkCubes(player, "green", -2)&
            players.checkCubes(player, "golden", -1))
            {
                players.setCubes(player, "green", -2);
                players.setCubes(player, "golden", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.mummy){
            if(players.checkCubes(player, "blue", -2)&
            players.checkCubes(player, "golden", -3))
            {
                players.setCubes(player, "blue", -2);
                players.setCubes(player, "golden", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.pharaoh){
            if(players.checkCubes(player, "green", -3)&
            players.checkCubes(player, "golden", -3))
            {
                players.setCubes(player, "green", -3);
                players.setCubes(player, "golden", -3);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.phoenix){
            if(players.checkCubes(player, "blue", -3)&
            players.checkCubes(player, "orange", -2))
            {
                players.setCubes(player, "blue", -3);
                players.setCubes(player, "orange", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.priest){
            if(players.checkCubes(player, "golden", -4)&
            players.checkCubes(player, "green", -2))
            {
                players.setCubes(player, "golden", -4);
                players.setCubes(player, "green", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.scorpionman){
            if(players.checkCubes(player, "green", -4)&
            players.checkCubes(player, "golden", -2))
            {
                players.setCubes(player, "green", -4);
                players.setCubes(player, "golden", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.sonofosiris){
            if(players.checkCubes(player, "golden", -4)&
            players.checkCubes(player, "blue", -4))
            {
                players.setCubes(player, "golden", -4);
                players.setCubes(player, "blue", -4);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.spearman){
            if(players.checkCubes(player, "green", -1)&
            players.checkCubes(player, "orange", -1))
            {
                players.setCubes(player, "green", -1);
                players.setCubes(player, "orange", -1);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.sphinx){
            if(players.checkCubes(player, "golden", -2)&
            players.checkCubes(player, "blue", -2))
            {
                players.setCubes(player, "golden", -2);
                players.setCubes(player, "blue", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        } else if (battle == MBcard.battleCard.wadjet){
            if(players.checkCubes(player, "green", -2)&
            players.checkCubes(player, "blue", -2))
            {
                players.setCubes(player, "green", -2);
                players.setCubes(player, "blue", -2);
                players.addUnit(player, battle);
                return true;
            }
            noResourceDia();
            return false;
        }
        return false;
    } 
      
    protected ArrayList<MBcard.battleCard> getBattleUnit(String culture){
        return cards.battleUnitCulture(culture);
    }
    
    protected ArrayList<MBcard.battleCard> getplayerUnit(String player){
        return players.getUnit(player);
    }
    
    protected String attack (MBcard.battleCard Unit, MBcard.battleCard aiUnit, String player){
        String winner = null;
        int buff = 0; 
        int attackerChance = Integer.parseInt(cards.battleUnitRoll.get(Unit));     
        int attackeeChance = Integer.parseInt(cards.battleUnitRoll.get(aiUnit));    
        if (randomCardBuff){
            attackerChance++;
        }
        
        
        if (cards.battleUnitAgst.get(Unit).contains(cards.battleUnitType.get(aiUnit))){
            int p = cards.battleUnitAgst.get(Unit).indexOf(cards.battleUnitType.get(aiUnit)) - 1;
            buff = Integer.parseInt(cards.battleUnitAgst.get(Unit).substring(p, p+1));
            attackerChance += buff;
        } else if (cards.battleUnitAgst.get(aiUnit).contains(cards.battleUnitType.get(Unit))){
            int p = cards.battleUnitAgst.get(aiUnit).indexOf(cards.battleUnitType.get(Unit)) - 1;
            buff = Integer.parseInt(cards.battleUnitAgst.get(aiUnit).substring(p, p+1));
            attackeeChance += buff;
        }       
        
        for (int i = 0; i < 20; i ++){
            int attackerRoll = attacker(attackerChance);
            int attackeeRoll = attackee(attackeeChance);
            if (attackerRoll > attackeeRoll){
                winner = "human";
                break;
            } else if (attackerRoll < attackeeRoll) {
                winner = player;
                break;
            }
        }      
        return winner;
    }    
    
    protected int attacker(int attackerChance){
        int attacker6 = 0;
                
        for (int i = 0; i < attackerChance; i ++){
            if (dice() == 6){
                attacker6 ++;
            }
        }
        return attacker6;      
    }
    
    protected int attackee(int attackeeChance){
        int attackee6 = 0;
        
        for (int i = 0; i < attackeeChance; i ++){
            if (dice() == 6){
                attackee6 ++;
            }
        }
        return attackee6;
    }
    
    protected int dice(){
        return (dice.nextInt(6) + 1);
    }
    
    protected void RanCardBuff(){
        randomCardBuff = true;
    }
    
    protected String groupAttackUnit(MBcard.battleCard Unit, String player, int aiUnitCount){
        ArrayList<MBcard.battleCard> aiUnit = new ArrayList<>();
        aiUnit = getplayerUnit(player);
        MBcard.battleCard aiTemp;
        String winner = null;
        if (aiUnit.size() == 0){
            JOptionPane.showMessageDialog(
                        null, "Battle Win" , "Information",
                        JOptionPane.WARNING_MESSAGE);
        } else {
            aiTemp = aiUnit.get(aiRandom.nextInt(aiUnit.size()));
            winner = attack(Unit,aiTemp,player);
            if (winner.equalsIgnoreCase("human")){
                players.removeUnit(player, aiTemp);
            } else {
                players.removeUnit("human", Unit);
            }
        }
        randomCardBuff = false;
        return winner;
        
    }
    
    /***************************************/
    protected boolean randomCost(String player,int cost){
        if(!players.checkCubes(player,"blue",cost))
        {
            noResourceDia();
            return false;
        }
        else
        {
            players.setCubes(player,"blue",cost);
            return true;
        }
    }
    
    protected MBcard.card drawRcard()
    {
        if(players.humanPlayer.randomCard.size()==0)
        {
            initRcard();
        }
        MBcard.card card=players.humanPlayer.randomCard.get(0);
        players.humanPlayer.randomCard.remove(0);
        return card;
    }
    
    protected void gainFoodPerFoodtile(String player,int amount){
        int food=0;
        switch(player.toLowerCase()){
            case"human":
                for(int i=0;i<players.humanPlayer.tile.size();i++)
                {
                   if(players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.fertileF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.forestF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.hillF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.swampF)
                       food+=amount;
                }
                setCube(player, "green", food);
                break;
            case"ai1":
                for(int i=0;i<players.humanPlayer.tile.size();i++)
                {
                   if(players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.fertileF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.forestF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.hillF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.swampF)
                       food+=amount;
                }
                setCube(player, "green", food);
                break;
            case"ai2":
                for(int i=0;i<players.humanPlayer.tile.size();i++)
                {
                   if(players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.fertileF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.forestF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.hillF||
                           players.humanPlayer.tile.get(i)==MBproduction.terrainTypeEnum.swampF)
                       food+=amount;
                }
                setCube(player, "green", food);
                break;
            default:
                break;
        }
    }
    
    protected void gainResource(String player,String cubeColor,int amount){
        if(!players.setCubes(player,cubeColor,amount))
            noResourceDia();
    }
    
    protected void gain4Resource(String player){
        players.setCubes(player,"blue",1);
        players.setCubes(player,"orange",1);
        players.setCubes(player,"golden",1);
        players.setCubes(player,"green",1);
    }
    protected void initRcard(){
        players.humanPlayer.randomCard=cards.randomCardCulture(players.getHumanCulture());
        players.aiPlayer1.randomCard=cards.randomCardCulture(players.getAICulture1());
        players.aiPlayer2.randomCard=cards.randomCardCulture(players.getAICulture2());
    }
    
    protected void addTile(MBproduction.terrainTypeEnum tile, String player){
        switch(player.toLowerCase()){
            case"human":
                players.humanPlayer.tile.add(tile);
                break;
            case"ai1":
                players.aiPlayer1.tile.add(tile);
                break;
            case"ai2":
                players.aiPlayer2.tile.add(tile);
                break;
            default:
                break;
        }
    }
    protected boolean buildLess(String player, String buildTile){
        switch(buildTile){
            case"armory":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "golden", -1))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "golden", -1);
                    players.addBuilding(player, MBproduction.buildingType.armory);
                    return true;
                }
                noResourceDia();
                return false;
            case"woodWork":
                if(players.checkCubes(player, "golden", -2)&
                players.checkCubes(player, "green", -1))
                {
                    players.setCubes(player, "golden", -2);
                    players.setCubes(player, "green", -1);
                    players.addBuilding(player, MBproduction.buildingType.woodWork);
                    return true;
                }
                noResourceDia();
                return false;
            case"market":
                if(players.checkCubes(player, "golden", -2)&
                players.checkCubes(player, "blue", -1))
                {
                    players.setCubes(player, "golden", -2);
                    players.setCubes(player, "blue", -1);
                    players.addBuilding(player, MBproduction.buildingType.market);
                    return true;
                }
                noResourceDia();
                return false;
            case"house":
                if(players.checkCubes(player, "orange", -1)&
                players.checkCubes(player, "green", -1))
                {
                    players.setCubes(player, "orange", -1);
                    players.setCubes(player, "green", -1);
                    players.addBuilding(player, MBproduction.buildingType.house);
                    return true;
                }
                noResourceDia();
                return false;
            case"monument":
                if(players.checkCubes(player, "golden", -1)&
                players.checkCubes(player, "green", -1))
                {
                    players.setCubes(player, "golden", -1);
                    players.setCubes(player, "green", -1);
                    players.addBuilding(player, MBproduction.buildingType.monument);
                    return true;
                }
                noResourceDia();
                return false;
            case"granary":
                if(players.checkCubes(player, "orange", -1)&
                players.checkCubes(player, "golden", -2))
                {
                    players.setCubes(player, "orange", -1);
                    players.setCubes(player, "golden", -2);
                    players.addBuilding(player, MBproduction.buildingType.granary);
                    return true;
                }
                noResourceDia();
                return false;
            case"storeHouse":
                if(players.checkCubes(player, "blue", -1)&
                players.checkCubes(player, "golden", -1)&
                players.checkCubes(player, "green", -2)&
                players.checkCubes(player, "orange", -2))
                {
                    players.setCubes(player, "blue", -1);
                    players.setCubes(player, "golden", -1);
                    players.setCubes(player, "green", -2);
                    players.setCubes(player, "orange", -2);
                    players.addBuilding(player, MBproduction.buildingType.storeHouse);
                    return true;
                }
                noResourceDia();
                return false;
            case"siegeEngine":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "golden", -1))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "golden", -1);
                    players.addBuilding(player, MBproduction.buildingType.siegeEngine);
                    return true;
                }
                noResourceDia();
                return false;
            case"greatTemple":
                if(players.checkCubes(player, "blue", -4)&
                players.checkCubes(player, "golden", -4)&
                players.checkCubes(player, "green", -3)&
                players.checkCubes(player, "orange", -3))
                {
                    players.setCubes(player, "blue", -4);
                    players.setCubes(player, "golden", -4);
                    players.setCubes(player, "green", -3);
                    players.setCubes(player, "orange", -3);
                    players.addBuilding(player, MBproduction.buildingType.greatTemple);
                    return true;
                }
                noResourceDia();
                return false;
            case"wall":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "golden", -2))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "golden", -2);
                    players.addBuilding(player, MBproduction.buildingType.wall);
                    return true;
                }
                noResourceDia();
                return false;
            case"wonder":
                if(players.checkCubes(player, "blue", -10)&
                players.checkCubes(player, "golden", -9)&
                players.checkCubes(player, "green", -9)&
                players.checkCubes(player, "orange", -10))
                {
                    players.setCubes(player, "blue", -10);
                    players.setCubes(player, "golden", -9);
                    players.setCubes(player, "green", -9);
                    players.setCubes(player, "orange", -10);
                    players.addBuilding(player, MBproduction.buildingType.wonder);
                    return true;
                }
                noResourceDia();
                return false;
            case"goldMint":
                if(players.checkCubes(player, "orange", -1)&
                players.checkCubes(player, "green", -2))
                {
                    players.setCubes(player, "orange", -1);
                    players.setCubes(player, "green", -2);
                    players.addBuilding(player, MBproduction.buildingType.goldMint);
                    return true;
                }
                noResourceDia();
                return false;
            case"quarry":
                if(players.checkCubes(player, "golden", -1)&
                players.checkCubes(player, "green", -2))
                {
                    players.setCubes(player, "golden", -1);
                    players.setCubes(player, "green", -2);
                    players.addBuilding(player, MBproduction.buildingType.quarry);
                    return true;
                }
                noResourceDia();
                return false;
            case"tower":
                if(players.checkCubes(player, "orange", -2)&
                players.checkCubes(player, "golden", -2))
                {
                    players.setCubes(player, "orange", -2);
                    players.setCubes(player, "golden", -2);
                    players.addBuilding(player, MBproduction.buildingType.tower);
                    return true;
                }
                noResourceDia();
                return false;
            default:
            noResourceDia();
                return false;               
        }
    }
    protected void noResourceDia()
    {
    JOptionPane.showMessageDialog(
                    null, "You do not have enough resouce cubes that this card requires", "Information",
                    JOptionPane.WARNING_MESSAGE);
        }
    protected void randomNextAge(String player){
        player=player.toLowerCase();
        switch(player){
            case"human":
                switch(players.humanPlayer.playerAge){
                    case"archaic":
                        if(players.checkCubes(player, "blue", -3)&
                        players.checkCubes(player, "golden", -3)&
                        players.checkCubes(player, "green", -3)&
                        players.checkCubes(player, "orange", -3))
                        {
                            players.setCubes(player, "blue", -3);
                            players.setCubes(player, "golden", -3);
                            players.setCubes(player, "green", -3);
                            players.setCubes(player, "orange", -3);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"classical":
                        if(players.checkCubes(player, "blue", -4)&
                        players.checkCubes(player, "golden", -4)&
                        players.checkCubes(player, "green", -4)&
                        players.checkCubes(player, "orange", -4))
                        {
                            players.setCubes(player, "blue", -4);
                            players.setCubes(player, "golden", -4);
                            players.setCubes(player, "green", -4);
                            players.setCubes(player, "orange", -4);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"heroic":
                        if(players.checkCubes(player, "blue", -5)&
                        players.checkCubes(player, "golden", -5)&
                        players.checkCubes(player, "green", -5)&
                        players.checkCubes(player, "orange", -5))
                        {
                            players.setCubes(player, "blue", -5);
                            players.setCubes(player, "golden", -5);
                            players.setCubes(player, "green", -5);
                            players.setCubes(player, "orange", -5);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;    
                };
            break;
            case"ai1":
                switch(players.aiPlayer1.playerAge){
                     case"archaic":
                        if(players.checkCubes(player, "blue", -3)&
                        players.checkCubes(player, "golden", -3)&
                        players.checkCubes(player, "green", -3)&
                        players.checkCubes(player, "orange", -3))
                        {
                            players.setCubes(player, "blue", -3);
                            players.setCubes(player, "golden", -3);
                            players.setCubes(player, "green", -3);
                            players.setCubes(player, "orange", -3);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"classical":
                        if(players.checkCubes(player, "blue", -4)&
                        players.checkCubes(player, "golden", -4)&
                        players.checkCubes(player, "green", -4)&
                        players.checkCubes(player, "orange", -4))
                        {
                            players.setCubes(player, "blue", -4);
                            players.setCubes(player, "golden", -4);
                            players.setCubes(player, "green", -4);
                            players.setCubes(player, "orange", -4);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"heroic":
                        if(players.checkCubes(player, "blue", -5)&
                        players.checkCubes(player, "golden", -5)&
                        players.checkCubes(player, "green", -5)&
                        players.checkCubes(player, "orange", -5))
                        {
                            players.setCubes(player, "blue", -5);
                            players.setCubes(player, "golden", -5);
                            players.setCubes(player, "green", -5);
                            players.setCubes(player, "orange", -5);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;    
                };
            break;
            case"ai2":
                switch(players.aiPlayer2.playerAge){
                     case"archaic":
                        if(players.checkCubes(player, "blue", -3)&
                        players.checkCubes(player, "golden", -3)&
                        players.checkCubes(player, "green", -3)&
                        players.checkCubes(player, "orange", -3))
                        {
                            players.setCubes(player, "blue", -3);
                            players.setCubes(player, "golden", -3);
                            players.setCubes(player, "green", -3);
                            players.setCubes(player, "orange", -3);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"classical":
                        if(players.checkCubes(player, "blue", -4)&
                        players.checkCubes(player, "golden", -4)&
                        players.checkCubes(player, "green", -4)&
                        players.checkCubes(player, "orange", -4))
                        {
                            players.setCubes(player, "blue", -4);
                            players.setCubes(player, "golden", -4);
                            players.setCubes(player, "green", -4);
                            players.setCubes(player, "orange", -4);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                    case"heroic":
                        if(players.checkCubes(player, "blue", -5)&
                        players.checkCubes(player, "golden", -5)&
                        players.checkCubes(player, "green", -5)&
                        players.checkCubes(player, "orange", -5))
                        {
                            players.setCubes(player, "blue", -5);
                            players.setCubes(player, "golden", -5);
                            players.setCubes(player, "green", -5);
                            players.setCubes(player, "orange", -5);
                            players.nextAges(player);
                        }
                        else noResourceDia();
                    break;
                };
            break;
            default:
            break;
        }
    }
    
    protected ArrayList<MBproduction.buildingType> getBuilding(int player){
        ArrayList<MBproduction.buildingType> building = new ArrayList<>();
        if(player==0)
            building=players.humanPlayer.building;
        if(player==1)
            building=players.aiPlayer1.building;
        if(player==2)
            building=players.aiPlayer2.building;
        return building;
    }
    
    protected ArrayList<MBproduction.terrainTypeEnum> getTile(int player){
        ArrayList<MBproduction.terrainTypeEnum> building = new ArrayList<>();
        if(player==0)
            building=players.humanPlayer.tile;
        if(player==1)
            building=players.aiPlayer1.tile;
        if(player==2)
            building=players.aiPlayer2.tile;
        return building;
    }
    
    protected String getName(MBproduction.buildingType building){
        String name="";
        if(building==MBproduction.buildingType.armory)
            name="armoy";
        if(building==MBproduction.buildingType.goldMint)
            name="goldMint";
        if(building==MBproduction.buildingType.granary)
            name="granary";
        if(building==MBproduction.buildingType.greatTemple)
            name="greatTemple";
        if(building==MBproduction.buildingType.house)
            name="house";
        if(building==MBproduction.buildingType.market)
            name="market";
        if(building==MBproduction.buildingType.monument)
            name="monument";
        if(building==MBproduction.buildingType.quarry)
            name="quarry";
        if(building==MBproduction.buildingType.siegeEngine)
            name="siegeEngine";
        if(building==MBproduction.buildingType.starting)
            name="starting";
        if(building==MBproduction.buildingType.storeHouse)
            name="storeHouse";
        if(building==MBproduction.buildingType.tower)
            name="tower";
        if(building==MBproduction.buildingType.wall)
            name="wall";
        if(building==MBproduction.buildingType.wonder)
            name="wonder";
        if(building==MBproduction.buildingType.woodWork)
            name="woodWork";
        return name;
    }
    
     protected String getTileName(MBproduction.terrainTypeEnum tile){
        String name="";
        if(tile==MBproduction.terrainTypeEnum.desertA)
            name="Desert: Flavor +2";
        if(tile==MBproduction.terrainTypeEnum.desertG)
            name="Desert: Gold +1";
        if(tile==MBproduction.terrainTypeEnum.fertileA)
            name="Fertile: Flavor +1";
        if(tile==MBproduction.terrainTypeEnum.fertileF)
            name="Fertile: Food +2";
        if(tile==MBproduction.terrainTypeEnum.fertileG)
            name="Fertile: Gold +1";
        if(tile==MBproduction.terrainTypeEnum.fertileW)
            name="Fertile: Wood +1";
        if(tile==MBproduction.terrainTypeEnum.forestA)
            name="Forest: Flavor +1";
        if(tile==MBproduction.terrainTypeEnum.forestF)
            name="Forest: Food +1";
        if(tile==MBproduction.terrainTypeEnum.forestG)
            name="Forest: Gold +1";
        if(tile==MBproduction.terrainTypeEnum.forestW)
            name="Forest: Wood +2";
        if(tile==MBproduction.terrainTypeEnum.hillA)
            name="Hill: Flavor +1";
        if(tile==MBproduction.terrainTypeEnum.hillF)
            name="Hill: Food +1";
        if(tile==MBproduction.terrainTypeEnum.hillG)
            name="Hill: Gold +2";
        if(tile==MBproduction.terrainTypeEnum.hillW)
            name="Hill: Wood +1";
        if(tile==MBproduction.terrainTypeEnum.mountainA)
            name="Mountain: Flavor +1";
        if(tile==MBproduction.terrainTypeEnum.mountainG)
            name="Mountain: Gold +2";
        if(tile==MBproduction.terrainTypeEnum.mountainW)
            name="Mountain: Wood +1";
        if(tile==MBproduction.terrainTypeEnum.swampA)
            name="Swamp: Flavor +1";
        if(tile==MBproduction.terrainTypeEnum.swampF)
            name="Swamp: Food +1";
        if(tile==MBproduction.terrainTypeEnum.swampW)
            name="Swamp: Wood +1";
        return name;
     }
    
    protected void removeBuilding(String player, int i){
        players.removeBuilding(player,i);
    }
    
    protected void removeTile(String player,int i)
    {
        players.removeTile(player,i);
    }
    
    protected void add2Toxotes(String player)
    {
        player=player.toLowerCase();
        if(player=="human")
        {
            players.humanPlayer.battleCard.add(MBcard.battleCard.toxotes);
            players.humanPlayer.battleCard.add(MBcard.battleCard.toxotes);
        }
        if(player=="ai1")
        {
            players.aiPlayer1.battleCard.add(MBcard.battleCard.toxotes);
            players.aiPlayer1.battleCard.add(MBcard.battleCard.toxotes);
        }
        if(player=="ai2")
        {
            players.aiPlayer2.battleCard.add(MBcard.battleCard.toxotes);
            players.aiPlayer2.battleCard.add(MBcard.battleCard.toxotes);
        }
    }
    protected void add2Axe(String player)
    {
        player=player.toLowerCase();
        if(player=="human")
        {

players.humanPlayer.battleCard.add(MBcard.battleCard.throwingAxe);

players.humanPlayer.battleCard.add(MBcard.battleCard.throwingAxe);
        }
        if(player=="ai1")
        {
            players.aiPlayer1.battleCard.add(MBcard.battleCard.throwingAxe);
            players.aiPlayer1.battleCard.add(MBcard.battleCard.throwingAxe);
        }
        if(player=="ai2")
        {
            players.aiPlayer2.battleCard.add(MBcard.battleCard.throwingAxe);
            players.aiPlayer2.battleCard.add(MBcard.battleCard.throwingAxe);
        }
    }

    protected void addHero(String player, String age)
    {
        player=player.toLowerCase();
        String culture;
        if(age=="archaic")
            return;
        if(age=="classical")
        {
            if(player=="human")
            {
                culture=players.getHumanCulture();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.humanPlayer.battleCard.add(MBcard.battleCard.cGreekHero);
                if(culture=="norse")
                    players.humanPlayer.battleCard.add(MBcard.battleCard.cNorseHero);
            }
            if(player=="ai1")
            {
                culture=players.getAICulture1();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.aiPlayer1.battleCard.add(MBcard.battleCard.cGreekHero);
                if(culture=="norse")
                    players.aiPlayer1.battleCard.add(MBcard.battleCard.cNorseHero);
            }
            if(player=="ai2")
            {
                culture=players.getAICulture2();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.aiPlayer2.battleCard.add(MBcard.battleCard.cGreekHero);
                if(culture=="norse")
                    players.aiPlayer2.battleCard.add(MBcard.battleCard.cNorseHero);
            }
        }
        if(age=="heroic")
        {
            if(player=="human")
            {
                culture=players.getHumanCulture();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.humanPlayer.battleCard.add(MBcard.battleCard.hGreekHero);
                if(culture=="norse")
                    players.humanPlayer.battleCard.add(MBcard.battleCard.hNorseHero);
            }
            if(player=="ai1")
            {
                culture=players.getAICulture1();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.aiPlayer1.battleCard.add(MBcard.battleCard.hGreekHero);
                if(culture=="norse")
                    players.aiPlayer1.battleCard.add(MBcard.battleCard.hNorseHero);
            }
            if(player=="ai2")
            {
                culture=players.getAICulture2();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.aiPlayer2.battleCard.add(MBcard.battleCard.hGreekHero);
                if(culture=="norse")
                    players.aiPlayer2.battleCard.add(MBcard.battleCard.hNorseHero);
            }
        }
        if(age=="mythic")
        {
            if(player=="human")
            {
                culture=players.getHumanCulture();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.humanPlayer.battleCard.add(MBcard.battleCard.mGreekHero);
                if(culture=="norse")
                    players.humanPlayer.battleCard.add(MBcard.battleCard.mNorseHero);
            }
            if(player=="ai1")
            {
                culture=players.getAICulture1();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.aiPlayer1.battleCard.add(MBcard.battleCard.mGreekHero);
                if(culture=="norse")
                    players.aiPlayer1.battleCard.add(MBcard.battleCard.mNorseHero);
            }
            if(player=="ai2")
            {
                culture=players.getAICulture2();
                if(culture=="egypt"){
                    return;
                    }
                if(culture=="greek")
                    players.aiPlayer2.battleCard.add(MBcard.battleCard.mGreekHero);
                if(culture=="norse")
                    players.aiPlayer2.battleCard.add(MBcard.battleCard.mNorseHero);
            }
        }
    }
    
    protected MBcard.card aiCard(String player, int card){
        return players.AIhandCard(player,card);
    }
    
    protected void addToAiHandCard(){
        int r1 = aiRandom.nextInt(1);
        int r2 = aiRandom.nextInt(1);
        if (r1 == 0){
        players.aiPlayer1.handCard.add(aiCard("ai1",2));
        players.aiPlayer1.handCard.add(aiCard("ai1",4));
        } else if (r1 == 1){
        players.aiPlayer1.handCard.add(aiCard("ai1",1));
        players.aiPlayer1.handCard.add(aiCard("ai1",3));
        } 
        players.aiPlayer1.handCard.add(aiCard("ai1",5));
        players.aiPlayer1.handCard.add(aiCard("ai1",6));
        if (r2 == 0){
        players.aiPlayer2.handCard.add(aiCard("ai2",2));
        players.aiPlayer2.handCard.add(aiCard("ai2",4));}
        else if (r2 == 1){
        players.aiPlayer1.handCard.add(aiCard("ai2",1));
        players.aiPlayer1.handCard.add(aiCard("ai2",3));    
        }
        players.aiPlayer2.handCard.add(aiCard("ai2",5));
        players.aiPlayer2.handCard.add(aiCard("ai2",6));
    }
    
    protected void removeHandCard(String player){
        if(player.equalsIgnoreCase("human")){
            players.humanPlayer.handCard.clear();
        }
        if(player.equalsIgnoreCase("ai1")){
            players.aiPlayer1.handCard.clear();
        }
        if(player.equalsIgnoreCase("ai2")){
            players.aiPlayer2.handCard.clear();
        }
    }
    
}
