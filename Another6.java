interface Isum{
    public int sum(int value1, int value2);
}
class Another6 //implements Isum//
{
    static void main(String[] args) {
       Isum isumm=Integer::sum;
       int isum2=isumm.sum(1000,1001);
        System.out.println("printing sum method in reference way: "+isum2);
    }
}