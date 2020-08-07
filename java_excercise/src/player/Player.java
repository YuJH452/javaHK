package player;


public class Player {
	
	private String name;
	private String position;
	private int pay;
	private int bNumber;
	private String foreign;
	
	public Player() {
	
	}
	
	
	
	public Player(String name, String position, int pay, int bNumber,String foreign) {
		
		this.name = name;
		this.position = position;
		this.pay = pay;
		this.bNumber = bNumber;
		this.foreign = foreign;
	}

	


	public String getForeign() {
		return foreign;
	}



	public void setForeign(String foreign) {
		this.foreign = foreign;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getbNumber() {
		return bNumber;
	}

	public void setbNumber(int bNumber) {
		this.bNumber = bNumber;
	}

	

	
	


	@Override
	public String toString() {
		return "선수이름 : " + name + ", 포지션 :" + position +  ", 연봉:" + pay + ", 등번호:"
				+ bNumber +"용병 여부 (Y/N) : " + foreign;
	}
	
	
}
