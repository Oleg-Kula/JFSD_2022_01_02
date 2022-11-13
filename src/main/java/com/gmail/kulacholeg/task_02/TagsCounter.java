package com.gmail.kulacholeg.task_02;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TagsCounter {
    private final List<String> strings;
    private final Pattern PATTERN = Pattern.compile("#(\\S+)");

    public TagsCounter(List<String> strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getTopTags(){
        HashMap<String, Integer> result = new HashMap<>();
        List<Set<String>> hashTags = new ArrayList<>();
        for(String s: strings) {
            Set<String> set = new HashSet<>();
            Matcher m = PATTERN.matcher(s);
            while (m.find()) {
                set.add(m.group());
            }
            hashTags.add(set);
        }

        for(Set<String> s: hashTags){
            for(String s1: s){
                if(result.get(s1) == null)
                    result.put(s1, 1);
                else
                    result.put(s1, result.get(s1) + 1);
            }
        }

       result = result.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new
                ));

        return result;
    }
}
