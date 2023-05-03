//crear una función que reciba un precio y devuelva el precio con el IVA incluido.
public class Main {
    public static void main(String[] args) {
        float price1 = getPrice(15000f);
        float price2 = getPrice(15.08f);

        System.out.println(price1);
        System.out.println(price2);
    }

    static float getPrice(float priceWOIVA) {
        float IVA = 0.19f;
        return priceWOIVA * (1 + IVA);
    }
}