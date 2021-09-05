package week3.Company;

public class Company {
    private static Company instance = new Company();

    private Company() {
    }

    public static Company getInstance() { //외부에서 가져오기 위해서 static으로 생성
        return instance;
    }
}
