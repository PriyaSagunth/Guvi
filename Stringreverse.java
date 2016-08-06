
public class Stringencrtption {

	private static String output1;
	public static void userCode(String input1)
	{
		char[] Alpha={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] input=input1.toCharArray();
		int Alength=Alpha.length;
		int inputlength=input.length;
		int key=0;
		int inlength=0;
		int resArr[]=new int[inputlength];
		char[] resultArr=new char[inputlength];
		for(int i=inputlength-1;i>=0;i--)
		{
			int a=input[i];
			if((a>=65 && a<=90) || (a>=97 && a<=122))
			{
				inputlength=i+1;
				break;
			}
		}
		inlength=inputlength;
		for(int i=0;i<Alength;i++)
		{
			if(input[inlength-1]==Alpha[i] || input[inlength-1]==alphabet[i])
			{
				key=i+1;
			}
		}
		
		for(int i=0;i<inlength-1;i++)
		{
			for(int j=0;j<Alength;j++)
			{
				if(input[i]==Alpha[j] || input[i]==alphabet[j])
				{
					int a=j+1;
					resArr[i]=a-key;
					if(resArr[i]<=0)
					{
						resArr[i]+=26;
					}
				}
			}
		}
		for(int i=0;i<inlength-1;i++)
		{
			for(int j=0;j<Alength;j++)
			{
				if(input[i]==Alpha[j])
				{
					resultArr[i]=Alpha[(resArr[i]-1)];
				}
				else if(input[i]==alphabet[j])
				{
					resultArr[i]=alphabet[(resArr[i]-1)];
				}
			}
		}
		int length=input.length;
		int i=inlength-1;
		while(i<length){
		    resultArr[i]=input[i];	
		    i++;
		}
		String result=String.valueOf(resultArr);
		output1=result;
	}
	public static void main(String[] args) {
		userCode("java");
		System.out.println(output1);
	}

}
