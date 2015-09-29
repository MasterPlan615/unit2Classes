public class Annuity
{
    public static void main( String[] args )
    {
        double PMT = 10000;
        double i = 0.08;
        double n = 20;
        double top = (Math.pow(1+i, n-1)-1)/i;
        double bottom = (Math.pow(1+i, n-1));
        double PVann = PMT*((top/bottom) + 1);
        System.out.println(PVann);
    }
}