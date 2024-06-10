//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductPopularityTracker productPopularityTracker = new ProductPopularityTracker();


        System.out.println(productPopularityTracker.addProduct(1,"TV"));
        System.out.println(productPopularityTracker.addProduct(2,"Laptop"));
        System.out.println(productPopularityTracker.addProduct(3,"Screen"));

        System.out.println(productPopularityTracker.viewProduct("TV"));
        System.out.println(productPopularityTracker.viewProduct("TV"));
        System.out.println(productPopularityTracker.viewProduct("TV"));
        System.out.println(productPopularityTracker.viewProduct("TV"));
        System.out.println(productPopularityTracker.viewProduct("TV"));

        System.out.println(productPopularityTracker.viewProduct("Laptop"));
        System.out.println(productPopularityTracker.viewProduct("Laptop"));
        System.out.println(productPopularityTracker.viewProduct("Laptop"));
        System.out.println(productPopularityTracker.viewProduct("Laptop"));

        System.out.println(productPopularityTracker.viewProduct("Screen"));
        System.out.println(productPopularityTracker.viewProduct("Screen"));
        System.out.println(productPopularityTracker.viewProduct("Screen"));
        System.out.println(productPopularityTracker.viewProduct("Screen"));
        System.out.println(productPopularityTracker.viewProduct("Screen"));
        System.out.println(productPopularityTracker.viewProduct("Screen"));



        System.out.println(productPopularityTracker.getViewCount("TV"));

        System.out.println(productPopularityTracker.getMostViewedProduct(3));



    }
}