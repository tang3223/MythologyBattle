package mythologybattle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Random;

/**
 * Project Mythology Battle
 * Term Project For CECS 543
 * Group Member Qianyi(Charles) Tang; Yunzan(Ned) Hu
 * Current Iteration: Iteration I
 * @author Qianyi Tang
 */

//types of all terrain and resource cube
public class MBproduction {
    //All 90 terrain
    ArrayList<terrainTypeEnum> terrainType = new ArrayList<>();
    //18 init terrain
    ArrayList<terrainTypeEnum> terrainPool = new ArrayList<>();
    //exile terrain
    ArrayList<terrainTypeEnum> exiledTile = new ArrayList<>();
    //maps of terrainType and resource pic path and its resourcecube
    EnumMap<terrainTypeEnum,String> terrainResource = new EnumMap<>(terrainTypeEnum.class);
    public enum terrainTypeEnum {
        fertileA ("/mythologybattle/resource/Fertile1Favor.png"), 
        fertileG ("/mythologybattle/resource/Fertile1Gold.png"), 
        fertileW ("/mythologybattle/resource/Fertile1Wood.png"),
        fertileF ("/mythologybattle/resource/Fertile2Food.png"),
        forestA  ("/mythologybattle/resource/Forest1Favor.png"),
        forestG  ("/mythologybattle/resource/Forest1Gold.png"),
        forestW  ("/mythologybattle/resource/Forest2Wood.png"),
        forestF  ("/mythologybattle/resource/Forest1Food.png"),
        hillA    ("/mythologybattle/resource/Hills1Favor.png"),
        hillG    ("/mythologybattle/resource/Hills2GOld.png"),
        hillW    ("/mythologybattle/resource/Hills1Wood.png"),
        hillF    ("/mythologybattle/resource/Hills1Food.png"),
        mountainA("/mythologybattle/resource/Mountain1Favor.png"),
        mountainG("/mythologybattle/resource/Mountain2Gold.png"),
        mountainW("/mythologybattle/resource/Mountain1Wood.png"),
        swampA   ("/mythologybattle/resource/Swamp1Favor.png"),
        swampW   ("/mythologybattle/resource/Swamp1Wood.png"),
        swampF   ("/mythologybattle/resource/Swamp1Food.png"),
        desertA  ("/mythologybattle/resource/Desert2Favor.png"),
        desertG  ("/mythologybattle/resource/Desert1Gold.png");
        private final String resourceImage;
        
        private terrainTypeEnum(String resourcePath){
            this.resourceImage = resourcePath;
        }
        public String getPath(){
            return this.resourceImage;
        }    
    };
    
    protected void initTerrainResource(){
        terrainResource.put(terrainTypeEnum.fertileA,  "1");
        terrainResource.put(terrainTypeEnum.fertileG,  "1");
        terrainResource.put(terrainTypeEnum.fertileW,  "1");
        terrainResource.put(terrainTypeEnum.fertileF,  "2");
        terrainResource.put(terrainTypeEnum.forestA,   "1");
        terrainResource.put(terrainTypeEnum.forestG,   "1");
        terrainResource.put(terrainTypeEnum.forestW,   "2");
        terrainResource.put(terrainTypeEnum.forestF,   "1");
        terrainResource.put(terrainTypeEnum.hillA,     "1");
        terrainResource.put(terrainTypeEnum.hillG,     "2");
        terrainResource.put(terrainTypeEnum.hillW,     "1");
        terrainResource.put(terrainTypeEnum.hillF,     "1");
        terrainResource.put(terrainTypeEnum.mountainA, "1");
        terrainResource.put(terrainTypeEnum.mountainG, "2");
        terrainResource.put(terrainTypeEnum.mountainW, "1");
        terrainResource.put(terrainTypeEnum.swampA,    "1");
        terrainResource.put(terrainTypeEnum.swampW,    "1");
        terrainResource.put(terrainTypeEnum.swampF,    "1");
        terrainResource.put(terrainTypeEnum.desertA,   "2");
        terrainResource.put(terrainTypeEnum.desertG,   "1");
    }
    
    public enum buildingType{
        woodWork   ("/mythologybattle/resource/WoodWork.png"),
        market     ("/mythologybattle/resource/Market.png"),
        house      ("/mythologybattle/resource/House.png"),
        starting   ("/mythologybattle/resource/"),
        monument   ("/mythologybattle/resource/Monument.png"),
        granary    ("/mythologybattle/resource/Granary.png"),
        storeHouse ("/mythologybattle/resource/Storehouse.png"),
        siegeEngine("/mythologybattle/resource/SiegeWork.png"),
        greatTemple("/mythologybattle/resource/GreatTemple.png"),
        armory     ("/mythologybattle/resource/Armory.png"),
        wall       ("/mythologybattle/resource/Wall.png"),
        wonder     ("/mythologybattle/resource/Wonder.png"),
        goldMint   ("/mythologybattle/resource/GoldMint.png"),
        quarry     ("/mythologybattle/resource/Quarry.png"),
        tower      ("/mythologybattle/resource/Tower.png");
        private final String buildImage;
        
        private buildingType(String resourcePath){
            this.buildImage = resourcePath;
        }
        public String getPath(){
            return this.buildImage;
        }
    }
    
    protected int getResourceCube(terrainTypeEnum terrain){
        return Integer.parseInt(terrainResource.get(terrain));
    }

    //add 90 tile to initialize the production set
    protected void initProduction(){
        //min 90 tiles
        terrainType.ensureCapacity(90);
        //fertile
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.fertileA);
        }
        for (int i = 0; i < 3; i++){
            terrainType.add(terrainTypeEnum.fertileG);
        }
        for (int i = 0; i < 3; i++){
            terrainType.add(terrainTypeEnum.fertileW);
        }
        for (int i = 0; i < 12; i++){
            terrainType.add(terrainTypeEnum.fertileF);
        }
        //forest
        for (int i = 0; i < 2; i++){
            terrainType.add(terrainTypeEnum.forestA);
        }
        for (int i = 0; i < 2; i++){
            terrainType.add(terrainTypeEnum.forestG);
        }
        for (int i = 0; i < 9; i++){
            terrainType.add(terrainTypeEnum.forestW);
        }
        for (int i = 0; i < 2; i++){
            terrainType.add(terrainTypeEnum.forestF);
        }
        //hill
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.hillA);
        }
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.hillG);
        }
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.hillW);
        }
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.hillF);
        }
        //mountain
        for (int i = 0; i < 3; i++){
            terrainType.add(terrainTypeEnum.mountainA);
        }
        for (int i = 0; i < 3; i++){
            terrainType.add(terrainTypeEnum.mountainW);
        }
        for (int i = 0; i < 6; i++){
            terrainType.add(terrainTypeEnum.mountainG);
        }
        //desert
        for (int i = 0; i < 7; i++){
            terrainType.add(terrainTypeEnum.desertA);
        }
        for (int i = 0; i < 7; i++){
            terrainType.add(terrainTypeEnum.desertG);
        }
        //swamp
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.swampA);
        }
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.swampW);
        }
        for (int i = 0; i < 4; i++){
            terrainType.add(terrainTypeEnum.swampF);
        }
        
    }
    
    //randomize all 90 production tiles
    private void randomizeProduction(){
        long seed = System.nanoTime();
        Collections.shuffle(terrainType, new Random(seed));
    }
    
    //add centain number of tiles to the initialization popout window
    protected ArrayList<terrainTypeEnum> drawProduction(int tile){
        ArrayList<terrainTypeEnum> blockTile = new ArrayList<>();
        //shuffle        
        randomizeProduction();        
        
        for (int i = 0; i < tile; i ++){
            blockTile.add(terrainType.get(i));
        }
        terrainPool = blockTile;
        return blockTile;
    }
    
    //exile selected tiles
    protected void exileProduction(terrainTypeEnum tile){
        exiledTile.add(tile);
    }
    
    protected void returnProduction(int tile){
    }
    
    
}
