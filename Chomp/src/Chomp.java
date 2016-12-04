import java.util.*;
public class Chomp {

	public static void main(String[] args) {
		// T'o'D'o' Aut'o'-generated meth'o'd stub
		char m[][]=new char[][]{
			{'0','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'},
			{'o','o','o','o','o','o','o','o','o','o'}
		};
		int player=randStart();
		for(int i=0;i<m.length;i++){
			for(int j= 0; j<m[0].length;j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		do{
			System.out.println("Player "+ player+ "'s turn, Which cookie do you pick?");
			if(player==1){
				player=2;
			}
			else{
				player=1;
			}
			ask(m);
			
		}while(m[0][0]!='X');
		System.out.println("Player "+ player+ " Wins!!!");
		
	}
	
	public static int randStart(){
		return (int) ((Math.random()*2)+1);
	}
	public static void ask(char m[][]){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input row: ");
		int row= in.nextInt();
		System.out.println("Pleasde input columns: ");
		int column= in.nextInt();
		row--;column--;
		for(int i=row;i<m.length;i++){
			for(int j=column;j<m[0].length;j++){
				m[i][j]='X';
			}
		}
		for(int i=0;i<m.length;i++){
			for(int j= 0; j<m[0].length;j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
	

}
