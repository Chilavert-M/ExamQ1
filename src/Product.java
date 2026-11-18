
public class Product implements IProduct {

    // Single-dimensional array: one name per product
    private final String[] productNames;

    // Two-dimensional array: [product][month]
    private final int[][] sales;

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    // Total sales for one product across all months
    private int getProductTotal(int productIndex) {
        int total = 0;
        for (int month = 0; month < sales[productIndex].length; month++) {
            total += sales[productIndex][month];
        }
        return total;
    }

    // Total number of products sold across all products and months
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int product = 0; product < sales.length; product++) {
            total += getProductTotal(product);
        }
        return total;
    }

    // Average
    @Override
    public double GetAverageProductSold() {
        int entries = 0;
        for (int product = 0; product < sales.length; product++) {
            entries += sales[product].length;
        }
        return entries == 0 ? 0 : (double) GetTotalProductsSold() / entries;
    }

    // Product with the highest total sales
    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = getProductTotal(0);

        for (int product = 1; product < sales.length; product++) {
            int total = getProductTotal(product);
            if (total > bestTotal) {
                bestTotal = total;
                bestIndex = product;
            }
        }

        // Highest single-month sales for the winning product
        int bestMonth = sales[bestIndex][0];
        for (int month = 1; month < sales[bestIndex].length; month++) {
            if (sales[bestIndex][month] > bestMonth) {
                bestMonth = sales[bestIndex][month];
            }
        }

        return productNames[bestIndex] + "(" + bestMonth + ")";
    }
}