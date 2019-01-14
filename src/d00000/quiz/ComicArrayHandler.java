package d00000.quiz;


public class ComicArrayHandler {
    public int totalPriceInclTax(Comic[] comics) {
        int total = 0;
        for (int i = 0; i < comics.length; i++) {
            total += comics[i].priceInclTax();
        }
        return total;
    }

    public Comic[] createComics(String title, int volumeStart, int volumeEnd, int price) {
        Comic[] comics = new Comic[volumeEnd - volumeStart + 1];
        int volume = volumeStart;
        for (int i = 0; i < comics.length; i++) {
            Comic c = new Comic(title, volume, price);
            comics[i] = c;
            volume++;
        }
        return comics;
    }
}
