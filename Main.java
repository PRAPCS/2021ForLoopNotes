class Main {
  public static void main(String[] args) {
    int ranNum = 0;
    int num20 =0;
   //i is the counter variable, i++ is how much the conuter increments
   for(int i=0;i<100;i+=2){
     ranNum = (int)(Math.random()*20)+1; 
     System.out.println(ranNum);
     if(ranNum==20)
         num20++;
   }

   System.out.println("You rolled a 20 "+num20+" times in 50 rolls");

  for(int i=100;i>0;i--){
     ranNum = (int)(Math.random()*20)+1; 
     System.out.println(ranNum);
     if(ranNum==20)
         num20++;
   }

   System.out.println("You rolled a 20 "+num20+" times in 100 rolls");
  }
}