package test;



import java.util.Scanner;

import player.SoccerService;






public class TestMain {
	public static void main(String[] args) {
			int choice = 0;
			
			
			
			
			Scanner sc = new Scanner(System.in);
		
			SoccerService ss = new SoccerService();
			
		
			  while(true) {
//				  try {
////				FileInputStream fis = new FileInputStream("book.dat");
//					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("team.dat"));
//					  
//				  }catch(FileNotFoundException e) {
//					  e.printStackTrace();
//				  } catch (IOException e) {
//					  // TODO Auto-generated catch block
//					  e.printStackTrace();
//				  } catch (ClassNotFoundException e) {
//					  // TODO Auto-generated catch block
//					  e.printStackTrace();
//				  }
		             
	              
	                System.out.println("========================================================================================================");
	                System.out.println("1.구단  입력 | 2.구단 검색 | 3.구단정보 삭제 | 4.선수 정보 추가 | 5.선수 리스트 | 6.선수정보 수정 | 7.구단 선수 추가  |8.구단 선수 삭제 | 0.나가기");
	                System.out.println("========================================================================================================");
	                
	                System.out.println("어느 작업을 하시겠습니까? >>");
	                choice = sc.nextInt();
	                 
	                switch(choice) {
	                    case 1://구단 입력
	                        ss.insertTeam();
	                        break;
	                    case 2://구단 검색
	                    	ss.getTeamList();
	                        break;
	                    case 3://선수정보 삭제
	                    	ss.deleteTeam();
	                        break;
	                    case 4: // 선수 정보 추가
	                    	ss.insertPlayer();
	                    	break;
	                    case 5: // 선수 리스트
	                    	ss.selectPlayer();
	                    	break;
	                    case 6:
	                    	ss.buyPlayer();
	                    	break;
	                    case 7:
	                    	break;
	                    case 8:
	                    	break;
	                    case 0:
	                    	System.exit(0);
	                    default:
	                        System.out.println("오류");
	                }
	             
	                
	             
//	                try {
//	                	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("team.txt"));
//	                	
//	                	oos.flush();
//	                	oos.close();
//	                }catch(FileNotFoundException e) {
//	                	e.printStackTrace();
//	                }catch(IOException e) {
//	                	e.printStackTrace();
//	                }
	        }
	    }
	 
	}

