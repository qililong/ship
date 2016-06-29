package cn.ucai.ship.bean;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/29.
 */
public class RowBean implements Serializable {
    int brandId;
    int DisCount;
    String EndDate;
    String EndDateStr;
    String ImgUrlSml;
    String Name;
    ProductInfoBean[] ProductInfo;

    public RowBean(int brandId, int disCount, String endDate, String endDateStr, String imgUrlSml, String name, ProductInfoBean[] productInfo) {
        this.brandId = brandId;
        DisCount = disCount;
        EndDate = endDate;
        EndDateStr = endDateStr;
        ImgUrlSml = imgUrlSml;
        Name = name;
        ProductInfo = productInfo;
    }

    @Override
    public String toString() {
        return "RowBean{" +
                "brandId=" + brandId +
                ", DisCount=" + DisCount +
                ", EndDate='" + EndDate + '\'' +
                ", EndDateStr='" + EndDateStr + '\'' +
                ", ImgUrlSml='" + ImgUrlSml + '\'' +
                ", Name='" + Name + '\'' +
                ", ProductInfo=" + Arrays.toString(ProductInfo) +
                '}';
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getDisCount() {
        return DisCount;
    }

    public void setDisCount(int disCount) {
        DisCount = disCount;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getEndDateStr() {
        return EndDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        EndDateStr = endDateStr;
    }

    public String getImgUrlSml() {
        return ImgUrlSml;
    }

    public void setImgUrlSml(String imgUrlSml) {
        ImgUrlSml = imgUrlSml;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ProductInfoBean[] getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(ProductInfoBean[] productInfo) {
        ProductInfo = productInfo;
    }
}
