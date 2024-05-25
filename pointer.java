import java.util.Scanner;

class pointer
{
    static int creditCalc(float marks, float outOf)
    {
        int credit = 0;
        float percent = (marks/outOf)*100;
        if(percent >= 90)
        {
            credit = 10;
        }
        else if(percent >= 80)
        {
            credit = 9;
        }
        else if(percent >= 70)
        {
            credit = 8;
        }
        else if(percent >= 60)
        {
            credit = 7;
        }
        else if(percent >= 50)
        {
            credit = 6;
        }
        else
        {
            System.out.println("Chhodo");
            return 0;
        }
        return credit;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"Maths","Maths Termwork", "Daa", "Daa Termwork", "Poa","Poa Termwork","OS","OS Termwork","UHV","UHV Termwork","Web Dev"};
        float outOf[] = {100,25,100,50,100,50,100,50,100,25,100};
        float credit[] = {3,1,3,1,3,1,3,1,2,1,2};
        float marks[] = new float[arr.length];
        float totalCredit = 0;
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter marks in "+arr[i]+" out of "+outOf[i]);   
            marks[i] = sc.nextInt();
            if(marks[i] > outOf[i])
            {
                System.out.println("Marks cannot be greater than "+outOf[i]);
                i--;
            }
            else
            {
                float pointer = creditCalc(marks[i], outOf[i]);
                totalCredit+=credit[i]*pointer;
            }
        }
        System.out.println("Total Pointer: "+totalCredit/21.0);
        
    }
}