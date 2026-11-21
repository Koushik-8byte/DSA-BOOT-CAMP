class  thread1 extends Thread{
    @Override
    public void run ()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
class Thread1{
        public static void main(String[] args)
        {
            thread1 t1=new thread1();
            t1.start();
        }
}

