import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList();
    }
    public void newStack6(){
        for(int i=0;i<=6;i++){
            for(int j=i;j<=6;j++){
                Domino n = new Domino(i,j);
                pile.add(n);
            }
        }
    }
    public void shuffle(){
        for(int i=1;i<=10000;i++){
            Random random = new Random();
            int random1 = random.nextInt(pile.size()-1);
            int random2 = random.nextInt(pile.size()-1);
            Domino a = pile.get(random1);
            Domino b = pile.get(random2);
            pile.set(random2,a);
            pile.set(random1,b);
        }
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
}