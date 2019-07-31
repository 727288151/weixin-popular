package weixin.popular.bean.wxopen;

import java.util.List;

public class Category {
    private Integer first;      //一级类目ID
    private Integer second;     //二级类目ID
    private List<CategoryCerticateItem> certicates;     //类目资质

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public List<CategoryCerticateItem> getCerticates() {
        return certicates;
    }

    public void setCerticates(List<CategoryCerticateItem> certicates) {
        this.certicates = certicates;
    }
}
