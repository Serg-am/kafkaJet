package com.jet.common.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    private String boardName;
    private List<RoutePath> path = new ArrayList<RoutePath>();

    public boolean notAssigned(){
        return  boardName == null;
    }
}
