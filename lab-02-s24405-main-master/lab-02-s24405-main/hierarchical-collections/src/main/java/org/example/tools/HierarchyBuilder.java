package org.example.tools;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.List;


public class HierarchyBuilder<TItem extends org.example.model.abstraction.IHaveHierarchicalStructure>{

    private List<TItem> elements;
    public void setElements(List<TItem> geographies) {
        this.elements = elements;
    }

    public void buildHierarchy() {
        for (TItem element : elements) {
           if (element.getParentId() != null) {
                for (TItem parent : elements) {
                    if (parent.getId() == element.getParentId()) {
                        element.setParent(parent);
                       parent.getChildren().add(element);
                    }
                }
            }
       }
    }

    public TItem getRootElement() {
        for (TItem element : elements) {
            if (element.getParentId() == null) {
                return element;

            }
}
        return null;
    }
}

