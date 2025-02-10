package three.slaes;

public class WeekSalesAn {

    private String saleName;
    private double amout;
    private int weekNumber;

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public double averageSale(WeekSalesAn[][] weekSalesAns){

        double sum = 0.0;
        int count = 0;
        double avg;
        for (WeekSalesAn[] weekSalesAn : weekSalesAns) {
            for (int j = 0; j < 3; j++) {
                sum = sum + weekSalesAn[j].getAmout();
                count++;
            }
        }
        avg = sum / count;
        return avg;
    }

    public void highestSaleForWeek(WeekSalesAn[][] weekSalesAns){

        WeekSalesAn highestSale = new WeekSalesAn();


        for (int i = 0; i < weekSalesAns.length; i++) {
            highestSale.setAmout(weekSalesAns[i][0].getAmout());
            highestSale.setSaleName(weekSalesAns[i][0].getSaleName());
            highestSale.setWeekNumber(weekSalesAns[i][0].getWeekNumber());
            for (int j = 0; j < 7; j++) {
                if(weekSalesAns[i][j].getAmout() > highestSale.getAmout()){
                    highestSale.setAmout(weekSalesAns[i][j].getAmout());
                    highestSale.setSaleName(weekSalesAns[i][j].getSaleName());
                    highestSale.setWeekNumber(weekSalesAns[i][j].getWeekNumber());
                }
            }
            System.out.println("Week "+(i+1)+" Highest Sale Amount is : "+highestSale.getAmout() + " Name : "+highestSale.getSaleName());
        }
        System.out.println();
    }

    public void lowestSaleForWeek(WeekSalesAn[][] weekSalesAns){

        WeekSalesAn lowestSale = new WeekSalesAn();

        for (int i = 0; i < weekSalesAns.length; i++) {
            lowestSale.setAmout(weekSalesAns[i][0].getAmout());
            lowestSale.setSaleName(weekSalesAns[i][0].getSaleName());
            lowestSale.setWeekNumber(weekSalesAns[i][0].getWeekNumber());
            for (int j = 0; j < 7; j++) {
                if(weekSalesAns[i][j].getAmout() < lowestSale.getAmout()){
                    lowestSale.setAmout(weekSalesAns[i][j].getAmout());
                    lowestSale.setSaleName(weekSalesAns[i][j].getSaleName());
                    lowestSale.setWeekNumber(weekSalesAns[i][j].getWeekNumber());
                }
            }
            System.out.println("Week "+(i+1)+" Lowest Sale Amount is : "+lowestSale.getAmout() + " Name : "+lowestSale.getSaleName());
        }
        System.out.println();
    }
}
