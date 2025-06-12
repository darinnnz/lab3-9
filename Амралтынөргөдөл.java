import java.util.Date;

public class АмралтынӨргөдөл {
    private Ажилтан ажилтан;
    private Date эхлэхОгноо;
    private Date дуусахОгноо;
    private String төрөл; // төлбөртэй, төлбөргүй, эмчилгээний гэх мэт
    private String төлөв; // хүлээгдэж буй, батлагдсан, татгалзсан

    public АмралтынӨргөдөл(Ажилтан ажилтан, Date эхлэхОгноо, Date дуусахОгноо, String төрөл) {
        if (ажилтан == null) throw new IllegalArgumentException("Ажилтан заавал байх ёстой");
        if (эхлэхОгноо == null || дуусахОгноо == null)
            throw new IllegalArgumentException("Огноо дутуу");
        if (дуусахОгноо.before(эхлэхОгноо))
            throw new IllegalArgumentException("Дуусах огноо эхлэхээс өмнө байж болохгүй");
        if (төрөл == null || төрөл.isEmpty())
            throw new IllegalArgumentException("Төрөл шаардлагатай");
        this.ажилтан = ажилтан;
        this.эхлэхОгноо = эхлэхОгноо;
        this.дуусахОгноо = дуусахОгноо;
        this.төрөл = төрөл;
        this.төлөв = "хүлээгдэж буй";
    }
    public Ажилтан ажилтанАвах() { return ажилтан; }
    public Date эхлэхОгнооАвах() { return эхлэхОгноо; }
    public Date дуусахОгнооАвах() { return дуусахОгноо; }
    public String төрөлАвах() { return төрөл; }
    public String төлөвАвах() { return төлөв; }
    public void батлах() {
        if (!"хүлээгдэж буй".equals(төлөв))
            throw new IllegalStateException("Зөвхөн хүлээгдэж буй өргөдлийг баталж болно");
        төлөв = "батлагдсан";
    }
    public void татгалзах() {
        if (!"хүлээгдэж буй".equals(төлөв))
            throw new IllegalStateException("Зөвхөн хүлээгдэж буй өргөдлийг татгалзаж болно");
        төлөв = "татгалзсан";
    }
}