package com.monds.ps.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SkillTreeTest {

    @Test
    void test1() {
        SkillTree skillTree = new SkillTree();
        assertThat(skillTree.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA", "CEFD"}))
            .isEqualTo(2);
    }

    @Test
    void test2() {
        SkillTree skillTree = new SkillTree();
        assertThat(skillTree.solution("ABC", new String[] {"QWE"}))
            .isEqualTo(1);
    }

    @Test
    void test3() {
        SkillTree skillTree = new SkillTree();
        assertThat(skillTree.solution("ABC", new String[] {"EEA"}))
            .isEqualTo(1);
    }
}
