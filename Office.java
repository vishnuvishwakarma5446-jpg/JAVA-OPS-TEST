public class Office {
    String chair;
    int laptop;
    double amount;
   public Office(String chair,int laptop){
       this.chair=chair;
        this.laptop=laptop;

    }

    public Office(String chair, int laptop, double amount) {
        this.chair = chair;
        this.laptop = laptop;
        this.amount = amount;
    }

    public Office() {
    }

    public static void main(String[] args) {
    Office office=new Office("deepak",22);
        System.out.println(office.chair);
        System.out.println(office.laptop);
    }
}
