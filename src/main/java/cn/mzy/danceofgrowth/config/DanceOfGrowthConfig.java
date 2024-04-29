package cn.mzy.danceofgrowth.config;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "danceofgrowth")
public class DanceOfGrowthConfig implements ConfigData {

    @Comment(value = "当玩家按下蹲伏按钮时，附近植物获得骨粉效果的机会。10是1/10，20是1/20。")
    public int chance = 25;

    @Comment(value = "从最后一个玩家跳跃到影响潜行机会的时间。")
    public int jumpTime = 40;

    public float jumpModifier = 1.5f;

    @Comment(value = "从最后一个玩家冲刺动作开始的时间，以滴答为形式，对潜行机会产生影响。")
    public int sprintTime = 40;

    public float sprintModifier = 1.5f;

    @Comment(value = "可以通过蹲伏生长的附近植物的最小数量。")
    public int cropPerSneakMin = 1;

    @Comment(value = "通过蹲伏可以生长的附近植物的最大数量。")
    public int cropPerSneakMax = 1;

    public int horizontalGrowthRadius = 5;
    public int verticalGrowthRadius = 2;
    public boolean allowCrops = true;
    public boolean growGrass = false;
    public float rainModifier = 1.1f;
    public boolean showParticles = true;
}
