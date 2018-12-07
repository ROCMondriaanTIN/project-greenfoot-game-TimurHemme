
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
            tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 1:
            tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 2:
            tile = new Tile("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 3:
            tile = new Tile("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 4:
            tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 5:
            tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.getImage().mirrorVertically();
            tile.isSolid = true;
            break;
            case 6:
            tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 7:
            tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 8:
            tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 9:
            tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 10:
            tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 11:
            tile = new Water("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 12:
            tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 13:
            tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 14:
            tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 23:
            tile = new Tile("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
            case 67:
            tile = new GoldCoin("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 68:
            tile = new SilverCoin("coinSilver.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 114:
            tile = new BlueGem("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 115:
            tile = new GreenGem("gemGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 116:
            tile = new RedGem("gemRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 117:
            tile = new YellowGem("gemYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 149:
            tile = new Tile("hud_gem_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 150:
            tile = new Tile("hud_gem_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 151:
            tile = new Tile("hud_gem_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 152:
            tile = new Tile("hud_gem_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 153:
            tile = new EmptyHP("hud_heartEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 154:
            tile = new FullHP("hud_heartFull.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 155:
            tile = new HalfHP("hud_heartHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 171:
            tile = new BlueKey("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 172:
            tile = new GreenKey("keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 173:
            tile = new RedKey("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 174:
            tile = new YellowKey("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 175:
            tile = new Ladder("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 181:
            tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 182:
            tile = new Tile("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 183:
            tile = new Tile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 184:
            tile = new Tile("lock_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 214:
            tile = new RopeAttached("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;  
            case 216:
            tile = new RopeVertical("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 266:
            tile = new Tile("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 268:
            tile = new Tile("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 292:
            tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 293:
            tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            break;
            case 246:
            tile = new Tile("snowCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;    
            default:
            tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
            tile.isSolid = true;
            break;
        }
        return tile;
    }
}
