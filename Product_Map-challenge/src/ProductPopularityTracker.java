import java.util.*;

public class ProductPopularityTracker {

    Map<Integer,String> productsMap;
    Map<String,Integer> productCount;

    public ProductPopularityTracker() {
        this.productsMap = new HashMap<>();
        this.productCount = new HashMap<>();
    }

    public String addProduct(Integer id, String name){
        productsMap.put(id,name);
        return name + " was added to our product list";
    }

    public String viewProduct(String name){
        for (String product:productsMap.values()){
            if (product.equals(name)){
                if(productCount.containsKey(product)){
                    int newCounter = productCount.get(product) +1;
                    productCount.replace(product,newCounter);
                }else{
                    productCount.put(product,1);
                }
            }
        }
        return name + " doesn't exist in our product list";
    }

    public String getViewCount(String name){
        for(String product: productCount.keySet()){
            if(product.equals(name)){
                return name + " has " + productCount.get(name) + " views";
            }
        }
        return "No product found";
    }

    public List<Map.Entry<String, Integer>> getMostViewedProduct(int N){

        List<Map.Entry<String, Integer>> viewCountList = new ArrayList<>(productCount.entrySet());
        //viewCountList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        viewCountList.sort(Map.Entry.comparingByValue());

        List<Map.Entry<String, Integer>> topNProducts = new ArrayList<>();
        for (int i = 0; i < N && i < viewCountList.size(); i++) {
            topNProducts.add(viewCountList.get(i));
        }

        return topNProducts;


    }







}
