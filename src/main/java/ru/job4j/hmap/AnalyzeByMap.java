package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        List<Label> list = averageScoreByPupil(pupils);
        double score = 0D;
        for (var label : list) {
            score += label.score();
        }
        return score / list.size();
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new  ArrayList<>();
        for (var pupil : pupils) {
            double score = 0;
            for (var subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score / pupil.subjects().size()));
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> map = new  LinkedHashMap<>();
        for (var pupil : pupils) {
            for (var subject : pupil.subjects()) {
                map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (var entry : map.entrySet()) {
            list.add(new Label(entry.getKey(), entry.getValue() / pupils.size()));
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new  ArrayList<>();
        for (var pupil : pupils) {
            double score = 0;
            for (var subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> map = new  LinkedHashMap<>();
        for (var pupil : pupils) {
            for (var subject : pupil.subjects()) {
                map.put(subject.name(), map.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        for (var entry : map.entrySet()) {
            list.add(new Label(entry.getKey(), entry.getValue()));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}
