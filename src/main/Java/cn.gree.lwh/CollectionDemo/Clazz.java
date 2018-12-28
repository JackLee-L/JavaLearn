package cn.gree.lwh.CollectionDemo;

import java.util.Collection;

/**
 * 创建一个班级的类
 */
public class Clazz {
    private int clazzId;

    private int stuNo;

    private Collection col;

    public Clazz() {
        this.clazzId = clazzId;
        this.stuNo = stuNo;
        this.col = col;
    }

    public int getClazzId() {
        return clazzId;
    }

    public void setClazzId(int clazzId) {
        this.clazzId = clazzId;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public Collection getCol() {
        return col;
    }

    public void setCol(Collection col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId=" + clazzId +
                ", stuNo=" + stuNo +
                ", col=" + col +
                '}';
    }
}
