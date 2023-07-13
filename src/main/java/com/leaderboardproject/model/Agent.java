package com.leaderboardproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//This is going to be for Valorant Agents

public class Agent {
    private String uuid;
    private String name;
    private String desc1;
    private String desc2;
    private String desc3;
}
