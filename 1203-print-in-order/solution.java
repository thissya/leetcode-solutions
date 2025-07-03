class Foo {
    Semaphore t1,t2;
    public Foo() {
        t1= new Semaphore(0);
        t2 =  new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        t1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        t1.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        t2.release();
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        t2.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
