public class sagnik_store_shooping_cart {
    public static void main(String[] args) {

                double[] prices = {
                        19.99, 5.49, 8.75, 12.00, 29.99, 0, 15.49, 0, 23.89, 11.99
                                  };


                double totalPrice = 0;
                for (double price : prices) {
                    totalPrice += price;
                }
                System.out.printf("Total price: %.2f%n", totalPrice);


                double mostExpensive = Double.MIN_VALUE;
                double leastExpensive = Double.MAX_VALUE;

                for (double price : prices) {
                    if (price > mostExpensive) {
                        mostExpensive = price;
                    }
                    if (price > 0 && price < leastExpensive) {
                        leastExpensive = price;
                    }
                }

                System.out.printf("Most expensive item: %.2f%n", mostExpensive);
                System.out.printf("Least expensive item: %.2f%n", leastExpensive);
    }
}
