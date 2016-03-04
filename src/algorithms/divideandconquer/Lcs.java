package algorithms.divideandconquer;

public class Lcs {
	public static void main(String[] args) {
		String x = "ABCDBEF";
		String y = "ABCGHEGF";
		System.out.println(findLcs(x,y));
		findLcsDp(x,y);
	}

	private static String findLcs(String x, String y) {
		int lengthX = x.length();
		int lengthY = y.length();
		if(lengthX==0 || lengthY==0)
			return "";
		if(x.charAt(lengthX-1)==y.charAt(lengthY-1))
			return findLcs(x.substring(0,lengthX-1), y.substring(0,lengthY-1)) +x.charAt(lengthX-1);
		else
		{
			String xT = findLcs(x, y.substring(0,lengthY-1));
			String yT = findLcs(x.substring(0,lengthX-1), y);
			return xT.length() > yT.length() ? xT:yT;
		}
			
	}
	
	private static void findLcsDp(String x, String y) {
		int[][] table = new int[x.length()+1][y.length()+1];
		for(int i=0;i<x.length();i++)
		{
			for (int j = 0; j < y.length(); j++) {
				if(x.charAt(i) == y.charAt(j))
					table[i+1][j+1] = table[i][j]+1;
				else
					table[i+1][j+1] = Math.max(table[i+1][j],table[i][j+1]);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=x.length(),j=y.length();i!=0 && j!=0 ;)
		{
			if(table[i][j] == table[i-1][j])
				i--;
			else if(table[i][j] == table[i][j-1])
				j--;
			else
			{
				if(x.charAt(i-1) == y.charAt(j-1))
					sb.append(x.charAt(i-1));
				i--;
				j--;
			}
		}
		System.out.println(sb.reverse().toString());
	}
}

