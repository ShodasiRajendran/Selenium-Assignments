package week3.day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text="We learn Java basics as part of java sessions in java week1";
		String[] split=text.split(" ");
		String[] split1=text.split(" ");
		int count = 0;
		for(int i=0; i<split.length;i++) 
		{
			for(int j=split1.length;j>0;j--)
			{
				if(split[i].equals(split1[j-1]))
				{
					count++;
					split[i]="";
					System.out.println(split[i]);
				}
			}
			if(count>0)
			{
				for(i=0;i<split.length;i++)
			
			{
			System.out.println(split[i]);
		}
	}

}
	}
}


//We learn Java basics as part of java sessions in java week1
//We learn Java basics as part of java sessions in java week1
//0	1		2	3	 4  5    6   7    8       9   10   11	