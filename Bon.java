public class Bon{
    public static void main(String[] args) {
        int currentbalance = 50;            // текущий баланс
        int replenishment = 2000;          // пополнение
        int percent;                      // 100р = 100%, 1р = 1%
        if (replenishment >= 1000) {     // "более чем на 1000"
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = replenishment / 100 * percent;
        int newbalanc = currentbalance + replenishment +bonus;
        System.out.println(bonus);      // сколько бонусов начислили
        System.out.println(newbalanc); // итоговый баланс
    }
}