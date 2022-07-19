public class Company {
    private String name;
    private int size;
    private int foundationYear;

    public Company() {
    }

    public Company(String name, int size, int foundationYear) {
        this.name = name;
        this.size = size;
        this.foundationYear = foundationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void setSize(int size) {
        this.size = size;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getFoundationYear() {
        return foundationYear;
    }
}

class Fintech {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("TEST");
        company.setSize(5000);
        company.setFoundationYear(2000);

        System.out.println("Company: " + company.getName());
        System.out.println("Size: " + company.getSize());
        System.out.println("Foundation Year: " + company.getFoundationYear());
    }
}
