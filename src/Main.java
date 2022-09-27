public class Main {

    public static void main(String[] args) {

        /* Course 24, Methods
        findNumber();
         */

        /* Course 25, Methods with parameters
        String aMessage = messageOut();
        int total = add(5, 7);
        System.out.println(total);
         */

        /* Course 26, Variable Arguments
        int total = add(2, 3, 4, 5, 6, 7, 8);
        System.out.println(total);
         */

        /* Course 27,28,29, Classes and Difference Between Stack & Heap Space
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Update();
        customerManager.Delete();
         */

        /* Course 30, ReCap - 1
        FourOperations fourOperations = new FourOperations();
        int result = fourOperations.Addition(3, 5);
        System.out.println(result);
         */

        /* Course 31, Field & Attribute
        Product product = new Product();
        product.name = "Notebook";
        product.id = 1;
        product.description = "MSI";
        product.price = 4999.99;
        product.stockAmount = 3;

        System.out.println(product.name);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
         */

        /* Course 33, Getters & Setters
        Product product = new Product();
        product.setName("Notebook");
        product.setId(1);
        product.setDescription("MSI");
        product.setPrice(4999.99);
        product.setStockAmount(3);
        System.out.println(product.getCode());
         */

        /* Course 34, Constructor
        Product product = new Product(1, "Notebook", "MSI", 4999.99, 3, "Black");
        System.out.println(product.getCode());
         */

        /* Course 35, Method Overloading
        FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.Addition(3, 5));
        System.out.println(fourOperations.Addition(3, 5, 10));
         */

        /* Course 36, Inheritance
        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
         */

        /* Course 37, Inheritance ReCap - 2

         */
        TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
        //teacherLoanManager.CalculateLoan();

        LoanUI loanUI = new LoanUI();
        loanUI.CalculateLoan(new MilitaryLoanManager());
    }

    /* Course 24, Methods
    public static void findNumber() {

        int numbers[] = new int[]{1, 2, 5, 7, 9, 0};
        int findingNumber = 6;
        boolean isExist = false;

        for (int number : numbers) {
            if (number == findingNumber) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            messageOut("The number " + findingNumber + " is exist");
        } else {
            messageOut("The number " + findingNumber + " isn't exist");
        }
    }

    public static void messageOut(String message) {

        System.out.println(message);
    }
     */

    /* Course 25, Methods with parameters
    public static int add(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public static String messageOut() {

        return "Message";
    }
     */

    /* Course 26, Variable Arguments
    public static int add(int... numbers) {
        int total = 0;
        for (int number : numbers) {

            total = total + number;
        }
        return total;
    }
     */
}