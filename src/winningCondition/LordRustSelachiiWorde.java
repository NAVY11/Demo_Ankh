package winningCondition;

import java.util.ArrayList;

import ankhmorpork.Game.Game;
import ankhmorpork.GameObjects.Area;
import ankhmorpork.GameObjects.Building;
import ankhmorpork.GameObjects.Minion;
import ankhmorpork.GameObjects.Player;
import ankhmorpork.GameObjects.Cards.CityAreaCard;

public class LordRustSelachiiWorde implements WinningCondition {

	@Override
	public Boolean isWinner(int PlayerID) {
		int numberOfPlayers = Game.lstPlayers.size();
		Player objPlayer = Game.GetPlayer(PlayerID);
		//ArrayList<CityAreaCard> lstCityAreaCard = Game.GetCityAreaCardByPlayerID(PlayerID);
		if (numberOfPlayers == 2)
			return ControlledArea(objPlayer,7);
	   else if (numberOfPlayers == 3)
	        //Controlled Area
		   return Boolean.TRUE;
	   else if (numberOfPlayers == 4)
	        //Controlled Area
		   return Boolean.TRUE;
	   return Boolean.FALSE;
	}
	
	private boolean ControlledArea(Player objPlayer,int controlledAreaChk)
	{
		//Area objArea = new Area();
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
		
		if((minionCounter > controlledAreaChk) && (buildingCounter > controlledAreaChk)){
			
			return Boolean.TRUE;
		}
			
		return Boolean.FALSE;
				
	}

}



