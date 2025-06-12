import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ХНМенежер {
    private static final Logger лог = LogManager.getLogger(ХНМенежер.class);
    private List<Ажилтан> ажилтнууд = new ArrayList<>();
    private List<АмралтынӨргөдөл> өргөдлүүд = new ArrayList<>();
    private List<ЦалингийнБүртгэл> цалингууд = new ArrayList<>();

    public List<Ажилтан> ажилтнуудАвах() { return ажилтнууд; }
    public void ажилтанНэмэх(Ажилтан a) {
        if (a == null) throw new IllegalArgumentException("Ажилтан null байж болохгүй");
        if (ажилтнууд.contains(a)) throw new IllegalArgumentException("Ажилтан аль хэдийн бүртгэлтэй");
        ажилтнууд.add(a);
        лог.info("Ажилтан нэмэгдсэн: {}", a.toString());
    }
    public void ажилтанХасах(Ажилтан a) {
        if (a == null) throw new IllegalArgumentException("Ажилтан null байж болохгүй");
        if (!ажилтнууд.contains(a)) throw new IllegalArgumentException("Ажилтан олдсонгүй");
        ажилтнууд.remove(a);
        лог.info("Ажилтан хасагдсан: {}", a.toString());
    }
    public void амралтБатлах(АмралтынӨргөдөл ө) {
        if (ө == null) throw new IllegalArgumentException("Өргөдөл null байж болохгүй");
        ө.батлах();
        өргөдлүүд.add(ө);
        лог.info("Амралтын өргөдөл батлагдсан: {} - {}", ө.төрөлАвах(), ө.ажилтанАвах().нэрАвах());
    }
    public ЦалингийнБүртгэл цалинБодолт(Ажилтан a, String сар, double нэмэгдэл, double суутгал) {
        if (a == null) throw new IllegalArgumentException("Ажилтан байхгүй");
        if (!ажилтнууд.contains(a)) throw new IllegalArgumentException("Ажилтан бүртгэлгүй");
        ЦалингийнБүртгэл бүртгэл = new ЦалингийнБүртгэл(a, сар, a.цалинАвах(), нэмэгдэл, суутгал);
        цалингууд.add(бүртгэл);
        лог.info("Цалин бодогдсон: {} - {}", a.нэрАвах(), бүртгэл.нийтАвах());
        return бүртгэл;
    }
}