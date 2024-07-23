package product;

import java.util.Scanner;


public class Menu {
    Scanner str = new Scanner(System.in);
    Scanner number = new Scanner(System.in);
    ProductsManager manager = new ProductsManager();
    public void functionHandle () {
        diplayMenu();
        System.out.println("Nhập số yêu cầu ");
        int choice = number.nextInt();
        do {
            switch (choice) {
                case 1:
                    functionAdd();
                    break;
                case 2 :
                    manager.DisplayProduct();
                    break;
                case 3 :
                    functionDelete();
                    break;
                case 4 :
                    functionUpdate();
                    break;
            }
            diplayMenu();
            choice = number.nextInt();

        }while (choice != 0) ;


    }
   public void diplayMenu () {
       System.out.println("-------Menu-------");
       System.out.println("1. Add Product");
       System.out.println("2. Display Product");
       System.out.println("3. Delete Product");
       System.out.println("4. Update Product");
       System.out.println("0. Exit");
   }
   public void functionAdd () {
       System.out.println("Điền thông tin sản phẩm ");
       System.out.println("Nhập tên : ");
       String productName = str.nextLine();
       System.out.println("Nhập mã sản phẩm :");
       String productCode = str.nextLine();
       System.out.println("Nhập giá sản phẩm :");
       int productPrice = number.nextInt();
       Product product = new Product(productName,productPrice,productCode);
       manager.add(product);
       System.out.println("Thêm thành công .");
   }
   public void functionDelete () {
       System.out.println("Nhập ID sản phẩm cần xoá ");
       int id = number.nextInt();
       do {
           if (manager.findIndexByID(id) != -1) {
               manager.remove(id);
           }else {
               System.out.println("ID không hơp lệ , vui lòng nhập lại !");
               id = number.nextInt();
           }
       }while (manager.findIndexByID(id) == -1) ;
       manager.remove(id);
       System.out.println("Xoá thành công .");


   }
   public void functionUpdate () {
       System.out.println("Nhập ID sản phẩm cần sửa ");
       int id = number.nextInt();
       do {

           if (manager.findIndexByID(id) != -1) {
               System.out.println("Điền thông tin cần sửa");
               System.out.println("Nhập Tên :");
               String productName = str.nextLine();
               System.out.println("Nhập mã sản phẩm :");
               String productCode = str.nextLine();
               System.out.println("Nhập giá sản phẩm :");
               int productPrice = number.nextInt();
               Product product = new Product(productName,productPrice,productCode);
               manager.update(id, product);
           }else {
               System.out.println("ID không hơp lệ , vui lòng nhập lại !");
               id = number.nextInt();
           }

       }while (manager.findIndexByID(id) == -1);
       System.out.println("Điền thông tin cần sửa");
       System.out.println("Nhập Tên :");
       String productName = str.nextLine();
       System.out.println("Nhập mã sản phẩm :");
       String productCode = str.nextLine();
       System.out.println("Nhập giá sản phẩm :");
       int productPrice = number.nextInt();
       Product product = new Product(productName,productPrice,productCode);
       manager.update(id, product);

       System.out.println("Sửa thành công .");

   }
}
