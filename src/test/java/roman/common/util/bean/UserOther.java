package roman.common.util.bean;

import roman.common.util.bean.orika.annotation.OrigFieldMap;

//@ClassMap(mapper = {UserToUserA.class, UserToUserA.class}, filter = AggregateFilter.class)
public class UserOther {

    private Long id;

    @OrigFieldMap(destClass = UserA.class, destField = "nameC")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
