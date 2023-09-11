
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RenameThisClass
{
    public static void main(String[] args) {
        String[] array={"Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India"};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println(" ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }    
        System.out.println(" ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1) {
                System.out.print("-");
            }
        }
    }    
}
