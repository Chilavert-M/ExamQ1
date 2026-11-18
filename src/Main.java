import java.util.Scanner;

 void main() {
     Scanner scanner = new Scanner(System.in);

     // Single-dimensional array
     String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

     // Two-dimensional array: [product][month]
     int[][] sales = new int[3][3];

     Product product;
     PrintProduct printer;

     // Cozy Nights Monarch
     System.out.print("Enter number of sales for month 1 for Cozy Nights Monarch mattress: ");
     sales[0][0] = scanner.nextInt();
     System.out.print("Enter number of sales for month 2 for Cozy Nights Monarch mattress: ");
     sales[0][1] = scanner.nextInt();
     System.out.print("Enter number of sales for month 3 for Cozy Nights Monarch mattress: ");
     sales[0][2] = scanner.nextInt();
     System.out.println();

     // Restonic Barbados
     System.out.print("Enter number of sales for month 1 for Restonic Barbados mattress: ");
     sales[1][0] = scanner.nextInt();
     System.out.print("Enter number of sales for month 2 for Restonic Barbados mattress: ");
     sales[1][1] = scanner.nextInt();
     System.out.print("Enter number of sales for month 3 for Restonic Barbados mattress: ");
     sales[1][2] = scanner.nextInt();
     System.out.println();

     // Sealy Phuket
     System.out.print("Enter number of sales for month 1 for Sealy Phuket mattress: ");
     sales[2][0] = scanner.nextInt();
     System.out.print("Enter number of sales for month 2 for Sealy Phuket mattress: ");
     sales[2][1] = scanner.nextInt();
     System.out.print("Enter number of sales for month 3 for Sealy Phuket mattress: ");
     sales[2][2] = scanner.nextInt();
     System.out.println();

     // Report
     product = new Product(names, sales);
     printer = new PrintProduct(product);

     printer.PrintHeader();
     printer.PrintTotalProductSales();
     printer.PrintAverageProductSales();
     printer.PrintMostPopularProduct();

     scanner.close();
 }
