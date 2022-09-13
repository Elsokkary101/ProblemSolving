import java.util.Scanner;

public class Games {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		player [] team = new player [n];
		for (int i = 0 ; i  < n ; i++) {
			team [i] = new player(sc.nextInt(),sc.nextInt());
		}
		
		int ans = 0;
		
		for (int i = 0 ; i  < team.length ; i++) {
			for (int j = 0 ; j  < team.length ; j++) {
				if (i == j)continue;
				if (team[i].home == team[j].away)
					ans++;
			}
		}
		
		System.out.println(ans);
		
		
	}
}


class player  {
	int home;
	int away;
	
	public player (int home , int away) {
		this.home = home;
		this.away = away;
	}
}
