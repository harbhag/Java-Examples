public class beersong {
	public static void main (String[] args) {
		int bnum = 99;
		//String word = "bottles";
		//String sigword = "bottle";
		while ( bnum > 0){
			if(bnum > 1)
				{
					System.out.println(bnum+" bottles of beer on the wall, " + bnum + " bottles of beer.");
					bnum = bnum - 1;
					if (bnum == 1)
					{
						System.out.println("Take one down and pass it around, " + bnum +" bottle of beer on the wall.");
					}
					else
					{
						System.out.println("Take one down and pass it around, " + bnum +" bottles of beer on the wall.");
					}
				}
				
			if(bnum == 1){
					System.out.println(bnum+" bottle of beer on the wall, " + bnum +" bottle  of beer.");
					bnum = bnum - 1;
					if(bnum == 0)
					{
						System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
					}
				}
			}
			
			System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
			System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
		
	}
}
					
				
				
