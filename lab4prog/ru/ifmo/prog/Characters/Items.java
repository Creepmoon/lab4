package ru.ifmo.prog.Characters;

import ru.ifmo.prog.Interfaces.Print;

public abstract class Items implements Print {
    private  String name;

    private String Act_on_Obj;
    private String Owner;

    private String Size;

    public void Obj_desk(String name, String Owner, String Act_on_Obj,String Size){
        this.name = name;
        this.Act_on_Obj = Act_on_Obj;
        this.Owner = Owner;
        this.Size = Size;

    }

    public void print(String output){

        System.out.printf(output);
    }



    public Items(){

    }
    public String getSize(){return Size;}
    public String getName() {
        return name;
    }

    public void Destroy(Human Human) throws ArithmeticException {
        System.out.println(Human.getName() + " Решил уничтожить " + getName());
        boolean Chance = Math.random() * 10 > 4;
        class expl{

            public String LevelExp(Double lvl){
                if(lvl <=5){
                    return "Small";
                }
                else{
                    return "Big";
                }
            }
            public expl(){
                double TNT = (Math.random() * 10)/Math.random();
                String size = LevelExp(TNT);

                 if (Chance & size.equals("Small"))
            {
                System.out.println(Human.getName() + " сделал маленький взрыв ");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(getName() + " Уничтожен на " + i * 10 + "%");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Human.getName() + " полностью уничтожил " + getName());
            } else if (Chance & size.equals("Big")) {
                     System.out.println(Human.getName() + " сделал большой взрыв");
                     for (int i = 1; i <= 2; i++) {
                         System.out.println(getName() + " Уничтожен на " + i * 50 + "%");
                         try {
                             Thread.sleep(500);
                         } catch (InterruptedException e) {
                             throw new RuntimeException(e);
                         }
                     }
                     System.out.println(Human.getName() + " полностью уничтожил " + getName());

                 } else{
            System.out.println(Human.getName() + " не удалось уничтожить " + getName());

            }
                }

        }
        new expl();


    }
    }

