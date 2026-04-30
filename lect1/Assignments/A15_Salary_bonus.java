public class A15_Salary_bonus{
    public static void main(String [] args) {
        
        float salary = 15000;
        int exp = 6;

        if (exp>=5){
            salary= (salary * 1.10f) ;
            System.out.println(" You get a 10% hike and your final salary is : " + salary);
        }else {
            System.out.println(" You get no hike and your final salary is : " + salary);
        }
    }
}