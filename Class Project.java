public class Project {
    private String name ; 
    private int in;
    private int cost ; 
    private int profit ; 
    private double netProfit ; 
    final double tax = 0.17;

    public Project(String name, int in, int cost) {
        this.name = name;
        this.in = in;
        this.cost = cost;
        setProfit();
        setNetProfit();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit() {
        this.profit = this.in-this.cost;
    }

    public double getNetProfit() {
        return netProfit;
    }

    public void setNetProfit() {
        this.netProfit = this.profit-(tax*this.profit);
    }

    @Override
    public String toString() {
        return "Project{" + "name=" + name + ", in=" + in + ", cost=" + cost + ", profit=" + profit + ", netProfit=" + netProfit + '}'+"\n";
    }
    
    
    public static String maxProfit(Project o1 , Project o2 , Project o3){
        if (o1.getProfit()>o2.getProfit()&&o1.getProfit()>o3.getProfit()) {
            return o1.name;
        }
        else if (o2.getProfit()>o1.getProfit()&&o2.getProfit()>o3.getProfit()) {
            return o2.name;
        }
        else 
            return o3.name;
        
    }
     public static double avgNetProfit(Project o1 , Project o2 ){
         return (o1.netProfit+o2.netProfit)/2;
     }

     public static void printLoser(Project[]o){
         if (o[0].getProfit()<o[1].getProfit()&&o[0].getProfit()<o[2].getProfit()) {
             System.out.println(o[0].toString());
        }
        else if (o[1].getProfit()<o[0].getProfit()&&o[1].getProfit()<o[2].getProfit()) {
             System.out.println(o[1].toString());
        }
        else 
             System.out.println(o[2].toString());
         
         
     }
    
}
