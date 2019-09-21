package Problems;

import java.util.*;

public class KyleP3 {
	
   public static void main(String args[]){
	   
       String[] topic={"Sports","Movies","TV shows","Books","Video games"}; 
       
       int[][] responses=new int[5][11];
       
       for(int i=0;i<4;i++){
           for(int j=1;j<=10;j++){
               responses[i][j]=0; 
           }
       }
       int peoples;
       
       System.out.print("Please rate 1 - 10 the importance of the topic to you. Enter the number of people willing to Rate:"); //Input the no of people willing to vote.
      
       Scanner console=new Scanner(System.in);
       
       peoples=console.nextInt();
       
       int i=1;
      
       while(i<=peoples){
           for(int j=0;j<5;j++){ 
               System.out.print("P"+i+":"+topic[j]+":");
               int x=console.nextInt();
               responses[j][x]=responses[j][x]+1;
           }
           i++;
       }
       System.out.println("Topic  Total Rating  Average Rating");
       
       int max_rate=0,min_rate=100000,max_topic=0,min_topic=0;
      
       for(i=0;i<5;i++)
       {
           int total=0,count=0;
          
           for(int j=1;j<=10;j++)
           {
               total=total+j*responses[i][j]; 
               count=count+responses[i][j]; 
           }
           if(max_rate<total)
           {  
               max_rate=total;
               max_topic=i;
           }
           if(min_rate>total)
           {  
               min_rate=total;
               min_topic=i;
           }
           System.out.println(topic[i]+" "+total+" "+(total+0.0)/count);
       }
       
       System.out.println("Max Point Topic  Total Rating");
       System.out.println(topic[max_topic]+" "+max_rate);
       System.out.println("Min Point Topic  Total Rating");
       System.out.println(topic[min_topic]+" "+min_rate);
   }
}