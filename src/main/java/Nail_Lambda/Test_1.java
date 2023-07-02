package Nail_Lambda;


interface Executable {
    int execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}



public class Test_1 {

    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello");
                System.out.println("Goodbuy!");

                return 1;
            }
        });

        runner.run(()-> {
            System.out.println("Hello");
            System.out.println("Goodbuy!");

            return 1;

        });
    }
}
