public class Reverse {
	public static void main(String[] args) {
		String str="This is the Example Program";
		String[] s=str.split(" ");
		int len=s.length;
		String result="";
		for(int i=0;i<len;i++) {
			if(i%2==0) {
				StringBuffer sb=new StringBuffer(s[i]);
				sb.reverse();
				result+=sb.toString()+" ";
			}
			else {
				result+=s[i]+" ";
			}
			
		}
		System.out.println(result);

	}
}
