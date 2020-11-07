package com.monds.ps.programmers;

public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        outer:
        for (String skill_tree : skill_trees) {
            int index = 0;
            for (int i = 0; i < skill_tree.length(); i++) {
                int curr = skill.indexOf(skill_tree.charAt(i));
                if (curr > index) continue outer;
                if (curr != -1) index++;
            }
            answer++;
        }
        return answer;
    }
}
