package org.example.model;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.List;

public class Geography implements IHaveHierarchicalStructure{

         private int id;
         private String name;
         private String type;
         private String code;
         private Integer parentId;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public void setParent(Object geography) {

    }

    @Override
    public List getChildren() {
        return null;
    }

    @Override
    public Object getParent() {
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCode(String part) {
        return code;
    }

    public Integer getParentId() {
        return parentId;
    }
}
