package com.sda.she_likes_java.homework.homework_23;


import java.util.HashSet;

public class ClassJournal {
    public ClassJournal() {
    }

    HashSet<Pupil> pupilList = new HashSet<>();
public HashSet addToPupilList(Pupil pupil){
    pupilList.add(pupil);
    return pupilList;
}
public String showPupilList(){
  String fullPupilList = "List of pupils: "+ pupilList;
   return fullPupilList;

}

    public HashSet<Pupil> getPupilList() {
        return pupilList;
    }
}
