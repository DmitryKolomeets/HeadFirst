package Nail_Lambda;




interface Executable{
    void execute();
}

class Runner  {
    public void run (Executable e) {
    }
}

class ExecutableImplmentation implements Executable{
    @Override
    public void execute() {
        System.out.println("Hello");
    }
}


public class Test_1 {
    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new ExecutableImplmentation());
runner.run(new Executable() {
    @Override
    public void execute() {
        System.out.println("");
    }
});


    }
}
