/**
 * サトシクラス
 * 
 * ポケモンバトルを行う
 * 
 * @author  Okuno Yuuka
 */

public class Satoshi extends Object {

    public int enemyhp = 100;

    public int eeveehp = 100;

    /**
     * 
     * peformメソッド
     * 
     * ポケモンバトルの詳細を行う
     * 
     * @param enemyhp 敵ポケモンのHP
     * 
     * @param eeveehp イーブイのHP
     * 
     * レビュー者：やくわ、ほりうち
     */

    public void peform() {

        System.out.println("バトル開始");

        System.out.println("-----------------------------------");

        while (enemyhp > 0 && eeveehp > 0) {

            Eevee anEevee = new Eevee();
            anEevee.attack();
            System.out.println("敵ポケモンは" + anEevee.attackpower + "のダメージを受けた！");
            enemyhp -= anEevee.attackpower;

            System.out.println("-----------------------------------");

            Enemy anEnemy = new Enemy();
            anEnemy.attack();
            System.out.println("イーブイは" + anEnemy.attackpower + "のダメージを受けた！");
            eeveehp -= anEnemy.attackpower;

            System.out.println("-----------------------------------");

        }

        
        if (enemyhp < eeveehp ) {
            System.out.println("敵ポケモンはたおれた！");
            System.out.println("イーブイのレベルがあがった！");

        }else if (eeveehp <enemyhp) {
            System.out.println("イーブイはたおれた！");
            
        }

    }   
}
