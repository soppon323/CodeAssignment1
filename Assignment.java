
public class Assignment {
    
    

    public static void main(String[] args) {
        
        int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 46}; //added 46 to array
        
        int sum = 0;
        
       System.out.println(ages[ages.length-1]-ages[0]);
        
        
        for (int i=0; i< ages.length; i++) {
           
            sum += ages[i];
            }
        
       double averageAge =  sum/ages.length ; 
       
       System.out.println(averageAge); // prints the average age
       
      String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
       
      int sum2 = 0;
       
       for ( int j = 0; j< names.length; j++) {
           
           sum2 += names[j].length(); 
           
           
       } 
       
      int avgNumOfLetters = sum2/names.length;
      
      System.out.println(avgNumOfLetters);//  average length of letters
     
      for (int i = 0; i < names.length; i++) {
           
       System.out.print(names[i]+" ");//names separated by space
           
       }
      int [] nameLengths = new int [names.length];
       
       for (int i = 0; i < names.length; i++) {
           
           nameLengths[i]= names[i].length();
           }
           int sum1 = 0;
           for ( int j = 0; j<nameLengths.length;j++) {
               sum1 += nameLengths[j];}  
        //System.out.println(sum1);
           
       
       
        triple("promineo", 7);
        fullName ( "Stephen", "Oppon");
        System.out.println(willBuyDrink(true,9));
        
        int [] games = { 18,36,18};       // added 2 test arrays to test problems 9 through 12
        int [] scores = {44,65,45};
        
        System.out.println(isOver100(games));
        System.out.println(averageElements(games));
        System.out.println(compareArray(scores, games));
        walkOrDrive(false,3.0);
         }
        
        
        static String triple (String word, int x ) { 
          
            String triple = word.repeat(x);
          
          System.out.println(triple);
        return triple;
            }
        
        
        static String fullName(String firstName, String lastName) {
            
            String fullName = firstName + " " + lastName;
            System.out.println(firstName + " "+ lastName);
            return fullName;
        }
        
        static boolean isOver100(int [] array) {
            
            int sum3 = 0;
            
            for (int i=0; i< array.length; i++) {
                sum3 += array[i];
                
            }
            
            if (sum3 >= 100) {
                
                return true;
            } else { 
                return false;}
           
               
        } 
        static double averageElements(int [] array) {
            
            double sum4 = 0.0;
            for (int i=0; i<array.length;i++) {
                sum4 += array[i];
            }
            double averageElements = sum4/array.length;
            return averageElements;
            
        }
        static boolean compareArray(int[]x,int[]y) {
            
            double sum5 = 0.0;
            for (int i=0; i<x.length;i++) {
                sum5 += x[i];
            }
            double avgx = sum5/x.length;
            double sum6 = 0.0;
            for (int i=0; i<y.length;i++) {
                sum6 += y[i];
            }
            double avgy = sum6/y.length;
            
            if (avgx > avgy) {
                return true;
            } else { return false;}
                 
                 
        }
      
        static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
            
            if (isHotOutside = true && moneyInPocket >= 10.50) {
                return true;
            } else return false;
            
            
        }
        static void walkOrDrive( boolean hasHybrid, double gasPrice) {    // This method takes the current gas prices
                                                                          // and whether or not you own an electric vehicle and determines whether 
            if (gasPrice >= 4.80 && hasHybrid == true) {                  // it's better to walk or drive
                System.out.println("We can drive there.");
                } else if (gasPrice >=4.80 && hasHybrid == false)  {
                    System.out.println("Yeah, I'm definitely walking.");
                } else if (gasPrice <4.8 && hasHybrid == true) {
                    System.out.println("Definitely driving.");
                } else if (gasPrice < 4.80 && hasHybrid == false) {
                    System.out.println("I don't like it but we will drive there.");
                }
            
        }
    
}
       
