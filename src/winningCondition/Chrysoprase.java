package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Player;

public class Chrysoprase implements WinningCondition {

    @Override
    public Boolean isWinner(int PlayerID) {
    	//Area objArea = new Area();
    	int totalAmtByBuilding = 0;
    	ArrayList<Building> lstOfBuilding = Game.GetBuildingsByPlayerID(PlayerID);
    	for(Building objBuilding : lstOfBuilding){
    		if(objBuilding.getArea_id() != 0){
    			int areaId = objBuilding.getArea_id();
    			if(!Game.AreaHasDemon(areaId)){
    				//objArea = Game.GetArea(areaId);
    				totalAmtByBuilding += Game.GetCostByAreaID(areaId);
    			}
    		}
    	
    	}
    	
    	float playerAmt = 0;
    	Player objPlayer = Game.GetPlayer(PlayerID);
    	playerAmt = objPlayer.getPlayer_amount();
    	float totalAmt = playerAmt + totalAmtByBuilding;
    	if(totalAmt >= 50){
    		return Boolean.TRUE;
    	}
    return Boolean.FALSE;	
    }
}
 