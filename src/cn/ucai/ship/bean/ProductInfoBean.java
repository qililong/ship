package cn.ucai.ship.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ProductInfoBean implements Serializable {
    int Id;
    boolean IsBaoYou;
    boolean IsPromotion;
    String Name;
    float NewPrice;
    int PFrom;
    String ProductImg;
    double disCount;
    float oldPrice;

    public ProductInfoBean(int id, boolean isBaoYou, boolean isPromotion, String name, float newPrice, int PFrom, String productImg, double disCount, float oldPrice) {
        Id = id;
        IsBaoYou = isBaoYou;
        IsPromotion = isPromotion;
        Name = name;
        NewPrice = newPrice;
        this.PFrom = PFrom;
        ProductImg = productImg;
        this.disCount = disCount;
        this.oldPrice = oldPrice;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "Id=" + Id +
                ", IsBaoYou=" + IsBaoYou +
                ", IsPromotion=" + IsPromotion +
                ", Name='" + Name + '\'' +
                ", NewPrice=" + NewPrice +
                ", PFrom=" + PFrom +
                ", ProductImg='" + ProductImg + '\'' +
                ", disCount=" + disCount +
                ", oldPrice=" + oldPrice +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public boolean isBaoYou() {
        return IsBaoYou;
    }

    public void setIsBaoYou(boolean isBaoYou) {
        IsBaoYou = isBaoYou;
    }

    public boolean isPromotion() {
        return IsPromotion;
    }

    public void setIsPromotion(boolean isPromotion) {
        IsPromotion = isPromotion;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getNewPrice() {
        return NewPrice;
    }

    public void setNewPrice(float newPrice) {
        NewPrice = newPrice;
    }

    public int getPFrom() {
        return PFrom;
    }

    public void setPFrom(int PFrom) {
        this.PFrom = PFrom;
    }

    public String getProductImg() {
        return ProductImg;
    }

    public void setProductImg(String productImg) {
        ProductImg = productImg;
    }

    public double getDisCount() {
        return disCount;
    }

    public void setDisCount(double disCount) {
        this.disCount = disCount;
    }

    public float getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(float oldPrice) {
        this.oldPrice = oldPrice;
    }
}
