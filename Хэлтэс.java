import java.util.ArrayList;
import java.util.List;

public class Хэлтэс {
    private String нэр;
    private Ажилтан менежер;
    private List<Ажилтан> ажилтнууд = new ArrayList<>();

    public Хэлтэс(String нэр, Ажилтан менежер) {
        if (нэр == null || нэр.isEmpty()) throw new IllegalArgumentException("Хэлтэсийн нэр шаардлагатай");
        if (менежер == null) throw new IllegalArgumentException("Менежер заавал байх ёстой");
        this.нэр = нэр;
        this.менежер = менежер;
    }
    public String нэрАвах() { return нэр; }
    public Ажилтан менежерАвах() { return менежер; }
    public List<Ажилтан> ажилтнуудАвах() { return ажилтнууд; }
    public void ажилтанНэмэх(Ажилтан a) {
        if (a == null) throw new IllegalArgumentException("Ажилтан null байж болохгүй");
        if (ажилтнууд.contains(a)) throw new IllegalArgumentException("Ажилтан аль хэдийн бүртгэлтэй");
        ажилтнууд.add(a);
    }
    public void ажилтанХасах(Ажилтан a) {
        if (!ажилтнууд.contains(a)) throw new IllegalArgumentException("Ажилтан олдсонгүй");
        ажилтнууд.remove(a);
    }
}