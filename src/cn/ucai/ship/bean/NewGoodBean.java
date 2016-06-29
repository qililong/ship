package cn.ucai.ship.bean;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/6/29.
 */
public class NewGoodBean implements Serializable {
    RowBean[] rows;
    int total;

    public NewGoodBean(RowBean[] rows, int total) {
        this.rows = rows;
        this.total = total;
    }

    @Override
    public String toString() {
        return "NewGoodBean{" +
                "rows=" + Arrays.toString(rows) +
                ", total=" + total +
                '}';
    }

    public RowBean[] getRows() {
        return rows;
    }

    public void setRows(RowBean[] rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
