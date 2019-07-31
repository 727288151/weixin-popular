package weixin.popular.bean.wxopen;

import weixin.popular.bean.BaseResult;

import java.util.List;

public class GetAllCategoriesResult extends BaseResult {

    private CategoryList category_list;

    public CategoryList getCategory_list() {
        return category_list;
    }

    public void setCategory_list(CategoryList category_list) {
        this.category_list = category_list;
    }

    public static class CategoryList {
        private List<Category> categories;

        public List<Category> getCategories() {
            return categories;
        }

        public void setCategories(List<Category> categories) {
            this.categories = categories;
        }
    }

    public static class Category {
        private List<Integer> children;     //子类目ID
        private Integer father;     //类目父级ID
        private Integer id;         //类目ID
        private Integer level;      //类目层级
        private String name;        //类目名称
        private QualityItem quality;    //类目资质
        //是否为敏感类目（1为敏感类目，需要提供相应资质审核；0为非敏感类目，无需审核）
        private Integer sensitive_type;

        public List<Integer> getChildren() {
            return children;
        }

        public void setChildren(List<Integer> children) {
            this.children = children;
        }

        public Integer getFather() {
            return father;
        }

        public void setFather(Integer father) {
            this.father = father;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public QualityItem getQuality() {
            return quality;
        }

        public void setQuality(QualityItem quality) {
            this.quality = quality;
        }

        public Integer getSensitive_type() {
            return sensitive_type;
        }

        public void setSensitive_type(Integer sensitive_type) {
            this.sensitive_type = sensitive_type;
        }
    }

    public static class QualityItem {
        private List<ExterItem> exter_list;

        public List<ExterItem> getExter_list() {
            return exter_list;
        }

        public void setExter_list(List<ExterItem> exter_list) {
            this.exter_list = exter_list;
        }
    }

    public static class ExterItem {
        private List<InnerItem> inner_list;

        public List<InnerItem> getInner_list() {
            return inner_list;
        }

        public void setInner_list(List<InnerItem> inner_list) {
            this.inner_list = inner_list;
        }
    }

    public static class InnerItem {
        //sensitive_type为1的类目需要提供的资质文件名称
        private String name;
        //资质文件示例
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

}
