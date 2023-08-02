package Stringassingment;

	public class Assingment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11;
		for(int i=0; i<n; i++)
		{
			//A
		  for(int j=0; j<n; j++)
		  {
			if(i==0&&j>0&&j<(n-1)/2||j==0&&i>0||j==(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2)
			{	
			System.out.print("* ");  
			}
			else
			{
				System.out.print("  ");
			}
		  } 	
	//	  System.out.println();
	//	}
	//	for(int i=0; i<n; i++)
	//	{
		  //B
		  for(int j=0; j<n; j++)
		  {
			if(j==0 || i==0&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || j==(n-1)/2&&i>(n-1)/2&&i<(n-1) || i==(n-1)&&j<(n-1)/2)
			{	
			System.out.print("* ");  
			}
			else
			{
				System.out.print("  ");
			}
		  } 	
	//	  System.out.println();
	//	}
	//	for(int i=0; i<n; i++)
			//	{
		  //C
				  for(int j=0; j<n; j++)
				  {
					if(j==0&&i>0&&i<(n-1) || i==0&&j>0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2&&j>0 || j==(n-1)/2&&i>0&&i<((n-1)/2)-1 || j==(n-1)/2&&i>((n-1)/2)+1&&i<(n-1))
					{	
					System.out.print("* ");  
					}
					else
					{
						System.out.print("  ");
					}
				  } 	
		//		  System.out.println();
		//		}
//					for(int i=0; i<n; i++)
					//	{
				  //D
				  for(int j=0; j<n; j++)
				  {
					if(i==0&&j>0&&j<(n-1)/2||j==0||i==n-1&&j>0&&j<(n-1)/2||j==n-5&&i>0&&i<(n-1))
					{	
					System.out.print("* ");  
					}
					else
					{
						System.out.print("  ");
					}
				  }
//				  System.out.println();
					//	}
//					for(int i=0; i<n; i++)
					//	{
				  //E
						  for(int j=0; j<n; j++)
						  {
							if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2 || i==(n-1)/2&&j<((n-1)/2)-1)
							{	
							System.out.print("* ");  
							}
							else
							{
								System.out.print("  ");
							}
						  } 	
				//		  System.out.println();
				//		}
//		for(int i=0; i<n; i++)
				//	{
						  //F
					  for(int j=0; j<n; j++)
					  {
						if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)/2&&j<((n-1)/2)-1)
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
					  } 	
			//		  System.out.println();
			//		}
//		for(int i=0; i<n; i++)
				//	{
					  //G
					  for(int j=0; j<n; j++)
					  {
						if(j==0&&i>0&&i<(n-1) || i==0&&j>0&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<((n-1)/2)-1 || i==(n-1)&&j>0&&j<((n-1)/2)-1 || j==((n-1)/2)-2&&i>(n-1)/2 || i==((n-1)/2)+1&&j>2&&j<=(n-1)/2 || j==(n-1)/2&&i>(n-1)/2)
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
						}
					//  System.out.println();
					//  } 
//		for(int i=0; i<n; i++)
				//	{
					  //H
					  for(int j=0; j<n; j++)
					  {
						if(j==0 || j==(n-1)/2 || i==(n-1)/2&&j<(n-1)/2)
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
						}
					  System.out.println();
					  } 
            		for(int i=0; i<n; i++)
					{
            			//trangle
					  for(int j=0; j<n; j++)
					  {
						if(j==i&&i>(n-1)/2&&j>(n-1)/2 || i+j==(n-1)&&i>=(n-1)/2&&j<=(n-1)/2 || i==(n-1))
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
						}
					  System.out.println();
					  }
            		System.out.println("  ");
            		for(int i=0; i<n; i++)
					{
            			//temple
					  for(int j=0; j<n; j++)
					  {
						if(j+i<=(n-1)/2 || j-i>=(n-1)/2 || j==0 ||j==(n-1) || i==(n-1) )
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
						}
					  System.out.println();
					  } 
            		System.out.println("  ");
            		for(int i=0; i<n; i++)
					{
            			//P
					  for(int j=0; j<n; j++)
					  {
						if(j==0 ||j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || i==0&&j<(n-1)/2 )
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
						}
				//	  System.out.println();
				//	  } 
            	//	for(int i=0; i<n; i++)
				//	{
					  //W
					  for(int j=0; j<n; j++)
					  {
						if(j==0 ||j==(n-1) || i+j==(n-1)&&i>=(n-1)/2&&j<=(n-1)/2 || i==j&&j>=(n-1)/2&&i>=(n-1)/2 )
						{	
						System.out.print("* ");  
						}
						else
						{
							System.out.print("  ");
						}
						}
					  System.out.print("       ");
				//	  System.out.println();
				//	  } 
//            		for(int i=0; i<n; i++)
    				//	{
					  //S
    					  for(int j=0; j<n; j++)
    					  {
    						if(j==0&&i>0&&i<(n-1)/2 || i==0&&j>0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2&&j>0 || j==(n-1)/2&&i>0&&i<((n-1)/2)-2 || j==(n-1)/2&&i>((n-1)/2)&&i<(n-1) || i==(n-1)/2&&j>0&&j<(n-1)/2 || j==0&&i<(n-1)&&i>((n-1)/2)+2)
    						{	
    						System.out.print("* ");  
    						}
    						else
    						{
    							System.out.print("  ");
    						}
    						}
    				//	  System.out.println();
    				//	  } 
            //		for(int i=0; i<n; i++)
        				//	{
    					  //K
        					  for(int j=0; j<n; j++)
        					  {
        						if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
        						{	
        						System.out.print("* ");  
        						}
        						else
        						{
        							System.out.print("  ");
        						}
        						}
        			//		  System.out.println();
        			//		  } 
            		  //		for(int i=0; i<n; i++)
    				//	{
        					  //I
    					  for(int j=0; j<n; j++)
    					  {
    						if(j==(n-1)/2 || i==0 || i==(n-1))
    						{	
    						System.out.print("* ");  
    						}
    						else
    						{
    							System.out.print("  ");
    						}
    						}
    					  System.out.print("      ");
    			//		  System.out.println();
    			//		  } 
            		  //		for(int i=0; i<n; i++)
    				//	{
    					  //L
    					  for(int j=0; j<n; j++)
    					  {
    						if(j==0 || i==(n-1)&&j<(n-1)/2)
    						{	
    						System.out.print("* ");  
    						}
    						else
    						{
    							System.out.print("  ");
    						}
    						}
    		//			  System.out.println();
    		//			  } 
	  //		for(int i=0; i<n; i++)
	//	{
    	//L				  
		  for(int j=0; j<n; j++)
		  {
			if(j==0 || i==(n-1)&&j<(n-1)/2)
			{	
			System.out.print("* ");  
			}
			else
			{
				System.out.print("  ");
			}
			}
	//	  System.out.println();
	//	  } 
// 		for(int i=0; i<n; i++)
       //	{
		  //S
		  for(int j=0; j<n; j++)
		  {
			if(j==0&&i>0&&i<(n-1)/2 || i==0&&j>0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2&&j>0 || j==(n-1)/2&&i>0&&i<((n-1)/2)-2 || j==(n-1)/2&&i>((n-1)/2)&&i<(n-1) || i==(n-1)/2&&j>0&&j<(n-1)/2 || j==0&&i<(n-1)&&i>((n-1)/2)+2)
			{	
			System.out.print("* ");  
			}
			else
			{
				System.out.print("  ");
			}
			}
		  System.out.println();
		  } 
		  System.out.println("  ");
            		//Full name
            for(int i=0; i<n; i++)
            {
            	//M
            	 for(int j=0; j<n; j++)
       		  {
       			if(j==0 || j==(n-1) || i==j&&i<=(n-1)/2&&j<=(n-1)/2 || i+j==(n-1)&&i<=(n-1)/2&&j>=(n-1)/2)
       			{	
       			System.out.print("* ");  
       			}
       			else
       			{
       				System.out.print("  ");
       			}
       			}
            	 System.out.print("        ");
       //		  System.out.println();
       	//	  } 
         //   for(int i=0; i<n; i++)
          //  {
            	//E
            	 for(int j=0; j<n; j++)
            	 {
                if(j==0 || i==0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2 || i==(n-1)/2&&j<((n-1)/2)-1)
         			{	
         			System.out.print("* ");  
         			}
         			else
         			{
         				System.out.print("  ");
         			}
         			}
         //		  System.out.println();
         //		  } 
            //   for(int i=0; i<n; i++)
            //  {
              	//R
              	 for(int j=0; j<n; j++)
              	 {
                  if(j==0 ||j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || i==0&&j<(n-1)/2 || i-j==(n-1)/2)
           			{	
           			System.out.print("* ");  
           			}
           			else
           			{
           				System.out.print("  ");
           			}
           			}
           //		  System.out.println();
           //		  } 
            //   for(int i=0; i<n; i++)
            //  {
              	//A
              	 for(int j=0; j<n; j++)
              	 {
                  if(i==0&&j>0&&j<(n-1)/2||j==0&&i>0||j==(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2)
           			{	
           			System.out.print("* ");  
           			}
           			else
           			{
           				System.out.print("  ");
           			}
           			}
          // 		  System.out.println();
           //		  } 
            //   for(int i=0; i<n; i++)
            //  {
              	//J
              	 for(int j=0; j<n; j++)
              	 {
                  if(i==0 || j==0&&i>(n-1)/2&&i<(n-1) || j==(n-1)/2&&i<(n-1) || i==(n-1)&&j>0&&j<(n-1)/2)
           			{	
           			System.out.print("* ");  
           			}
           			else
           			{
           				System.out.print("  ");
           			}
           			}
           		  System.out.println();
           		  } 
            System.out.println("  ");
              for(int i=0; i<n; i++)
              {
              	//A
              	 for(int j=0; j<n; j++)
              	 {
                  if(i==0&&j>0&&j<(n-1)/2||j==0&&i>0||j==(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2)
           			{	
           			System.out.print("* ");  
           			}
           			else
           			{
           				System.out.print("  ");
           			}
           			}
          // 		  System.out.println();
           //		  } 
           //   for(int i=0; i<n; i++)
           //   {
              	//N
              	 for(int j=0; j<n; j++)
              	 {
                  if(j==0 ||i==j ||j==(n-1))
           			{	
           			System.out.print("* ");  
           			}
           			else
           			{
           				System.out.print("  ");
           			}
           			}
              	System.out.print("      ");
           //		  System.out.println();
           	//	  } 
              //   for(int i=0; i<n; i++)
              //   {
                 	//S
                 	 for(int j=0; j<n; j++)
                 	 {
                     if(j==0&&i>0&&i<(n-1)/2 || i==0&&j>0&&j<(n-1)/2 || i==(n-1)&&j<(n-1)/2&&j>0 || j==(n-1)/2&&i>0&&i<((n-1)/2)-2 || j==(n-1)/2&&i>((n-1)/2)&&i<(n-1) || i==(n-1)/2&&j>0&&j<(n-1)/2 || j==0&&i<(n-1)&&i>((n-1)/2)+2)
              			{	
              			System.out.print("* ");  
              			}
              			else
              			{
              				System.out.print("  ");
              			}
              			}
            //  		  System.out.println();
            //  		  } 
              //   for(int i=0; i<n; i++)
              //   {
                 	//A
                 	 for(int j=0; j<n; j++)
                 	 {
                     if(i==0&&j>0&&j<(n-1)/2||j==0&&i>0||j==(n-1)/2&&i>0||i==(n-1)/2&&j<(n-1)/2)
              			{	
              			System.out.print("* ");  
              			}
              			else
              			{
              				System.out.print("  ");
              			}
              			}
              //		  System.out.println();
              //		  } 
              //   for(int i=0; i<n; i++)
              //   {
                 	//R
                 	 for(int j=0; j<n; j++)
                 	 {
                     if(j==0 ||j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || i==0&&j<(n-1)/2 || i-j==(n-1)/2)
              			{	
              			System.out.print("* ");  
              			}
              			else
              			{
              				System.out.print("  ");
              			}
              			}
        //      		  System.out.println();
          //    		  } 
              //   for(int i=0; i<n; i++)
              //   {
                 	//I
                 	 for(int j=0; j<n; j++)
                 	 {
                     if(j==(n-1)/2 || i==(n-1) || i==0)
              			{	
              			System.out.print("* ");  
              			}
              			else
              			{
              				System.out.print("  ");
              			}
              			}
              		  System.out.println();
              		  } 
	}
	

}


 // i==0&&j>0&&j<(n-1)/2||j==0||i==n-1&&j>0&&j<(n-1)/2||j==n-5&&i>0&&i<n-1
