package d00000.exam;

public class Exam04 {
    public static void main(String[] args) {
        Parcel p1 = new Parcel(15, 25, 35, 20); // 普通のゆうパックの場合
        System.out.println("p1のサイズは" + p1.getSize() + "で、料金は" + p1.getCost() + "円です。");

        Parcel p2 = new Parcel(15, 25, 35, 27); // 重重ゆうパックの場合
        System.out.println("p2のサイズは" + p2.getSize() + "で、料金は" + p2.getCost() + "円です。");

        Parcel p3 = new Parcel(15, 25, 35, 200); // 重量が重すぎる場合
        System.out.println("p3のサイズは" + p3.getSize() + "で、料金は" + p3.getCost() + "円です。");

        Parcel p4 = new Parcel(50, 60, 70, 20); // サイズが大きすぎる場合
        System.out.println("p4のサイズは" + p4.getSize() + "で、料金は" + p4.getCost() + "円です。");
    }
}
