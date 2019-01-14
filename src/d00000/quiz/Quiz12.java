package d00000.quiz;

public class Quiz12 {
    public static void main(String[] args) {
        ComicArrayHandler cah = new ComicArrayHandler();

        Comic[] comics = new Comic[3];
        comics[0] = new Comic("宇宙兄弟", 34, 590);
        comics[1] = new Comic("3月のライオン", 14, 486);
        comics[2] = new Comic("ヴィンランド・サガ", 21, 630);

        int total = cah.totalPriceInclTax(comics);
        System.out.println("価格（税込）の合計: " + total);

        System.out.println();

        Comic[] kaiji = cah.createComics("賭博堕天録カイジ ワン・ポーカー編", 13, 16, 590);
        for (int i = 0; i < kaiji.length; i++) {
            Comic k = kaiji[i];
            System.out.println("kaiji[" + i + "]: " + k.title + " " + k.volume + "巻 " + k.priceInclTax() + "円");
        }
    }
}
