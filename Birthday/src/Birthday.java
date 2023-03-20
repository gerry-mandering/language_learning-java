public class Birthday {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public Birthday() {
        this.isValid = true;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.isValid = false;
            return;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public void printThis() {
        System.out.println(this);
    }
}
