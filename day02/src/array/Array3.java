package array;

public class Array3 {
    public static void main(String[] args) {
        Customer [] customers = new Customer[3];
        customers[0] = new Customer("id00","pw00","name");
        customers[1] = new Customer("id01","pw01","name");
        customers[2] = new Customer("id02","pw02","name");
        for(Customer c:customers){
            System.out.println(c);
        }
    }
}
