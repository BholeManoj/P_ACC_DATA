package March_18.Maven_Project;
public class mock {
	public static void main(String[] args) {
		String str  = "hello java";
		String rev = " ";
		int a = str.length();
		a--;
		for(int i = a ;i<=0 ; i--)
		{
				rev = rev + rev.charAt(i);
				System.out.print(rev);
		}
		System.out.print(rev);
	}
}
