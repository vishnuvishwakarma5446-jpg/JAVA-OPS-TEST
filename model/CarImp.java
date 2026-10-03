package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarImp implements Car{
    @Override
    public int spedd() {
        System.out.println("this speed limit ");
        return 0;
    }

    public static void main(String[] args) {
        CarImp carImp=new CarImp();
        carImp.spedd();
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(12);
        list.add(25);
        list.add(null);
        list.add(null);
        list.add(0);
        list.add(1);
       // Collections.list()
        System.out.println(list+ "     this is all of arrya list ");
        }

}
