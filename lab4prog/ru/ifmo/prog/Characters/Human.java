package ru.ifmo.prog.Characters;

import ru.ifmo.prog.Exept.DontDrinkBeerException;
import ru.ifmo.prog.Interfaces.Around_place;
import ru.ifmo.prog.Interfaces.Change_location;
import ru.ifmo.prog.enums.Around_place_enum;
import ru.ifmo.prog.Interfaces.smthdo;
import ru.ifmo.prog.Interfaces.speak;

import java.lang.String;
import java.util.Objects;
import ru.ifmo.prog.Exept.*;
import java.lang.Throwable;

public abstract class Human implements smthdo, Change_location, speak, Around_place {
     public void setName(String name) {
          this.name = name;
     }

     private String name;

     public void setAge(String age) throws IllegalArgumentException {
          this.age = age;
     }

     private String age;
     private String location;
     private String action;
     private String place_of_residence;

     public  String getName() {
          return name;
     }
     public String getPlace_of_residence() {
          return place_of_residence;
     }

     public void setCharacter(String name, String age, String location, String action, String place_of_residence) {
          this.action = action;
          this.name = name;
          this.age = age;
          this.location = location;
          this.place_of_residence = place_of_residence;
     }

     public void setAction(String action){
          this.action = action;
     }

     @Override
     public String getAction() {
          return action;
     }


     @Override
     public int hashCode() {
          return Objects.hash(name, age, location, action, place_of_residence);
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Human human = (Human) o;
          return Objects.equals(name, human.name) && Objects.equals(age, human.age) && Objects.equals(location, human.location) && Objects.equals(action, human.action) && Objects.equals(place_of_residence, human.place_of_residence);
     }

     @Override
     public String Ch_loc() {
          System.out.printf(this.name + " Перешел в " + this.location + '\n');
          return null;
     }

     public Around_place_enum safe(Human Rylle, Human Fille){
          String Rylle_act = Rylle.getAction();
          String Fille_act = Fille.getAction();
          if(Rylle_act.equals("Думает, что карлсон живет В доме свантесонов") & Fille_act.equals("Думает, что карлсон живет В доме свантесонов")){
               return Around_place_enum.Безопастности;
          }
          else{
               return Around_place_enum.Опсатности;
          }
     }

     public String smthdo() {
               System.out.printf(this.name + ' ' + this.action + '\n');
               return null;
     }
     @Override
     public String Speak(String act) {
          System.out.printf(name + " Сказал: " + act + "\n");
          return null;
     }
     public String Find(Human Carlson){
          System.out.printf(name + " "+ getAction()+"\n");

          if (getAction()=="В поисках" && getAction()=="В поисках"){

               setAction("Не смог выследить");

               System.out.printf(name + " " + action + " " + Carlson.getName() + "\n");
          }
          if (getAction()=="Нашел карлсона"){
               setAction("Смог выследить");
               Carlson.setAction(" в " + Around_place_enum.Опсатности);
               System.out.printf(name + " " + action + " " + Carlson.getName() + "\n");
               System.out.printf(Carlson.getName() + " " + Carlson.getAction() + "\n");
          }
          return null;

     }

     public boolean FindHouse(Human Rylle,Human Fille,Items Home){
          if(Rylle.action.equals("пронюхал про домик на крыше") | Fille.action.equals("пронюхал про домик на крыше")){
               System.out.println(Rylle.getName() + " " + action );
               System.out.println(Fille.getName() +" "+Fille.action );
               if(action.equals("пронюхал про домик на крыше"))
               Home.Destroy(Rylle);
               else Home.Destroy(Fille);
               return true;
          } else if (action.equals("не пронюхал про домик на крыше") | Fille.action.equals("не пронюхал про домик на крыше"))
          {
               System.out.println(getName() +" "+ action);
               System.out.println(Fille.getName() + " "+ Fille.action);
               return false;
          }
          return false;
     }

     public void Do_obj(Items Item){
          System.out.println(getName() + " " + getAction() + " " + Item.getName());
     }

     public void DrinkBeer() throws DontDrinkBeerException {
          if (getAction().contains("не пьет пиво")) {
               throw new DontDrinkBeerException(getName() + " не пьет пиво, день уже неудачный");
          } else if (getAction().contains("пьет пиво")) {
               System.out.println(getName() + " " + getAction());
          }
          else{
               throw new DontDrinkBeerException("день уже провален, " + getName() + " не пьет пиво, а " + getAction() );
          }

}
}






