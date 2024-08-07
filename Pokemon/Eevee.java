/**
 * イーブイクラス
 * 
 * イーブイの攻撃を行う
 * 
 * @author Okuno Yuuka
 * 
 * レビュー者：やくわ、ほりうち
 * 
 */

public class Eevee extends PokemonBattle{

    


    /**
     * 
     * attackメソッド
     * 
     * イーブイの攻撃を行う
     * 
     * @return イーブイの攻撃力
     */
    public void attack(){

        this.attackpower = (int)(Math.random() * 50);
        System.out.println("イーブイは" + attackpower + "のダメージを与えた！");
        
    }

    
    
}
