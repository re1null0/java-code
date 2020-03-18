public class HeavyBox{
    public static void main(String[] args) {
        class Heavybox extends Box{
            int weight;
            super
                Heavybox(int w , int h, int d, int m){
                super(w, h, d)
                }
        }
        class HeavyBox {
            int weight;

            HeavyBox(int w, int h, int d, int m) {
                width = w;
                height = h;
                depth = d;
                weight = m;
            }
        }


            HeavyBox box = new HeavyBox(15, 10, 20, 5);
        int vol = box.getvolume();
        System.out.println("объем коробки"+ box.getVolume() + "вес коробки" + box.weight());

    }
}
