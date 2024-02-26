class TestSleepoMethod extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            // the thread will sleep for the 500 milli seconds
            try{Thread.sleep(500);
            }
            catch(InterruptedException e){System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestSleepoMethod t1=new TestSleepoMethod();
        TestSleepoMethod t2=new TestSleepoMethod();

        t1.start();
        t2.start();
    }
}