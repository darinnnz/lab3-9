public class Ажилтан {
    private String нэр;
    private String регистр;
    private String хэлтэс;
    private String албанТушаал;
    private double цалин;
    private String утас;
    private String иМэйл;

    public Ажилтан(String нэр, String регистр, String хэлтэс, String албанТушаал, double цалин, String утас, String иМэйл) {
        if (нэр == null || нэр.isEmpty()) throw new IllegalArgumentException("Нэр шаардлагатай");
        if (регистр == null || регистр.isEmpty()) throw new IllegalArgumentException("Регистр заавал");
        if (цалин < 0) throw new IllegalArgumentException("Цалин сөрөг байж болохгүй");
        this.нэр = нэр;
        this.регистр = регистр;
        this.хэлтэс = хэлтэс;
        this.албанТушаал = албанТушаал;
        this.цалин = цалин;
        this.утас = утас;
        this.иМэйл = иМэйл;
    }
    public String нэрАвах() { return нэр; }
    public String регистрАвах() { return регистр; }
    public String хэлтэсАвах() { return хэлтэс; }
    public String албанТушаалАвах() { return албанТушаал; }
    public double цалинАвах() { return цалин; }
    public String утасАвах() { return утас; }
    public String иМэйлАвах() { return иМэйл; }

    public void хэлтэсТохируулах(String хэлтэс) {
        if (хэлтэс == null || хэлтэс.isEmpty())
            throw new IllegalArgumentException("Хэлтэс хоосон байж болохгүй");
        this.хэлтэс = хэлтэс;
    }
    public void албанТушаалТохируулах(String албанТушаал) {
        if (албанТушаал == null || албанТушаал.isEmpty())
            throw new IllegalArgumentException("Албан тушаал хоосон байж болохгүй");
        this.албанТушаал = албанТушаал;
    }
    public void цалинТохируулах(double цалин) {
        if (цалин < 0) throw new IllegalArgumentException("Цалин сөрөг байж болохгүй");
        this.цалин = цалин;
    }

    @Override
    public String toString() {
        return String.format("%s (%s), %s, %s, %.2f₮", нэр, регистр, хэлтэс, албанТушаал, цалин);
    }
}