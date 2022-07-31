public class tryCatch
{
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[5] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array size is : " + array.length);
        }
    }
}