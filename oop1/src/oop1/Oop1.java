package oop1;

public class Oop1 {
        
    public static void main(String[] args) {
           
       Product product1 = new Product();
                        //set value
       product1.setName("Delonghi Kahve Makinesi"); 
       product1.setUnitPrice(7500);
       product1.setDiscount(7);
       product1.setUnitsInStock(3);
       product1.setImageUrl("bilmemne.jpg");
       
       Product product2 = new Product();
                        
       product2.setName("Smeg Kahve Makinesi");
       product2.setUnitPrice(6500);
       product2.setDiscount(8);
       product2.setUnitsInStock(2);
       product2.setImageUrl("bilmemne2.jpg");
       
       Product product3 = new Product();
                        
       product3.setName("Kitchen Aid Kahve Makinesi");
       product3.setUnitPrice(4500);
       product3.setDiscount(7);
       product3.setUnitsInStock(4);
       product3.setImageUrl("bilmemne3.jpg");
                        //get
       //System.out.println(product1.name);
       
       Product[] products = {product1 , product2 , product3};
       
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");
        
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05383101366");
        individualCustomer.setCustomerNumber("67429201650");
        individualCustomer.setFirstname("Sude");
        individualCustomer.setLastname("Gürbüz");
        
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setTaxnumber("11111111111");
        corporateCustomer.setCustomerNumber("123456");
        
        Customer[] customers = {individualCustomer , corporateCustomer};
        
    }
    
}
