public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    int turn = (firstAttacker.equals(fighter1.name)?0:1);
    while(true){
      switch (turn){
          case 0:
          fighter2.health = fighter2.health - fighter1.damagePerAttack;
          if(fighter2.health<=0)
            return fighter1.name;
          case 1:
          fighter1.health = fighter1.health - fighter2.damagePerAttack;
          if(fighter1.health<=0)
            return fighter2.name;
          turn= 0;
        }
      }  
  }
}
