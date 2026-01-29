public class ShoppingMall {
    // I am Andrew and I am good at archery
    public static void main(String[] args){

        int cash = 100;
        double taxRate = 1.13;
        double subtotal = 58.62;
        String name = "Andrew";
        double change = cash - subtotal * taxRate;
        double changeTrunc = (int) (change*100) /100.0;
        System.out.println(name + " has $" + changeTrunc +
                " dollars remaining!\n" + name + " started with $"
                + cash + " dollars!");


        }
    }