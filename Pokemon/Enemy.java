/**
 * エネミークラス
 * 
 * 敵ポケモンの攻撃を行う
 * 
 * @author Okuno Yuuka
 * 
 * レビュー者：やくわ、ほりうち
 */
public class Enemy extends PokemonBattle{

    
/**
 * attackメソッド
 * 
 * 敵ポケモンの攻撃を行う
 * 
 * @return 敵ポケモンの攻撃力
 */
    public void attack(){

        this.attackpower = (int)(Math.random() * 50);
        System.out.println("敵ポケモンは" + attackpower + "のダメージを与えた！");
        
    }

    
    
}
