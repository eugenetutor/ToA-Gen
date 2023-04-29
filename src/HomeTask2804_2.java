public class HomeTask2804_2 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Product A", 12.99f, 5),
                new Product("Product B", 9.99f, 10),
                new Product("Product C", 12.99f, 8),
                new Product("Product D", 7.99f, 15),
                new Product("Product E", 10.22f, 16)
        };
        Product[] sortedProducts = countingSort(products);
        for (int i = 0; i < sortedProducts.length; i++) {
            Product p = sortedProducts[i];
            if (p != null) {
                System.out.println(p.name + " " + p.price + " " + p.quantity);
            }
        }
    }


    public static Product[] countingSort(Product[] products) {
        // Find the maximum price
        float maxPrice = 0.0f;
        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
            }
        }

        // Count the number of products with each price
        int[] priceCounts = new int[(int)maxPrice + 1];
        for (Product product : products) {
            int priceIndex = (int)product.getPrice();
            if (priceIndex >= 0) {
                priceCounts[priceIndex]++;
            }
        }

        // Compute the cumulative count of products with each price
        for (int i = 1; i < priceCounts.length; i++) {
            priceCounts[i] += priceCounts[i - 1];
        }

        // Create a temporary array to hold the sorted products
        Product[] sortedProducts = new Product[products.length];

        // Iterate over the products in reverse order to ensure stable sorting
        for (int i = products.length - 1; i >= 0; i--) {
            Product product = products[i];
            int priceIndex = (int)product.getPrice();
            if (priceIndex >= 0) {
                // Count the number of products with the same price and lesser quantity
                int lesserQuantityCount = 0;
                for (int j = 0; j < i; j++) {
                    Product otherProduct = products[j];
                    if (otherProduct.getPrice() == product.getPrice() &&
                            otherProduct.getQuantity() < product.getQuantity()) {
                        lesserQuantityCount++;
                    }
                }

                // Calculate the final index of the product in the sorted array
                int sortedIndex = priceCounts[priceIndex - 1] + lesserQuantityCount;
                sortedProducts[sortedIndex] = product;

                    // Decrement the count of products with this price
                priceCounts[priceIndex]--;
            }
        }

        // Return the sorted array of products
        return sortedProducts;
    }


}

class Product {

    public String name;
    public float price;
    public int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
