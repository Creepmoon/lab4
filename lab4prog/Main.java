import ru.ifmo.prog.Characters.*;
import ru.ifmo.prog.Exept.DontDrinkBeerException;

public class Main {
    public static void main(String[] args) throws DontDrinkBeerException {

        Human Baby = new Baby();
        Human Rylle = new Rylle(){
            public String Speak(String Speech){
                System.out.println(getName() + " тихо сказал: " + Speech);
            return null;
            }
        };

        Human Carlson = new Carlson();
        Human Fille = new Fille();
        Human Sweep = new Sweep();
        Home Home = new Home();
        try{
            Fille.DrinkBeer();
        }
        catch (DontDrinkBeerException e){
            System.out.println(e.getMessage());
        }
        try{
            Rylle.DrinkBeer();
        }
        catch (DontDrinkBeerException e){
            System.out.println(e.getMessage());
        }
        Rylle.setAction("Выпил пиво и продолжает молчать");
        Fille.setAction("Выпил пиво и продолжает молчать");
        Rylle.smthdo();
        Fille.smthdo();
        Fille.Speak("Малыш так испугался, что едва смог дух перевести");
        Carlson.smthdo();
        Rylle.setAction("Заметил маленький домик на крыше");
        Fille.setAction("Заметил маленький домик на крыше");
        Rylle.smthdo();
        Fille.smthdo();
        Baby.smthdo();
        Rylle.Speak("У Малыша глаза округлились от удивления");
        Fille.setAction("Думает, что карлсон живет В доме свантесонов");
        Rylle.setAction("Думает, что карлсон живет В доме свантесонов");
        Fille.smthdo();
        Rylle.smthdo();
        Carlson.setAction("спрятался " + Carlson.getPlace_of_residence() + ", Значит он в полной " + Carlson.safe(Rylle, Fille));
        Carlson.smthdo();
        Fille.setAction("В поисках");
        Rylle.setAction("В поисках");
        Fille.Find(Carlson);
        Rylle.Find(Carlson);
        Sweep.smthdo();
        Fille.setAction("пронюхал про домик на крыше");
        Rylle.setAction("пронюхал про домик на крыше");
        Rylle.FindHouse(Rylle,Fille,Home);
        Carlson.setAction("не сможет спрятаться, если за ним начнется охота");
        Carlson.smthdo();
        Carlson.setName("Этот дурачок");
        Carlson.setAction("Никогда не умел прятатся");
        Carlson.smthdo();
        Carlson.setName("Карлсон");
        Carlson.setAction("Решил попить чай");
        Carlson.smthdo();
        Carlson.setAction("Поставил чай на");
        Home.TableDo(Carlson);
        Carlson.setAction("садиться на");
        Home.ChairDo(Carlson);
        Rylle.Speak("Продолжение следует ...");
    }
}