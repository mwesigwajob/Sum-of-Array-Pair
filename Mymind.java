/* 
 * @author Job Mwesigwa
 * */

public class Mymind
{
  public static void main(String[] args){
    Logic log = new Logic();
    int [] myNums = new int[] {6,2,4,1,3,5,7};
    
    System.out.println("There are only "+log.findSum(9,myNums)+" pairs");
    
  }
}