public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int one, int two){
        top = one;
        bottom = two;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int one){
        top = one;
    }
    public void setBottom(int one){
        bottom = one;
    }
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip(){
        int one = top;
        top = bottom;
        bottom = one;
    }
    public void settle(){
        if(bottom < top) flip();
    }
    public int compareTo(Domino other){
        int one = Math.min(top,bottom);
        int two = Math.min(other.top,other.bottom);
        if(one<two){
            return -1;
        }else if(one>two){
            return 1;
        }
        one = Math.max(top,bottom);
        two = Math.max(other.top,other.bottom);
        if(one<two){
            return -1;
        }else if(one>two){
            return 1;
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        int sum = top + bottom;
        int sum1 = other.top + other.bottom;
        if(sum<sum1){
            return -1;
        }
        if(sum>sum1){
            return 1;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        return top == other.bottom || top == other.top || bottom == other.top || bottom == other.bottom;
    }
}