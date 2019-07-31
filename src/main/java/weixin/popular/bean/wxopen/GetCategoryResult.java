package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

import java.util.List;

public class GetCategoryResult extends BaseResult {
    private List<CategoryItem> categories;  //类目集合
    private Integer limit;  //一个更改周期内可以设置类目的次数
    private Integer quota;  //本更改周期内还可以设置类目的次数
    private Integer category_limit; //最多可以设置的类目数量

    public List<CategoryItem> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryItem> categories) {
        this.categories = categories;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getCategory_limit() {
        return category_limit;
    }

    public void setCategory_limit(Integer category_limit) {
        this.category_limit = category_limit;
    }

    public static class CategoryItem {
        private Integer first;  //一级类目ID
        private String first_name;  //一级类目名称
        private Integer second; //二级类目ID
        private String second_name; //二级类目名称
        private Integer audit_status;   //审核状态
        private String audit_reason;    //审核不通过原因

        public Integer getFirst() {
            return first;
        }

        public void setFirst(Integer first) {
            this.first = first;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public Integer getSecond() {
            return second;
        }

        public void setSecond(Integer second) {
            this.second = second;
        }

        public String getSecond_name() {
            return second_name;
        }

        public void setSecond_name(String second_name) {
            this.second_name = second_name;
        }

        public Integer getAudit_status() {
            return audit_status;
        }

        public void setAudit_status(Integer audit_status) {
            this.audit_status = audit_status;
        }

        public String getAudit_reason() {
            return audit_reason;
        }

        public void setAudit_reason(String audit_reason) {
            this.audit_reason = audit_reason;
        }
    }
}
