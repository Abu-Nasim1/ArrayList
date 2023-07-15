package backengineering;

public class CarInfo {

    private String BrandName;
    private String model;
    private int price;

    CarInfo(String Brandname,String model,int price){

        this.BrandName=Brandname;
        this.model=model;
        this.price=price;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "BrandName='" + BrandName + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
