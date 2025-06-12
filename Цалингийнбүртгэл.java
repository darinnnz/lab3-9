public class ЦалингийнБүртгэл {
    private Ажилтан ажилтан;
    private String сар;
    private double үндсэнЦалин;
    private double нэмэгдэл;
    private double суутгал;
    private double нийт;

    public ЦалингийнБүртгэл(Ажилтан ажилтан, String сар, double үндсэнЦалин, double нэмэгдэл, double суутгал) {
        if (ажилтан == null) throw new IllegalArgumentException("Ажилтан байх ёстой");
        if (сар == null || сар.isEmpty()) throw new IllegalArgumentException("Сар заавал");
        if (үндсэнЦалин < 0 || нэмэгдэл < 0 || суутгал < 0)
            throw new IllegalArgumentException("Сөрөг утга байж болохгүй");
        this.ажилтан = ажилтан;
        this.сар = сар;
        this.үндсэнЦалин = үндсэнЦалин;
        this.нэмэгдэл = нэмэгдэл;
        this.суутгал = суутгал;
        this.нийт = үндсэнЦалин + нэмэгдэл - суутгал;
        if (нийт < 0) throw new IllegalArgumentException("Нийт цалин сөрөг байж болохгүй");
    }
    public Ажилтан ажилтанАвах() { return ажилтан; }
    public String сарАвах() { return сар; }
    public double үндсэнЦалинАвах() { return үндсэнЦалин; }
    public double нэмэгдэлАвах() { return нэмэгдэл; }
    public double суутгалАвах() { return суутгал; }
    public double нийтАвах() { return нийт; }
}