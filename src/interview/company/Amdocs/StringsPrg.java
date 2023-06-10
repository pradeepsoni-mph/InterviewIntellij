class StringsPrg
{
	public static void main(String args[])
	{
		String s1 = "This is a Test....";
		String s2,s3;
		s2 = s1.substring(0,12);
	
		//System.out.println(s2);

		s2 = s2.concat("x");
		//System.out.println(s2);

		s3 = s1.substring(13,18);
		//System.out.println(s3);

		s2 = s2.concat(s3);
		System.out.println(s2);
	}
}
