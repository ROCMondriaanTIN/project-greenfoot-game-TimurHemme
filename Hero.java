
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    private final double gravity;
    private final double acc;
    private final double drag;
    private final double movespeed = 4;
    private boolean facingLeft=false;
    private int frame;
    private String teller;
    private int y = 01;
    private int ypos = 0;
    private int health = 1;

    private int totalCoins;


    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }
    
    public void checkFall()
    {
        if (onGround())
        {
            Actor below = getOneObjectAtOffset (0, getImage().getHeight()/2, Tile.class);
            setLocation(below.getX(), below.getY());
        }
    }

    @Override
    public void act() {
        handleInput();

        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        lookForCoin();
        getKey();
        lookForGem();
        death();
        showHealth();
        gameover();

    }

        public void lookForCoin()
        {
            if(isTouching(SilverCoin.class)) {
                removeTouching(SilverCoin.class);
                totalCoins++;
            } else if(isTouching(GoldCoin.class)) {
                removeTouching(GoldCoin.class);
                totalCoins = totalCoins + 2;
            }
            getWorld().showText("Score: "+ Integer.toString(totalCoins), 60, 75);
        }
        public void showHealth() {
            getWorld().showText(""+ Integer.toString(health), 45, 45);
        }
        public void death() {
            if (isTouching(Water.class)){
                health = health - 1;
                respawn();
            }  else if (isTouching(Enemy.class)){
                health = health -1;
                respawn();
            }
            return;
        }
        public void gameover(){
            if (health == 0) {
                Greenfoot.setWorld(new GameOver());
            }
        }
        public void lookForGem(){
            if(isTouching(YellowGem.class)) {
                removeTouching(YellowGem.class);      
            } else if(isTouching(RedGem.class)) {
                removeTouching(RedGem.class);
            } else if(isTouching(GreenGem.class)) {
                removeTouching(GreenGem.class);
            } else if(isTouching(BlueGem.class)){
                removeTouching(BlueGem.class);
            }
        }
        public void animation()
        {
            String lopen = "images/p1_walk/PNG/p1_walk";
            if (y != 12){
                teller = Integer.toString(y);
                y++;
            } else if (y == 12) {
                y = 1;
            }

            setImage(lopen+teller+".png");
        }
        public void getKey()
        {
            if(isTouching(YellowKey.class)) {
                removeTouching(YellowKey.class);
            }
        }
        public void respawn()
        {
            setLocation(350, 3000);
            return;
        }
        public void handleInput() {
            if (Greenfoot.isKeyDown("w")) {
                velocityY = -15;
            }
            if (Greenfoot.isKeyDown("space") && onGround()) {

                velocityY = -15;
            } else if(isTouching(Ladder.class)) 
            {
                setImage("p1_jump.png");
                if(Greenfoot.isKeyDown("space"))
                {
                    velocityY = -movespeed -1;
                } else if(isTouching(RopeAttached.class)) {
                    velocityY = -movespeed;
                }
            }
            if (Greenfoot.isKeyDown("left")) {
                velocityX = -movespeed;
                if (velocityY != 0) {
                    setImage("p1_jump.png");
                    getImage().mirrorHorizontally();
                } else if (velocityX < 0) {
                    animation();
                    getImage().mirrorHorizontally();
                }
            }
            if (Greenfoot.isKeyDown("right")) {
                velocityX = movespeed;
                if (velocityY != 0) {
                    setImage("p1_jump.png");
                } else if (velocityX > 0) {
                    animation();
                }
            }
            if (Greenfoot.isKeyDown("down")) {
                if(isTouching(Ladder.class)) 
                {
                    setImage("p1_jump.png");

                    velocityX = 0;
                }
            } else if (velocityX == 0 && velocityY == 0) {
                    setImage("p1_front.png");
                }
        }

        public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
