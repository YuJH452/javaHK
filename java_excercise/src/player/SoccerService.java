package player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SoccerService {

	Scanner sc = new Scanner(System.in);
	List<Player> plist = new ArrayList<>();
	List<Team> tlist = new ArrayList<>();
	int count = 0;

	public void update() {
		System.out.println("변경할 선수명 검색 :");
		String un = sc.nextLine();
		

		}



	public void getTeamList() {
		System.out.println("구단 리스트");
		for (Team t : tlist) {
			System.out.println(t);
		}

	}

	public void insertTeam() {

		System.out.println("구단명 : ");
		String teamName = sc.nextLine();
		System.out.println("보유 머니:");
		String teamMoney = sc.nextLine();

		tlist.add(new Team(teamName, teamMoney));

	}
	
	public void deleteTeam() {
		System.out.println("삭제할 구단명 ");
		String tn = sc.nextLine();
		
		for(Team t : tlist) {
			if(t.getTeamName().equals(tn)) plist.remove(t);
		}
		
	}

	public void insertPlayer() {
		
		System.out.print("선수 이름: ");
		String name = sc.nextLine();
		System.out.print("포지션 :");
		String position = sc.nextLine();
		System.out.print("연봉 :");
		int pay = Integer.parseInt(sc.nextLine());
		System.out.print("등번호 :");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("용병 여부(Y/N):");
		String foreign = sc.nextLine().toUpperCase();
	
		plist.add(new Player(name, position, pay, number, foreign));
	}

	public void deletePlayer() {
		
		System.out.println("삭제할 선수 이름");
		String pn = sc.nextLine();
		for(Player p : plist)
		if(p.getName().equals(pn)) {
		plist.remove(pn);	
		
		}
	}

	public void selectPlayer() {
		System.out.println("선수 리스트");
		for (Player p : plist) {
			System.out.println(p);
		}
	}



	public void buyPlayer() {
		
		Team selecteam = selectTeam();
	
		Player p = new Player();
		
		selecteam.addPlayer(p);
		
		
		
	}
	
	public Team selectTeam() {
		
		System.out.println("팀 목록");
		for(int i = 0 ; i < tlist.size() ; i ++ ) {
			System.out.println( "팀 번호 : " + i + " 팀 이름 : " + tlist.get(i).getTeamName());
		}
		
		System.out.println("선택할 팀 번호");
		String teamNumber = sc.nextLine();
		
		return tlist.get(Integer.parseInt(teamNumber));
		
	}
	
	

}
