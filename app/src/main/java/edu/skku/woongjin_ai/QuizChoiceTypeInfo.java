package edu.skku.woongjin_ai;

import java.util.HashMap;
import java.util.Map;

public class QuizChoiceTypeInfo {
    public String uid;
    public String question;
    public String answer;
    public String answer1;
    public String answer2;
    public String answer3;
    public String answer4;
    public String star;
    public String desc;
    public String like;

    public QuizChoiceTypeInfo() {

    }

    public QuizChoiceTypeInfo(String uid, String question, String answer, String answer1, String answer2, String answer3, String answer4, String star, String desc, String like) {
        this.uid = uid;
        this.question = question;
        this.answer = answer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.star = star;
        this.desc = desc;
        this.like = like;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("question", question);
        result.put("answer", answer);
        result.put("answer1", answer1);
        result.put("answer2", answer2);
        result.put("answer3", answer3);
        result.put("answer4", answer4);
        result.put("star", star);
        result.put("desc", desc);
        result.put("like", like);
        return result;
    }
}