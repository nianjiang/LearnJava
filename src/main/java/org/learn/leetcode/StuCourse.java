package org.learn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class StuCourse {

    private HashMap anyCourses;
    private ArrayList<LinkedList> conditionRules;

    public static void main(String[] args){
        String[] current = {"A", "B", "C"};
//        System.out.println(current[0]);

        String[] anyCourses = {"E", "J"};
        String[] rule1 = {"F", "A"};
        String[] rule2 = {"G", "B"};
        String[] rule3 = {"H", "C"};
        String[] rule4 = {"I", "D"};

        String[] selectCourses = {"E", "G", "B", "F", "A"};

        StuCourse self = new StuCourse();
        self.initRules(anyCourses, rule1, rule2, rule3,rule4);
//        System.out.println(rules.size());
//        System.out.println(rules.get(0));

        boolean result = self.checkSelect(selectCourses);
        System.out.println(selectCourses.length);
        System.out.println(result);

    }

    public boolean checkSelect(String[] courses){
        for(String course: courses){
            return checkRules(course);
        }
        return false;
    }

    public boolean checkRules(String course){
        if(anyCourses.containsKey(course)) return true;

        ArrayList<LinkedList> tRules = new ArrayList<LinkedList>(conditionRules);
        for(LinkedList rule : tRules){
            if(rule.size()>0 && rule.getFirst().equals(course)) {
                rule.removeFirst();
                return true;
            }
        }

        return false;
    }
    public void initRules(String[] anyCourseArr, String[] ...allRules){
        anyCourses = new HashMap();
        conditionRules = new ArrayList<LinkedList>();

        for(String course : anyCourseArr){
            anyCourses.put(course, 1);
        }

        for(String[] courses : allRules){
            LinkedList rule = new LinkedList();
            for(String course : courses){
                rule.add(course);
            }
            conditionRules.add(rule);
        }
    }

    public static void testRule(String[] courses) {
        LinkedList rule = new LinkedList();
        for(String course : courses){
            rule.add(course);
        }

        System.out.println(rule.getFirst());
        System.out.println(rule.getFirst());
        rule.removeFirst();
        System.out.println(rule.getFirst());



    }
}
