public class FormattedPrinting
{
    public static void main(String[] args) {
        String name = "Julian Prezgay";
        int age = 18;
        double salary = 455678.12345;
        for(int x = 0; x < 15; x++){
            System.out.printf("\n%-17s%5d%12.2f",name,age,salary);
        }

    }
}
