
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class PrintProductTest {
    String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    int[][] productSales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue(){
        Product product = new Product(productNames, productSales);
        assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue(){
        Product product = new Product(productNames, productSales);

        double result = product.GetAverageProductSold();
        assertEquals(17.0, result, 0.01);
    }

}