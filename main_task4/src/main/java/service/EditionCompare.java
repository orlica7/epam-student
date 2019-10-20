package main.java.service;

import main.java.edition.Edition;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class EditionNameCompare implements Comparator<Edition> {

        public int compare(Edition a, Edition b){

            return a.getName().compareTo(b.getName());
        }
    }
    class EditionAgeComparator implements Comparator<Edition>{

        public int compare(Edition a, Edition b){
            if(a.getAge()> b.getAge())
                return 1;
            else if(a.getAge()< b.getAge())
                return -1;
            else
                return 0;
        }
    }
    public class EditionCompare {
        public static void compare(List<Edition> loadEditions) {
            System.out.println("Сортировка по имени");
            Comparator<Edition> pcomp = new EditionNameCompare();
            TreeSet<Edition> editio = new TreeSet<>(pcomp);
            editio.addAll(loadEditions);
            for (Edition e : editio) {
               System.out.println(e.toString());
            }
            pcomp = new EditionNameCompare().thenComparing(new EditionAgeComparator());
            editio = new TreeSet<>(pcomp);
            editio.addAll(loadEditions);
            System.out.println("Сортировка по имени и возрасту  ");
            for (Edition e : editio) {
                System.out.println(e.toString());
            }
        }
    }

