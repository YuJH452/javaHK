package player;

import java.util.List;

public class Team {
	private String teamName;
	private String money;
	private List<Player> playerList;
	
	public Team() {
		
	}
	
	
	public Team(String teamName, String money) {
		
		this.teamName = teamName;
		this.money = money;
		
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
	
	

	@Override
	public String toString() {
		return "구단 : " + teamName + ", 보유머니 : " + money ;
	}


	public void insertTeam() {
		
		
	}
	public void selectTeam() {
		
	}

	public boolean equals(Object obj) {
		if(obj instanceof Team) {
			Team team = (Team) obj;
			if(this.teamName == team.getTeamName())
				return true;
			else 
				return false;
		}
		
		return false;
	}


	public void addPlayer(Player player) {
		this.playerList.add(player);
	}
	
}
