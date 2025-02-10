public class DemoClass {
    public static void main(String[] args) {

        System.out.println("This is a demo github project!");
        int number = 21;
        DemoClass demo = new DemoClass();
        String result =   demo.verifyUser(number);
        System.out.println(result);


    }

    public String verifyUser(int number) {
        if (number % 2 == 0) {
            return "User is Correct";
        } else {
            return "User Incorrect";
        }
    }
}
