package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Troll;
import ankhmorpork.GameObjects.Cards.CityAreaCard;

public class LordRustSelachiiWorde implements WinningCondition {

	@Override
	public Boolean isWinner(int PlayerID) {
		int numberOfPlayers = Game.lstPlayers.size();
		Player objPlayer = Game.GetPlayer(PlayerID);
		if (numberOfPlayers == 2)
			return ControlledArea(objPlayer,7);
	   else if (numberOfPlayers == 3)
		   return ControlledArea(objPlayer,5);
	   else if (numberOfPlayers == 4)
		   return ControlledArea(objPlayer,4);
	   return Boolean.FALSE;
	}
	
	private boolean ControlledArea(Player objPlayer,int controlledAreaChk)
	{
		int trollCount = 0 ;
		//ArrayList<Troll> lstTrolls = Game.lstTrolls;
		for(Troll objtroll : Game.lstTrolls )
		{
			if(objtroll.getArea_id()!=0)
			{
				trollCount++;
			}
		}
		
		
		int buildingCounter = 0;
		int minionCounter = 0;
		ArrayList<Building> lstOfBuilding = Game.GetBuildingsByPlayerID(objPlayer.getPlayer_id());
		for(Building objBuilding : lstOfBuilding){
			if(objBuilding.getArea_id() != 0){
				int areaId = objBuilding.getArea_id();
				if(!Game.AreaHasDemon(areaId))
				{
					buildingCounter++;
				}
			}
		}
		
		ArrayList<Minion> lstOfMinion = Game.GetMinionsByPlayerID(objPlayer.getPlayer_id());
		for(Minion objMinion : lstOfMinion){
			if(objMinion.getArea_id() != 0){
				int areaId = objMinion.getArea_id();
				if(!Game.AreaHasDemon(areaId))
				{
					minionCounter++;
				}
			}
		}
		
		//checks number of player minion or building is greater than no of troll in the game
		if((minionCounter > trollCount) || (buildingCounter > trollCount) ){
			//checks number of player minion or building is greater than controlled area condition in the game
			if((minionCounter > controlledAreaChk) || (buildingCounter > controlledAreaChk)){
				return Boolean.TRUE;
			}
		}	
		return Boolean.FALSE;
				
	}

}



