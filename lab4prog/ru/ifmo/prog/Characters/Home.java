package ru.ifmo.prog.Characters;

import ru.ifmo.prog.Interfaces.Print;

import java.util.Objects;
import java.util.Random;

public class Home extends Items {


    public Home() {
        Obj_desk("Домик", "Карлсон", "ничего","Small");
    }
    private class Chair extends Items{

        public Chair(){
            Obj_desk("стул", "Карлсон", "ничего","Small");
        }

    }
    private class Table extends Items {

        public Table(){
            Obj_desk("стол", "Карлсон", "ничего","Small");
        }
    }
    Items table = new Table();
    Items chair = new Chair();
    public String TableDo(Human Human){
        System.out.println(Human.getName() + " " + Human.getAction() + " " + table.getName());
        return null;
    }

    public String ChairDo(Human Human){
        System.out.println(Human.getName() + " " + Human.getAction() + " " + chair.getName());
        return null;
    }



}





